package entities;

import marketing.classes.Fattura;
import marketing.classes.MetodoPagamento;
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

    @Test
    public void insert2() throws ParseException {
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
    public void testDeleteFattura() {
        Fattura f = em.find(Fattura.class, 10);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }

}
