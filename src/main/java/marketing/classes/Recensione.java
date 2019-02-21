package marketing.classes;

public class Recensione {

    private int idRecensione;
    private int idProdotto;
    private String descrizione;
    private int voto;

    public Recensione(int idRecensione,
                      int idProdotto,
                      String descrizione,
                      int voto) {

        this.idRecensione = idRecensione;
        this.idProdotto = idProdotto;
        this.descrizione = descrizione;
        this.voto = voto;
    }

    public int getIdRecensione() {
        return idRecensione;
    }

    public void setIdUtente(int idRecensione) {
        this.idRecensione = idRecensione;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

}
