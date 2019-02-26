package entities;

import marketing.classes.*;
import org.junit.Test;
import utils.TestUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OneToManyTest extends TestUtil {
    @Test
    public void insertUtenteOrdine() throws ParseException {
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
    public void inserteMetodoFattura() throws ParseException {
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
    public void insertProdottoRecensione() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Prodotto prodotto = new Prodotto("Forbice", 5, 10.0, 5, "Cover di platino", "15*5*10", 0.5, "nero", "qefwrgtrhytjuy", dateFormat.parse("2019-02-25"),  dateFormat.parse("2019-02-30"));
        Recensione recensione = new Recensione("Bello", 6);

        recensione.setProdotto(prodotto);

        try {
            em.getTransaction().begin();
            em.persist(recensione);
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

    @Test
    public void testDeleteRecensione() {
        Recensione f = em.find(Recensione.class, 2);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }

    @Test
    public void testDeleteProdotto() {
        Prodotto f = em.find(Prodotto.class, 1);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }
}
