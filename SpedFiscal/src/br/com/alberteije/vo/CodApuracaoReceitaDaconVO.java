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
@Table(name = "cod_apuracao_receita_dacon")
@NamedQueries({
    @NamedQuery(name = "CodApuracaoReceitaDaconVO.findAll", query = "SELECT c FROM CodApuracaoReceitaDaconVO c")})
public class CodApuracaoReceitaDaconVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ID_CODIGO_APURACAO_EFD", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private CodigoApuracaoEfdVO idCodigoApuracaoEfd;
    @JoinColumn(name = "ID_TIPO_RECEITA_DACON", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoReceitaDaconVO idTipoReceitaDacon;

    public CodApuracaoReceitaDaconVO() {
    }

    public CodApuracaoReceitaDaconVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CodigoApuracaoEfdVO getIdCodigoApuracaoEfd() {
        return idCodigoApuracaoEfd;
    }

    public void setIdCodigoApuracaoEfd(CodigoApuracaoEfdVO idCodigoApuracaoEfd) {
        this.idCodigoApuracaoEfd = idCodigoApuracaoEfd;
    }

    public TipoReceitaDaconVO getIdTipoReceitaDacon() {
        return idTipoReceitaDacon;
    }

    public void setIdTipoReceitaDacon(TipoReceitaDaconVO idTipoReceitaDacon) {
        this.idTipoReceitaDacon = idTipoReceitaDacon;
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
        if (!(object instanceof CodApuracaoReceitaDaconVO)) {
            return false;
        }
        CodApuracaoReceitaDaconVO other = (CodApuracaoReceitaDaconVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CodApuracaoReceitaDaconVO[ id=" + id + " ]";
    }
    
}
