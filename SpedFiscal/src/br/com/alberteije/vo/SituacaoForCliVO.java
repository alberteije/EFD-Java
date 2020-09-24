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
@Table(name = "situacao_for_cli")
@NamedQueries({
    @NamedQuery(name = "SituacaoForCliVO.findAll", query = "SELECT s FROM SituacaoForCliVO s")})
public class SituacaoForCliVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Lob
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSituacaoForCli")
    private List<ClienteVO> clienteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSituacaoForCli")
    private List<FornecedorVO> fornecedorVOList;

    public SituacaoForCliVO() {
    }

    public SituacaoForCliVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ClienteVO> getClienteVOList() {
        return clienteVOList;
    }

    public void setClienteVOList(List<ClienteVO> clienteVOList) {
        this.clienteVOList = clienteVOList;
    }

    public List<FornecedorVO> getFornecedorVOList() {
        return fornecedorVOList;
    }

    public void setFornecedorVOList(List<FornecedorVO> fornecedorVOList) {
        this.fornecedorVOList = fornecedorVOList;
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
        if (!(object instanceof SituacaoForCliVO)) {
            return false;
        }
        SituacaoForCliVO other = (SituacaoForCliVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.SituacaoForCliVO[ id=" + id + " ]";
    }
    
}
