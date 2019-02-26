package marketing.classes;

import javax.persistence.*;

@Entity
@Table(name = "recensione")
public class Recensione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRecensione")
    private Integer idRecensione;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idProdotto")
    private Prodotto prodotto;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    @Column(name = "voto", nullable = false)
    private Integer voto;

    public Recensione() {

    }

    public Recensione(String descrizione,
                      Integer voto) {
        this.descrizione = descrizione;
        this.voto = voto;
    }

    public Integer getIdRecensione() {
        return idRecensione;
    }

    public void setIdUtente(Integer idRecensione) {
        this.idRecensione = idRecensione;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

}
