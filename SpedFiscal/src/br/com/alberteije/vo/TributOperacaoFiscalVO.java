/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "tribut_operacao_fiscal")
@NamedQueries({
    @NamedQuery(name = "TributOperacaoFiscalVO.findAll", query = "SELECT t FROM TributOperacaoFiscalVO t")})
public class TributOperacaoFiscalVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DESCRICAO_NA_NF")
    private String descricaoNaNf;
    @Column(name = "CFOP")
    private Integer cfop;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributOperacaoFiscal")
    private List<TributConfiguraOfGtVO> tributConfiguraOfGtVOList;
    @OneToMany(mappedBy = "idOperacaoFiscal")
    private List<ClienteVO> clienteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributOperacaoFiscal")
    private List<TributIssVO> tributIssVOList;
    @OneToMany(mappedBy = "idTributOperacaoFiscal")
    private List<NfeCabecalhoVO> nfeCabecalhoVOList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public TributOperacaoFiscalVO() {
    }

    public TributOperacaoFiscalVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoNaNf() {
        return descricaoNaNf;
    }

    public void setDescricaoNaNf(String descricaoNaNf) {
        this.descricaoNaNf = descricaoNaNf;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<TributConfiguraOfGtVO> getTributConfiguraOfGtVOList() {
        return tributConfiguraOfGtVOList;
    }

    public void setTributConfiguraOfGtVOList(List<TributConfiguraOfGtVO> tributConfiguraOfGtVOList) {
        this.tributConfiguraOfGtVOList = tributConfiguraOfGtVOList;
    }

    public List<ClienteVO> getClienteVOList() {
        return clienteVOList;
    }

    public void setClienteVOList(List<ClienteVO> clienteVOList) {
        this.clienteVOList = clienteVOList;
    }

    public List<TributIssVO> getTributIssVOList() {
        return tributIssVOList;
    }

    public void setTributIssVOList(List<TributIssVO> tributIssVOList) {
        this.tributIssVOList = tributIssVOList;
    }

    public List<NfeCabecalhoVO> getNfeCabecalhoVOList() {
        return nfeCabecalhoVOList;
    }

    public void setNfeCabecalhoVOList(List<NfeCabecalhoVO> nfeCabecalhoVOList) {
        this.nfeCabecalhoVOList = nfeCabecalhoVOList;
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
        if (!(object instanceof TributOperacaoFiscalVO)) {
            return false;
        }
        TributOperacaoFiscalVO other = (TributOperacaoFiscalVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributOperacaoFiscalVO[ id=" + id + " ]";
    }
    
}
