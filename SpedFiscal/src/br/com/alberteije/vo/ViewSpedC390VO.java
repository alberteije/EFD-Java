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
@Table(name = "view_sped_c390")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC390VO.findAll", query = "SELECT v FROM ViewSpedC390VO v")})
public class ViewSpedC390VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "CST")
    private String cst;
    @Basic(optional = false)
    @Column(name = "CFOP")
    private Integer cfop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAXA_ICMS")
    private Double taxaIcms;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "SOMA_ITEM")
    private Double somaItem;
    @Column(name = "SOMA_BASE_ICMS")
    private Double somaBaseIcms;
    @Column(name = "SOMA_ICMS")
    private Double somaIcms;
    @Column(name = "SOMA_ICMS_OUTRAS")
    private Double somaIcmsOutras;

    public ViewSpedC390VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Double getTaxaIcms() {
        return taxaIcms;
    }

    public void setTaxaIcms(Double taxaIcms) {
        this.taxaIcms = taxaIcms;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getSomaItem() {
        return somaItem;
    }

    public void setSomaItem(Double somaItem) {
        this.somaItem = somaItem;
    }

    public Double getSomaBaseIcms() {
        return somaBaseIcms;
    }

    public void setSomaBaseIcms(Double somaBaseIcms) {
        this.somaBaseIcms = somaBaseIcms;
    }

    public Double getSomaIcms() {
        return somaIcms;
    }

    public void setSomaIcms(Double somaIcms) {
        this.somaIcms = somaIcms;
    }

    public Double getSomaIcmsOutras() {
        return somaIcmsOutras;
    }

    public void setSomaIcmsOutras(Double somaIcmsOutras) {
        this.somaIcmsOutras = somaIcmsOutras;
    }
    
}
