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
@Table(name = "nfe_cana_deducoes_safra")
@NamedQueries({
    @NamedQuery(name = "NfeCanaDeducoesSafraVO.findAll", query = "SELECT n FROM NfeCanaDeducoesSafraVO n")})
public class NfeCanaDeducoesSafraVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DECRICAO")
    private String decricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_DEDUCAO")
    private Double valorDeducao;
    @Column(name = "VALOR_FORNECIMENTO")
    private Double valorFornecimento;
    @Column(name = "VALOR_TOTAL_DEDUCAO")
    private Double valorTotalDeducao;
    @Column(name = "VALOR_LIQUIDO_FORNECIMENTO")
    private Double valorLiquidoFornecimento;
    @JoinColumn(name = "ID_NFE_CANA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCanaVO idNfeCana;

    public NfeCanaDeducoesSafraVO() {
    }

    public NfeCanaDeducoesSafraVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Double getValorDeducao() {
        return valorDeducao;
    }

    public void setValorDeducao(Double valorDeducao) {
        this.valorDeducao = valorDeducao;
    }

    public Double getValorFornecimento() {
        return valorFornecimento;
    }

    public void setValorFornecimento(Double valorFornecimento) {
        this.valorFornecimento = valorFornecimento;
    }

    public Double getValorTotalDeducao() {
        return valorTotalDeducao;
    }

    public void setValorTotalDeducao(Double valorTotalDeducao) {
        this.valorTotalDeducao = valorTotalDeducao;
    }

    public Double getValorLiquidoFornecimento() {
        return valorLiquidoFornecimento;
    }

    public void setValorLiquidoFornecimento(Double valorLiquidoFornecimento) {
        this.valorLiquidoFornecimento = valorLiquidoFornecimento;
    }

    public NfeCanaVO getIdNfeCana() {
        return idNfeCana;
    }

    public void setIdNfeCana(NfeCanaVO idNfeCana) {
        this.idNfeCana = idNfeCana;
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
        if (!(object instanceof NfeCanaDeducoesSafraVO)) {
            return false;
        }
        NfeCanaDeducoesSafraVO other = (NfeCanaDeducoesSafraVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeCanaDeducoesSafraVO[ id=" + id + " ]";
    }
    
}
