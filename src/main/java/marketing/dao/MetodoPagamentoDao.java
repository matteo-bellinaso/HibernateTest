package marketing.dao;

import marketing.classes.MetodoPagamento;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class MetodoPagamentoDao extends GenericDao<MetodoPagamento> {
    @Override
    public List<MetodoPagamento> getAll() throws SQLException {
        List<MetodoPagamento> result;
        Query query = getEm().createQuery("FROM MetodoPagamento");
        return queryAll(query);
    }

    @Override
    public void delete(MetodoPagamento metodoPagamento) throws SQLException {
        MetodoPagamento f = getEm().find(MetodoPagamento.class, metodoPagamento.getMetodoPagamento());
        deleteQuery(f);
    }

    @Override
    public MetodoPagamento getById(MetodoPagamento i) {
        return null;
    }
}
