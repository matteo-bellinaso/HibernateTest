package marketing.dao;

import marketing.classes.Ordine;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class OrdineDao extends GenericDao<Ordine> {

    @Override
    public List<Ordine> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Ordine");
        return queryAll(query);
    }

    @Override
    public void delete(Ordine ordine) throws SQLException {
        Ordine f = getEm().find(Ordine.class, ordine.getId());
        deleteQuery(f);
    }

    @Override
    public Ordine getById(Ordine i) {
        Ordine f = getEm().find(Ordine.class, i.getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
