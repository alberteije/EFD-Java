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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "ecf_tipo_pagamento")
@NamedQueries({
    @NamedQuery(name = "EcfTipoPagamentoVO.findAll", query = "SELECT e FROM EcfTipoPagamentoVO e")})
public class EcfTipoPagamentoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "TEF")
    private String tef;
    @Column(name = "IMPRIME_VINCULADO")
    private String imprimeVinculado;
    @Column(name = "PERMITE_TROCO")
    private String permiteTroco;
    @Column(name = "TEF_TIPO_GP")
    private String tefTipoGp;
    @Column(name = "GERA_PARCELAS")
    private String geraParcelas;

    public EcfTipoPagamentoVO() {
    }

    public EcfTipoPagamentoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTef() {
        return tef;
    }

    public void setTef(String tef) {
        this.tef = tef;
    }

    public String getImprimeVinculado() {
        return imprimeVinculado;
    }

    public void setImprimeVinculado(String imprimeVinculado) {
        this.imprimeVinculado = imprimeVinculado;
    }

    public String getPermiteTroco() {
        return permiteTroco;
    }

    public void setPermiteTroco(String permiteTroco) {
        this.permiteTroco = permiteTroco;
    }

    public String getTefTipoGp() {
        return tefTipoGp;
    }

    public void setTefTipoGp(String tefTipoGp) {
        this.tefTipoGp = tefTipoGp;
    }

    public String getGeraParcelas() {
        return geraParcelas;
    }

    public void setGeraParcelas(String geraParcelas) {
        this.geraParcelas = geraParcelas;
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
        if (!(object instanceof EcfTipoPagamentoVO)) {
            return false;
        }
        EcfTipoPagamentoVO other = (EcfTipoPagamentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfTipoPagamentoVO[ id=" + id + " ]";
    }
    
}
