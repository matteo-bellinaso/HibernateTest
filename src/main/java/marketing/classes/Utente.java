package marketing.classes;

import marketing.interfaces.Orm;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utente")
public class Utente implements Orm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUtente")
    private Integer idUtente;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cognome", nullable = false)
    private String cognome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "pIva")
    private String pIva;

    @JsonIgnore
    @OneToMany(mappedBy = "primaryKey.utente", cascade = CascadeType.ALL)
    private List<ProdottoUtente> visite = new ArrayList<ProdottoUtente>();

    @JsonIgnore
    @OneToMany(mappedBy = "utente", fetch = FetchType.LAZY)
    private List<Ordine> ordini = new ArrayList<Ordine>();

    public Utente(){

    }

    public Utente(String nome, String cognome, String email, String partitaIVA) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.pIva = partitaIVA;
    }

    public Integer getId() {
        return idUtente;
    }

    public void setId(Integer id) {
        this.idUtente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPartitaIVA() {
        return pIva;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.pIva = partitaIVA;
    }

    public List<ProdottoUtente> getVisite() {
        return visite;
    }

    public void setVisite(List<ProdottoUtente> visite) {
        this.visite = visite;
    }

    public void addVisita(ProdottoUtente v) {
        visite.add(v);
    }

    public List<Ordine> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<Ordine> ordini) {
        this.ordini = ordini;
    }

    @PreRemove
    public void removeForeignKey() {
        for (Ordine ordine : ordini) {
            ordine.setUtente(null);
        }
    }
}
