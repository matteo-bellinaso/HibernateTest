package marketing.classes;

public class Utente {

    private int idUtente;
    private String nome;
    private String cognome;
    private String email;
    private String pIva;

    public Utente(int id, String nome, String cognome, String email, String partitaIVA) {
        this.idUtente = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.pIva = partitaIVA;
    }

    public int getId() {
        return idUtente;
    }

    public void setId(int id) {
        this.idUtente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPartitaIVA() {
        return pIva;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.pIva = partitaIVA;
    }
}
