package marketing.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "primaryKey.tag", cascade = CascadeType.ALL)
    private List<TagProdotto> tagProdotto = new ArrayList<TagProdotto>();

    public Tag() {

    }

    public Tag(
            String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<TagProdotto> getTagProdotto() {
        return tagProdotto;
    }

    public void setTagProdotto(List<TagProdotto> tagProdotto) {
        this.tagProdotto = tagProdotto;
    }

    public void addTagProdotto(TagProdotto tagProdotto) {
        this.tagProdotto.add(tagProdotto);
    }
}