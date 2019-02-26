package marketing.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrdine")
    private Integer idOrdine;

    @OneToOne(mappedBy = "ordine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Fattura fattura;

    @Column(name = "dataOrdine", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataOrdine;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUtente")
    private Utente utente;

    @OneToMany(mappedBy = "primaryKey.ordine", cascade = CascadeType.REMOVE)
    private List<ProdottoOrdine> prodottoOrdine = new ArrayList<ProdottoOrdine>();

    @Column(name = "stato", nullable = false)
    private String stato;

    public Ordine() {

    }

    public Ordine(Date dataOrdine, String stato) {
        this.dataOrdine = dataOrdine;
        this.stato = stato;
    }

    public Integer getId() {
        return idOrdine;
    }

    public void setId(Integer id) {
        this.idOrdine = id;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Fattura getFattura() {
        return fattura;
    }

    public void setFattura(Fattura fattura) {
        this.fattura = fattura;
    }

    public List<ProdottoOrdine> getProdottoOrdine() {
        return prodottoOrdine;
    }

    public void setProdottoOrdine(List<ProdottoOrdine> prodottoOrdine) {
        this.prodottoOrdine = prodottoOrdine;
    }

    public void addProdottoOrdine(ProdottoOrdine prodottoOrdine) {
        this.prodottoOrdine.add(prodottoOrdine);
    }
}