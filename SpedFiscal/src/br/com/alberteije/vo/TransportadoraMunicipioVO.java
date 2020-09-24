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
@Table(name = "transportadora_municipio")
@NamedQueries({
    @NamedQuery(name = "TransportadoraMunicipioVO.findAll", query = "SELECT t FROM TransportadoraMunicipioVO t")})
public class TransportadoraMunicipioVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private MunicipioVO idMunicipio;
    @JoinColumn(name = "ID_TRANSPORTADORA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TransportadoraVO idTransportadora;

    public TransportadoraMunicipioVO() {
    }

    public TransportadoraMunicipioVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MunicipioVO getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(MunicipioVO idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public TransportadoraVO getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(TransportadoraVO idTransportadora) {
        this.idTransportadora = idTransportadora;
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
        if (!(object instanceof TransportadoraMunicipioVO)) {
            return false;
        }
        TransportadoraMunicipioVO other = (TransportadoraMunicipioVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TransportadoraMunicipioVO[ id=" + id + " ]";
    }
    
}
