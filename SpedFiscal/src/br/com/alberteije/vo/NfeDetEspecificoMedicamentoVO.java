/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_det_especifico_medicamento")
@NamedQueries({
    @NamedQuery(name = "NfeDetEspecificoMedicamentoVO.findAll", query = "SELECT n FROM NfeDetEspecificoMedicamentoVO n")})
public class NfeDetEspecificoMedicamentoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_LOTE")
    private String numeroLote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_LOTE")
    private Double quantidadeLote;
    @Column(name = "DATA_FABRICACAO")
    @Temporal(TemporalType.DATE)
    private Date dataFabricacao;
    @Column(name = "DATA_VALIDADE")
    @Temporal(TemporalType.DATE)
    private Date dataValidade;
    @Column(name = "PRECO_MAXIMO_CONSUMIDOR")
    private Double precoMaximoConsumidor;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;

    public NfeDetEspecificoMedicamentoVO() {
    }

    public NfeDetEspecificoMedicamentoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Double getQuantidadeLote() {
        return quantidadeLote;
    }

    public void setQuantidadeLote(Double quantidadeLote) {
        this.quantidadeLote = quantidadeLote;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Double getPrecoMaximoConsumidor() {
        return precoMaximoConsumidor;
    }

    public void setPrecoMaximoConsumidor(Double precoMaximoConsumidor) {
        this.precoMaximoConsumidor = precoMaximoConsumidor;
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
        if (!(object instanceof NfeDetEspecificoMedicamentoVO)) {
            return false;
        }
        NfeDetEspecificoMedicamentoVO other = (NfeDetEspecificoMedicamentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetEspecificoMedicamentoVO[ id=" + id + " ]";
    }
    
}
