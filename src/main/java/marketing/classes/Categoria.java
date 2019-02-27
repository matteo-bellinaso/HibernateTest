package marketing.classes;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Column(name = "nome")
    private String nome;

    @Column(name = "parentId")
    private Integer parentId;


    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Prodotto> prodotti = new ArrayList<Prodotto>();

    public Categoria() {
    }


    public Categoria(String nome, int parentId) {
        this.nome = nome;
        this.parentId = parentId;
    }

    public Integer getId() {
        return idCategoria;
    }

    public void setId(Integer id) {
        this.idCategoria = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


    public List<Prodotto> getProdotto() {
        return prodotti;
    }

    public void setProdotto(List<Prodotto> ordini) {
        this.prodotti = ordini;
    }

    //fa l'on delete set null
    @PreRemove
    public void removeForeignKey() {
        for (Prodotto prodotto : prodotti) {
            prodotto.setCategoria(null);
        }
    }


}
