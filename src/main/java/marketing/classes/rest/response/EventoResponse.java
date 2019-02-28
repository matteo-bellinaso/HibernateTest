package marketing.classes.rest.response;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import marketing.classes.Evento;
import marketing.classes.Utente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EventoResponse implements Serializable {
    private List<Evento> eventi = new ArrayList<Evento>();


    @JsonGetter
    public List<Evento> getEventi() {
        return eventi;
    }

    @JsonSetter
    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    public void addEvento (Evento evento) {
        eventi.add(evento);
    }
}
