package marketing.dao;

import marketing.classes.Prodotto;
import marketing.classes.Tag;

import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

public class TagDao extends GenericDao<Tag> {

    @Override
    public List<Tag> getAll() throws SQLException {
        Query query = getEm().createQuery("FROM Tag");
        return queryAll(query);
    }

    @Override
    public void delete(Tag tag) throws SQLException {
        Tag f = getEm().find(Tag.class, tag.getNome());
        deleteQuery(f);
    }

    @Override
    public Tag getById(Tag i) {
        Tag f = getEm().find(Tag.class, i.getNome());
        if (f != null) {
            return f;
        } else {
            return null;
        }
    }
}
