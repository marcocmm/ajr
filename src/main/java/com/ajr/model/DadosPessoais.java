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
@Entity
public class DadosPessoais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDadosPessoais;
    
    private String nome;
    
    private char sexo;
    
    private Date dataNascimento;
    
    private String estadoCivil;
    
    private NivelEscolar nivelEscolar;
    
    private Setor setorInteresse;
    
    private String textoSobre;
    
    private String cpf;
    
    private Endereco endereco;
    
    private List<Contato> contatos;

    public Integer getIdDadosPessoais() {
        return idDadosPessoais;
    }

    public void setIdDadosPessoais(Integer idDadosPessoais) {
        this.idDadosPessoais = idDadosPessoais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public NivelEscolar getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(NivelEscolar nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public Setor getSetorInteresse() {
        return setorInteresse;
    }

    public void setSetorInteresse(Setor setorInteresse) {
        this.setorInteresse = setorInteresse;
    }

    public String getTextoSobre() {
        return textoSobre;
    }

    public void setTextoSobre(String textoSobre) {
        this.textoSobre = textoSobre;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    
}
