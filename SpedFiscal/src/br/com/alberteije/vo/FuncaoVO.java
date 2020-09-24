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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "funcao")
@NamedQueries({
    @NamedQuery(name = "FuncaoVO.findAll", query = "SELECT f FROM FuncaoVO f")})
public class FuncaoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESCRICAO_MENU")
    private String descricaoMenu;
    @Column(name = "IMAGEM_MENU")
    private String imagemMenu;
    @Column(name = "METODO")
    private String metodo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FORMULARIO")
    private String formulario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncao")
    private List<PapelFuncaoVO> papelFuncaoVOList;

    public FuncaoVO() {
    }

    public FuncaoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoMenu() {
        return descricaoMenu;
    }

    public void setDescricaoMenu(String descricaoMenu) {
        this.descricaoMenu = descricaoMenu;
    }

    public String getImagemMenu() {
        return imagemMenu;
    }

    public void setImagemMenu(String imagemMenu) {
        this.imagemMenu = imagemMenu;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public List<PapelFuncaoVO> getPapelFuncaoVOList() {
        return papelFuncaoVOList;
    }

    public void setPapelFuncaoVOList(List<PapelFuncaoVO> papelFuncaoVOList) {
        this.papelFuncaoVOList = papelFuncaoVOList;
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
        if (!(object instanceof FuncaoVO)) {
            return false;
        }
        FuncaoVO other = (FuncaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.FuncaoVO[ id=" + id + " ]";
    }
    
}
