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
@Table(name = "nfe_detalhe_imposto_icms")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoIcmsVO.findAll", query = "SELECT n FROM NfeDetalheImpostoIcmsVO n")})
public class NfeDetalheImpostoIcmsVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ORIGEM_MERCADORIA")
    private String origemMercadoria;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CSOSN")
    private String csosn;
    @Column(name = "MODALIDADE_BC_ICMS")
    private String modalidadeBcIcms;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAXA_REDUCAO_BC_ICMS")
    private Double taxaReducaoBcIcms;
    @Column(name = "BASE_CALCULO_ICMS")
    private Double baseCalculoIcms;
    @Column(name = "ALIQUOTA_ICMS")
    private Double aliquotaIcms;
    @Column(name = "VALOR_ICMS")
    private Double valorIcms;
    @Column(name = "MOTIVO_DESONERACAO_ICMS")
    private String motivoDesoneracaoIcms;
    @Column(name = "MODALIDADE_BC_ICMS_ST")
    private String modalidadeBcIcmsSt;
    @Column(name = "PERCENTUAL_MVA_ICMS_ST")
    private Double percentualMvaIcmsSt;
    @Column(name = "PERCENTUAL_REDUCAO_BC_ICMS_ST")
    private Double percentualReducaoBcIcmsSt;
    @Column(name = "VALOR_BASE_CALCULO_ICMS_ST")
    private Double valorBaseCalculoIcmsSt;
    @Column(name = "ALIQUOTA_ICMS_ST")
    private Double aliquotaIcmsSt;
    @Column(name = "VALOR_ICMS_ST")
    private Double valorIcmsSt;
    @Column(name = "VALOR_BC_ICMS_ST_RETIDO")
    private Double valorBcIcmsStRetido;
    @Column(name = "VALOR_ICMS_ST_RETIDO")
    private Double valorIcmsStRetido;
    @Column(name = "VALOR_BC_ICMS_ST_DESTINO")
    private Double valorBcIcmsStDestino;
    @Column(name = "VALOR_ICMS_ST_DESTINO")
    private Double valorIcmsStDestino;
    @Column(name = "ALIQUOTA_CREDITO_ICMS_SN")
    private Double aliquotaCreditoIcmsSn;
    @Column(name = "VALOR_CREDITO_ICMS_SN")
    private Double valorCreditoIcmsSn;
    @Column(name = "PERCENTUAL_BC_OPERACAO_PROPRIA")
    private Double percentualBcOperacaoPropria;
    @Column(name = "UF_ST")
    private String ufSt;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoIcmsVO() {
    }

    public NfeDetalheImpostoIcmsVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigemMercadoria() {
        return origemMercadoria;
    }

    public void setOrigemMercadoria(String origemMercadoria) {
        this.origemMercadoria = origemMercadoria;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public String getModalidadeBcIcms() {
        return modalidadeBcIcms;
    }

    public void setModalidadeBcIcms(String modalidadeBcIcms) {
        this.modalidadeBcIcms = modalidadeBcIcms;
    }

    public Double getTaxaReducaoBcIcms() {
        return taxaReducaoBcIcms;
    }

    public void setTaxaReducaoBcIcms(Double taxaReducaoBcIcms) {
        this.taxaReducaoBcIcms = taxaReducaoBcIcms;
    }

    public Double getBaseCalculoIcms() {
        return baseCalculoIcms;
    }

    public void setBaseCalculoIcms(Double baseCalculoIcms) {
        this.baseCalculoIcms = baseCalculoIcms;
    }

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public String getMotivoDesoneracaoIcms() {
        return motivoDesoneracaoIcms;
    }

    public void setMotivoDesoneracaoIcms(String motivoDesoneracaoIcms) {
        this.motivoDesoneracaoIcms = motivoDesoneracaoIcms;
    }

    public String getModalidadeBcIcmsSt() {
        return modalidadeBcIcmsSt;
    }

    public void setModalidadeBcIcmsSt(String modalidadeBcIcmsSt) {
        this.modalidadeBcIcmsSt = modalidadeBcIcmsSt;
    }

    public Double getPercentualMvaIcmsSt() {
        return percentualMvaIcmsSt;
    }

    public void setPercentualMvaIcmsSt(Double percentualMvaIcmsSt) {
        this.percentualMvaIcmsSt = percentualMvaIcmsSt;
    }

    public Double getPercentualReducaoBcIcmsSt() {
        return percentualReducaoBcIcmsSt;
    }

    public void setPercentualReducaoBcIcmsSt(Double percentualReducaoBcIcmsSt) {
        this.percentualReducaoBcIcmsSt = percentualReducaoBcIcmsSt;
    }

    public Double getValorBaseCalculoIcmsSt() {
        return valorBaseCalculoIcmsSt;
    }

    public void setValorBaseCalculoIcmsSt(Double valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
    }

    public Double getAliquotaIcmsSt() {
        return aliquotaIcmsSt;
    }

    public void setAliquotaIcmsSt(Double aliquotaIcmsSt) {
        this.aliquotaIcmsSt = aliquotaIcmsSt;
    }

    public Double getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(Double valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public Double getValorBcIcmsStRetido() {
        return valorBcIcmsStRetido;
    }

    public void setValorBcIcmsStRetido(Double valorBcIcmsStRetido) {
        this.valorBcIcmsStRetido = valorBcIcmsStRetido;
    }

    public Double getValorIcmsStRetido() {
        return valorIcmsStRetido;
    }

    public void setValorIcmsStRetido(Double valorIcmsStRetido) {
        this.valorIcmsStRetido = valorIcmsStRetido;
    }

    public Double getValorBcIcmsStDestino() {
        return valorBcIcmsStDestino;
    }

    public void setValorBcIcmsStDestino(Double valorBcIcmsStDestino) {
        this.valorBcIcmsStDestino = valorBcIcmsStDestino;
    }

    public Double getValorIcmsStDestino() {
        return valorIcmsStDestino;
    }

    public void setValorIcmsStDestino(Double valorIcmsStDestino) {
        this.valorIcmsStDestino = valorIcmsStDestino;
    }

    public Double getAliquotaCreditoIcmsSn() {
        return aliquotaCreditoIcmsSn;
    }

    public void setAliquotaCreditoIcmsSn(Double aliquotaCreditoIcmsSn) {
        this.aliquotaCreditoIcmsSn = aliquotaCreditoIcmsSn;
    }

    public Double getValorCreditoIcmsSn() {
        return valorCreditoIcmsSn;
    }

    public void setValorCreditoIcmsSn(Double valorCreditoIcmsSn) {
        this.valorCreditoIcmsSn = valorCreditoIcmsSn;
    }

    public Double getPercentualBcOperacaoPropria() {
        return percentualBcOperacaoPropria;
    }

    public void setPercentualBcOperacaoPropria(Double percentualBcOperacaoPropria) {
        this.percentualBcOperacaoPropria = percentualBcOperacaoPropria;
    }

    public String getUfSt() {
        return ufSt;
    }

    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
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
        if (!(object instanceof NfeDetalheImpostoIcmsVO)) {
            return false;
        }
        NfeDetalheImpostoIcmsVO other = (NfeDetalheImpostoIcmsVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoIcmsVO[ id=" + id + " ]";
    }
    
}
