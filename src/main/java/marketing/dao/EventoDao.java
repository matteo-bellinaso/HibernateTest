package marketing.dao;

import marketing.classes.Evento;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class EventoDao extends GenericDao<Evento> {

    @Override
    public List<Evento> getAll() throws SQLException {
        List<Evento> result;
        Query query = getEm().createQuery("FROM Evento");
        return queryAll(query);
    }
    @Override
    public void delete(Evento evento) throws SQLException {
        Evento f = getEm().find(Evento.class, evento.getidEvento());
        deleteQuery(f);
    }

    @Override
    public Evento getById(Evento i) {
        Evento f = getEm().find(Evento.class, i.getidEvento());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
