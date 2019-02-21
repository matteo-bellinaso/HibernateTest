package marketing.classes;

public class ProdottoEvento {

    private int idProdotto;
    private int idEvento;

    public ProdottoEvento(int idProdotto, int idEvento) {
        super();
        this.idProdotto = idProdotto;
        this.idEvento = idEvento;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
}

