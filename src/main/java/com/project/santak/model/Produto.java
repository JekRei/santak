package com.project.santak.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

//@Data
//@EqualsAndHashCode(exclude = "produtoHasPigmentos")

@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String cod;
    private String cor;
    private String marca;
    private String medida;

    private String red;
    private String yellow;
    private String blue;
    private String ocre;
    private String black;
    private String rust_red;
    private String green;

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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public String getOcre() {
        return ocre;
    }

    public void setOcre(String ocre) {
        this.ocre = ocre;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String getRust_red() {
        return rust_red;
    }

    public void setRust_red(String rust_red) {
        this.rust_red = rust_red;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }
}