/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_prod_rural_referenciada")
@NamedQueries({
    @NamedQuery(name = "NfeProdRuralReferenciadaVO.findAll", query = "SELECT n FROM NfeProdRuralReferenciadaVO n")})
public class NfeProdRuralReferenciadaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO_UF")
    private Integer codigoUf;
    @Column(name = "ANO_MES")
    private String anoMes;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "INSCRICAO_ESTADUAL")
    private String inscricaoEstadual;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "NUMERO_NF")
    private String numeroNf;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;

    public NfeProdRuralReferenciadaVO() {
    }

    public NfeProdRuralReferenciadaVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(Integer codigoUf) {
        this.codigoUf = codigoUf;
    }

    public String getAnoMes() {
        return anoMes;
    }

    public void setAnoMes(String anoMes) {
        this.anoMes = anoMes;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(String numeroNf) {
        this.numeroNf = numeroNf;
    }

    public NfeCabecalhoVO getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(NfeCabecalhoVO idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeProdRuralReferenciadaVO)) {
            return false;
        }
        NfeProdRuralReferenciadaVO other = (NfeProdRuralReferenciadaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeProdRuralReferenciadaVO[ id=" + id + " ]";
    }
    
}
