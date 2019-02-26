package marketing.classes;

import marketing.classes.Keys.ProdottoOrdineKey;

import javax.persistence.*;

@Entity
@Table(name = "prodotto_ordine")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.ordine",
                joinColumns = @JoinColumn(name = "idOrdine")),
        @AssociationOverride(name = "primaryKey.prodotto",
                joinColumns = @JoinColumn(name = "idProdotto"))
})
public class ProdottoOrdine {

    @EmbeddedId
    private ProdottoOrdineKey primaryKey = new ProdottoOrdineKey();

    public ProdottoOrdineKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ProdottoOrdineKey pk) {
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
    public Ordine getOrdine() {
        return primaryKey.getOrdine();
    }

    public void setOrdine(Ordine ordine) {
        primaryKey.setOrdine(ordine);
    }
}
