package com.project.santak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Pid;

    private String PCod;
    private String PNome;
    private String PMarca;
    private String PMaterial;
    private String PMedida;

    public String getPNome() {
        return PNome;
    }

    public void setPNome(String PNome) {
        this.PNome = PNome;
    }

    public String getPCod() {
        return PCod;
    }

    public void setPCod(String PCod) {
        this.PCod = PCod;
    }

    public String getPMarca() {
        return PMarca;
    }

    public void setPMarca(String PMarca) {
        this.PMarca = PMarca;
    }

    public long getPid() {
        return Pid;
    }

    public void setPid(long pid) {
        Pid = pid;
    }

    public String getPMaterial() {
        return PMaterial;
    }

    public void setPMaterial(String PMaterial) {
        this.PMaterial = PMaterial;
    }

    public String getPMedida() {
        return PMedida;
    }

    public void setPMedida(String PMedida) {
        this.PMedida = PMedida;
    }
}