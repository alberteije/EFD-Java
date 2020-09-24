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
@Table(name = "cargo")
@NamedQueries({
    @NamedQuery(name = "CargoVO.findAll", query = "SELECT c FROM CargoVO c")})
public class CargoVO implements Serializable {
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARIO")
    private Double salario;
    @Column(name = "CBO_1994")
    private String cbo1994;
    @Column(name = "CBO_2002")
    private String cbo2002;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargo")
    private List<ColaboradorVO> colaboradorVOList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public CargoVO() {
    }

    public CargoVO(Integer id) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCbo1994() {
        return cbo1994;
    }

    public void setCbo1994(String cbo1994) {
        this.cbo1994 = cbo1994;
    }

    public String getCbo2002() {
        return cbo2002;
    }

    public void setCbo2002(String cbo2002) {
        this.cbo2002 = cbo2002;
    }

    public List<ColaboradorVO> getColaboradorVOList() {
        return colaboradorVOList;
    }

    public void setColaboradorVOList(List<ColaboradorVO> colaboradorVOList) {
        this.colaboradorVOList = colaboradorVOList;
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
        if (!(object instanceof CargoVO)) {
            return false;
        }
        CargoVO other = (CargoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CargoVO[ id=" + id + " ]";
    }
    
}
