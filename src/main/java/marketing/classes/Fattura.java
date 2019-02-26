package marketing.classes;

import javax.persistence.*;

@Entity
@Table(name = "fattura")
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFattura")
    private Integer idFattura;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idOrdine")
    private Ordine ordine;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "metodoPagamento")
    private MetodoPagamento metodoPagamento;

    public Fattura() {
    }

    public Integer getId() {
        return idFattura;
    }

    public void setId(Integer id) {
        this.idFattura = id;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


}