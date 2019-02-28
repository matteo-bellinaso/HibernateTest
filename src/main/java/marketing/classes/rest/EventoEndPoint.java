package marketing.classes.rest;

import marketing.classes.rest.response.EventoResponse;
import marketing.classes.rest.response.UtenteResponse;
import marketing.dao.EventoDaoImpl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/evento")
public class EventoEndPoint {

    private EventoDaoImpl eventoDao = new EventoDaoImpl();

    @GET
    @Path("/getAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EventoResponse getAll() {
        EventoResponse response = new EventoResponse();
        if(eventoDao.getAll() == null) {
            System.out.println("------------------- NULLOO");
        } else {
            System.out.println("---------  Response utente   ------------" + eventoDao.getAll());

        }
        response.setEventi(eventoDao.getAll());
        return response;
    }
}
