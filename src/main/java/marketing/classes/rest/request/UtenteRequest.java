package marketing.classes.rest.request;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import marketing.classes.Ordine;
import marketing.classes.ProdottoUtente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UtenteRequest implements Serializable {

    private Integer idUtente;

    private String nome;

    private String cognome;

    private String email;

    private String pIva;

    private List<ProdottoUtente> visite = new ArrayList<>();

    private List<Ordine> ordini = new ArrayList<>();

    @JsonGetter
    public Integer getId() {
        return idUtente;
    }

    @JsonSetter
    public void setId(Integer idUtente) {
        this.idUtente = idUtente;
    }

    @JsonGetter
    public String getNome() {
        return nome;
    }

    @JsonSetter
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonGetter
    public String getCognome() {
        return cognome;
    }

    @JsonSetter
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @JsonGetter
    public String getEmail() {
        return email;
    }

    @JsonSetter
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonGetter
    public String getpIva() {
        return pIva;
    }

    @JsonSetter
    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    @JsonGetter
    public List<ProdottoUtente> getVisite() {
        return visite;
    }

    @JsonSetter
    public void setVisite(List<ProdottoUtente> visite) {
        this.visite = visite;
    }

    public void addVisite (ProdottoUtente visita) {
        this.visite.add(visita);
    }

    @JsonGetter
    public List<Ordine> getOrdini() {
        return ordini;
    }

    @JsonSetter
    public void setOrdini(List<Ordine> ordini) {
        this.ordini = ordini;
    }

    public void addVisite (Ordine ordine) {
        this.ordini.add(ordine);
    }
}
