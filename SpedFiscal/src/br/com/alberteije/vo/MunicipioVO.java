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
@Table(name = "municipio")
@NamedQueries({
    @NamedQuery(name = "MunicipioVO.findAll", query = "SELECT m FROM MunicipioVO m")})
public class MunicipioVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CODIGO_IBGE")
    private Integer codigoIbge;
    @Column(name = "CODIGO_RECEITA_FEDERAL")
    private Integer codigoReceitaFederal;
    @Column(name = "CODIGO_ESTADUAL")
    private Integer codigoEstadual;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private List<TransportadoraMunicipioVO> transportadoraMunicipioVOList;
    @JoinColumn(name = "ID_UF", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UfVO idUf;

    public MunicipioVO() {
    }

    public MunicipioVO(Integer id) {
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

    public Integer getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public Integer getCodigoReceitaFederal() {
        return codigoReceitaFederal;
    }

    public void setCodigoReceitaFederal(Integer codigoReceitaFederal) {
        this.codigoReceitaFederal = codigoReceitaFederal;
    }

    public Integer getCodigoEstadual() {
        return codigoEstadual;
    }

    public void setCodigoEstadual(Integer codigoEstadual) {
        this.codigoEstadual = codigoEstadual;
    }

    public List<TransportadoraMunicipioVO> getTransportadoraMunicipioVOList() {
        return transportadoraMunicipioVOList;
    }

    public void setTransportadoraMunicipioVOList(List<TransportadoraMunicipioVO> transportadoraMunicipioVOList) {
        this.transportadoraMunicipioVOList = transportadoraMunicipioVOList;
    }

    public UfVO getIdUf() {
        return idUf;
    }

    public void setIdUf(UfVO idUf) {
        this.idUf = idUf;
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
        if (!(object instanceof MunicipioVO)) {
            return false;
        }
        MunicipioVO other = (MunicipioVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.MunicipioVO[ id=" + id + " ]";
    }
    
}
