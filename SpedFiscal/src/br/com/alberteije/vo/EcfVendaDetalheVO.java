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
@Table(name = "ecf_venda_detalhe")
@NamedQueries({
    @NamedQuery(name = "EcfVendaDetalheVO.findAll", query = "SELECT e FROM EcfVendaDetalheVO e")})
public class EcfVendaDetalheVO implements Serializable {
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
    @Column(name = "ID_ECF_PRODUTO")
    private Integer idEcfProduto;
    @Column(name = "ID_ECF_VENDA_CABECALHO")
    private Integer idEcfVendaCabecalho;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "GTIN")
    private String gtin;
    @Column(name = "CCF")
    private Integer ccf;
    @Column(name = "COO")
    private Integer coo;
    @Column(name = "SERIE_ECF")
    private String serieEcf;
    @Column(name = "ITEM")
    private Integer item;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALOR_UNITARIO")
    private Double valorUnitario;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "TOTAL_ITEM")
    private Double totalItem;
    @Column(name = "BASE_ICMS")
    private Double baseIcms;
    @Column(name = "TAXA_ICMS")
    private Double taxaIcms;
    @Column(name = "ICMS")
    private Double icms;
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
    @Column(name = "ACRESCIMO_RATEIO")
    private Double acrescimoRateio;
    @Column(name = "DESCONTO_RATEIO")
    private Double descontoRateio;
    @Column(name = "TOTALIZADOR_PARCIAL")
    private String totalizadorParcial;
    @Column(name = "CST")
    private String cst;
    @Column(name = "CANCELADO")
    private String cancelado;
    @Column(name = "MOVIMENTA_ESTOQUE")
    private String movimentaEstoque;
    @Column(name = "ECF_ICMS_ST")
    private String ecfIcmsSt;
    @Column(name = "HASH_TRIPA")
    private String hashTripa;
    @Column(name = "HASH_INCREMENTO")
    private Integer hashIncremento;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfVendaDetalheVO() {
    }

    public EcfVendaDetalheVO(Integer id) {
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

    public Integer getIdEcfProduto() {
        return idEcfProduto;
    }

    public void setIdEcfProduto(Integer idEcfProduto) {
        this.idEcfProduto = idEcfProduto;
    }

    public Integer getIdEcfVendaCabecalho() {
        return idEcfVendaCabecalho;
    }

    public void setIdEcfVendaCabecalho(Integer idEcfVendaCabecalho) {
        this.idEcfVendaCabecalho = idEcfVendaCabecalho;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public Integer getCcf() {
        return ccf;
    }

    public void setCcf(Integer ccf) {
        this.ccf = ccf;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public String getSerieEcf() {
        return serieEcf;
    }

    public void setSerieEcf(String serieEcf) {
        this.serieEcf = serieEcf;
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

    public Double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Double totalItem) {
        this.totalItem = totalItem;
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

    public Double getAcrescimoRateio() {
        return acrescimoRateio;
    }

    public void setAcrescimoRateio(Double acrescimoRateio) {
        this.acrescimoRateio = acrescimoRateio;
    }

    public Double getDescontoRateio() {
        return descontoRateio;
    }

    public void setDescontoRateio(Double descontoRateio) {
        this.descontoRateio = descontoRateio;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
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

    public String getHashTripa() {
        return hashTripa;
    }

    public void setHashTripa(String hashTripa) {
        this.hashTripa = hashTripa;
    }

    public Integer getHashIncremento() {
        return hashIncremento;
    }

    public void setHashIncremento(Integer hashIncremento) {
        this.hashIncremento = hashIncremento;
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
        if (!(object instanceof EcfVendaDetalheVO)) {
            return false;
        }
        EcfVendaDetalheVO other = (EcfVendaDetalheVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfVendaDetalheVO[ id=" + id + " ]";
    }
    
}
