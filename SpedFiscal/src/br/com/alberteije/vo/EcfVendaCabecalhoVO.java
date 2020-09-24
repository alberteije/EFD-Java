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
@Table(name = "ecf_venda_cabecalho")
@NamedQueries({
    @NamedQuery(name = "EcfVendaCabecalhoVO.findAll", query = "SELECT e FROM EcfVendaCabecalhoVO e")})
public class EcfVendaCabecalhoVO implements Serializable {
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
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "ID_ECF_FUNCIONARIO")
    private Integer idEcfFuncionario;
    @Column(name = "ID_ECF_MOVIMENTO")
    private Integer idEcfMovimento;
    @Column(name = "ID_ECF_DAV")
    private Integer idEcfDav;
    @Column(name = "ID_ECF_PRE_VENDA_CABECALHO")
    private Integer idEcfPreVendaCabecalho;
    @Column(name = "SERIE_ECF")
    private String serieEcf;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "COO")
    private Integer coo;
    @Column(name = "CCF")
    private Integer ccf;
    @Column(name = "DATA_VENDA")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column(name = "HORA_VENDA")
    private String horaVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_VENDA")
    private Double valorVenda;
    @Column(name = "TAXA_DESCONTO")
    private Double taxaDesconto;
    @Column(name = "DESCONTO")
    private Double desconto;
    @Column(name = "TAXA_ACRESCIMO")
    private Double taxaAcrescimo;
    @Column(name = "ACRESCIMO")
    private Double acrescimo;
    @Column(name = "VALOR_FINAL")
    private Double valorFinal;
    @Column(name = "VALOR_RECEBIDO")
    private Double valorRecebido;
    @Column(name = "TROCO")
    private Double troco;
    @Column(name = "VALOR_CANCELADO")
    private Double valorCancelado;
    @Column(name = "TOTAL_PRODUTOS")
    private Double totalProdutos;
    @Column(name = "TOTAL_DOCUMENTO")
    private Double totalDocumento;
    @Column(name = "BASE_ICMS")
    private Double baseIcms;
    @Column(name = "ICMS")
    private Double icms;
    @Column(name = "ICMS_OUTRAS")
    private Double icmsOutras;
    @Column(name = "ISSQN")
    private Double issqn;
    @Column(name = "PIS")
    private Double pis;
    @Column(name = "COFINS")
    private Double cofins;
    @Column(name = "ACRESCIMO_ITENS")
    private Double acrescimoItens;
    @Column(name = "DESCONTO_ITENS")
    private Double descontoItens;
    @Column(name = "STATUS_VENDA")
    private String statusVenda;
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "CPF_CNPJ_CLIENTE")
    private String cpfCnpjCliente;
    @Column(name = "CUPOM_CANCELADO")
    private String cupomCancelado;
    @Column(name = "HASH_TRIPA")
    private String hashTripa;
    @Column(name = "HASH_INCREMENTO")
    private Integer hashIncremento;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfVendaCabecalhoVO() {
    }

    public EcfVendaCabecalhoVO(Integer id) {
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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEcfFuncionario() {
        return idEcfFuncionario;
    }

    public void setIdEcfFuncionario(Integer idEcfFuncionario) {
        this.idEcfFuncionario = idEcfFuncionario;
    }

    public Integer getIdEcfMovimento() {
        return idEcfMovimento;
    }

    public void setIdEcfMovimento(Integer idEcfMovimento) {
        this.idEcfMovimento = idEcfMovimento;
    }

    public Integer getIdEcfDav() {
        return idEcfDav;
    }

    public void setIdEcfDav(Integer idEcfDav) {
        this.idEcfDav = idEcfDav;
    }

    public Integer getIdEcfPreVendaCabecalho() {
        return idEcfPreVendaCabecalho;
    }

    public void setIdEcfPreVendaCabecalho(Integer idEcfPreVendaCabecalho) {
        this.idEcfPreVendaCabecalho = idEcfPreVendaCabecalho;
    }

    public String getSerieEcf() {
        return serieEcf;
    }

    public void setSerieEcf(String serieEcf) {
        this.serieEcf = serieEcf;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Integer getCcf() {
        return ccf;
    }

    public void setCcf(Integer ccf) {
        this.ccf = ccf;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
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

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public Double getValorCancelado() {
        return valorCancelado;
    }

    public void setValorCancelado(Double valorCancelado) {
        this.valorCancelado = valorCancelado;
    }

    public Double getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(Double totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public Double getTotalDocumento() {
        return totalDocumento;
    }

    public void setTotalDocumento(Double totalDocumento) {
        this.totalDocumento = totalDocumento;
    }

    public Double getBaseIcms() {
        return baseIcms;
    }

    public void setBaseIcms(Double baseIcms) {
        this.baseIcms = baseIcms;
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

    public Double getIssqn() {
        return issqn;
    }

    public void setIssqn(Double issqn) {
        this.issqn = issqn;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getCofins() {
        return cofins;
    }

    public void setCofins(Double cofins) {
        this.cofins = cofins;
    }

    public Double getAcrescimoItens() {
        return acrescimoItens;
    }

    public void setAcrescimoItens(Double acrescimoItens) {
        this.acrescimoItens = acrescimoItens;
    }

    public Double getDescontoItens() {
        return descontoItens;
    }

    public void setDescontoItens(Double descontoItens) {
        this.descontoItens = descontoItens;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public String getCupomCancelado() {
        return cupomCancelado;
    }

    public void setCupomCancelado(String cupomCancelado) {
        this.cupomCancelado = cupomCancelado;
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
        if (!(object instanceof EcfVendaCabecalhoVO)) {
            return false;
        }
        EcfVendaCabecalhoVO other = (EcfVendaCabecalhoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfVendaCabecalhoVO[ id=" + id + " ]";
    }
    
}
