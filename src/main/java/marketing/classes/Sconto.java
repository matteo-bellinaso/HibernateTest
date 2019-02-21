package marketing.classes;

public class Sconto {

    private int idSconto;
    private int percentuale;
    private String commento;

    public Sconto (int idSconto, int percentuale, String commento) {
        this.idSconto = idSconto;
        this.percentuale = percentuale;
        this.commento = commento;
    }

    public int getIdSconto() {
        return idSconto;
    }

    public void setIdSconto(int idSconto) {
        this.idSconto = idSconto;
    }

    public int getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(int percentuale) {
        this.percentuale = percentuale;
    }

    public String getCommento() {
        return commento;
    }

    public void setCommento(String commento) {
        this.commento = commento;
    }


}

