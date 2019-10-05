package com.project.santak.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Materiais {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String nome;
}
