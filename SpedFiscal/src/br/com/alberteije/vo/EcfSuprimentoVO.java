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
@Table(name = "ecf_suprimento")
@NamedQueries({
    @NamedQuery(name = "EcfSuprimentoVO.findAll", query = "SELECT e FROM EcfSuprimentoVO e")})
public class EcfSuprimentoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME_CAIXA")
    private String nomeCaixa;
    @Column(name = "ID_GERADO_CAIXA")
    private Integer idGeradoCaixa;
    @Column(name = "ID_EMPRESA")
    private Integer idEmpresa;
    @Column(name = "ID_ECF_MOVIMENTO")
    private Integer idEcfMovimento;
    @Column(name = "DATA_SUPRIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataSuprimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfSuprimentoVO() {
    }

    public EcfSuprimentoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCaixa() {
        return nomeCaixa;
    }

    public void setNomeCaixa(String nomeCaixa) {
        this.nomeCaixa = nomeCaixa;
    }

    public Integer getIdGeradoCaixa() {
        return idGeradoCaixa;
    }

    public void setIdGeradoCaixa(Integer idGeradoCaixa) {
        this.idGeradoCaixa = idGeradoCaixa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEcfMovimento() {
        return idEcfMovimento;
    }

    public void setIdEcfMovimento(Integer idEcfMovimento) {
        this.idEcfMovimento = idEcfMovimento;
    }

    public Date getDataSuprimento() {
        return dataSuprimento;
    }

    public void setDataSuprimento(Date dataSuprimento) {
        this.dataSuprimento = dataSuprimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataSincronizacao() {
        return dataSincronizacao;
    }

    public void setDataSincronizacao(Date dataSincronizacao) {
        this.dataSincronizacao = dataSincronizacao;
    }

    public String getHoraSincronizacao() {
        return horaSincronizacao;
    }

    public void setHoraSincronizacao(String horaSincronizacao) {
        this.horaSincronizacao = horaSincronizacao;
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
        if (!(object instanceof EcfSuprimentoVO)) {
            return false;
        }
        EcfSuprimentoVO other = (EcfSuprimentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfSuprimentoVO[ id=" + id + " ]";
    }
    
}
