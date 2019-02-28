package marketing.dao;

import marketing.classes.Categoria;
import marketing.classes.Utente;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class UtenteDao extends GenericDao<Utente> {

    @Override
    public List<Utente> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Utente");
        return queryAll(query);
    }

    @Override
    public void delete(Utente utente) throws SQLException {
        Utente f = getEm().find(Utente.class, utente.getId());
        deleteQuery(f);
    }

    @Override
    public Utente getById(Utente i) {
        Utente f = getEm().find(Utente.class, i.getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }

}
