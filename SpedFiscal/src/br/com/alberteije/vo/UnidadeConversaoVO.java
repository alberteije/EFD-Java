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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "unidade_conversao")
@NamedQueries({
    @NamedQuery(name = "UnidadeConversaoVO.findAll", query = "SELECT u FROM UnidadeConversaoVO u")})
public class UnidadeConversaoVO implements Serializable {
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FATOR_CONVERSAO")
    private Double fatorConversao;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Column(name = "ID_UNIDADE_PRODUTO")
    private Integer idUnidadeProduto;

    public UnidadeConversaoVO() {
    }

    public UnidadeConversaoVO(Integer id) {
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

    public Double getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(Double fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(Integer idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
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
        if (!(object instanceof UnidadeConversaoVO)) {
            return false;
        }
        UnidadeConversaoVO other = (UnidadeConversaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.UnidadeConversaoVO[ id=" + id + " ]";
    }
    
}
