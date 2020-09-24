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
@Table(name = "nfe_detalhe_imposto_ipi")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoIpiVO.findAll", query = "SELECT n FROM NfeDetalheImpostoIpiVO n")})
public class NfeDetalheImpostoIpiVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ENQUADRAMENTO_IPI")
    private String enquadramentoIpi;
    @Column(name = "CNPJ_PRODUTOR")
    private String cnpjProdutor;
    @Column(name = "CODIGO_SELO_IPI")
    private String codigoSeloIpi;
    @Column(name = "QUANTIDADE_SELO_IPI")
    private Integer quantidadeSeloIpi;
    @Column(name = "ENQUADRAMENTO_LEGAL_IPI")
    private String enquadramentoLegalIpi;
    @Column(name = "CST_IPI")
    private String cstIpi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_BASE_CALCULO_IPI")
    private Double valorBaseCalculoIpi;
    @Column(name = "ALIQUOTA_IPI")
    private Double aliquotaIpi;
    @Column(name = "QUANTIDADE_UNIDADE_TRIBUTAVEL")
    private Double quantidadeUnidadeTributavel;
    @Column(name = "VALOR_UNIDADE_TRIBUTAVEL")
    private Double valorUnidadeTributavel;
    @Column(name = "VALOR_IPI")
    private Double valorIpi;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoIpiVO() {
    }

    public NfeDetalheImpostoIpiVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnquadramentoIpi() {
        return enquadramentoIpi;
    }

    public void setEnquadramentoIpi(String enquadramentoIpi) {
        this.enquadramentoIpi = enquadramentoIpi;
    }

    public String getCnpjProdutor() {
        return cnpjProdutor;
    }

    public void setCnpjProdutor(String cnpjProdutor) {
        this.cnpjProdutor = cnpjProdutor;
    }

    public String getCodigoSeloIpi() {
        return codigoSeloIpi;
    }

    public void setCodigoSeloIpi(String codigoSeloIpi) {
        this.codigoSeloIpi = codigoSeloIpi;
    }

    public Integer getQuantidadeSeloIpi() {
        return quantidadeSeloIpi;
    }

    public void setQuantidadeSeloIpi(Integer quantidadeSeloIpi) {
        this.quantidadeSeloIpi = quantidadeSeloIpi;
    }

    public String getEnquadramentoLegalIpi() {
        return enquadramentoLegalIpi;
    }

    public void setEnquadramentoLegalIpi(String enquadramentoLegalIpi) {
        this.enquadramentoLegalIpi = enquadramentoLegalIpi;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public Double getValorBaseCalculoIpi() {
        return valorBaseCalculoIpi;
    }

    public void setValorBaseCalculoIpi(Double valorBaseCalculoIpi) {
        this.valorBaseCalculoIpi = valorBaseCalculoIpi;
    }

    public Double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(Double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public Double getQuantidadeUnidadeTributavel() {
        return quantidadeUnidadeTributavel;
    }

    public void setQuantidadeUnidadeTributavel(Double quantidadeUnidadeTributavel) {
        this.quantidadeUnidadeTributavel = quantidadeUnidadeTributavel;
    }

    public Double getValorUnidadeTributavel() {
        return valorUnidadeTributavel;
    }

    public void setValorUnidadeTributavel(Double valorUnidadeTributavel) {
        this.valorUnidadeTributavel = valorUnidadeTributavel;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public NfeDetalheVO getIdNfeDetalhe() {
        return idNfeDetalhe;
    }

    public void setIdNfeDetalhe(NfeDetalheVO idNfeDetalhe) {
        this.idNfeDetalhe = idNfeDetalhe;
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
        if (!(object instanceof NfeDetalheImpostoIpiVO)) {
            return false;
        }
        NfeDetalheImpostoIpiVO other = (NfeDetalheImpostoIpiVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoIpiVO[ id=" + id + " ]";
    }
    
}
