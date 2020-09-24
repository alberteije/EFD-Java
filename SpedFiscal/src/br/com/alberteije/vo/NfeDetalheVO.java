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
@Table(name = "nfe_detalhe")
@NamedQueries({
    @NamedQuery(name = "NfeDetalheVO.findAll", query = "SELECT n FROM NfeDetalheVO n")})
public class NfeDetalheVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_ITEM")
    private Integer numeroItem;
    @Column(name = "CODIGO_PRODUTO")
    private String codigoProduto;
    @Column(name = "GTIN")
    private String gtin;
    @Column(name = "NOME_PRODUTO")
    private String nomeProduto;
    @Column(name = "NCM")
    private String ncm;
    @Column(name = "EX_TIPI")
    private Integer exTipi;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "UNIDADE_COMERCIAL")
    private String unidadeComercial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_COMERCIAL")
    private Double quantidadeComercial;
    @Column(name = "VALOR_UNITARIO_COMERCIAL")
    private Double valorUnitarioComercial;
    @Column(name = "VALOR_BRUTO_PRODUTO")
    private Double valorBrutoProduto;
    @Column(name = "GTIN_UNIDADE_TRIBUTAVEL")
    private String gtinUnidadeTributavel;
    @Column(name = "UNIDADE_TRIBUTAVEL")
    private String unidadeTributavel;
    @Column(name = "QUANTIDADE_TRIBUTAVEL")
    private Double quantidadeTributavel;
    @Column(name = "VALOR_UNITARIO_TRIBUTAVEL")
    private Double valorUnitarioTributavel;
    @Column(name = "VALOR_FRETE")
    private Double valorFrete;
    @Column(name = "VALOR_SEGURO")
    private Double valorSeguro;
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @Column(name = "VALOR_OUTRAS_DESPESAS")
    private Double valorOutrasDespesas;
    @Column(name = "ENTRA_TOTAL")
    private String entraTotal;
    @Column(name = "VALOR_SUBTOTAL")
    private Double valorSubtotal;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "NUMERO_PEDIDO_COMPRA")
    private String numeroPedidoCompra;
    @Column(name = "ITEM_PEDIDO_COMPRA")
    private Integer itemPedidoCompra;
    @Lob
    @Column(name = "INFORMACOES_ADICIONAIS")
    private String informacoesAdicionais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoIcmsVO> nfeDetalheImpostoIcmsVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetEspecificoVeiculoVO> nfeDetEspecificoVeiculoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetEspecificoArmamentoVO> nfeDetEspecificoArmamentoVOList;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne
    private ProdutoVO idProduto;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoIpiVO> nfeDetalheImpostoIpiVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoCofinsVO> nfeDetalheImpostoCofinsVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoIssqnVO> nfeDetalheImpostoIssqnVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDeclaracaoImportacaoVO> nfeDeclaracaoImportacaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoPisVO> nfeDetalheImpostoPisVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetalheImpostoIiVO> nfeDetalheImpostoIiVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetEspecificoCombustivelVO> nfeDetEspecificoCombustivelVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDetalhe")
    private List<NfeDetEspecificoMedicamentoVO> nfeDetEspecificoMedicamentoVOList;

    public NfeDetalheVO() {
    }

    public NfeDetalheVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Integer getExTipi() {
        return exTipi;
    }

    public void setExTipi(Integer exTipi) {
        this.exTipi = exTipi;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getUnidadeComercial() {
        return unidadeComercial;
    }

    public void setUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
    }

    public Double getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(Double quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public Double getValorUnitarioComercial() {
        return valorUnitarioComercial;
    }

    public void setValorUnitarioComercial(Double valorUnitarioComercial) {
        this.valorUnitarioComercial = valorUnitarioComercial;
    }

    public Double getValorBrutoProduto() {
        return valorBrutoProduto;
    }

    public void setValorBrutoProduto(Double valorBrutoProduto) {
        this.valorBrutoProduto = valorBrutoProduto;
    }

    public String getGtinUnidadeTributavel() {
        return gtinUnidadeTributavel;
    }

    public void setGtinUnidadeTributavel(String gtinUnidadeTributavel) {
        this.gtinUnidadeTributavel = gtinUnidadeTributavel;
    }

    public String getUnidadeTributavel() {
        return unidadeTributavel;
    }

    public void setUnidadeTributavel(String unidadeTributavel) {
        this.unidadeTributavel = unidadeTributavel;
    }

    public Double getQuantidadeTributavel() {
        return quantidadeTributavel;
    }

    public void setQuantidadeTributavel(Double quantidadeTributavel) {
        this.quantidadeTributavel = quantidadeTributavel;
    }

    public Double getValorUnitarioTributavel() {
        return valorUnitarioTributavel;
    }

    public void setValorUnitarioTributavel(Double valorUnitarioTributavel) {
        this.valorUnitarioTributavel = valorUnitarioTributavel;
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

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(Double valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public String getEntraTotal() {
        return entraTotal;
    }

    public void setEntraTotal(String entraTotal) {
        this.entraTotal = entraTotal;
    }

    public Double getValorSubtotal() {
        return valorSubtotal;
    }

    public void setValorSubtotal(Double valorSubtotal) {
        this.valorSubtotal = valorSubtotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNumeroPedidoCompra() {
        return numeroPedidoCompra;
    }

    public void setNumeroPedidoCompra(String numeroPedidoCompra) {
        this.numeroPedidoCompra = numeroPedidoCompra;
    }

    public Integer getItemPedidoCompra() {
        return itemPedidoCompra;
    }

    public void setItemPedidoCompra(Integer itemPedidoCompra) {
        this.itemPedidoCompra = itemPedidoCompra;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public List<NfeDetalheImpostoIcmsVO> getNfeDetalheImpostoIcmsVOList() {
        return nfeDetalheImpostoIcmsVOList;
    }

    public void setNfeDetalheImpostoIcmsVOList(List<NfeDetalheImpostoIcmsVO> nfeDetalheImpostoIcmsVOList) {
        this.nfeDetalheImpostoIcmsVOList = nfeDetalheImpostoIcmsVOList;
    }

    public List<NfeDetEspecificoVeiculoVO> getNfeDetEspecificoVeiculoVOList() {
        return nfeDetEspecificoVeiculoVOList;
    }

    public void setNfeDetEspecificoVeiculoVOList(List<NfeDetEspecificoVeiculoVO> nfeDetEspecificoVeiculoVOList) {
        this.nfeDetEspecificoVeiculoVOList = nfeDetEspecificoVeiculoVOList;
    }

    public List<NfeDetEspecificoArmamentoVO> getNfeDetEspecificoArmamentoVOList() {
        return nfeDetEspecificoArmamentoVOList;
    }

    public void setNfeDetEspecificoArmamentoVOList(List<NfeDetEspecificoArmamentoVO> nfeDetEspecificoArmamentoVOList) {
        this.nfeDetEspecificoArmamentoVOList = nfeDetEspecificoArmamentoVOList;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
    }

    public NfeCabecalhoVO getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(NfeCabecalhoVO idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
    }

    public List<NfeDetalheImpostoIpiVO> getNfeDetalheImpostoIpiVOList() {
        return nfeDetalheImpostoIpiVOList;
    }

    public void setNfeDetalheImpostoIpiVOList(List<NfeDetalheImpostoIpiVO> nfeDetalheImpostoIpiVOList) {
        this.nfeDetalheImpostoIpiVOList = nfeDetalheImpostoIpiVOList;
    }

    public List<NfeDetalheImpostoCofinsVO> getNfeDetalheImpostoCofinsVOList() {
        return nfeDetalheImpostoCofinsVOList;
    }

    public void setNfeDetalheImpostoCofinsVOList(List<NfeDetalheImpostoCofinsVO> nfeDetalheImpostoCofinsVOList) {
        this.nfeDetalheImpostoCofinsVOList = nfeDetalheImpostoCofinsVOList;
    }

    public List<NfeDetalheImpostoIssqnVO> getNfeDetalheImpostoIssqnVOList() {
        return nfeDetalheImpostoIssqnVOList;
    }

    public void setNfeDetalheImpostoIssqnVOList(List<NfeDetalheImpostoIssqnVO> nfeDetalheImpostoIssqnVOList) {
        this.nfeDetalheImpostoIssqnVOList = nfeDetalheImpostoIssqnVOList;
    }

    public List<NfeDeclaracaoImportacaoVO> getNfeDeclaracaoImportacaoVOList() {
        return nfeDeclaracaoImportacaoVOList;
    }

    public void setNfeDeclaracaoImportacaoVOList(List<NfeDeclaracaoImportacaoVO> nfeDeclaracaoImportacaoVOList) {
        this.nfeDeclaracaoImportacaoVOList = nfeDeclaracaoImportacaoVOList;
    }

    public List<NfeDetalheImpostoPisVO> getNfeDetalheImpostoPisVOList() {
        return nfeDetalheImpostoPisVOList;
    }

    public void setNfeDetalheImpostoPisVOList(List<NfeDetalheImpostoPisVO> nfeDetalheImpostoPisVOList) {
        this.nfeDetalheImpostoPisVOList = nfeDetalheImpostoPisVOList;
    }

    public List<NfeDetalheImpostoIiVO> getNfeDetalheImpostoIiVOList() {
        return nfeDetalheImpostoIiVOList;
    }

    public void setNfeDetalheImpostoIiVOList(List<NfeDetalheImpostoIiVO> nfeDetalheImpostoIiVOList) {
        this.nfeDetalheImpostoIiVOList = nfeDetalheImpostoIiVOList;
    }

    public List<NfeDetEspecificoCombustivelVO> getNfeDetEspecificoCombustivelVOList() {
        return nfeDetEspecificoCombustivelVOList;
    }

    public void setNfeDetEspecificoCombustivelVOList(List<NfeDetEspecificoCombustivelVO> nfeDetEspecificoCombustivelVOList) {
        this.nfeDetEspecificoCombustivelVOList = nfeDetEspecificoCombustivelVOList;
    }

    public List<NfeDetEspecificoMedicamentoVO> getNfeDetEspecificoMedicamentoVOList() {
        return nfeDetEspecificoMedicamentoVOList;
    }

    public void setNfeDetEspecificoMedicamentoVOList(List<NfeDetEspecificoMedicamentoVO> nfeDetEspecificoMedicamentoVOList) {
        this.nfeDetEspecificoMedicamentoVOList = nfeDetEspecificoMedicamentoVOList;
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
        if (!(object instanceof NfeDetalheVO)) {
            return false;
        }
        NfeDetalheVO other = (NfeDetalheVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDetalheVO[ id=" + id + " ]";
    }
    
}
