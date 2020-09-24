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
@Table(name = "nfe_detalhe_imposto_issqn")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheImpostoIssqnVO.findAll", query = "SELECT n FROM NfeDetalheImpostoIssqnVO n")})
public class NfeDetalheImpostoIssqnVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_CALCULO_ISSQN")
    private Double baseCalculoIssqn;
    @Column(name = "ALIQUOTA_ISSQN")
    private Double aliquotaIssqn;
    @Column(name = "VALOR_ISSQN")
    private Double valorIssqn;
    @Column(name = "MUNICIPIO_ISSQN")
    private Integer municipioIssqn;
    @Column(name = "ITEM_LISTA_SERVICOS")
    private Integer itemListaServicos;
    @Column(name = "TRIBUTACAO_ISSQN")
    private String tributacaoIssqn;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetalheImpostoIssqnVO() {
    }

    public NfeDetalheImpostoIssqnVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBaseCalculoIssqn() {
        return baseCalculoIssqn;
    }

    public void setBaseCalculoIssqn(Double baseCalculoIssqn) {
        this.baseCalculoIssqn = baseCalculoIssqn;
    }

    public Double getAliquotaIssqn() {
        return aliquotaIssqn;
    }

    public void setAliquotaIssqn(Double aliquotaIssqn) {
        this.aliquotaIssqn = aliquotaIssqn;
    }

    public Double getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(Double valorIssqn) {
        this.valorIssqn = valorIssqn;
    }

    public Integer getMunicipioIssqn() {
        return municipioIssqn;
    }

    public void setMunicipioIssqn(Integer municipioIssqn) {
        this.municipioIssqn = municipioIssqn;
    }

    public Integer getItemListaServicos() {
        return itemListaServicos;
    }

    public void setItemListaServicos(Integer itemListaServicos) {
        this.itemListaServicos = itemListaServicos;
    }

    public String getTributacaoIssqn() {
        return tributacaoIssqn;
    }

    public void setTributacaoIssqn(String tributacaoIssqn) {
        this.tributacaoIssqn = tributacaoIssqn;
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
        if (!(object instanceof NfeDetalheImpostoIssqnVO)) {
            return false;
        }
        NfeDetalheImpostoIssqnVO other = (NfeDetalheImpostoIssqnVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheImpostoIssqnVO[ id=" + id + " ]";
    }
    
}
