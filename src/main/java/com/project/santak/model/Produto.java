package com.project.santak.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

//@Data
//@EqualsAndHashCode(exclude = "produtoHasPigmentos")

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String cod;
    private String cor;
    private String nome;
    private String marca;

    private long material_id;
    private long user_id;

//    @ManyToOne
//    @JoinColumn
//    private Material material;
//
//    @ManyToOne
//    @JoinColumn
//    private User user;
//
//    @OneToMany(mappedBy = "produtos", cascade = CascadeType.ALL)
//    private Set<ProdutoHasPigmento> produtoHasPigmentos;

    //nome
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    //cod
    public String getCod() { return cod; }

    public void setCod(String cod) { this.cod = cod; }

    //marca
    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    //id
    public long getId() { return id; }

    public void setId(long id) { id = id; }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(long material_id) {
        this.material_id = material_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}