package marketing.dao;

import Utility.Em;
import marketing.interfaces.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class GenericDao<T>  implements Dao<T> {

    private static EntityManager em;

    public static EntityManager getEm() {
        if(em == null){
        em = Em.createEntityManager();
        }
        return em;
    }

    public static void closeEm() {
        em.close();
        Em.closeEntityManager();
    }

    public List<T> queryAll(Query query) {
        List<T> results = query.getResultList();
        if (!results.isEmpty()) {
           return results;
        } else {
            return null;
        }
    }

    @Override
    public void save(T obj) {
        getEm().getTransaction().begin();
        getEm().persist(obj);
        getEm().getTransaction().commit();
        closeEm();
    }

    @Override
    public void update(T obj) {
        getEm().getTransaction().begin();
        getEm().merge(obj);
        getEm().getTransaction().commit();
        closeEm();
    }


    public void deleteQuery(T o) throws SQLException {
        getEm().getTransaction().begin();
        getEm().remove(o);
        getEm().getTransaction().commit();
        closeEm();
    }
}
