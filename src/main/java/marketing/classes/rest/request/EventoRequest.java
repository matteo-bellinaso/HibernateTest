package marketing.classes.rest.request;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import marketing.classes.ProdottoEvento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoRequest implements Serializable {

    private Integer idEvento;
    private String nome;
    private Date dataInizio, dataFine;
    private List<ProdottoEvento> prodottoEvento = new ArrayList<ProdottoEvento>();


    @JsonGetter
    public Integer getId() {
        return idEvento;
    }

    @JsonSetter
    public void setId(Integer idUtente) {
        this.idEvento = idEvento;
    }

    @JsonGetter
    public String getNome() {
        return nome;
    }

    @JsonSetter
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonGetter
    public Date getDataInizio(){return dataInizio;}

    @JsonGetter
    public void setDataInizio(Date dataInizio){this.dataInizio = dataInizio;}

    @JsonGetter
    public Date getDataFine(){return dataInizio;}

    @JsonGetter
    public void setDataFine(Date dataFine){this.dataFine = dataFine;}

    @JsonGetter
    public List<ProdottoEvento> getProdottoEvento(){return prodottoEvento;}

    @JsonGetter
    public void setProdottoEvento (List<ProdottoEvento> prodottoEvento) {this.prodottoEvento = prodottoEvento;}
}
