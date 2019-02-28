package marketing.classes.rest;
import marketing.classes.rest.request.UtenteRequest;
import marketing.classes.rest.response.ProdottoUtenteResponse;
import marketing.classes.rest.response.UtenteResponse;
import marketing.dao.UtenteDaoImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/utente")
public class UtenteEndPoint {

    private UtenteDaoImpl utenteDao = new UtenteDaoImpl();

    @POST
    @Path("/getById")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UtenteResponse retrieveById(UtenteRequest utenteRequest) {
        UtenteResponse response = new UtenteResponse();
        response.addUtente(utenteDao.getById(utenteRequest.getId()));
        return response;
    }

    @GET
    @Path("/getAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UtenteResponse getAll() {
        UtenteResponse response = new UtenteResponse();
        if( utenteDao.getAll() == null) {
            System.out.println("------------------- NULLOO");
        } else {
            System.out.println("---------  Response utente   ------------" + utenteDao.getAll());

        }
        response.setUtenti(utenteDao.getAll());
        return response;
    }

    @GET
    @Path("/getVisita")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ProdottoUtenteResponse getVisita(){
        ProdottoUtenteResponse prodottoUtenteResponse = new ProdottoUtenteResponse();
        if(utenteDao.getByIdUtente()==null){
            System.out.println("------------------- NULLOO");
        }else{
            System.out.println("---------  Response utente   ------------" + utenteDao.getAll());
        }
        prodottoUtenteResponse.setProdotti(utenteDao.getByIdUtente());
        return prodottoUtenteResponse;
    }
}
