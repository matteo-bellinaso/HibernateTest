package marketing.classes;

public class ProdottoOrdine {

    private int idProdotto;
    private int idOrdine;
    private int quantità;

    public ProdottoOrdine(int idProdotto, int idOrdine, int quantità) {
        super();
        this.idProdotto = idProdotto;
        this.idOrdine = idOrdine;
        this.quantità = quantità;
    }


    public int getIdProdotto() {
        return idProdotto;
    }


    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }


    public int getIdOrdine() {
        return idOrdine;
    }


    public void setIdOrdine(int idOrdine) {
        this.idOrdine = idOrdine;
    }


    public int getQuantità() {
        return quantità;
    }


    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }
}
