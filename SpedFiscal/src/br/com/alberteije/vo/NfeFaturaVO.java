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
@Table(name = "nfe_fatura")
@NamedQueries({
    @NamedQuery(name = "NfeFaturaVO.findAll", query = "SELECT n FROM NfeFaturaVO n")})
public class NfeFaturaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO")
    private String numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_ORIGINAL")
    private Double valorOriginal;
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @Column(name = "VALOR_LIQUIDO")
    private Double valorLiquido;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;

    public NfeFaturaVO() {
    }

    public NfeFaturaVO(Integer id) {
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

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public NfeCabecalhoVO getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(NfeCabecalhoVO idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
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
        if (!(object instanceof NfeFaturaVO)) {
            return false;
        }
        NfeFaturaVO other = (NfeFaturaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeFaturaVO[ id=" + id + " ]";
    }
    
}
