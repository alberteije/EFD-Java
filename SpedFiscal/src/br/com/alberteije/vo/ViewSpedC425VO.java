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
@Table(name = "view_sped_c425")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC425VO.findAll", query = "SELECT v FROM ViewSpedC425VO v")})
public class ViewSpedC425VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "ID_ECF_PRODUTO")
    private Integer idEcfProduto;
    @Column(name = "DESCRICAO_UNIDADE")
    private String descricaoUnidade;
    @Column(name = "TOTALIZADOR_PARCIAL")
    private String totalizadorParcial;
    @Column(name = "DATA_VENDA")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOMA_QUANTIDADE")
    private Double somaQuantidade;
    @Column(name = "SOMA_ITEM")
    private Double somaItem;
    @Column(name = "SOMA_PIS")
    private Double somaPis;
    @Column(name = "SOMA_COFINS")
    private Double somaCofins;

    public ViewSpedC425VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdEcfProduto() {
        return idEcfProduto;
    }

    public void setIdEcfProduto(Integer idEcfProduto) {
        this.idEcfProduto = idEcfProduto;
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        this.descricaoUnidade = descricaoUnidade;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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
