/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_cupom_fiscal_referenciado")
@NamedQueries({
    @NamedQuery(name = "NfeCupomFiscalReferenciadoVO.findAll", query = "SELECT n FROM NfeCupomFiscalReferenciadoVO n")})
public class NfeCupomFiscalReferenciadoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MODELO_DOCUMENTO_FISCAL")
    private String modeloDocumentoFiscal;
    @Column(name = "NUMERO_ORDEM_ECF")
    private Integer numeroOrdemEcf;
    @Column(name = "COO")
    private Integer coo;
    @Column(name = "DATA_EMISSAO_CUPOM")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaoCupom;
    @Column(name = "NUMERO_CAIXA")
    private Integer numeroCaixa;
    @Column(name = "NUMERO_SERIE_ECF")
    private String numeroSerieEcf;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;

    public NfeCupomFiscalReferenciadoVO() {
    }

    public NfeCupomFiscalReferenciadoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModeloDocumentoFiscal() {
        return modeloDocumentoFiscal;
    }

    public void setModeloDocumentoFiscal(String modeloDocumentoFiscal) {
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public Integer getNumeroOrdemEcf() {
        return numeroOrdemEcf;
    }

    public void setNumeroOrdemEcf(Integer numeroOrdemEcf) {
        this.numeroOrdemEcf = numeroOrdemEcf;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Date getDataEmissaoCupom() {
        return dataEmissaoCupom;
    }

    public void setDataEmissaoCupom(Date dataEmissaoCupom) {
        this.dataEmissaoCupom = dataEmissaoCupom;
    }

    public Integer getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(Integer numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public String getNumeroSerieEcf() {
        return numeroSerieEcf;
    }

    public void setNumeroSerieEcf(String numeroSerieEcf) {
        this.numeroSerieEcf = numeroSerieEcf;
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
        if (!(object instanceof NfeCupomFiscalReferenciadoVO)) {
            return false;
        }
        NfeCupomFiscalReferenciadoVO other = (NfeCupomFiscalReferenciadoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeCupomFiscalReferenciadoVO[ id=" + id + " ]";
    }
    
}
