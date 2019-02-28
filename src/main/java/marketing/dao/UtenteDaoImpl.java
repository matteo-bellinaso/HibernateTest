package marketing.dao;

import Utility.Em;
import marketing.classes.Utente;
import marketing.interfaces.UtenteDao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDaoImpl extends JpaDao<Utente> implements UtenteDao {

    private String baseQueryNoRel = "SELECT NEW Utente(u.nome, u.cognome, u.email, u.pIva) FROM Utente u"; //JOIN FETCH c.ordini

    public UtenteDaoImpl() {
        super(Utente.class);
    }

    @Override
    public Utente getById(Integer id) {
        EntityManager em = Em.createEntityManager();
        Utente utente = em.find(Utente.class, id);
        Em.closeEntityManager();
        return utente;
    }

    @Override
    public List<Utente> getAll() {
        EntityManager em = init();
        List<Utente> results;

        Query query = em.createQuery(baseQueryNoRel);
        results = query.getResultList();
        if (results.isEmpty()) {
            results = null;
        }
        em.close();
        // Em.closeEntityManager(em);
        return results;
    }
}


