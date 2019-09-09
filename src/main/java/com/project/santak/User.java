package com.project.santak;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class User implements Serializable {


    private String UNome;


    private String USenha;


    private String UMail;

    public String getUNome() {
        return UNome;
    }

    public void setUNome(String UNome) {
        this.UNome = UNome;
    }

    public String getUSenha() {
        return USenha;
    }

    public void setUSenha(String USenha) {
        this.USenha = USenha;
    }

    public String getUMail() {
        return UMail;
    }

    public void setUMail(String UMail) {
        this.UMail = UMail;
    }
}
