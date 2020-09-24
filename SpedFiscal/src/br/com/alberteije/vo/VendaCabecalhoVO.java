/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "venda_cabecalho")
@NamedQueries({
    @NamedQuery(name = "VendaCabecalhoVO.findAll", query = "SELECT v FROM VendaCabecalhoVO v")})
public class VendaCabecalhoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATA_VENDA")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "HORA_SAIDA")
    private String horaSaida;
    @Column(name = "NUMERO_FATURA")
    private Integer numeroFatura;
    @Column(name = "LOCAL_ENTREGA")
    private String localEntrega;
    @Column(name = "LOCAL_COBRANCA")
    private String localCobranca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_SUBTOTAL")
    private Double valorSubtotal;
    @Column(name = "TAXA_COMISSAO")
    private Double taxaComissao;
    @Column(name = "VALOR_COMISSAO")
    private Double valorComissao;
    @Column(name = "TAXA_DESCONTO")
    private Double taxaDesconto;
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "TIPO_FRETE")
    private String tipoFrete;
    @Column(name = "FORMA_PAGAMENTO")
    private String formaPagamento;
    @Column(name = "VALOR_FRETE")
    private Double valorFrete;
    @Column(name = "VALOR_SEGURO")
    private Double valorSeguro;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "SITUACAO")
    private String situacao;
    @JoinColumn(name = "ID_TRANSPORTADORA", referencedColumnName = "ID")
    @ManyToOne
    private TransportadoraVO idTransportadora;
    @JoinColumn(name = "ID_VENDEDOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private VendedorVO idVendedor;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ClienteVO idCliente;
    @OneToMany(mappedBy = "idVendaCabecalho")
    private List<NfeCabecalhoVO> nfeCabecalhoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVendaCabecalho")
    private List<VendaDetalheVO> vendaDetalheVOList;

    public VendaCabecalhoVO() {
    }

    public VendaCabecalhoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Integer getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(Integer numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(String localEntrega) {
        this.localEntrega = localEntrega;
    }

    public String getLocalCobranca() {
        return localCobranca;
    }

    public void setLocalCobranca(String localCobranca) {
        this.localCobranca = localCobranca;
    }

    public Double getValorSubtotal() {
        return valorSubtotal;
    }

    public void setValorSubtotal(Double valorSubtotal) {
        this.valorSubtotal = valorSubtotal;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public Double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(Double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public TransportadoraVO getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(TransportadoraVO idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public VendedorVO getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(VendedorVO idVendedor) {
        this.idVendedor = idVendedor;
    }

    public ClienteVO getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteVO idCliente) {
        this.idCliente = idCliente;
    }

    public List<NfeCabecalhoVO> getNfeCabecalhoVOList() {
        return nfeCabecalhoVOList;
    }

    public void setNfeCabecalhoVOList(List<NfeCabecalhoVO> nfeCabecalhoVOList) {
        this.nfeCabecalhoVOList = nfeCabecalhoVOList;
    }

    public List<VendaDetalheVO> getVendaDetalheVOList() {
        return vendaDetalheVOList;
    }

    public void setVendaDetalheVOList(List<VendaDetalheVO> vendaDetalheVOList) {
        this.vendaDetalheVOList = vendaDetalheVOList;
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
        if (!(object instanceof VendaCabecalhoVO)) {
            return false;
        }
        VendaCabecalhoVO other = (VendaCabecalhoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.VendaCabecalhoVO[ id=" + id + " ]";
    }
    
}
