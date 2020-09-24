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
@Table(name = "nfe_transporte_volume_lacre")
@NamedQueries({
    @NamedQuery(name = "NfeTransporteVolumeLacreVO.findAll", query = "SELECT n FROM NfeTransporteVolumeLacreVO n")})
public class NfeTransporteVolumeLacreVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO")
    private String numero;
    @JoinColumn(name = "ID_NFE_TRANSPORTE_VOLUME", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeTransporteVolumeVO idNfeTransporteVolume;

    public NfeTransporteVolumeLacreVO() {
    }

    public NfeTransporteVolumeLacreVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public NfeTransporteVolumeVO getIdNfeTransporteVolume() {
        return idNfeTransporteVolume;
    }

    public void setIdNfeTransporteVolume(NfeTransporteVolumeVO idNfeTransporteVolume) {
        this.idNfeTransporteVolume = idNfeTransporteVolume;
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
        if (!(object instanceof NfeTransporteVolumeLacreVO)) {
            return false;
        }
        NfeTransporteVolumeLacreVO other = (NfeTransporteVolumeLacreVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeTransporteVolumeLacreVO[ id=" + id + " ]";
    }
    
}
