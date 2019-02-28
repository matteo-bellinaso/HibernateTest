package marketing.dao;

import marketing.classes.Prodotto;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;


public class ProdottoDao extends GenericDao<Prodotto> {

    @Override
    public List<Prodotto> getAll() {
        Query query = getEm().createQuery("FROM Prodotto");
        return queryAll(query);
    }

    @Override
    public void delete(Prodotto o) throws SQLException {
        Prodotto f = getEm().find(Prodotto.class, o.getId());
        deleteQuery(f);
    }

    @Override
    public Prodotto getById(Prodotto i) {
        Prodotto f = getEm().find(Prodotto.class, i.getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }

}
