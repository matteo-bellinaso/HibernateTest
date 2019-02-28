package marketing.dao;

import marketing.classes.ProdottoUtente;
import marketing.classes.Utente;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class ProdottoUtenteDao extends GenericDao<ProdottoUtente> {
    @Override
    public List<ProdottoUtente> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM ProdottoUtente");
        return queryAll(query);
    }

    @Override
    public void delete(ProdottoUtente prodottoUtente) throws SQLException {
    }

    @Override
    public ProdottoUtente getById(ProdottoUtente i) {
        return null;
    }

    public List<ProdottoUtente> getByIdUtenteProdotto(ProdottoUtente i) {
        Query query = getEm().createQuery("FROM ProdottoUtente as p where p.primaryKey.prodotto = :idProdotto and p.primaryKey.utente.id = :idUtente");
        query.setParameter("idProdotto", i.getProdotto().getId());
        query.setParameter("idUtente", i.getUtente().getId());
        return queryAll(query);
    }

    public List<ProdottoUtente> getByIdUtente(Integer i) {
        Query query = getEm().createQuery("FROM ProdottoUtente as p where  p.primaryKey.utente.id = :idUtente");
        query.setParameter("idUtente", i);
        return queryAll(query);
    }
    public List<ProdottoUtente> getByIdProdotto(ProdottoUtente i) {
        Query query = getEm().createQuery("FROM ProdottoUtente as p where p.primaryKey.prodotto = :idProdotto ");
        query.setParameter("idProdotto", i.getProdotto().getId());
        return queryAll(query);
    }

    public List<ProdottoUtente> getByIdProdottoDate (ProdottoUtente i) {
        Query query = getEm().createQuery("FROM ProdottoUtente as p where p.primaryKey.prodotto = :idProdotto and p.dataVisita = :dataVisita");
        query.setParameter("idProdotto", i.getProdotto().getId());
        query.setParameter("dataVisita", i.getDate());
        return queryAll(query);
    }

    public List<ProdottoUtente> getByIdUtenteDate (ProdottoUtente i) {
        Query query = getEm().createQuery("FROM ProdottoUtente as p where p.primaryKey.utente = :idUtente and p.dataVisita = :dataVisita");
        query.setParameter("idUtente", i.getUtente().getId());
        query.setParameter("dataVisita", i.getDate());
        return queryAll(query);
    }
}
