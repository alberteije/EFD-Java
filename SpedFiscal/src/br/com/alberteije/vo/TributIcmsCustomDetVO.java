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
@Table(name = "tribut_icms_custom_det")
@NamedQueries({
    @NamedQuery(name = "TributIcmsCustomDetVO.findAll", query = "SELECT t FROM TributIcmsCustomDetVO t")})
public class TributIcmsCustomDetVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "UF_DESTINO")
    private String ufDestino;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "CSOSN_B")
    private String csosnB;
    @Column(name = "CST_B")
    private String cstB;
    @Column(name = "MODALIDADE_BC")
    private String modalidadeBc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQUOTA")
    private Double aliquota;
    @Column(name = "VALOR_PAUTA")
    private Double valorPauta;
    @Column(name = "VALOR_PRECO_MAXIMO")
    private Double valorPrecoMaximo;
    @Column(name = "MVA")
    private Double mva;
    @Column(name = "PORCENTO_BC")
    private Double porcentoBc;
    @Column(name = "MODALIDADE_BC_ST")
    private String modalidadeBcSt;
    @Column(name = "ALIQUOTA_INTERNA_ST")
    private Double aliquotaInternaSt;
    @Column(name = "ALIQUOTA_INTERESTADUAL_ST")
    private Double aliquotaInterestadualSt;
    @Column(name = "PORCENTO_BC_ST")
    private Double porcentoBcSt;
    @Column(name = "ALIQUOTA_ICMS_ST")
    private Double aliquotaIcmsSt;
    @Column(name = "VALOR_PAUTA_ST")
    private Double valorPautaSt;
    @Column(name = "VALOR_PRECO_MAXIMO_ST")
    private Double valorPrecoMaximoSt;
    @JoinColumn(name = "ID_TRIBUT_ICMS_CUSTOM_CAB", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TributIcmsCustomCabVO idTributIcmsCustomCab;

    public TributIcmsCustomDetVO() {
    }

    public TributIcmsCustomDetVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCsosnB() {
        return csosnB;
    }

    public void setCsosnB(String csosnB) {
        this.csosnB = csosnB;
    }

    public String getCstB() {
        return cstB;
    }

    public void setCstB(String cstB) {
        this.cstB = cstB;
    }

    public String getModalidadeBc() {
        return modalidadeBc;
    }

    public void setModalidadeBc(String modalidadeBc) {
        this.modalidadeBc = modalidadeBc;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getValorPauta() {
        return valorPauta;
    }

    public void setValorPauta(Double valorPauta) {
        this.valorPauta = valorPauta;
    }

    public Double getValorPrecoMaximo() {
        return valorPrecoMaximo;
    }

    public void setValorPrecoMaximo(Double valorPrecoMaximo) {
        this.valorPrecoMaximo = valorPrecoMaximo;
    }

    public Double getMva() {
        return mva;
    }

    public void setMva(Double mva) {
        this.mva = mva;
    }

    public Double getPorcentoBc() {
        return porcentoBc;
    }

    public void setPorcentoBc(Double porcentoBc) {
        this.porcentoBc = porcentoBc;
    }

    public String getModalidadeBcSt() {
        return modalidadeBcSt;
    }

    public void setModalidadeBcSt(String modalidadeBcSt) {
        this.modalidadeBcSt = modalidadeBcSt;
    }

    public Double getAliquotaInternaSt() {
        return aliquotaInternaSt;
    }

    public void setAliquotaInternaSt(Double aliquotaInternaSt) {
        this.aliquotaInternaSt = aliquotaInternaSt;
    }

    public Double getAliquotaInterestadualSt() {
        return aliquotaInterestadualSt;
    }

    public void setAliquotaInterestadualSt(Double aliquotaInterestadualSt) {
        this.aliquotaInterestadualSt = aliquotaInterestadualSt;
    }

    public Double getPorcentoBcSt() {
        return porcentoBcSt;
    }

    public void setPorcentoBcSt(Double porcentoBcSt) {
        this.porcentoBcSt = porcentoBcSt;
    }

    public Double getAliquotaIcmsSt() {
        return aliquotaIcmsSt;
    }

    public void setAliquotaIcmsSt(Double aliquotaIcmsSt) {
        this.aliquotaIcmsSt = aliquotaIcmsSt;
    }

    public Double getValorPautaSt() {
        return valorPautaSt;
    }

    public void setValorPautaSt(Double valorPautaSt) {
        this.valorPautaSt = valorPautaSt;
    }

    public Double getValorPrecoMaximoSt() {
        return valorPrecoMaximoSt;
    }

    public void setValorPrecoMaximoSt(Double valorPrecoMaximoSt) {
        this.valorPrecoMaximoSt = valorPrecoMaximoSt;
    }

    public TributIcmsCustomCabVO getIdTributIcmsCustomCab() {
        return idTributIcmsCustomCab;
    }

    public void setIdTributIcmsCustomCab(TributIcmsCustomCabVO idTributIcmsCustomCab) {
        this.idTributIcmsCustomCab = idTributIcmsCustomCab;
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
        if (!(object instanceof TributIcmsCustomDetVO)) {
            return false;
        }
        TributIcmsCustomDetVO other = (TributIcmsCustomDetVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributIcmsCustomDetVO[ id=" + id + " ]";
    }
    
}
