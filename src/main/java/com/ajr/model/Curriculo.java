/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajr.model;

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

public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCurriculo;

    private DadosPessoais dadosPessoais;

    private List<Contato> contatos;

    private List<FeedBack> feedBackInterno;

    private List<FeedBack> feedBackExterno;

    private List<ExperienciaAcademica> expAcademicas;
    
    private List<ExperienciaProfissional> expProfissionais;

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<FeedBack> getFeedBackInterno() {
        return feedBackInterno;
    }

    public void setFeedBackInterno(List<FeedBack> feedBackInterno) {
        this.feedBackInterno = feedBackInterno;
    }

    public List<FeedBack> getFeedBackExterno() {
        return feedBackExterno;
    }

    public void setFeedBackExterno(List<FeedBack> feedBackExterno) {
        this.feedBackExterno = feedBackExterno;
    }

    public List<ExperienciaAcademica> getExpAcademicas() {
        return expAcademicas;
    }

    public void setExpAcademicas(List<ExperienciaAcademica> expAcademicas) {
        this.expAcademicas = expAcademicas;
    }

    public List<ExperienciaProfissional> getExpProfissionais() {
        return expProfissionais;
    }

    public void setExpProfissionais(List<ExperienciaProfissional> expProfissionais) {
        this.expProfissionais = expProfissionais;
    }

    public Integer getIdCurriculo() {
        return idCurriculo;
    }

    public void setIdCurriculo(Integer idCurriculo) {
        this.idCurriculo = idCurriculo;
    }

}
