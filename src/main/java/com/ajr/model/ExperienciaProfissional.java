package com.ajr.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity // This tells Hibernate to make a table out of this class
public class ExperienciaProfissional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idExpProf;
    
    private String empresa;
    
    private String cargo;
    
    private Date dataAdmissao;
    
    private Date dataDemissao;
    
    private Double salario;
    
    private String nomeReferencia;
    
    private String foneReferencia;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNomeReferencia() {
        return nomeReferencia;
    }

    public void setNomeReferencia(String nomeReferencia) {
        this.nomeReferencia = nomeReferencia;
    }

    public String getFoneReferencia() {
        return foneReferencia;
    }

    public void setFoneReferencia(String foneReferencia) {
        this.foneReferencia = foneReferencia;
    }

    public Integer getIdExpProf() {
        return idExpProf;
    }

    public void setIdExpProf(Integer idExpProf) {
        this.idExpProf = idExpProf;
    }


}
