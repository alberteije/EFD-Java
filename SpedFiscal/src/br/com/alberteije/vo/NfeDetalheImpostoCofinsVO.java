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
@Table(name = "nfe_detalhe_imposto_cofins")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoCofinsVO.findAll", query = "SELECT n FROM NfeDetalheImpostoCofinsVO n")})
public class NfeDetalheImpostoCofinsVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CST_COFINS")
    private String cstCofins;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_VENDIDA")
    private Double quantidadeVendida;
    @Column(name = "BASE_CALCULO_COFINS")
    private Double baseCalculoCofins;
    @Column(name = "ALIQUOTA_COFINS_PERCENTUAL")
    private Double aliquotaCofinsPercentual;
    @Column(name = "ALIQUOTA_COFINS_REAIS")
    private Double aliquotaCofinsReais;
    @Column(name = "VALOR_COFINS")
    private Double valorCofins;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoCofinsVO() {
    }

    public NfeDetalheImpostoCofinsVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getBaseCalculoCofins() {
        return baseCalculoCofins;
    }

    public void setBaseCalculoCofins(Double baseCalculoCofins) {
        this.baseCalculoCofins = baseCalculoCofins;
    }

    public Double getAliquotaCofinsPercentual() {
        return aliquotaCofinsPercentual;
    }

    public void setAliquotaCofinsPercentual(Double aliquotaCofinsPercentual) {
        this.aliquotaCofinsPercentual = aliquotaCofinsPercentual;
    }

    public Double getAliquotaCofinsReais() {
        return aliquotaCofinsReais;
    }

    public void setAliquotaCofinsReais(Double aliquotaCofinsReais) {
        this.aliquotaCofinsReais = aliquotaCofinsReais;
    }

    public Double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
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
        if (!(object instanceof NfeDetalheImpostoCofinsVO)) {
            return false;
        }
        NfeDetalheImpostoCofinsVO other = (NfeDetalheImpostoCofinsVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoCofinsVO[ id=" + id + " ]";
    }
    
}
