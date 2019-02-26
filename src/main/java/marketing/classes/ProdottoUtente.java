package marketing.classes;

import marketing.classes.Keys.ProdottoUtenteKey;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prodotto_utente")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.utente",
                joinColumns = @JoinColumn(name = "idUtente")),
        @AssociationOverride(name = "primaryKey.prodotto",
                joinColumns = @JoinColumn(name = "idProdotto"))
})
public class ProdottoUtente {
    @EmbeddedId
    private ProdottoUtenteKey primaryKey = new ProdottoUtenteKey();

    @Column(name = "dataVisita", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataVisita;

    public ProdottoUtenteKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ProdottoUtenteKey pk) {
        this.primaryKey = pk;
    }

    public Date getDate() {
        return dataVisita;
    }

    public void setDate(Date dataVisita) {
        this.dataVisita = dataVisita;
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
    public Utente getUtente() {
        return primaryKey.getUtente();
    }

    public void setUtente(Utente utente) {
        primaryKey.setUtente(utente);
    }
}
