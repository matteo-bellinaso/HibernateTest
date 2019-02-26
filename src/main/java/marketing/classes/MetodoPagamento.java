package marketing.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "metodo_pagamento")
public class MetodoPagamento {

    @Id
    @Column (name = "metodoPagamento")
    private String metodoPagamento;

    @OneToMany(mappedBy = "metodoPagamento", fetch = FetchType.LAZY)
    private List<Fattura> fatture = new ArrayList<Fattura>();

    public MetodoPagamento(){

    }

    public MetodoPagamento (String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public List<Fattura> getFatture() {return fatture;}

    public void setFatture (List<Fattura> fatture) { this.fatture = fatture;}
}

