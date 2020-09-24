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
@Table(name = "nfe_det_especifico_combustivel")
@NamedQueries({
    @NamedQuery(name = "NfeDetEspecificoCombustivelVO.findAll", query = "SELECT n FROM NfeDetEspecificoCombustivelVO n")})
public class NfeDetEspecificoCombustivelVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO_ANP")
    private Integer codigoAnp;
    @Column(name = "CODIF")
    private String codif;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_TEMP_AMBIENTE")
    private Double quantidadeTempAmbiente;
    @Column(name = "UF_CONSUMO")
    private String ufConsumo;
    @Column(name = "BASE_CALCULO_CIDE")
    private Double baseCalculoCide;
    @Column(name = "ALIQUOTA_CIDE")
    private Double aliquotaCide;
    @Column(name = "VALOR_CIDE")
    private Double valorCide;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetEspecificoCombustivelVO() {
    }

    public NfeDetEspecificoCombustivelVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoAnp() {
        return codigoAnp;
    }

    public void setCodigoAnp(Integer codigoAnp) {
        this.codigoAnp = codigoAnp;
    }

    public String getCodif() {
        return codif;
    }

    public void setCodif(String codif) {
        this.codif = codif;
    }

    public Double getQuantidadeTempAmbiente() {
        return quantidadeTempAmbiente;
    }

    public void setQuantidadeTempAmbiente(Double quantidadeTempAmbiente) {
        this.quantidadeTempAmbiente = quantidadeTempAmbiente;
    }

    public String getUfConsumo() {
        return ufConsumo;
    }

    public void setUfConsumo(String ufConsumo) {
        this.ufConsumo = ufConsumo;
    }

    public Double getBaseCalculoCide() {
        return baseCalculoCide;
    }

    public void setBaseCalculoCide(Double baseCalculoCide) {
        this.baseCalculoCide = baseCalculoCide;
    }

    public Double getAliquotaCide() {
        return aliquotaCide;
    }

    public void setAliquotaCide(Double aliquotaCide) {
        this.aliquotaCide = aliquotaCide;
    }

    public Double getValorCide() {
        return valorCide;
    }

    public void setValorCide(Double valorCide) {
        this.valorCide = valorCide;
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
        if (!(object instanceof NfeDetEspecificoCombustivelVO)) {
            return false;
        }
        NfeDetEspecificoCombustivelVO other = (NfeDetEspecificoCombustivelVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetEspecificoCombustivelVO[ id=" + id + " ]";
    }
    
}
