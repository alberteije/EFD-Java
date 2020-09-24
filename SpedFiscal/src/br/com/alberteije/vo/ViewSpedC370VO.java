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
@Table(name = "view_sped_c370")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC370VO.findAll", query = "SELECT v FROM ViewSpedC370VO v")})
public class ViewSpedC370VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "ID_NF_CABECALHO")
    private Integer idNfCabecalho;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Column(name = "ITEM")
    private Integer item;
    @Basic(optional = false)
    @Column(name = "ID_UNIDADE_PRODUTO")
    private Integer idUnidadeProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "CST")
    private String cst;
    @Column(name = "DESCONTO")
    private Double desconto;

    public ViewSpedC370VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdNfCabecalho() {
        return idNfCabecalho;
    }

    public void setIdNfCabecalho(Integer idNfCabecalho) {
        this.idNfCabecalho = idNfCabecalho;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(Integer idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
}
