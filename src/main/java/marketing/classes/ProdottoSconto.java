package marketing.classes;

import java.sql.Date;

public class ProdottoSconto {

    private int idProdotto;
    private int idSconto;
    private Date dataInizio;
    private Date dataFine;

    public ProdottoSconto(int idProdotto, int idSconto, Date dataInizio, Date dataFine) {
        this.idProdotto = idProdotto;
        this.idSconto = idSconto;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public int getIdSconto() {
        return idSconto;
    }

    public void setIdSconto(int idSconto) {
        this.idSconto = idSconto;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
}
