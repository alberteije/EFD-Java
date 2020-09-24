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
@Table(name = "tabela_preco_produto")
@NamedQueries({
    @NamedQuery(name = "TabelaPrecoProdutoVO.findAll", query = "SELECT t FROM TabelaPrecoProdutoVO t")})
public class TabelaPrecoProdutoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECO")
    private Double preco;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoVO idProduto;
    @JoinColumn(name = "ID_TABELA_PRECO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TabelaPrecoVO idTabelaPreco;

    public TabelaPrecoProdutoVO() {
    }

    public TabelaPrecoProdutoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
    }

    public TabelaPrecoVO getIdTabelaPreco() {
        return idTabelaPreco;
    }

    public void setIdTabelaPreco(TabelaPrecoVO idTabelaPreco) {
        this.idTabelaPreco = idTabelaPreco;
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
        if (!(object instanceof TabelaPrecoProdutoVO)) {
            return false;
        }
        TabelaPrecoProdutoVO other = (TabelaPrecoProdutoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TabelaPrecoProdutoVO[ id=" + id + " ]";
    }
    
}
