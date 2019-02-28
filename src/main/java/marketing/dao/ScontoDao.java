package marketing.dao;

import marketing.classes.Sconto;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class ScontoDao extends GenericDao<Sconto> {
    @Override
    public List<Sconto> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Sconto");
        return queryAll(query);
    }

    @Override
    public void delete(Sconto sconto) throws SQLException {
        Sconto f = getEm().find(Sconto.class, sconto.getIdSconto());
        deleteQuery(f);
    }

    @Override
    public Sconto getById(Sconto i) {
        Sconto f = getEm().find(Sconto.class, i.getIdSconto());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
