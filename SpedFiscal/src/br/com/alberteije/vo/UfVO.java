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
@Table(name = "uf")
@NamedQueries({
    @NamedQuery(name = "UfVO.findAll", query = "SELECT u FROM UfVO u")})
public class UfVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CODIGO_IBGE")
    private Integer codigoIbge;
    @JoinColumn(name = "ID_PAIS", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PaisVO idPais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUf")
    private List<MunicipioVO> municipioVOList;

    public UfVO() {
    }

    public UfVO(Integer id) {
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

    public PaisVO getIdPais() {
        return idPais;
    }

    public void setIdPais(PaisVO idPais) {
        this.idPais = idPais;
    }

    public List<MunicipioVO> getMunicipioVOList() {
        return municipioVOList;
    }

    public void setMunicipioVOList(List<MunicipioVO> municipioVOList) {
        this.municipioVOList = municipioVOList;
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
        if (!(object instanceof UfVO)) {
            return false;
        }
        UfVO other = (UfVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.UfVO[ id=" + id + " ]";
    }
    
}
