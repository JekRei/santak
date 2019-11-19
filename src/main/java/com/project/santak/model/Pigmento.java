package com.project.santak.model;

import javax.persistence.*;
import java.util.Set;

//@Data
//@EqualsAndHashCode(exclude = "produtoHasPigmentos")

@Entity
public class Pigmento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String nome;

//    @OneToMany(mappedBy = "pigmentos", cascade = CascadeType.ALL)
//    private Set<ProdutoHasPigmento> produtoHasPigmentos;

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
