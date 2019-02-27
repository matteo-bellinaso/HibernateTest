package marketing.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sconto")
public class Sconto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSconto")
    private Integer idSconto;

    @Column(name = "percentuale", nullable = false)
    private Integer percentuale;

    @Column(name = "commento")
    private String commento;

    @OneToMany(mappedBy = "primaryKey.sconto", cascade = CascadeType.ALL)
    private List<ProdottoSconto> prodottoSconto = new ArrayList<ProdottoSconto>();

    public Sconto() { }

    public Sconto(Integer percentuale, String commento) {
        this.percentuale = percentuale;
        this.commento = commento;
    }

    public Integer getIdSconto() {
        return idSconto;
    }

    public void setIdSconto(Integer idSconto) {
        this.idSconto = idSconto;
    }

    public Integer getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(Integer percentuale) {
        this.percentuale = percentuale;
    }

    public String getCommento() {
        return commento;
    }

    public void setCommento(String commento) {
        this.commento = commento;
    }

    public List<ProdottoSconto> getProdottoSconto() {
        return prodottoSconto;
    }

    public void setProdottoSconto(List<ProdottoSconto> prodottoSconto) {
        this.prodottoSconto = prodottoSconto;
    }

    public void addProdottoSconto(ProdottoSconto ps) {
        prodottoSconto.add(ps);
    }

}

