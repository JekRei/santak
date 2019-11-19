package com.project.santak.model;

import javax.persistence.*;
import java.util.Set;

//@Data
//@EqualsAndHashCode(exclude = "produtos")

@Entity
@Table(name="materiais")
public class Material {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String nome;

//    @OneToMany(mappedBy = "materiais", cascade = CascadeType.ALL)
//    private Set<Produto> produtos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
