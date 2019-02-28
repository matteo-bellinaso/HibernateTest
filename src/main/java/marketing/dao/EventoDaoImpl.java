package marketing.dao;

import marketing.classes.Evento;
import marketing.classes.Utente;
import marketing.interfaces.EventoDao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EventoDaoImpl extends JpaDao<Evento> implements EventoDao {

    public EventoDaoImpl(){
        super(Evento.class);
    }

    @Override
    public List<Evento> getAll() {
        EntityManager em = init();
        List<Evento> results = null;
        try {
            Query query = em.createQuery("SELECT m FROM Evento m");
            results = query.getResultList();
            if (results.isEmpty()) {
                results = null;
            }
            em.close();
            // Em.closeEntityManager(em);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return results;
    }
}
