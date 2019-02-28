package marketing.classes;

import marketing.interfaces.Orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento implements Orm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvento")
    private Integer idEvento;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dataInizio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInizio;

    @Column(name = "dataFine", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataFine;

    @OneToMany(mappedBy = "primaryKey.evento", cascade = CascadeType.ALL)
    private List<ProdottoEvento> prodottoEvento = new ArrayList<ProdottoEvento>();

    public Evento() {

    }

    public Evento(String nome, Date dataInizio, Date dataFine) {
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public Integer getidEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
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

    public List<ProdottoEvento> getProdottoEvento() {
        return prodottoEvento;
    }

    public void setProdottoEvento(List<ProdottoEvento> prodottoEvento) {
        this.prodottoEvento = prodottoEvento;
    }

    public void addProdottoEvento(ProdottoEvento pe) {
        prodottoEvento.add(pe);
    }
}

