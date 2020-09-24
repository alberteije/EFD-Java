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
@Table(name = "venda_detalhe")
@NamedQueries({
    @NamedQuery(name = "VendaDetalheVO.findAll", query = "SELECT v FROM VendaDetalheVO v")})
public class VendaDetalheVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALOR_UNITARIO")
    private Double valorUnitario;
    @Column(name = "VALOR_SUBTOTAL")
    private Double valorSubtotal;
    @Column(name = "TAXA_DESCONTO")
    private Double taxaDesconto;
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "TAXA_COMISSAO")
    private Double taxaComissao;
    @Column(name = "VALOR_COMISSAO")
    private Double valorComissao;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoVO idProduto;
    @JoinColumn(name = "ID_VENDA_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private VendaCabecalhoVO idVendaCabecalho;

    public VendaDetalheVO() {
    }

    public VendaDetalheVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorSubtotal() {
        return valorSubtotal;
    }

    public void setValorSubtotal(Double valorSubtotal) {
        this.valorSubtotal = valorSubtotal;
    }

    public Double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
    }

    public VendaCabecalhoVO getIdVendaCabecalho() {
        return idVendaCabecalho;
    }

    public void setIdVendaCabecalho(VendaCabecalhoVO idVendaCabecalho) {
        this.idVendaCabecalho = idVendaCabecalho;
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
        if (!(object instanceof VendaDetalheVO)) {
            return false;
        }
        VendaDetalheVO other = (VendaDetalheVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.VendaDetalheVO[ id=" + id + " ]";
    }
    
}
