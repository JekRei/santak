package com.project.santak.model;

import javax.persistence.*;

//@Data

@Entity
public class ProdutoHasPigmento {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private long produto_id;
    private long pigmento_id;

    private String volume;
    private String qtd;

    //id
    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    //produto
//    public Produto getProduto() { return produto; }
//
//    public void setProduto(Produto produto) { this.produto = produto; }
//
//    //pigmento
//    public Pigmento getPigmento() { return pigmento; }
//
//    public void setPigmento(Pigmento pigmento) { this.pigmento = pigmento; }

    //volume
    public String getVolume() { return volume; }

    public void setVolume(String volume) { this.volume = volume; }

    //qtd
    public String getQtd() { return qtd; }

    public void setQtd(String qtd) { this.qtd = qtd; }
}
