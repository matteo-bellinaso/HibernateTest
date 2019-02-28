package entities;

import marketing.classes.*;
import marketing.dao.*;
import org.junit.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;

public class QueryTest {

    @Test
    public void queryProdotto(){
        ProdottoDao pd = new ProdottoDao();
        List<Prodotto> result = pd.getAll();

        for(Prodotto item : result) {
            System.out.println("prodotto: "  + item.getColore());
        }
    }

    @Test
    public void saveProduct() throws ParseException {
        ProdottoDao pd = new ProdottoDao();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Prodotto prodotto = new Prodotto("Coverz", 5, 10.0, "Cover di pelle", "15*5*10", 0.5, "nero", "qefwrgtrhytjuy", dateFormat.parse("2019-02-25"), dateFormat.parse("2019-02-30"));
        pd.save(prodotto);

    }

    @Test
    public void updateProduct() throws ParseException {
        ProdottoDao pd = new ProdottoDao();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Prodotto prodotto = new Prodotto("Coverone", 5, 10.0, "Cover di rame", "15*5*10", 0.5, "nero", "qefwrgtrhytjuy", dateFormat.parse("2019-02-25"), dateFormat.parse("2019-02-30"));
        prodotto.setId(1);
        pd.update(prodotto);

    }

    @Test
    public void getSingleProductById() throws ParseException {
        Prodotto prodotto = new Prodotto();
        prodotto.setId(2);
        ProdottoDao pd = new ProdottoDao();
        Prodotto p = pd.getById(prodotto);
        System.out.println(p.getNome());
    }


    @Test
    public void selectProdottoSconto() throws SQLException {
        ProdottoScontoDao psdb = new ProdottoScontoDao();
        List<ProdottoSconto> result = psdb.getAll();
        for(ProdottoSconto item : result) {
            System.out.println("prodotto: "  + item.getProdotto().getId() + " " + item.getSconto().getCommento());
        }
    }

    @Test
    public void insertUtente() {
        Utente utente = new Utente("Chew" , "Becca", "chew.becca@milleniumfalcon.org", "IanSoloSuka");
        UtenteDao udao = new UtenteDao();
        udao.save(utente);
    }

    @Test
    public void ProdottoUtente() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Utente u = new Utente();
        u.setId(4);
        Utente utente = new UtenteDao().getById(u);
        Prodotto pd = new Prodotto();
        pd.setId(1);
        Prodotto prodotto = new ProdottoDao().getById(pd);
        ProdottoUtenteDao puDao = new ProdottoUtenteDao();
        ProdottoUtente pu = new ProdottoUtente();
        pu.setUtente(utente);
        pu.setProdotto(prodotto);
        pu.setDate(dateFormat.parse("2019-02-28"));
        puDao.save(pu);
    }

    @Test
    public void getVisite() throws SQLException {
        Utente user = new Utente();
        user.setId(4);
        Utente utente = new UtenteDao().getById(user);

        ProdottoUtenteDao puDao = new ProdottoUtenteDao();

        List<ProdottoUtente> list = puDao.getByIdUtente(utente);

        for(ProdottoUtente item : list) {
            System.out.println(item.getDate());
        }
    }

    @Test
    public void tag() {
        Tag tag = new Tag("cellulare");
        TagDao tagDao = new TagDao();
        tagDao.save(tag);
    }


    @Test
    public void tagProdotto() {

        ProdottoTagDao ptDao = new ProdottoTagDao();
        List<TagProdotto> result = ptDao.getByProduct(3);

        String tagResult = "";
        for(TagProdotto item : result) {
            tagResult += item.getTag().getNome() + " ";
        }
        System.out.println(tagResult);
    }
}
