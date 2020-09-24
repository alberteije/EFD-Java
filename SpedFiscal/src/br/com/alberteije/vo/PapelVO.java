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
@Table(name = "papel")
@NamedQueries({
    @NamedQuery(name = "PapelVO.findAll", query = "SELECT p FROM PapelVO p")})
public class PapelVO implements Serializable {
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
    @Column(name = "ACESSO_COMPLETO")
    private String acessoCompleto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPapel")
    private List<PapelFuncaoVO> papelFuncaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPapel")
    private List<UsuarioVO> usuarioVOList;

    public PapelVO() {
    }

    public PapelVO(Integer id) {
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

    public String getAcessoCompleto() {
        return acessoCompleto;
    }

    public void setAcessoCompleto(String acessoCompleto) {
        this.acessoCompleto = acessoCompleto;
    }

    public List<PapelFuncaoVO> getPapelFuncaoVOList() {
        return papelFuncaoVOList;
    }

    public void setPapelFuncaoVOList(List<PapelFuncaoVO> papelFuncaoVOList) {
        this.papelFuncaoVOList = papelFuncaoVOList;
    }

    public List<UsuarioVO> getUsuarioVOList() {
        return usuarioVOList;
    }

    public void setUsuarioVOList(List<UsuarioVO> usuarioVOList) {
        this.usuarioVOList = usuarioVOList;
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
        if (!(object instanceof PapelVO)) {
            return false;
        }
        PapelVO other = (PapelVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PapelVO[ id=" + id + " ]";
    }
    
}
