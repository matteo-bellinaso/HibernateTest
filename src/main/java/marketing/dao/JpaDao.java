package marketing.dao;

import marketing.interfaces.Orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDao<PO extends Orm> {

    private EntityManagerFactory entityManagerFactory;

    private Class<PO> persistentObjectClass;

    public JpaDao(Class<PO> persistentObjectClass) {
        this.persistentObjectClass = persistentObjectClass;

    }

    protected EntityManager init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("marketing");
        return entityManagerFactory.createEntityManager();
    }

    protected void closeEntityManager(EntityManager em) {
        em.close();
        entityManagerFactory.close();
    }

    protected void persist(PO objectToPersist) {
        EntityManager em = init();
        em.getTransaction().begin();
        em.persist(objectToPersist);
        em.getTransaction().commit();
        closeEntityManager(em);
    }

}


