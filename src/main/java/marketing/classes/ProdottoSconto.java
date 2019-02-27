package marketing.classes;

import marketing.classes.Keys.ProdottoOrdineKey;
import marketing.classes.Keys.ProdottoScontoKey;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "prodotto_sconto")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.sconto",
                joinColumns = @JoinColumn(name = "idSconto")),
        @AssociationOverride(name = "primaryKey.prodotto",
                joinColumns = @JoinColumn(name = "idProdotto"))
})

public class ProdottoSconto {

    @EmbeddedId
    private ProdottoScontoKey primaryKey = new ProdottoScontoKey();

    public ProdottoScontoKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ProdottoScontoKey pk) {
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
    public Sconto getSconto() {
        return primaryKey.getSconto();
    }

    public void setSconto(Sconto sconto) {
        primaryKey.setSconto(sconto);
    }
}
