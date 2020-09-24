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
@Table(name = "nfe_detalhe_imposto_pis")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoPisVO.findAll", query = "SELECT n FROM NfeDetalheImpostoPisVO n")})
public class NfeDetalheImpostoPisVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CST_PIS")
    private String cstPis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_VENDIDA")
    private Double quantidadeVendida;
    @Column(name = "VALOR_BASE_CALCULO_PIS")
    private Double valorBaseCalculoPis;
    @Column(name = "ALIQUOTA_PIS_PERCENTUAL")
    private Double aliquotaPisPercentual;
    @Column(name = "ALIQUOTA_PIS_REAIS")
    private Double aliquotaPisReais;
    @Column(name = "VALOR_PIS")
    private Double valorPis;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoPisVO() {
    }

    public NfeDetalheImpostoPisVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getValorBaseCalculoPis() {
        return valorBaseCalculoPis;
    }

    public void setValorBaseCalculoPis(Double valorBaseCalculoPis) {
        this.valorBaseCalculoPis = valorBaseCalculoPis;
    }

    public Double getAliquotaPisPercentual() {
        return aliquotaPisPercentual;
    }

    public void setAliquotaPisPercentual(Double aliquotaPisPercentual) {
        this.aliquotaPisPercentual = aliquotaPisPercentual;
    }

    public Double getAliquotaPisReais() {
        return aliquotaPisReais;
    }

    public void setAliquotaPisReais(Double aliquotaPisReais) {
        this.aliquotaPisReais = aliquotaPisReais;
    }

    public Double getValorPis() {
        return valorPis;
    }

    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
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
        if (!(object instanceof NfeDetalheImpostoPisVO)) {
            return false;
        }
        NfeDetalheImpostoPisVO other = (NfeDetalheImpostoPisVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoPisVO[ id=" + id + " ]";
    }
    
}
