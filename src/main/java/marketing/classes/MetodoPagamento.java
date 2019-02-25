package marketing.classes;

import javax.persistence.*;

@Entity
@Table (name = "metodo_pagamento")
public class MetodoPagamento {

    @Id
    @Column (name = "metodoPagamento")
    private String metodoPagamento;

    @OneToOne(mappedBy = "metodoPagamento", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Fattura fattura;

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
}

