package marketing.classes;

import java.sql.Date;

public class Evento {
    private int id;
    private String nome;
    private Date dataInizio, dataFine;

    public Evento(int id, String nome, Date dataInizio, Date dataFine) {

        this.id = id;
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

