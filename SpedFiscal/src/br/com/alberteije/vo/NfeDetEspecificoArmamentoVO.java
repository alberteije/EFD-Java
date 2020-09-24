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
@Table(name = "nfe_det_especifico_armamento")
@NamedQueries({
    @NamedQuery(name = "NfeDetEspecificoArmamentoVO.findAll", query = "SELECT n FROM NfeDetEspecificoArmamentoVO n")})
public class NfeDetEspecificoArmamentoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TIPO_ARMA")
    private String tipoArma;
    @Column(name = "NUMERO_SERIE_ARMA")
    private String numeroSerieArma;
    @Column(name = "NUMERO_SERIE_CANO")
    private String numeroSerieCano;
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetEspecificoArmamentoVO() {
    }

    public NfeDetEspecificoArmamentoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getNumeroSerieArma() {
        return numeroSerieArma;
    }

    public void setNumeroSerieArma(String numeroSerieArma) {
        this.numeroSerieArma = numeroSerieArma;
    }

    public String getNumeroSerieCano() {
        return numeroSerieCano;
    }

    public void setNumeroSerieCano(String numeroSerieCano) {
        this.numeroSerieCano = numeroSerieCano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NfeDetalheVO getIdNfeDetalhe() {
        return idNfeDetalhe;
    }

    public void setIdNfeDetalhe(NfeDetalheVO idNfeDetalhe) {
        this.idNfeDetalhe = idNfeDetalhe;
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
        if (!(object instanceof NfeDetEspecificoArmamentoVO)) {
            return false;
        }
        NfeDetEspecificoArmamentoVO other = (NfeDetEspecificoArmamentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetEspecificoArmamentoVO[ id=" + id + " ]";
    }
    
}
