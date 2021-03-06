package marketing.dao;

import Utility.Em;
import marketing.classes.ProdottoUtente;
import marketing.classes.Utente;
import marketing.interfaces.UtenteDao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class UtenteDaoImpl extends JpaDao<Utente> implements UtenteDao {

    private String query = "SELECT NEW Utente(u.nome, u.cognome, u.email, u.pIva) FROM Utente u"; //JOIN FETCH c.ordini

    public UtenteDaoImpl() {
        super(Utente.class);
    }

    @Override
    public Utente getById(Integer id) {
        EntityManager em = init();
        String getIdQuery = query;
        getIdQuery += " WHERE u.id=:id";

        Query query = em.createQuery(getIdQuery);
        query.setParameter("id", id);

        List<Utente> results;
        results = query.getResultList();
        Utente result;
        if (results.isEmpty()) {
            results = null;
        }

        return results.get(0);
    }

    @Override
    public List<Utente> getAll() {
        EntityManager em = init();
        List<Utente> results;
        String getAll = query;
        Query query = em.createQuery(getAll);
        results = query.getResultList();
        if (results.isEmpty()) {
            results = null;
        }
        em.close();
        // Em.closeEntityManager(em);
        return results;
    }
}


