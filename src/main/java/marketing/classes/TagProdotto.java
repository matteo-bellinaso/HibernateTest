package marketing.classes;

public class TagProdotto {

    private int nome;
    private int idProdotto;

    public TagProdotto(int nome, int idProdotto) {
        this.nome = nome;
        this.idProdotto = idProdotto;
    }

    public int getNome() {
        return nome;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdTag(int nome) {
        this.nome = nome;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }
}

