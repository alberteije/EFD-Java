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
@Table(name = "nfe_cana_fornecimento_diario")
@NamedQueries({
    @NamedQuery(name = "NfeCanaFornecimentoDiarioVO.findAll", query = "SELECT n FROM NfeCanaFornecimentoDiarioVO n")})
public class NfeCanaFornecimentoDiarioVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DIA")
    private String dia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "QUANTIDADE_TOTAL_MES")
    private Double quantidadeTotalMes;
    @Column(name = "QUANTIDADE_TOTAL_ANTERIOR")
    private Double quantidadeTotalAnterior;
    @Column(name = "QUANTIDADE_TOTAL_GERAL")
    private Double quantidadeTotalGeral;
    @JoinColumn(name = "ID_NFE_CANA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCanaVO idNfeCana;

    public NfeCanaFornecimentoDiarioVO() {
    }

    public NfeCanaFornecimentoDiarioVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getQuantidadeTotalMes() {
        return quantidadeTotalMes;
    }

    public void setQuantidadeTotalMes(Double quantidadeTotalMes) {
        this.quantidadeTotalMes = quantidadeTotalMes;
    }

    public Double getQuantidadeTotalAnterior() {
        return quantidadeTotalAnterior;
    }

    public void setQuantidadeTotalAnterior(Double quantidadeTotalAnterior) {
        this.quantidadeTotalAnterior = quantidadeTotalAnterior;
    }

    public Double getQuantidadeTotalGeral() {
        return quantidadeTotalGeral;
    }

    public void setQuantidadeTotalGeral(Double quantidadeTotalGeral) {
        this.quantidadeTotalGeral = quantidadeTotalGeral;
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
        if (!(object instanceof NfeCanaFornecimentoDiarioVO)) {
            return false;
        }
        NfeCanaFornecimentoDiarioVO other = (NfeCanaFornecimentoDiarioVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeCanaFornecimentoDiarioVO[ id=" + id + " ]";
    }
    
}
