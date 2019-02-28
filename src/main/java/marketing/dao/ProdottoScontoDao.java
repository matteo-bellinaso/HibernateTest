package marketing.dao;

import marketing.classes.Prodotto;
import marketing.classes.ProdottoSconto;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class ProdottoScontoDao extends GenericDao<ProdottoSconto> {

    @Override
    public List<ProdottoSconto> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Prodotto  p join fetch p.prodottoSconto");
       return queryAll(query);
    }

    @Override
    public void delete(ProdottoSconto prodotto) throws SQLException {
        ProdottoSconto f = getEm().find(ProdottoSconto.class, prodotto.getProdotto().getId());
        deleteQuery(f);
    }

    @Override
    public ProdottoSconto getById(ProdottoSconto i) {
        ProdottoSconto f = getEm().find(ProdottoSconto.class, i.getProdotto().getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
