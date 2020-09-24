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
@Table(name = "view_sped_c190")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC190VO.findAll", query = "SELECT v FROM ViewSpedC190VO v")})
public class ViewSpedC190VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CFOP")
    private Integer cfop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQUOTA_ICMS")
    private Double aliquotaIcms;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "SOMA_VALOR_OPERACAO")
    private Double somaValorOperacao;
    @Column(name = "SOMA_BASE_CALCULO_ICMS")
    private Double somaBaseCalculoIcms;
    @Column(name = "SOMA_VALOR_ICMS")
    private Double somaValorIcms;
    @Column(name = "SOMA_BASE_CALCULO_ICMS_ST")
    private Double somaBaseCalculoIcmsSt;
    @Column(name = "SOMA_VALOR_ICMS_ST")
    private Double somaValorIcmsSt;
    @Column(name = "SOMA_VL_RED_BC")
    private Double somaVlRedBc;
    @Column(name = "SOMA_VALOR_IPI")
    private Double somaValorIpi;

    public ViewSpedC190VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getSomaValorOperacao() {
        return somaValorOperacao;
    }

    public void setSomaValorOperacao(Double somaValorOperacao) {
        this.somaValorOperacao = somaValorOperacao;
    }

    public Double getSomaBaseCalculoIcms() {
        return somaBaseCalculoIcms;
    }

    public void setSomaBaseCalculoIcms(Double somaBaseCalculoIcms) {
        this.somaBaseCalculoIcms = somaBaseCalculoIcms;
    }

    public Double getSomaValorIcms() {
        return somaValorIcms;
    }

    public void setSomaValorIcms(Double somaValorIcms) {
        this.somaValorIcms = somaValorIcms;
    }

    public Double getSomaBaseCalculoIcmsSt() {
        return somaBaseCalculoIcmsSt;
    }

    public void setSomaBaseCalculoIcmsSt(Double somaBaseCalculoIcmsSt) {
        this.somaBaseCalculoIcmsSt = somaBaseCalculoIcmsSt;
    }

    public Double getSomaValorIcmsSt() {
        return somaValorIcmsSt;
    }

    public void setSomaValorIcmsSt(Double somaValorIcmsSt) {
        this.somaValorIcmsSt = somaValorIcmsSt;
    }

    public Double getSomaVlRedBc() {
        return somaVlRedBc;
    }

    public void setSomaVlRedBc(Double somaVlRedBc) {
        this.somaVlRedBc = somaVlRedBc;
    }

    public Double getSomaValorIpi() {
        return somaValorIpi;
    }

    public void setSomaValorIpi(Double somaValorIpi) {
        this.somaValorIpi = somaValorIpi;
    }
    
}
