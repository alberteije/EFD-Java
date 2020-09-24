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
@Table(name = "ecf_nota_fiscal_detalhe")
@NamedQueries({
    @NamedQuery(name = "EcfNotaFiscalDetalheVO.findAll", query = "SELECT e FROM EcfNotaFiscalDetalheVO e")})
public class EcfNotaFiscalDetalheVO implements Serializable {
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
    @Column(name = "ID_NF_CABECALHO")
    private Integer idNfCabecalho;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Basic(optional = false)
    @Column(name = "CFOP")
    private int cfop;
    @Column(name = "ITEM")
    private Integer item;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALOR_UNITARIO")
    private Double valorUnitario;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "BASE_ICMS")
    private Double baseIcms;
    @Column(name = "TAXA_ICMS")
    private Double taxaIcms;
    @Column(name = "ICMS")
    private Double icms;
    @Column(name = "ICMS_OUTRAS")
    private Double icmsOutras;
    @Column(name = "ICMS_ISENTO")
    private Double icmsIsento;
    @Column(name = "TAXA_DESCONTO")
    private Double taxaDesconto;
    @Column(name = "DESCONTO")
    private Double desconto;
    @Column(name = "TAXA_ISSQN")
    private Double taxaIssqn;
    @Column(name = "ISSQN")
    private Double issqn;
    @Column(name = "TAXA_PIS")
    private Double taxaPis;
    @Column(name = "PIS")
    private Double pis;
    @Column(name = "TAXA_COFINS")
    private Double taxaCofins;
    @Column(name = "COFINS")
    private Double cofins;
    @Column(name = "TAXA_ACRESCIMO")
    private Double taxaAcrescimo;
    @Column(name = "ACRESCIMO")
    private Double acrescimo;
    @Column(name = "TAXA_IPI")
    private Double taxaIpi;
    @Column(name = "IPI")
    private Double ipi;
    @Column(name = "CANCELADO")
    private String cancelado;
    @Column(name = "CST")
    private String cst;
    @Column(name = "MOVIMENTA_ESTOQUE")
    private String movimentaEstoque;
    @Column(name = "ECF_ICMS_ST")
    private String ecfIcmsSt;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfNotaFiscalDetalheVO() {
    }

    public EcfNotaFiscalDetalheVO(Integer id) {
        this.id = id;
    }

    public EcfNotaFiscalDetalheVO(Integer id, int cfop) {
        this.id = id;
        this.cfop = cfop;
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

    public Integer getIdNfCabecalho() {
        return idNfCabecalho;
    }

    public void setIdNfCabecalho(Integer idNfCabecalho) {
        this.idNfCabecalho = idNfCabecalho;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getBaseIcms() {
        return baseIcms;
    }

    public void setBaseIcms(Double baseIcms) {
        this.baseIcms = baseIcms;
    }

    public Double getTaxaIcms() {
        return taxaIcms;
    }

    public void setTaxaIcms(Double taxaIcms) {
        this.taxaIcms = taxaIcms;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getIcmsOutras() {
        return icmsOutras;
    }

    public void setIcmsOutras(Double icmsOutras) {
        this.icmsOutras = icmsOutras;
    }

    public Double getIcmsIsento() {
        return icmsIsento;
    }

    public void setIcmsIsento(Double icmsIsento) {
        this.icmsIsento = icmsIsento;
    }

    public Double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTaxaIssqn() {
        return taxaIssqn;
    }

    public void setTaxaIssqn(Double taxaIssqn) {
        this.taxaIssqn = taxaIssqn;
    }

    public Double getIssqn() {
        return issqn;
    }

    public void setIssqn(Double issqn) {
        this.issqn = issqn;
    }

    public Double getTaxaPis() {
        return taxaPis;
    }

    public void setTaxaPis(Double taxaPis) {
        this.taxaPis = taxaPis;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getTaxaCofins() {
        return taxaCofins;
    }

    public void setTaxaCofins(Double taxaCofins) {
        this.taxaCofins = taxaCofins;
    }

    public Double getCofins() {
        return cofins;
    }

    public void setCofins(Double cofins) {
        this.cofins = cofins;
    }

    public Double getTaxaAcrescimo() {
        return taxaAcrescimo;
    }

    public void setTaxaAcrescimo(Double taxaAcrescimo) {
        this.taxaAcrescimo = taxaAcrescimo;
    }

    public Double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(Double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public Double getTaxaIpi() {
        return taxaIpi;
    }

    public void setTaxaIpi(Double taxaIpi) {
        this.taxaIpi = taxaIpi;
    }

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getMovimentaEstoque() {
        return movimentaEstoque;
    }

    public void setMovimentaEstoque(String movimentaEstoque) {
        this.movimentaEstoque = movimentaEstoque;
    }

    public String getEcfIcmsSt() {
        return ecfIcmsSt;
    }

    public void setEcfIcmsSt(String ecfIcmsSt) {
        this.ecfIcmsSt = ecfIcmsSt;
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
        if (!(object instanceof EcfNotaFiscalDetalheVO)) {
            return false;
        }
        EcfNotaFiscalDetalheVO other = (EcfNotaFiscalDetalheVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfNotaFiscalDetalheVO[ id=" + id + " ]";
    }
    
}
