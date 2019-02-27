package marketing.classes.Keys;

import marketing.classes.Prodotto;
import marketing.classes.Sconto;
import marketing.classes.Utente;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable

public class ProdottoScontoKey implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Sconto sconto;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Prodotto prodotto;

    public Sconto getSconto() {
        return sconto;
    }

    public void setSconto(Sconto sconto) {
        this.sconto = sconto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }
}
