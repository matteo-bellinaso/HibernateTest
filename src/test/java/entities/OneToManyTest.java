package entities;

import marketing.classes.Ordine;
import marketing.classes.Utente;
import org.junit.Test;
import utils.TestUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OneToManyTest extends TestUtil {
    @Test
    public void insert() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Utente utente = new Utente("Simone", "Bergomi", "vdbfuegrnth", "vufesbgjrnthm");
        Ordine ordine = new Ordine(dateFormat.parse("2018-05-18"), "Consegnato");

        ordine.setUtente(utente);

        try {

            em.getTransaction().begin();
            em.persist(ordine);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
            em.getTransaction().rollback();
        }
    }

}
