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
@Table(name = "empresa_cnae")
@NamedQueries({
    @NamedQuery(name = "EmpresaCnaeVO.findAll", query = "SELECT e FROM EmpresaCnaeVO e")})
public class EmpresaCnaeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PRINCIPAL")
    private String principal;
    @Column(name = "RAMO_ATIVIDADE")
    private String ramoAtividade;
    @Lob
    @Column(name = "OBJETO_SOCIAL")
    private String objetoSocial;
    @JoinColumn(name = "ID_CNAE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private CnaeVO idCnae;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public EmpresaCnaeVO() {
    }

    public EmpresaCnaeVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    public String getObjetoSocial() {
        return objetoSocial;
    }

    public void setObjetoSocial(String objetoSocial) {
        this.objetoSocial = objetoSocial;
    }

    public CnaeVO getIdCnae() {
        return idCnae;
    }

    public void setIdCnae(CnaeVO idCnae) {
        this.idCnae = idCnae;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof EmpresaCnaeVO)) {
            return false;
        }
        EmpresaCnaeVO other = (EmpresaCnaeVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EmpresaCnaeVO[ id=" + id + " ]";
    }
    
}
