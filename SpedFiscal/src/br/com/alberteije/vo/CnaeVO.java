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
@Table(name = "cnae")
@NamedQueries({
    @NamedQuery(name = "CnaeVO.findAll", query = "SELECT c FROM CnaeVO c")})
public class CnaeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Lob
    @Column(name = "DENOMINACAO")
    private String denominacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCnae")
    private List<EmpresaCnaeVO> empresaCnaeVOList;

    public CnaeVO() {
    }

    public CnaeVO(Integer id) {
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

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public List<EmpresaCnaeVO> getEmpresaCnaeVOList() {
        return empresaCnaeVOList;
    }

    public void setEmpresaCnaeVOList(List<EmpresaCnaeVO> empresaCnaeVOList) {
        this.empresaCnaeVOList = empresaCnaeVOList;
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
        if (!(object instanceof CnaeVO)) {
            return false;
        }
        CnaeVO other = (CnaeVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CnaeVO[ id=" + id + " ]";
    }
    
}
