package marketing.interfaces;

import marketing.classes.ProdottoUtente;
import marketing.classes.Utente;

import java.util.List;

public interface UtenteDao {

    Utente getById(Integer id);

    List<Utente> getAll();

    List<ProdottoUtente> getByIdUtente();
}
