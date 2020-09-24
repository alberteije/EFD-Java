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
@Table(name = "nfe_cabecalho")
@NamedQueries({
    @NamedQuery(name = "NfeCabecalhoVO.findAll", query = "SELECT n FROM NfeCabecalhoVO n")})
public class NfeCabecalhoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "UF_EMITENTE")
    private Integer ufEmitente;
    @Column(name = "CODIGO_NUMERICO")
    private String codigoNumerico;
    @Column(name = "NATUREZA_OPERACAO")
    private String naturezaOperacao;
    @Column(name = "INDICADOR_FORMA_PAGAMENTO")
    private String indicadorFormaPagamento;
    @Column(name = "CODIGO_MODELO")
    private String codigoModelo;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "DATA_ENTRADA_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dataEntradaSaida;
    @Column(name = "HORA_ENTRADA_SAIDA")
    private String horaEntradaSaida;
    @Column(name = "TIPO_OPERACAO")
    private String tipoOperacao;
    @Column(name = "CODIGO_MUNICIPIO")
    private Integer codigoMunicipio;
    @Column(name = "FORMATO_IMPRESSAO_DANFE")
    private String formatoImpressaoDanfe;
    @Column(name = "TIPO_EMISSAO")
    private String tipoEmissao;
    @Column(name = "CHAVE_ACESSO")
    private String chaveAcesso;
    @Column(name = "DIGITO_CHAVE_ACESSO")
    private String digitoChaveAcesso;
    @Column(name = "AMBIENTE")
    private String ambiente;
    @Column(name = "FINALIDADE_EMISSAO")
    private String finalidadeEmissao;
    @Column(name = "PROCESSO_EMISSAO")
    private String processoEmissao;
    @Column(name = "VERSAO_PROCESSO_EMISSAO")
    private String versaoProcessoEmissao;
    @Column(name = "DATA_ENTRADA_CONTINGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntradaContingencia;
    @Column(name = "JUSTIFICATIVA_CONTINGENCIA")
    private String justificativaContingencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_CALCULO_ICMS")
    private Double baseCalculoIcms;
    @Column(name = "VALOR_ICMS")
    private Double valorIcms;
    @Column(name = "BASE_CALCULO_ICMS_ST")
    private Double baseCalculoIcmsSt;
    @Column(name = "VALOR_ICMS_ST")
    private Double valorIcmsSt;
    @Column(name = "VALOR_TOTAL_PRODUTOS")
    private Double valorTotalProdutos;
    @Column(name = "VALOR_FRETE")
    private Double valorFrete;
    @Column(name = "VALOR_SEGURO")
    private Double valorSeguro;
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @Column(name = "VALOR_IMPOSTO_IMPORTACAO")
    private Double valorImpostoImportacao;
    @Column(name = "VALOR_IPI")
    private Double valorIpi;
    @Column(name = "VALOR_PIS")
    private Double valorPis;
    @Column(name = "VALOR_COFINS")
    private Double valorCofins;
    @Column(name = "VALOR_DESPESAS_ACESSORIAS")
    private Double valorDespesasAcessorias;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @Column(name = "VALOR_SERVICOS")
    private Double valorServicos;
    @Column(name = "BASE_CALCULO_ISSQN")
    private Double baseCalculoIssqn;
    @Column(name = "VALOR_ISSQN")
    private Double valorIssqn;
    @Column(name = "VALOR_PIS_ISSQN")
    private Double valorPisIssqn;
    @Column(name = "VALOR_COFINS_ISSQN")
    private Double valorCofinsIssqn;
    @Column(name = "VALOR_RETIDO_PIS")
    private Double valorRetidoPis;
    @Column(name = "VALOR_RETIDO_COFINS")
    private Double valorRetidoCofins;
    @Column(name = "VALOR_RETIDO_CSLL")
    private Double valorRetidoCsll;
    @Column(name = "BASE_CALCULO_IRRF")
    private Double baseCalculoIrrf;
    @Column(name = "VALOR_RETIDO_IRRF")
    private Double valorRetidoIrrf;
    @Column(name = "BASE_CALCULO_PREVIDENCIA")
    private Double baseCalculoPrevidencia;
    @Column(name = "VALOR_RETIDO_PREVIDENCIA")
    private Double valorRetidoPrevidencia;
    @Column(name = "COMEX_UF_EMBARQUE")
    private String comexUfEmbarque;
    @Column(name = "COMEX_LOCAL_EMBARQUE")
    private String comexLocalEmbarque;
    @Column(name = "COMPRA_NOTA_EMPENHO")
    private String compraNotaEmpenho;
    @Column(name = "COMPRA_PEDIDO")
    private String compraPedido;
    @Column(name = "COMPRA_CONTRATO")
    private String compraContrato;
    @Lob
    @Column(name = "INFORMACOES_ADD_FISCO")
    private String informacoesAddFisco;
    @Lob
    @Column(name = "INFORMACOES_ADD_CONTRIBUINTE")
    private String informacoesAddContribuinte;
    @Column(name = "STATUS_NOTA")
    private String statusNota;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeCanaVO> nfeCanaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeDetalheVO> nfeDetalheVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeReferenciadaVO> nfeReferenciadaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeDuplicataVO> nfeDuplicataVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeCupomFiscalReferenciadoVO> nfeCupomFiscalReferenciadoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeProdRuralReferenciadaVO> nfeProdRuralReferenciadaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeProcessoReferenciadoVO> nfeProcessoReferenciadoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeLocalEntregaVO> nfeLocalEntregaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeLocalRetiradaVO> nfeLocalRetiradaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeFaturaVO> nfeFaturaVOList;
    @JoinColumn(name = "ID_TRIBUT_OPERACAO_FISCAL", referencedColumnName = "ID")
    @ManyToOne
    private TributOperacaoFiscalVO idTributOperacaoFiscal;
    @JoinColumn(name = "ID_VENDA_CABECALHO", referencedColumnName = "ID")
    @ManyToOne
    private VendaCabecalhoVO idVendaCabecalho;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private EmpresaVO idEmpresa;
    @Column(name = "ID_FORNECEDOR")
    private Integer idFornecedor;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeNfReferenciadaVO> nfeNfReferenciadaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeTransporteVO> nfeTransporteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeDestinatarioVO> nfeDestinatarioVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeEmitenteVO> nfeEmitenteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCabecalho")
    private List<NfeCteReferenciadoVO> nfeCteReferenciadoVOList;

    public NfeCabecalhoVO() {
    }

    public NfeCabecalhoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUfEmitente() {
        return ufEmitente;
    }

    public void setUfEmitente(Integer ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getIndicadorFormaPagamento() {
        return indicadorFormaPagamento;
    }

    public void setIndicadorFormaPagamento(String indicadorFormaPagamento) {
        this.indicadorFormaPagamento = indicadorFormaPagamento;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataEntradaSaida() {
        return dataEntradaSaida;
    }

    public void setDataEntradaSaida(Date dataEntradaSaida) {
        this.dataEntradaSaida = dataEntradaSaida;
    }

    public String getHoraEntradaSaida() {
        return horaEntradaSaida;
    }

    public void setHoraEntradaSaida(String horaEntradaSaida) {
        this.horaEntradaSaida = horaEntradaSaida;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Integer getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(Integer codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getFormatoImpressaoDanfe() {
        return formatoImpressaoDanfe;
    }

    public void setFormatoImpressaoDanfe(String formatoImpressaoDanfe) {
        this.formatoImpressaoDanfe = formatoImpressaoDanfe;
    }

    public String getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(String tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getDigitoChaveAcesso() {
        return digitoChaveAcesso;
    }

    public void setDigitoChaveAcesso(String digitoChaveAcesso) {
        this.digitoChaveAcesso = digitoChaveAcesso;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getFinalidadeEmissao() {
        return finalidadeEmissao;
    }

    public void setFinalidadeEmissao(String finalidadeEmissao) {
        this.finalidadeEmissao = finalidadeEmissao;
    }

    public String getProcessoEmissao() {
        return processoEmissao;
    }

    public void setProcessoEmissao(String processoEmissao) {
        this.processoEmissao = processoEmissao;
    }

    public String getVersaoProcessoEmissao() {
        return versaoProcessoEmissao;
    }

    public void setVersaoProcessoEmissao(String versaoProcessoEmissao) {
        this.versaoProcessoEmissao = versaoProcessoEmissao;
    }

    public Date getDataEntradaContingencia() {
        return dataEntradaContingencia;
    }

    public void setDataEntradaContingencia(Date dataEntradaContingencia) {
        this.dataEntradaContingencia = dataEntradaContingencia;
    }

    public String getJustificativaContingencia() {
        return justificativaContingencia;
    }

    public void setJustificativaContingencia(String justificativaContingencia) {
        this.justificativaContingencia = justificativaContingencia;
    }

    public Double getBaseCalculoIcms() {
        return baseCalculoIcms;
    }

    public void setBaseCalculoIcms(Double baseCalculoIcms) {
        this.baseCalculoIcms = baseCalculoIcms;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Double getBaseCalculoIcmsSt() {
        return baseCalculoIcmsSt;
    }

    public void setBaseCalculoIcmsSt(Double baseCalculoIcmsSt) {
        this.baseCalculoIcmsSt = baseCalculoIcmsSt;
    }

    public Double getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(Double valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public Double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(Double valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
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

    public Double getValorImpostoImportacao() {
        return valorImpostoImportacao;
    }

    public void setValorImpostoImportacao(Double valorImpostoImportacao) {
        this.valorImpostoImportacao = valorImpostoImportacao;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getValorPis() {
        return valorPis;
    }

    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
    }

    public Double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
    }

    public Double getValorDespesasAcessorias() {
        return valorDespesasAcessorias;
    }

    public void setValorDespesasAcessorias(Double valorDespesasAcessorias) {
        this.valorDespesasAcessorias = valorDespesasAcessorias;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorServicos() {
        return valorServicos;
    }

    public void setValorServicos(Double valorServicos) {
        this.valorServicos = valorServicos;
    }

    public Double getBaseCalculoIssqn() {
        return baseCalculoIssqn;
    }

    public void setBaseCalculoIssqn(Double baseCalculoIssqn) {
        this.baseCalculoIssqn = baseCalculoIssqn;
    }

    public Double getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(Double valorIssqn) {
        this.valorIssqn = valorIssqn;
    }

    public Double getValorPisIssqn() {
        return valorPisIssqn;
    }

    public void setValorPisIssqn(Double valorPisIssqn) {
        this.valorPisIssqn = valorPisIssqn;
    }

    public Double getValorCofinsIssqn() {
        return valorCofinsIssqn;
    }

    public void setValorCofinsIssqn(Double valorCofinsIssqn) {
        this.valorCofinsIssqn = valorCofinsIssqn;
    }

    public Double getValorRetidoPis() {
        return valorRetidoPis;
    }

    public void setValorRetidoPis(Double valorRetidoPis) {
        this.valorRetidoPis = valorRetidoPis;
    }

    public Double getValorRetidoCofins() {
        return valorRetidoCofins;
    }

    public void setValorRetidoCofins(Double valorRetidoCofins) {
        this.valorRetidoCofins = valorRetidoCofins;
    }

    public Double getValorRetidoCsll() {
        return valorRetidoCsll;
    }

    public void setValorRetidoCsll(Double valorRetidoCsll) {
        this.valorRetidoCsll = valorRetidoCsll;
    }

    public Double getBaseCalculoIrrf() {
        return baseCalculoIrrf;
    }

    public void setBaseCalculoIrrf(Double baseCalculoIrrf) {
        this.baseCalculoIrrf = baseCalculoIrrf;
    }

    public Double getValorRetidoIrrf() {
        return valorRetidoIrrf;
    }

    public void setValorRetidoIrrf(Double valorRetidoIrrf) {
        this.valorRetidoIrrf = valorRetidoIrrf;
    }

    public Double getBaseCalculoPrevidencia() {
        return baseCalculoPrevidencia;
    }

    public void setBaseCalculoPrevidencia(Double baseCalculoPrevidencia) {
        this.baseCalculoPrevidencia = baseCalculoPrevidencia;
    }

    public Double getValorRetidoPrevidencia() {
        return valorRetidoPrevidencia;
    }

    public void setValorRetidoPrevidencia(Double valorRetidoPrevidencia) {
        this.valorRetidoPrevidencia = valorRetidoPrevidencia;
    }

    public String getComexUfEmbarque() {
        return comexUfEmbarque;
    }

    public void setComexUfEmbarque(String comexUfEmbarque) {
        this.comexUfEmbarque = comexUfEmbarque;
    }

    public String getComexLocalEmbarque() {
        return comexLocalEmbarque;
    }

    public void setComexLocalEmbarque(String comexLocalEmbarque) {
        this.comexLocalEmbarque = comexLocalEmbarque;
    }

    public String getCompraNotaEmpenho() {
        return compraNotaEmpenho;
    }

    public void setCompraNotaEmpenho(String compraNotaEmpenho) {
        this.compraNotaEmpenho = compraNotaEmpenho;
    }

    public String getCompraPedido() {
        return compraPedido;
    }

    public void setCompraPedido(String compraPedido) {
        this.compraPedido = compraPedido;
    }

    public String getCompraContrato() {
        return compraContrato;
    }

    public void setCompraContrato(String compraContrato) {
        this.compraContrato = compraContrato;
    }

    public String getInformacoesAddFisco() {
        return informacoesAddFisco;
    }

    public void setInformacoesAddFisco(String informacoesAddFisco) {
        this.informacoesAddFisco = informacoesAddFisco;
    }

    public String getInformacoesAddContribuinte() {
        return informacoesAddContribuinte;
    }

    public void setInformacoesAddContribuinte(String informacoesAddContribuinte) {
        this.informacoesAddContribuinte = informacoesAddContribuinte;
    }

    public String getStatusNota() {
        return statusNota;
    }

    public void setStatusNota(String statusNota) {
        this.statusNota = statusNota;
    }

    public List<NfeCanaVO> getNfeCanaVOList() {
        return nfeCanaVOList;
    }

    public void setNfeCanaVOList(List<NfeCanaVO> nfeCanaVOList) {
        this.nfeCanaVOList = nfeCanaVOList;
    }

    public List<NfeDetalheVO> getNfeDetalheVOList() {
        return nfeDetalheVOList;
    }

    public void setNfeDetalheVOList(List<NfeDetalheVO> nfeDetalheVOList) {
        this.nfeDetalheVOList = nfeDetalheVOList;
    }

    public List<NfeReferenciadaVO> getNfeReferenciadaVOList() {
        return nfeReferenciadaVOList;
    }

    public void setNfeReferenciadaVOList(List<NfeReferenciadaVO> nfeReferenciadaVOList) {
        this.nfeReferenciadaVOList = nfeReferenciadaVOList;
    }

    public List<NfeDuplicataVO> getNfeDuplicataVOList() {
        return nfeDuplicataVOList;
    }

    public void setNfeDuplicataVOList(List<NfeDuplicataVO> nfeDuplicataVOList) {
        this.nfeDuplicataVOList = nfeDuplicataVOList;
    }

    public List<NfeCupomFiscalReferenciadoVO> getNfeCupomFiscalReferenciadoVOList() {
        return nfeCupomFiscalReferenciadoVOList;
    }

    public void setNfeCupomFiscalReferenciadoVOList(List<NfeCupomFiscalReferenciadoVO> nfeCupomFiscalReferenciadoVOList) {
        this.nfeCupomFiscalReferenciadoVOList = nfeCupomFiscalReferenciadoVOList;
    }

    public List<NfeProdRuralReferenciadaVO> getNfeProdRuralReferenciadaVOList() {
        return nfeProdRuralReferenciadaVOList;
    }

    public void setNfeProdRuralReferenciadaVOList(List<NfeProdRuralReferenciadaVO> nfeProdRuralReferenciadaVOList) {
        this.nfeProdRuralReferenciadaVOList = nfeProdRuralReferenciadaVOList;
    }

    public List<NfeProcessoReferenciadoVO> getNfeProcessoReferenciadoVOList() {
        return nfeProcessoReferenciadoVOList;
    }

    public void setNfeProcessoReferenciadoVOList(List<NfeProcessoReferenciadoVO> nfeProcessoReferenciadoVOList) {
        this.nfeProcessoReferenciadoVOList = nfeProcessoReferenciadoVOList;
    }

    public List<NfeLocalEntregaVO> getNfeLocalEntregaVOList() {
        return nfeLocalEntregaVOList;
    }

    public void setNfeLocalEntregaVOList(List<NfeLocalEntregaVO> nfeLocalEntregaVOList) {
        this.nfeLocalEntregaVOList = nfeLocalEntregaVOList;
    }

    public List<NfeLocalRetiradaVO> getNfeLocalRetiradaVOList() {
        return nfeLocalRetiradaVOList;
    }

    public void setNfeLocalRetiradaVOList(List<NfeLocalRetiradaVO> nfeLocalRetiradaVOList) {
        this.nfeLocalRetiradaVOList = nfeLocalRetiradaVOList;
    }

    public List<NfeFaturaVO> getNfeFaturaVOList() {
        return nfeFaturaVOList;
    }

    public void setNfeFaturaVOList(List<NfeFaturaVO> nfeFaturaVOList) {
        this.nfeFaturaVOList = nfeFaturaVOList;
    }

    public TributOperacaoFiscalVO getIdTributOperacaoFiscal() {
        return idTributOperacaoFiscal;
    }

    public void setIdTributOperacaoFiscal(TributOperacaoFiscalVO idTributOperacaoFiscal) {
        this.idTributOperacaoFiscal = idTributOperacaoFiscal;
    }

    public VendaCabecalhoVO getIdVendaCabecalho() {
        return idVendaCabecalho;
    }

    public void setIdVendaCabecalho(VendaCabecalhoVO idVendaCabecalho) {
        this.idVendaCabecalho = idVendaCabecalho;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public List<NfeNfReferenciadaVO> getNfeNfReferenciadaVOList() {
        return nfeNfReferenciadaVOList;
    }

    public void setNfeNfReferenciadaVOList(List<NfeNfReferenciadaVO> nfeNfReferenciadaVOList) {
        this.nfeNfReferenciadaVOList = nfeNfReferenciadaVOList;
    }

    public List<NfeTransporteVO> getNfeTransporteVOList() {
        return nfeTransporteVOList;
    }

    public void setNfeTransporteVOList(List<NfeTransporteVO> nfeTransporteVOList) {
        this.nfeTransporteVOList = nfeTransporteVOList;
    }

    public List<NfeDestinatarioVO> getNfeDestinatarioVOList() {
        return nfeDestinatarioVOList;
    }

    public void setNfeDestinatarioVOList(List<NfeDestinatarioVO> nfeDestinatarioVOList) {
        this.nfeDestinatarioVOList = nfeDestinatarioVOList;
    }

    public List<NfeEmitenteVO> getNfeEmitenteVOList() {
        return nfeEmitenteVOList;
    }

    public void setNfeEmitenteVOList(List<NfeEmitenteVO> nfeEmitenteVOList) {
        this.nfeEmitenteVOList = nfeEmitenteVOList;
    }

    public List<NfeCteReferenciadoVO> getNfeCteReferenciadoVOList() {
        return nfeCteReferenciadoVOList;
    }

    public void setNfeCteReferenciadoVOList(List<NfeCteReferenciadoVO> nfeCteReferenciadoVOList) {
        this.nfeCteReferenciadoVOList = nfeCteReferenciadoVOList;
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
        if (!(object instanceof NfeCabecalhoVO)) {
            return false;
        }
        NfeCabecalhoVO other = (NfeCabecalhoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeCabecalhoVO[ id=" + id + " ]";
    }
    
}
