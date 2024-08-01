// mvnw.cmd clean install
package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDepto;
    private String nomeDepto;

    public Long getNumDepto() {
        return numDepto;
    }
    public void setNumDepto(Long numDepto) {
        this.numDepto = numDepto;
    }

    public String getNomeDepto() {
        return nomeDepto;
    }
    public void setNomeDepto(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }
}
