package marketing.classes;

import javax.persistence.*;

@Entity
@Table(name = "prodotto_evento")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.evento",
                joinColumns = @JoinColumn(name = "idEvento")),
        @AssociationOverride(name = "primaryKey.prodotto",
                joinColumns = @JoinColumn(name = "idProdotto"))
})
public class ProdottoEvento {

    @EmbeddedId
    private ProdottoEventoKey primaryKey = new ProdottoEventoKey();

    public ProdottoEventoKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ProdottoEventoKey pk) {
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
    public Evento getEvento() {
        return primaryKey.getEvento();
    }

    public void setEvento(Evento evento) {
        primaryKey.setEvento(evento);
    }
}

