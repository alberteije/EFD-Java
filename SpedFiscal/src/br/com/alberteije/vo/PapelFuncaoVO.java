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
@Table(name = "papel_funcao")
@NamedQueries({
    @NamedQuery(name = "PapelFuncaoVO.findAll", query = "SELECT p FROM PapelFuncaoVO p")})
public class PapelFuncaoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PODE_CONSULTAR")
    private String podeConsultar;
    @Column(name = "PODE_INSERIR")
    private String podeInserir;
    @Column(name = "PODE_ALTERAR")
    private String podeAlterar;
    @Column(name = "PODE_EXCLUIR")
    private String podeExcluir;
    @Column(name = "HABILITADO")
    private String habilitado;
    @JoinColumn(name = "ID_FUNCAO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FuncaoVO idFuncao;
    @JoinColumn(name = "ID_PAPEL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PapelVO idPapel;

    public PapelFuncaoVO() {
    }

    public PapelFuncaoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPodeConsultar() {
        return podeConsultar;
    }

    public void setPodeConsultar(String podeConsultar) {
        this.podeConsultar = podeConsultar;
    }

    public String getPodeInserir() {
        return podeInserir;
    }

    public void setPodeInserir(String podeInserir) {
        this.podeInserir = podeInserir;
    }

    public String getPodeAlterar() {
        return podeAlterar;
    }

    public void setPodeAlterar(String podeAlterar) {
        this.podeAlterar = podeAlterar;
    }

    public String getPodeExcluir() {
        return podeExcluir;
    }

    public void setPodeExcluir(String podeExcluir) {
        this.podeExcluir = podeExcluir;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public FuncaoVO getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(FuncaoVO idFuncao) {
        this.idFuncao = idFuncao;
    }

    public PapelVO getIdPapel() {
        return idPapel;
    }

    public void setIdPapel(PapelVO idPapel) {
        this.idPapel = idPapel;
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
        if (!(object instanceof PapelFuncaoVO)) {
            return false;
        }
        PapelFuncaoVO other = (PapelFuncaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PapelFuncaoVO[ id=" + id + " ]";
    }
    
}
