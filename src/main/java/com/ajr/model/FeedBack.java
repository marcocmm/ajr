/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajr.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mcmmattos
 */
public class FeedBack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFeedBack;
    
    private Etapa estapa;
    
    private String descricao;
    
    private char isAprovado;

    public Integer getIdFeedBack() {
        return idFeedBack;
    }

    public void setIdFeedBack(Integer idFeedBack) {
        this.idFeedBack = idFeedBack;
    }

    public Etapa getEstapa() {
        return estapa;
    }

    public void setEstapa(Etapa estapa) {
        this.estapa = estapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getIsAprovado() {
        return isAprovado;
    }

    public void setIsAprovado(char isAprovado) {
        this.isAprovado = isAprovado;
    }
    
    

}
