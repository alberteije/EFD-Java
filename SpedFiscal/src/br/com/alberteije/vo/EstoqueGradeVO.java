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
@Table(name = "estoque_grade")
@NamedQueries({
    @NamedQuery(name = "EstoqueGradeVO.findAll", query = "SELECT e FROM EstoqueGradeVO e")})
public class EstoqueGradeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoVO idProduto;
    @JoinColumn(name = "ID_ESTOQUE_TAMANHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EstoqueTamanhoVO idEstoqueTamanho;
    @JoinColumn(name = "ID_ESTOQUE_COR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EstoqueCorVO idEstoqueCor;

    public EstoqueGradeVO() {
    }

    public EstoqueGradeVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
    }

    public EstoqueTamanhoVO getIdEstoqueTamanho() {
        return idEstoqueTamanho;
    }

    public void setIdEstoqueTamanho(EstoqueTamanhoVO idEstoqueTamanho) {
        this.idEstoqueTamanho = idEstoqueTamanho;
    }

    public EstoqueCorVO getIdEstoqueCor() {
        return idEstoqueCor;
    }

    public void setIdEstoqueCor(EstoqueCorVO idEstoqueCor) {
        this.idEstoqueCor = idEstoqueCor;
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
        if (!(object instanceof EstoqueGradeVO)) {
            return false;
        }
        EstoqueGradeVO other = (EstoqueGradeVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EstoqueGradeVO[ id=" + id + " ]";
    }
    
}
