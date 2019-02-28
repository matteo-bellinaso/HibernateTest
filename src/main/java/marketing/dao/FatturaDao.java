package marketing.dao;

import marketing.classes.Fattura;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class FatturaDao extends GenericDao<Fattura> {
    @Override
    public List<Fattura> getAll() throws SQLException {
        List<Fattura> result;
        Query query = getEm().createQuery("FROM Fattura");
        return queryAll(query);
    }


    @Override
    public void delete(Fattura fattura) throws SQLException {
        Fattura f = getEm().find(Fattura.class, fattura.getId());
        deleteQuery(f);
    }

    @Override
    public Fattura getById(Fattura i) {
        Fattura f = getEm().find(Fattura.class, i.getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
