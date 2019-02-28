package marketing.dao;

import marketing.classes.Categoria;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class CategoriaDao extends GenericDao<Categoria> {

    @Override
    public List<Categoria> getAll() throws SQLException {
        List<Categoria> result;
        Query query = getEm().createQuery("FROM Categoria");
        return queryAll(query);
    }

    @Override
    public void delete(Categoria categoria) throws SQLException {
        Categoria f = getEm().find(Categoria.class, categoria.getId());
        deleteQuery(f);
    }

    @Override
    public Categoria getById(Categoria id) {
        Categoria f = getEm().find(Categoria.class, id.getId());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
