package marketing.dao;

import marketing.classes.Recensione;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class RecensioneDao extends GenericDao<Recensione> {

    @Override
    public List<Recensione> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Recensione");
        return queryAll(query);
    }

    @Override
    public void delete(Recensione recensione) throws SQLException {
        Recensione f = getEm().find(Recensione.class, recensione.getIdRecensione());
        deleteQuery(f);
    }

    @Override
    public Recensione getById(Recensione i) {
        Recensione f = getEm().find(Recensione.class, i.getIdRecensione());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
