/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "unidade_produto")
@NamedQueries({
    @NamedQuery(name = "UnidadeProdutoVO.findAll", query = "SELECT u FROM UnidadeProdutoVO u")})
public class UnidadeProdutoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SIGLA")
    private String sigla;
    @Lob
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PODE_FRACIONAR")
    private String podeFracionar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeProduto")
    private List<UnidadeConversaoVO> unidadeConversaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeProduto")
    private List<ProdutoVO> produtoVOList;

    public UnidadeProdutoVO() {
    }

    public UnidadeProdutoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPodeFracionar() {
        return podeFracionar;
    }

    public void setPodeFracionar(String podeFracionar) {
        this.podeFracionar = podeFracionar;
    }

    public List<UnidadeConversaoVO> getUnidadeConversaoVOList() {
        return unidadeConversaoVOList;
    }

    public void setUnidadeConversaoVOList(List<UnidadeConversaoVO> unidadeConversaoVOList) {
        this.unidadeConversaoVOList = unidadeConversaoVOList;
    }

    public List<ProdutoVO> getProdutoVOList() {
        return produtoVOList;
    }

    public void setProdutoVOList(List<ProdutoVO> produtoVOList) {
        this.produtoVOList = produtoVOList;
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
        if (!(object instanceof UnidadeProdutoVO)) {
            return false;
        }
        UnidadeProdutoVO other = (UnidadeProdutoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.UnidadeProdutoVO[ id=" + id + " ]";
    }
    
}
