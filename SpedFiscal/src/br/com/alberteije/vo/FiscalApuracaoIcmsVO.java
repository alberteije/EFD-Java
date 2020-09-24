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
@Table(name = "fiscal_apuracao_icms")
@NamedQueries({
    @NamedQuery(name = "FiscalApuracaoIcmsVO.findAll", query = "SELECT f FROM FiscalApuracaoIcmsVO f")})
public class FiscalApuracaoIcmsVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COMPETENCIA")
    private String competencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_TOTAL_DEBITO")
    private Double valorTotalDebito;
    @Column(name = "VALOR_AJUSTE_DEBITO")
    private Double valorAjusteDebito;
    @Column(name = "VALOR_TOTAL_AJUSTE_DEBITO")
    private Double valorTotalAjusteDebito;
    @Column(name = "VALOR_ESTORNO_CREDITO")
    private Double valorEstornoCredito;
    @Column(name = "VALOR_TOTAL_CREDITO")
    private Double valorTotalCredito;
    @Column(name = "VALOR_AJUSTE_CREDITO")
    private Double valorAjusteCredito;
    @Column(name = "VALOR_TOTAL_AJUSTE_CREDITO")
    private Double valorTotalAjusteCredito;
    @Column(name = "VALOR_ESTORNO_DEBITO")
    private Double valorEstornoDebito;
    @Column(name = "VALOR_SALDO_CREDOR_ANTERIOR")
    private Double valorSaldoCredorAnterior;
    @Column(name = "VALOR_SALDO_APURADO")
    private Double valorSaldoApurado;
    @Column(name = "VALOR_TOTAL_DEDUCAO")
    private Double valorTotalDeducao;
    @Column(name = "VALOR_ICMS_RECOLHER")
    private Double valorIcmsRecolher;
    @Column(name = "VALOR_SALDO_CREDOR_TRANSP")
    private Double valorSaldoCredorTransp;
    @Column(name = "VALOR_DEBITO_ESPECIAL")
    private Double valorDebitoEspecial;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public FiscalApuracaoIcmsVO() {
    }

    public FiscalApuracaoIcmsVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Double getValorTotalDebito() {
        return valorTotalDebito;
    }

    public void setValorTotalDebito(Double valorTotalDebito) {
        this.valorTotalDebito = valorTotalDebito;
    }

    public Double getValorAjusteDebito() {
        return valorAjusteDebito;
    }

    public void setValorAjusteDebito(Double valorAjusteDebito) {
        this.valorAjusteDebito = valorAjusteDebito;
    }

    public Double getValorTotalAjusteDebito() {
        return valorTotalAjusteDebito;
    }

    public void setValorTotalAjusteDebito(Double valorTotalAjusteDebito) {
        this.valorTotalAjusteDebito = valorTotalAjusteDebito;
    }

    public Double getValorEstornoCredito() {
        return valorEstornoCredito;
    }

    public void setValorEstornoCredito(Double valorEstornoCredito) {
        this.valorEstornoCredito = valorEstornoCredito;
    }

    public Double getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(Double valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public Double getValorAjusteCredito() {
        return valorAjusteCredito;
    }

    public void setValorAjusteCredito(Double valorAjusteCredito) {
        this.valorAjusteCredito = valorAjusteCredito;
    }

    public Double getValorTotalAjusteCredito() {
        return valorTotalAjusteCredito;
    }

    public void setValorTotalAjusteCredito(Double valorTotalAjusteCredito) {
        this.valorTotalAjusteCredito = valorTotalAjusteCredito;
    }

    public Double getValorEstornoDebito() {
        return valorEstornoDebito;
    }

    public void setValorEstornoDebito(Double valorEstornoDebito) {
        this.valorEstornoDebito = valorEstornoDebito;
    }

    public Double getValorSaldoCredorAnterior() {
        return valorSaldoCredorAnterior;
    }

    public void setValorSaldoCredorAnterior(Double valorSaldoCredorAnterior) {
        this.valorSaldoCredorAnterior = valorSaldoCredorAnterior;
    }

    public Double getValorSaldoApurado() {
        return valorSaldoApurado;
    }

    public void setValorSaldoApurado(Double valorSaldoApurado) {
        this.valorSaldoApurado = valorSaldoApurado;
    }

    public Double getValorTotalDeducao() {
        return valorTotalDeducao;
    }

    public void setValorTotalDeducao(Double valorTotalDeducao) {
        this.valorTotalDeducao = valorTotalDeducao;
    }

    public Double getValorIcmsRecolher() {
        return valorIcmsRecolher;
    }

    public void setValorIcmsRecolher(Double valorIcmsRecolher) {
        this.valorIcmsRecolher = valorIcmsRecolher;
    }

    public Double getValorSaldoCredorTransp() {
        return valorSaldoCredorTransp;
    }

    public void setValorSaldoCredorTransp(Double valorSaldoCredorTransp) {
        this.valorSaldoCredorTransp = valorSaldoCredorTransp;
    }

    public Double getValorDebitoEspecial() {
        return valorDebitoEspecial;
    }

    public void setValorDebitoEspecial(Double valorDebitoEspecial) {
        this.valorDebitoEspecial = valorDebitoEspecial;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof FiscalApuracaoIcmsVO)) {
            return false;
        }
        FiscalApuracaoIcmsVO other = (FiscalApuracaoIcmsVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.FiscalApuracaoIcmsVO[ id=" + id + " ]";
    }
    
}
