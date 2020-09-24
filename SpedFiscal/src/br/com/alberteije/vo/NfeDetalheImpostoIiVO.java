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
@Table(name = "nfe_detalhe_imposto_ii")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoIiVO.findAll", query = "SELECT n FROM NfeDetalheImpostoIiVO n")})
public class NfeDetalheImpostoIiVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_BC_II")
    private Double valorBcIi;
    @Column(name = "VALOR_DESPESAS_ADUANEIRAS")
    private Double valorDespesasAduaneiras;
    @Column(name = "VALOR_IMPOSTO_IMPORTACAO")
    private Double valorImpostoImportacao;
    @Column(name = "VALOR_IOF")
    private Double valorIof;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoIiVO() {
    }

    public NfeDetalheImpostoIiVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorBcIi() {
        return valorBcIi;
    }

    public void setValorBcIi(Double valorBcIi) {
        this.valorBcIi = valorBcIi;
    }

    public Double getValorDespesasAduaneiras() {
        return valorDespesasAduaneiras;
    }

    public void setValorDespesasAduaneiras(Double valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    }

    public Double getValorImpostoImportacao() {
        return valorImpostoImportacao;
    }

    public void setValorImpostoImportacao(Double valorImpostoImportacao) {
        this.valorImpostoImportacao = valorImpostoImportacao;
    }

    public Double getValorIof() {
        return valorIof;
    }

    public void setValorIof(Double valorIof) {
        this.valorIof = valorIof;
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
        if (!(object instanceof NfeDetalheImpostoIiVO)) {
            return false;
        }
        NfeDetalheImpostoIiVO other = (NfeDetalheImpostoIiVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoIiVO[ id=" + id + " ]";
    }
    
}
