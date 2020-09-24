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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "produto_sub_grupo")
@NamedQueries({
    @NamedQuery(name = "ProdutoSubGrupoVO.findAll", query = "SELECT p FROM ProdutoSubGrupoVO p")})
public class ProdutoSubGrupoVO implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubGrupo")
    private List<ProdutoVO> produtoVOList;
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoGrupoVO idGrupo;

    public ProdutoSubGrupoVO() {
    }

    public ProdutoSubGrupoVO(Integer id) {
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

    public List<ProdutoVO> getProdutoVOList() {
        return produtoVOList;
    }

    public void setProdutoVOList(List<ProdutoVO> produtoVOList) {
        this.produtoVOList = produtoVOList;
    }

    public ProdutoGrupoVO getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(ProdutoGrupoVO idGrupo) {
        this.idGrupo = idGrupo;
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
        if (!(object instanceof ProdutoSubGrupoVO)) {
            return false;
        }
        ProdutoSubGrupoVO other = (ProdutoSubGrupoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ProdutoSubGrupoVO[ id=" + id + " ]";
    }
    
}
