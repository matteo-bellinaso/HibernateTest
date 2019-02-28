package marketing.classes.rest.response;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import marketing.classes.Utente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UtenteResponse implements Serializable {
    private List<Utente> utenti = new ArrayList<>();

    @JsonGetter
    public List<Utente> getUtenti() {
        return utenti;
    }

    @JsonSetter
    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public void addUtente(Utente utente) {
        utenti.add(utente);
    }
}
