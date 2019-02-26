package marketing.classes;

import marketing.classes.Keys.ProdottoEventoKey;
import marketing.classes.Keys.TagProdottoKey;

import javax.persistence.*;

@Entity
@Table(name = "prodotto_tag")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.tag",
                joinColumns = @JoinColumn(name = "nome")),
        @AssociationOverride(name = "primaryKey.prodotto",
                joinColumns = @JoinColumn(name = "idProdotto"))
})
public class TagProdotto {

    @EmbeddedId
    private TagProdottoKey primaryKey = new TagProdottoKey();

    public TagProdottoKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(TagProdottoKey pk) {
        this.primaryKey = pk;
    }

    @Transient
// Hibernate doesn’t try to map these getters. These getters are provided for convenience in case we want to obtain a specific side of the relationship
    public Prodotto getProdotto() {
        return primaryKey.getProdotto();
    }

    public void setProdotto(Prodotto prodotto) {
        primaryKey.setProdotto(prodotto);
    }

    @Transient
    public Tag getTag() {
        return primaryKey.getTag();
    }

    public void setTag(Tag tag) {
        primaryKey.setTag(tag);
    }
}

