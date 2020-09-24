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
@Table(name = "fornecedor_produto")
@NamedQueries({
    @NamedQuery(name = "FornecedorProdutoVO.findAll", query = "SELECT f FROM FornecedorProdutoVO f")})
public class FornecedorProdutoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO_FORNECEDOR_PRODUTO")
    private String codigoFornecedorProduto;
    @Column(name = "DATA_ULTIMA_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date dataUltimaCompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECO_ULTIMA_COMPRA")
    private Double precoUltimaCompra;
    @Column(name = "LOTE_MINIMO_COMPRA")
    private Double loteMinimoCompra;
    @Column(name = "MENOR_EMBALGEM_COMPRA")
    private Double menorEmbalgemCompra;
    @Column(name = "CUSTO_ULTIMA_COMPRA")
    private Double custoUltimaCompra;
    @JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FornecedorVO idFornecedor;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoVO idProduto;

    public FornecedorProdutoVO() {
    }

    public FornecedorProdutoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoFornecedorProduto() {
        return codigoFornecedorProduto;
    }

    public void setCodigoFornecedorProduto(String codigoFornecedorProduto) {
        this.codigoFornecedorProduto = codigoFornecedorProduto;
    }

    public Date getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(Date dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public Double getPrecoUltimaCompra() {
        return precoUltimaCompra;
    }

    public void setPrecoUltimaCompra(Double precoUltimaCompra) {
        this.precoUltimaCompra = precoUltimaCompra;
    }

    public Double getLoteMinimoCompra() {
        return loteMinimoCompra;
    }

    public void setLoteMinimoCompra(Double loteMinimoCompra) {
        this.loteMinimoCompra = loteMinimoCompra;
    }

    public Double getMenorEmbalgemCompra() {
        return menorEmbalgemCompra;
    }

    public void setMenorEmbalgemCompra(Double menorEmbalgemCompra) {
        this.menorEmbalgemCompra = menorEmbalgemCompra;
    }

    public Double getCustoUltimaCompra() {
        return custoUltimaCompra;
    }

    public void setCustoUltimaCompra(Double custoUltimaCompra) {
        this.custoUltimaCompra = custoUltimaCompra;
    }

    public FornecedorVO getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(FornecedorVO idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
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
        if (!(object instanceof FornecedorProdutoVO)) {
            return false;
        }
        FornecedorProdutoVO other = (FornecedorProdutoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.FornecedorProdutoVO[ id=" + id + " ]";
    }
    
}
