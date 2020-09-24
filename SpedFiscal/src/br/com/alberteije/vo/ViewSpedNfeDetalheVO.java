/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "view_sped_nfe_detalhe")
@NamedQueries({
    @NamedQuery(name = "ViewSpedNfeDetalheVO.findAll", query = "SELECT v FROM ViewSpedNfeDetalheVO v")})
public class ViewSpedNfeDetalheVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;
    @Basic(optional = false)
    @Column(name = "ID_NFE_CABECALHO")
    private int idNfeCabecalho;
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
    @Column(name = "ID_TRIBUT_OPERACAO_FISCAL")
    private Integer idTributOperacaoFiscal;
    @Column(name = "ID_UNIDADE_PRODUTO")
    private Integer idUnidadeProduto;
    @Column(name = "CST_COFINS")
    private String cstCofins;
    @Column(name = "QUANTIDADE_VENDIDA_COFINS")
    private Double quantidadeVendidaCofins;
    @Column(name = "BASE_CALCULO_COFINS")
    private Double baseCalculoCofins;
    @Column(name = "ALIQUOTA_COFINS_PERCENTUAL")
    private Double aliquotaCofinsPercentual;
    @Column(name = "ALIQUOTA_COFINS_REAIS")
    private Double aliquotaCofinsReais;
    @Column(name = "VALOR_COFINS")
    private Double valorCofins;
    @Column(name = "ORIGEM_MERCADORIA")
    private String origemMercadoria;
    @Column(name = "CST_ICMS")
    private String cstIcms;
    @Column(name = "CSOSN")
    private String csosn;
    @Column(name = "MODALIDADE_BC_ICMS")
    private String modalidadeBcIcms;
    @Column(name = "TAXA_REDUCAO_BC_ICMS")
    private Double taxaReducaoBcIcms;
    @Column(name = "BASE_CALCULO_ICMS")
    private Double baseCalculoIcms;
    @Column(name = "ALIQUOTA_ICMS")
    private Double aliquotaIcms;
    @Column(name = "VALOR_ICMS")
    private Double valorIcms;
    @Column(name = "MOTIVO_DESONERACAO_ICMS")
    private String motivoDesoneracaoIcms;
    @Column(name = "MODALIDADE_BC_ICMS_ST")
    private String modalidadeBcIcmsSt;
    @Column(name = "PERCENTUAL_MVA_ICMS_ST")
    private Double percentualMvaIcmsSt;
    @Column(name = "PERCENTUAL_REDUCAO_BC_ICMS_ST")
    private Double percentualReducaoBcIcmsSt;
    @Column(name = "VALOR_BASE_CALCULO_ICMS_ST")
    private Double valorBaseCalculoIcmsSt;
    @Column(name = "ALIQUOTA_ICMS_ST")
    private Double aliquotaIcmsSt;
    @Column(name = "VALOR_ICMS_ST")
    private Double valorIcmsSt;
    @Column(name = "VALOR_BC_ICMS_ST_RETIDO")
    private Double valorBcIcmsStRetido;
    @Column(name = "VALOR_ICMS_ST_RETIDO")
    private Double valorIcmsStRetido;
    @Column(name = "VALOR_BC_ICMS_ST_DESTINO")
    private Double valorBcIcmsStDestino;
    @Column(name = "VALOR_ICMS_ST_DESTINO")
    private Double valorIcmsStDestino;
    @Column(name = "ALIQUOTA_CREDITO_ICMS_SN")
    private Double aliquotaCreditoIcmsSn;
    @Column(name = "VALOR_CREDITO_ICMS_SN")
    private Double valorCreditoIcmsSn;
    @Column(name = "PERCENTUAL_BC_OPERACAO_PROPRIA")
    private Double percentualBcOperacaoPropria;
    @Column(name = "UF_ST")
    private String ufSt;
    @Column(name = "VALOR_BC_II")
    private Double valorBcIi;
    @Column(name = "VALOR_DESPESAS_ADUANEIRAS")
    private Double valorDespesasAduaneiras;
    @Column(name = "VALOR_IMPOSTO_IMPORTACAO")
    private Double valorImpostoImportacao;
    @Column(name = "VALOR_IOF")
    private Double valorIof;
    @Column(name = "ENQUADRAMENTO_IPI")
    private String enquadramentoIpi;
    @Column(name = "CNPJ_PRODUTOR")
    private String cnpjProdutor;
    @Column(name = "CODIGO_SELO_IPI")
    private String codigoSeloIpi;
    @Column(name = "QUANTIDADE_SELO_IPI")
    private Integer quantidadeSeloIpi;
    @Column(name = "ENQUADRAMENTO_LEGAL_IPI")
    private String enquadramentoLegalIpi;
    @Column(name = "CST_IPI")
    private String cstIpi;
    @Column(name = "VALOR_BASE_CALCULO_IPI")
    private Double valorBaseCalculoIpi;
    @Column(name = "ALIQUOTA_IPI")
    private Double aliquotaIpi;
    @Column(name = "QUANTIDADE_UNIDADE_TRIBUTAVEL")
    private Double quantidadeUnidadeTributavel;
    @Column(name = "VALOR_UNIDADE_TRIBUTAVEL")
    private Double valorUnidadeTributavel;
    @Column(name = "VALOR_IPI")
    private Double valorIpi;
    @Column(name = "BASE_CALCULO_ISSQN")
    private Double baseCalculoIssqn;
    @Column(name = "ALIQUOTA_ISSQN")
    private Double aliquotaIssqn;
    @Column(name = "VALOR_ISSQN")
    private Double valorIssqn;
    @Column(name = "MUNICIPIO_ISSQN")
    private Integer municipioIssqn;
    @Column(name = "ITEM_LISTA_SERVICOS")
    private Integer itemListaServicos;
    @Column(name = "TRIBUTACAO_ISSQN")
    private String tributacaoIssqn;
    @Column(name = "CST_PIS")
    private String cstPis;
    @Column(name = "QUANTIDADE_VENDIDA_PIS")
    private Double quantidadeVendidaPis;
    @Column(name = "VALOR_BASE_CALCULO_PIS")
    private Double valorBaseCalculoPis;
    @Column(name = "ALIQUOTA_PIS_PERCENTUAL")
    private Double aliquotaPisPercentual;
    @Column(name = "ALIQUOTA_PIS_REAIS")
    private Double aliquotaPisReais;
    @Column(name = "VALOR_PIS")
    private Double valorPis;

    public ViewSpedNfeDetalheVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(int idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
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

    public Integer getIdTributOperacaoFiscal() {
        return idTributOperacaoFiscal;
    }

    public void setIdTributOperacaoFiscal(Integer idTributOperacaoFiscal) {
        this.idTributOperacaoFiscal = idTributOperacaoFiscal;
    }

    public Integer getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(Integer idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Double getQuantidadeVendidaCofins() {
        return quantidadeVendidaCofins;
    }

    public void setQuantidadeVendidaCofins(Double quantidadeVendidaCofins) {
        this.quantidadeVendidaCofins = quantidadeVendidaCofins;
    }

    public Double getBaseCalculoCofins() {
        return baseCalculoCofins;
    }

    public void setBaseCalculoCofins(Double baseCalculoCofins) {
        this.baseCalculoCofins = baseCalculoCofins;
    }

    public Double getAliquotaCofinsPercentual() {
        return aliquotaCofinsPercentual;
    }

    public void setAliquotaCofinsPercentual(Double aliquotaCofinsPercentual) {
        this.aliquotaCofinsPercentual = aliquotaCofinsPercentual;
    }

    public Double getAliquotaCofinsReais() {
        return aliquotaCofinsReais;
    }

    public void setAliquotaCofinsReais(Double aliquotaCofinsReais) {
        this.aliquotaCofinsReais = aliquotaCofinsReais;
    }

    public Double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
    }

    public String getOrigemMercadoria() {
        return origemMercadoria;
    }

    public void setOrigemMercadoria(String origemMercadoria) {
        this.origemMercadoria = origemMercadoria;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public String getModalidadeBcIcms() {
        return modalidadeBcIcms;
    }

    public void setModalidadeBcIcms(String modalidadeBcIcms) {
        this.modalidadeBcIcms = modalidadeBcIcms;
    }

    public Double getTaxaReducaoBcIcms() {
        return taxaReducaoBcIcms;
    }

    public void setTaxaReducaoBcIcms(Double taxaReducaoBcIcms) {
        this.taxaReducaoBcIcms = taxaReducaoBcIcms;
    }

    public Double getBaseCalculoIcms() {
        return baseCalculoIcms;
    }

    public void setBaseCalculoIcms(Double baseCalculoIcms) {
        this.baseCalculoIcms = baseCalculoIcms;
    }

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public String getMotivoDesoneracaoIcms() {
        return motivoDesoneracaoIcms;
    }

    public void setMotivoDesoneracaoIcms(String motivoDesoneracaoIcms) {
        this.motivoDesoneracaoIcms = motivoDesoneracaoIcms;
    }

    public String getModalidadeBcIcmsSt() {
        return modalidadeBcIcmsSt;
    }

    public void setModalidadeBcIcmsSt(String modalidadeBcIcmsSt) {
        this.modalidadeBcIcmsSt = modalidadeBcIcmsSt;
    }

    public Double getPercentualMvaIcmsSt() {
        return percentualMvaIcmsSt;
    }

    public void setPercentualMvaIcmsSt(Double percentualMvaIcmsSt) {
        this.percentualMvaIcmsSt = percentualMvaIcmsSt;
    }

    public Double getPercentualReducaoBcIcmsSt() {
        return percentualReducaoBcIcmsSt;
    }

    public void setPercentualReducaoBcIcmsSt(Double percentualReducaoBcIcmsSt) {
        this.percentualReducaoBcIcmsSt = percentualReducaoBcIcmsSt;
    }

    public Double getValorBaseCalculoIcmsSt() {
        return valorBaseCalculoIcmsSt;
    }

    public void setValorBaseCalculoIcmsSt(Double valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
    }

    public Double getAliquotaIcmsSt() {
        return aliquotaIcmsSt;
    }

    public void setAliquotaIcmsSt(Double aliquotaIcmsSt) {
        this.aliquotaIcmsSt = aliquotaIcmsSt;
    }

    public Double getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(Double valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public Double getValorBcIcmsStRetido() {
        return valorBcIcmsStRetido;
    }

    public void setValorBcIcmsStRetido(Double valorBcIcmsStRetido) {
        this.valorBcIcmsStRetido = valorBcIcmsStRetido;
    }

    public Double getValorIcmsStRetido() {
        return valorIcmsStRetido;
    }

    public void setValorIcmsStRetido(Double valorIcmsStRetido) {
        this.valorIcmsStRetido = valorIcmsStRetido;
    }

    public Double getValorBcIcmsStDestino() {
        return valorBcIcmsStDestino;
    }

    public void setValorBcIcmsStDestino(Double valorBcIcmsStDestino) {
        this.valorBcIcmsStDestino = valorBcIcmsStDestino;
    }

    public Double getValorIcmsStDestino() {
        return valorIcmsStDestino;
    }

    public void setValorIcmsStDestino(Double valorIcmsStDestino) {
        this.valorIcmsStDestino = valorIcmsStDestino;
    }

    public Double getAliquotaCreditoIcmsSn() {
        return aliquotaCreditoIcmsSn;
    }

    public void setAliquotaCreditoIcmsSn(Double aliquotaCreditoIcmsSn) {
        this.aliquotaCreditoIcmsSn = aliquotaCreditoIcmsSn;
    }

    public Double getValorCreditoIcmsSn() {
        return valorCreditoIcmsSn;
    }

    public void setValorCreditoIcmsSn(Double valorCreditoIcmsSn) {
        this.valorCreditoIcmsSn = valorCreditoIcmsSn;
    }

    public Double getPercentualBcOperacaoPropria() {
        return percentualBcOperacaoPropria;
    }

    public void setPercentualBcOperacaoPropria(Double percentualBcOperacaoPropria) {
        this.percentualBcOperacaoPropria = percentualBcOperacaoPropria;
    }

    public String getUfSt() {
        return ufSt;
    }

    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
    }

    public Double getValorBcIi() {
        return valorBcIi;
    }

    public void setValorBcIi(Double valorBcIi) {
        this.valorBcIi = valorBcIi;
    }

    public Double getValorDespesasAduaneiras() {
        return valorDespesasAduaneiras;
    }

    public void setValorDespesasAduaneiras(Double valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    }

    public Double getValorImpostoImportacao() {
        return valorImpostoImportacao;
    }

    public void setValorImpostoImportacao(Double valorImpostoImportacao) {
        this.valorImpostoImportacao = valorImpostoImportacao;
    }

    public Double getValorIof() {
        return valorIof;
    }

    public void setValorIof(Double valorIof) {
        this.valorIof = valorIof;
    }

    public String getEnquadramentoIpi() {
        return enquadramentoIpi;
    }

    public void setEnquadramentoIpi(String enquadramentoIpi) {
        this.enquadramentoIpi = enquadramentoIpi;
    }

    public String getCnpjProdutor() {
        return cnpjProdutor;
    }

    public void setCnpjProdutor(String cnpjProdutor) {
        this.cnpjProdutor = cnpjProdutor;
    }

    public String getCodigoSeloIpi() {
        return codigoSeloIpi;
    }

    public void setCodigoSeloIpi(String codigoSeloIpi) {
        this.codigoSeloIpi = codigoSeloIpi;
    }

    public Integer getQuantidadeSeloIpi() {
        return quantidadeSeloIpi;
    }

    public void setQuantidadeSeloIpi(Integer quantidadeSeloIpi) {
        this.quantidadeSeloIpi = quantidadeSeloIpi;
    }

    public String getEnquadramentoLegalIpi() {
        return enquadramentoLegalIpi;
    }

    public void setEnquadramentoLegalIpi(String enquadramentoLegalIpi) {
        this.enquadramentoLegalIpi = enquadramentoLegalIpi;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public Double getValorBaseCalculoIpi() {
        return valorBaseCalculoIpi;
    }

    public void setValorBaseCalculoIpi(Double valorBaseCalculoIpi) {
        this.valorBaseCalculoIpi = valorBaseCalculoIpi;
    }

    public Double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(Double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public Double getQuantidadeUnidadeTributavel() {
        return quantidadeUnidadeTributavel;
    }

    public void setQuantidadeUnidadeTributavel(Double quantidadeUnidadeTributavel) {
        this.quantidadeUnidadeTributavel = quantidadeUnidadeTributavel;
    }

    public Double getValorUnidadeTributavel() {
        return valorUnidadeTributavel;
    }

    public void setValorUnidadeTributavel(Double valorUnidadeTributavel) {
        this.valorUnidadeTributavel = valorUnidadeTributavel;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getBaseCalculoIssqn() {
        return baseCalculoIssqn;
    }

    public void setBaseCalculoIssqn(Double baseCalculoIssqn) {
        this.baseCalculoIssqn = baseCalculoIssqn;
    }

    public Double getAliquotaIssqn() {
        return aliquotaIssqn;
    }

    public void setAliquotaIssqn(Double aliquotaIssqn) {
        this.aliquotaIssqn = aliquotaIssqn;
    }

    public Double getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(Double valorIssqn) {
        this.valorIssqn = valorIssqn;
    }

    public Integer getMunicipioIssqn() {
        return municipioIssqn;
    }

    public void setMunicipioIssqn(Integer municipioIssqn) {
        this.municipioIssqn = municipioIssqn;
    }

    public Integer getItemListaServicos() {
        return itemListaServicos;
    }

    public void setItemListaServicos(Integer itemListaServicos) {
        this.itemListaServicos = itemListaServicos;
    }

    public String getTributacaoIssqn() {
        return tributacaoIssqn;
    }

    public void setTributacaoIssqn(String tributacaoIssqn) {
        this.tributacaoIssqn = tributacaoIssqn;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public Double getQuantidadeVendidaPis() {
        return quantidadeVendidaPis;
    }

    public void setQuantidadeVendidaPis(Double quantidadeVendidaPis) {
        this.quantidadeVendidaPis = quantidadeVendidaPis;
    }

    public Double getValorBaseCalculoPis() {
        return valorBaseCalculoPis;
    }

    public void setValorBaseCalculoPis(Double valorBaseCalculoPis) {
        this.valorBaseCalculoPis = valorBaseCalculoPis;
    }

    public Double getAliquotaPisPercentual() {
        return aliquotaPisPercentual;
    }

    public void setAliquotaPisPercentual(Double aliquotaPisPercentual) {
        this.aliquotaPisPercentual = aliquotaPisPercentual;
    }

    public Double getAliquotaPisReais() {
        return aliquotaPisReais;
    }

    public void setAliquotaPisReais(Double aliquotaPisReais) {
        this.aliquotaPisReais = aliquotaPisReais;
    }

    public Double getValorPis() {
        return valorPis;
    }

    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
    }
    
}
