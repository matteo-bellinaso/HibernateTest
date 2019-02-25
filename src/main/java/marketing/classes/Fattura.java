package marketing.classes;

import javax.persistence.*;

@Entity
@Table(name = "fattura")
public class Fattura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFattura")
    private Integer idFattura;

    @Column(name ="idOrdine")
    private Integer idOrdine;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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

    public Integer getIdOrdine() {
        return idOrdine;
    }

    public void setIdOrdine(Integer idOrdine) {
        this.idOrdine = idOrdine;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


}