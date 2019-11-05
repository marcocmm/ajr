/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajr.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mcmmattos
 */
@Entity // This tells Hibernate to make a table out of this class
public class ProcessoSeletivo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProcessoSeletivo;

    private List<Cargo> cargos;

    private List<Curriculo> curriculos;

    private List<Etapa> estapas;
    
    private Date dataInicial;
    
    private Date dataFinal;

    public Integer getIdProcessoSeletivo() {
        return idProcessoSeletivo;
    }

    public void setIdProcessoSeletivo(Integer idProcessoSeletivo) {
        this.idProcessoSeletivo = idProcessoSeletivo;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Curriculo> getCurriculos() {
        return curriculos;
    }

    public void setCurriculos(List<Curriculo> curriculos) {
        this.curriculos = curriculos;
    }

    public List<Etapa> getEstapas() {
        return estapas;
    }

    public void setEstapas(List<Etapa> estapas) {
        this.estapas = estapas;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    
}
