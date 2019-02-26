package marketing.classes;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "prodotto")
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProdotto")
    private Integer idProdotto;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "idProduttore", nullable = false)
    private Integer idProduttore;

    @Column(name = "prezzo", nullable = false)
    private Double prezzo;

    @Column(name = "idCategoria", nullable = false)
    private Integer idCategorie;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    @Column(name = "misure")
    private String misure;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "colore")
    private String colore;

    @Column(name = "pathImmagini", nullable = false)
    private String pathImmagini;

    @Column(name = "dataInizioValidità", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInizioValidita;

    @Column(name = "dataFineValidità", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateFineValidita;

    @OneToMany(mappedBy = "primaryKey.prodotto", cascade = CascadeType.ALL)
    private List<ProdottoUtente> visite = new ArrayList<ProdottoUtente>();

    @OneToMany(mappedBy = "primaryKey.prodotto", cascade = CascadeType.ALL)
    private List<ProdottoEvento> prodottoEvento = new ArrayList<ProdottoEvento>();

    @OneToMany(mappedBy = "primaryKey.prodotto", cascade = CascadeType.ALL)
    private List<ProdottoOrdine> prodottoOrdine = new ArrayList<ProdottoOrdine>();

    @OneToMany(mappedBy = "prodotto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Recensione> recensioni = new ArrayList<Recensione>();

    @OneToMany(mappedBy = "prodotto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TagProdotto> tagProdotto = new ArrayList<TagProdotto>();

    public Prodotto() {

    }

    public Prodotto(String nome,
                    Integer idProduttore,
                    Double prezzo,
                    Integer idCategorie,
                    String descrizione,
                    String misure,
                    Double peso,
                    String colore,
                    String pathImmagini,
                    Date dataInizioValidita,
                    Date dateFineValidita) {

        this.nome = nome;
        this.idProduttore = idProduttore;
        this.prezzo = prezzo;
        this.idCategorie = idCategorie;
        this.descrizione = descrizione;
        this.misure = misure;
        this.peso = peso;
        this.colore = colore;
        this.pathImmagini = pathImmagini;
        this.dataInizioValidita = dataInizioValidita;
        this.dateFineValidita = dateFineValidita;
    }

    public Integer getId() {
        return idProdotto;
    }

    public void setId(Integer idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdProduttore() {
        return idProduttore;
    }

    public void setIdProduttore(Integer idProduttore) {
        this.idProduttore = idProduttore;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getMisure() {
        return misure;
    }

    public void setMisure(String misure) {
        this.misure = misure;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getPathImmagini() {
        return pathImmagini;
    }

    public void setPathImmagini(String pathImmagini) {
        this.pathImmagini = pathImmagini;
    }

    public Date getDataInizioValidita() {
        return dataInizioValidita;
    }

    public void setDataInizioValidita(Date dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    public Date getDateFineValidita() {
        return dateFineValidita;
    }

    public void setDateFineValidita(Date dateFineValidita) {
        this.dateFineValidita = dateFineValidita;
    }

    public List<Recensione> getProdotti() {
        return recensioni;
    }

    public void setProdotti(List<Recensione> recensioni) {
        this.recensioni = recensioni;
    }

    /*public List<ProdottoUtente> getVisite() {
        return visite;
    }

    public void setVisite(List<ProdottoUtente> visite) {
        this.visite = visite;
    }

    public void addVisite(ProdottoUtente v) {
        visite.add(v);
    }

    public List<ProdottoEvento> getProdottoEvento() {
        return prodottoEvento;
    }

    public void setProdottoEvento(List<ProdottoEvento> prodottoEvento) {
        this.prodottoEvento = prodottoEvento;
    }

    public void addProdottoEvento(ProdottoEvento pe) {
        prodottoEvento.add(pe);
    }

    public List<ProdottoOrdine> getProdottoOrdine() {
        return prodottoOrdine;
    }

    public void setProdottoOrdine(List<ProdottoOrdine> prodottoOrdine) {
        this.prodottoOrdine = prodottoOrdine;
    }

    public void addProdottoOrdine(ProdottoOrdine prodottoOrdine) {
        this.prodottoOrdine.add(prodottoOrdine);
    }*/
}
