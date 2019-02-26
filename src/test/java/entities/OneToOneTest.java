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
        MetodoPagamento metodoPagamento = new MetodoPagamento("Carta di credito");
        Fattura fattura = new Fattura();
        fattura.setMetodoPagamento(metodoPagamento);

        try {
            em.getTransaction().begin();
            em.persist(fattura);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Test
    public void insert2() throws ParseException {
        MetodoPagamento metodoPagamento = new MetodoPagamento("Paypal");
        Fattura fattura = new Fattura();
        fattura.setMetodoPagamento(metodoPagamento);

        try {
            em.getTransaction().begin();
            em.persist(fattura);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
            em.getTransaction().rollback();
        }
    }


    @Test
    public void testDeleteFattura() {
        Fattura f = em.find(Fattura.class, 3);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }
}
