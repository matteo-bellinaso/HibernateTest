package entities;

import marketing.classes.Fattura;
import marketing.classes.MetodoPagamento;
import marketing.classes.Ordine;
import marketing.classes.Utente;
import org.junit.Test;
import utils.TestUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OneToOneTest extends TestUtil {

    @Test
    public void insert() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Ordine ordine = new Ordine(dateFormat.parse("2018-05-22"),"in consegna");
        Fattura fattura = new Fattura();
        fattura.setOrdine(ordine);
        ordine.setFattura(fattura);

        try {
            em.getTransaction().begin();
            em.persist(ordine);
            em.persist(fattura);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
            em.getTransaction().rollback();
        }
    }


    @Test
    public void testDeleteFattura() {
        Fattura f = em.find(Fattura.class, 19);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }

    @Test
    public void testDeleteOrdine() {
        Ordine f = em.find(Ordine.class, 8);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }


}
