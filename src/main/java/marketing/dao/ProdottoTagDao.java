package marketing.dao;

import marketing.classes.TagProdotto;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class ProdottoTagDao extends GenericDao<TagProdotto> {

    @Override
    public List<TagProdotto> getAll() throws SQLException {
        return null;
    }

    @Override
    public void delete(TagProdotto tagProdotto) throws SQLException {
    }

    @Override
    public TagProdotto getById(TagProdotto i) {
        return null;
    }

    public List<TagProdotto> getByProduct(Integer id) {
        Query query = getEm().createQuery("From TagProdotto as tg where tg.primaryKey.prodotto.id = :idProdotto");
        query.setParameter("idProdotto", id);
        return queryAll(query);
    }
}
