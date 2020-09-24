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
@Table(name = "view_sped_c321")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC321VO.findAll", query = "SELECT v FROM ViewSpedC321VO v")})
public class ViewSpedC321VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Column(name = "DESCRICAO_UNIDADE")
    private String descricaoUnidade;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOMA_QUANTIDADE")
    private Double somaQuantidade;
    @Column(name = "SOMA_ITEM")
    private Double somaItem;
    @Column(name = "SOMA_DESCONTO")
    private Double somaDesconto;
    @Column(name = "SOMA_BASE_ICMS")
    private Double somaBaseIcms;
    @Column(name = "SOMA_ICMS")
    private Double somaIcms;
    @Column(name = "SOMA_PIS")
    private Double somaPis;
    @Column(name = "SOMA_COFINS")
    private Double somaCofins;

    public ViewSpedC321VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        this.descricaoUnidade = descricaoUnidade;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getSomaQuantidade() {
        return somaQuantidade;
    }

    public void setSomaQuantidade(Double somaQuantidade) {
        this.somaQuantidade = somaQuantidade;
    }

    public Double getSomaItem() {
        return somaItem;
    }

    public void setSomaItem(Double somaItem) {
        this.somaItem = somaItem;
    }

    public Double getSomaDesconto() {
        return somaDesconto;
    }

    public void setSomaDesconto(Double somaDesconto) {
        this.somaDesconto = somaDesconto;
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

    public Double getSomaPis() {
        return somaPis;
    }

    public void setSomaPis(Double somaPis) {
        this.somaPis = somaPis;
    }

    public Double getSomaCofins() {
        return somaCofins;
    }

    public void setSomaCofins(Double somaCofins) {
        this.somaCofins = somaCofins;
    }
    
}
