package entities;

import marketing.classes.Prodotto;
import marketing.classes.ProdottoUtente;
import marketing.classes.Utente;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import utils.TestUtil;


public class ManyToManyTest extends TestUtil {

    @Test
    public void insert1() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Prodotto prodotto = new Prodotto("Cover", 5, 10.0, 5, "Cover di platino", "15*5*10", 0.5, "nero", "qefwrgtrhytjuy", dateFormat.parse("2019-02-25"),  dateFormat.parse("2019-02-30"));
        Utente utente = new Utente("Gabriele", "Moia", "vdbfuegrnth", "vufesbgjrnthm");
        ProdottoUtente prodottoUtente = new ProdottoUtente();
        prodottoUtente.setUtente(utente);
        prodottoUtente.setProdotto(prodotto);
        prodottoUtente.setDate(new Date());
        utente.addVisita(prodottoUtente);
        em.getTransaction().begin();
        em.persist(prodotto);
        em.persist(utente);
        em.getTransaction().commit();
    }

    /*@Test
    public void insert2() {
        Prodotto p = new Prodotto();
        Fornitore f = new Fornitore("ciao");
        Fornitura fornitura = new Fornitura();
        fornitura.setFornitore(f);
        fornitura.setProdotto(p);
        fornitura.setDate(new Date());
        fornitura.setQuantita(3);
        f.addFornitura(fornitura);
        em.getTransaction().begin();
        em.persist(p);
        em.persist(f);
        em.getTransaction().commit();
    }

    @Test
    public void insertAlreadyExisting() {
        Prodotto p = getProdotto(1);
        Fornitore f = getFornitore(3);
        Fornitura fornitura = new Fornitura();
        fornitura.setFornitore(f);
        fornitura.setProdotto(p);
        fornitura.setDate(new Date());
        fornitura.setQuantita(3);
        em.getTransaction().begin();
        em.persist(fornitura);
        em.getTransaction().commit();
    }

    //cancella anche dalla tabella di relazione
    @Test
    public void testDeleteFornitore() {
        Fornitore f = em.find(Fornitore.class, 2);
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }

    //se si us il mapped anziche il join column si rompe quando cerchi di cancellare l'entità perchè violi i vincoli di chiave esterna
    @Test
    public void testDeleteProdotto() {
        Prodotto p = em.find(Prodotto.class, 3);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    @Test
    public void select() {

        Prodotto p = getProdotto(1);
        List<Fornitura> list = p.getForniture();
        list.forEach(x -> {
            System.out.println(x.getFornitore().getId());
        });
    }


    private Prodotto getProdotto(int id) {
        Query query = em.createQuery("select p From Prodotto p WHERE p.id=:id");
        query.setParameter("id", id);
        List results = query.getResultList();
        if (!results.isEmpty()) {
            Prodotto prodotto = (Prodotto) results.get(0);
            return prodotto;
        }
        return null;
    }

    private Fornitore getFornitore(int id) {
        Query query = em.createQuery("select f From Fornitore f WHERE f.id=:id");
        query.setParameter("id", id);
        List results = query.getResultList();
        if (!results.isEmpty()) {
            Fornitore fornitore = (Fornitore) results.get(0);
            return fornitore;
        }
        return null;
    }*/

}
