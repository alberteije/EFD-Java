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
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "ProdutoVO.findAll", query = "SELECT p FROM ProdutoVO p")})
public class ProdutoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "GTIN")
    private String gtin;
    @Column(name = "CODIGO_INTERNO")
    private String codigoInterno;
    @Column(name = "NCM")
    private String ncm;
    @Column(name = "NOME")
    private String nome;
    @Lob
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DESCRICAO_PDV")
    private String descricaoPdv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_COMPRA")
    private Double valorCompra;
    @Column(name = "VALOR_VENDA")
    private Double valorVenda;
    @Column(name = "PRECO_VENDA_MINIMO")
    private Double precoVendaMinimo;
    @Column(name = "PRECO_SUGERIDO")
    private Double precoSugerido;
    @Column(name = "CUSTO_MEDIO_LIQUIDO")
    private Double custoMedioLiquido;
    @Column(name = "PRECO_LUCRO_ZERO")
    private Double precoLucroZero;
    @Column(name = "PRECO_LUCRO_MINIMO")
    private Double precoLucroMinimo;
    @Column(name = "PRECO_LUCRO_MAXIMO")
    private Double precoLucroMaximo;
    @Column(name = "MARKUP")
    private Double markup;
    @Column(name = "QUANTIDADE_ESTOQUE")
    private Double quantidadeEstoque;
    @Column(name = "QUANTIDADE_ESTOQUE_ANTERIOR")
    private Double quantidadeEstoqueAnterior;
    @Column(name = "ESTOQUE_MINIMO")
    private Double estoqueMinimo;
    @Column(name = "ESTOQUE_MAXIMO")
    private Double estoqueMaximo;
    @Column(name = "ESTOQUE_IDEAL")
    private Double estoqueIdeal;
    @Column(name = "EXCLUIDO")
    private String excluido;
    @Column(name = "INATIVO")
    private String inativo;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Lob
    @Column(name = "FOTO_PRODUTO")
    private String fotoProduto;
    @Column(name = "EX_TIPI")
    private String exTipi;
    @Column(name = "CODIGO_LST")
    private String codigoLst;
    @Column(name = "CLASSE_ABC")
    private String classeAbc;
    @Column(name = "IAT")
    private String iat;
    @Column(name = "IPPT")
    private String ippt;
    @Column(name = "TIPO_ITEM_SPED")
    private String tipoItemSped;
    @Column(name = "PESO")
    private Double peso;
    @Column(name = "PORCENTO_COMISSAO")
    private Double porcentoComissao;
    @Column(name = "PONTO_PEDIDO")
    private Double pontoPedido;
    @Column(name = "LOTE_ECONOMICO_COMPRA")
    private Double loteEconomicoCompra;
    @Column(name = "ALIQUOTA_ICMS_PAF")
    private Double aliquotaIcmsPaf;
    @Column(name = "ALIQUOTA_ISSQN_PAF")
    private Double aliquotaIssqnPaf;
    @Column(name = "TOTALIZADOR_PARCIAL")
    private String totalizadorParcial;
    @Column(name = "CODIGO_BALANCA")
    private Integer codigoBalanca;
    @Column(name = "DATA_ALTERACAO")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracao;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(mappedBy = "idProduto")
    private List<NfeDetalheVO> nfeDetalheVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<TabelaPrecoProdutoVO> tabelaPrecoProdutoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<UnidadeConversaoVO> unidadeConversaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<EmpresaProdutoVO> empresaProdutoVOList;
    @JoinColumn(name = "ID_TRIBUT_ICMS_CUSTOM_CAB", referencedColumnName = "ID")
    @ManyToOne
    private TributIcmsCustomCabVO idTributIcmsCustomCab;
    @JoinColumn(name = "ID_ALMOXARIFADO", referencedColumnName = "ID")
    @ManyToOne
    private AlmoxarifadoVO idAlmoxarifado;
    @JoinColumn(name = "ID_GRUPO_TRIBUTARIO", referencedColumnName = "ID")
    @ManyToOne
    private TributGrupoTributarioVO idGrupoTributario;
    @JoinColumn(name = "ID_MARCA_PRODUTO", referencedColumnName = "ID")
    @ManyToOne
    private ProdutoMarcaVO idMarcaProduto;
    @JoinColumn(name = "ID_SUB_GRUPO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoSubGrupoVO idSubGrupo;
    @JoinColumn(name = "ID_UNIDADE_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UnidadeProdutoVO unidadeProdutoVO;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<FornecedorProdutoVO> fornecedorProdutoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<FichaTecnicaVO> fichaTecnicaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<ProdutoPromocaoVO> produtoPromocaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<VendaDetalheVO> vendaDetalheVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<ProdutoLoteVO> produtoLoteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<ProdutoCodigoAdicionalVO> produtoCodigoAdicionalVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<ProdutoAlteracaoItemVO> produtoAlteracaoItemVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<EstoqueGradeVO> estoqueGradeVOList;

    public ProdutoVO() {
    }

    public ProdutoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoPdv() {
        return descricaoPdv;
    }

    public void setDescricaoPdv(String descricaoPdv) {
        this.descricaoPdv = descricaoPdv;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getPrecoVendaMinimo() {
        return precoVendaMinimo;
    }

    public void setPrecoVendaMinimo(Double precoVendaMinimo) {
        this.precoVendaMinimo = precoVendaMinimo;
    }

    public Double getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(Double precoSugerido) {
        this.precoSugerido = precoSugerido;
    }

    public Double getCustoMedioLiquido() {
        return custoMedioLiquido;
    }

    public void setCustoMedioLiquido(Double custoMedioLiquido) {
        this.custoMedioLiquido = custoMedioLiquido;
    }

    public Double getPrecoLucroZero() {
        return precoLucroZero;
    }

    public void setPrecoLucroZero(Double precoLucroZero) {
        this.precoLucroZero = precoLucroZero;
    }

    public Double getPrecoLucroMinimo() {
        return precoLucroMinimo;
    }

    public void setPrecoLucroMinimo(Double precoLucroMinimo) {
        this.precoLucroMinimo = precoLucroMinimo;
    }

    public Double getPrecoLucroMaximo() {
        return precoLucroMaximo;
    }

    public void setPrecoLucroMaximo(Double precoLucroMaximo) {
        this.precoLucroMaximo = precoLucroMaximo;
    }

    public Double getMarkup() {
        return markup;
    }

    public void setMarkup(Double markup) {
        this.markup = markup;
    }

    public Double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getQuantidadeEstoqueAnterior() {
        return quantidadeEstoqueAnterior;
    }

    public void setQuantidadeEstoqueAnterior(Double quantidadeEstoqueAnterior) {
        this.quantidadeEstoqueAnterior = quantidadeEstoqueAnterior;
    }

    public Double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Double getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Double estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Double getEstoqueIdeal() {
        return estoqueIdeal;
    }

    public void setEstoqueIdeal(Double estoqueIdeal) {
        this.estoqueIdeal = estoqueIdeal;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getFotoProduto() {
        return fotoProduto;
    }

    public void setFotoProduto(String fotoProduto) {
        this.fotoProduto = fotoProduto;
    }

    public String getExTipi() {
        return exTipi;
    }

    public void setExTipi(String exTipi) {
        this.exTipi = exTipi;
    }

    public String getCodigoLst() {
        return codigoLst;
    }

    public void setCodigoLst(String codigoLst) {
        this.codigoLst = codigoLst;
    }

    public String getClasseAbc() {
        return classeAbc;
    }

    public void setClasseAbc(String classeAbc) {
        this.classeAbc = classeAbc;
    }

    public String getIat() {
        return iat;
    }

    public void setIat(String iat) {
        this.iat = iat;
    }

    public String getIppt() {
        return ippt;
    }

    public void setIppt(String ippt) {
        this.ippt = ippt;
    }

    public String getTipoItemSped() {
        return tipoItemSped;
    }

    public void setTipoItemSped(String tipoItemSped) {
        this.tipoItemSped = tipoItemSped;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPorcentoComissao() {
        return porcentoComissao;
    }

    public void setPorcentoComissao(Double porcentoComissao) {
        this.porcentoComissao = porcentoComissao;
    }

    public Double getPontoPedido() {
        return pontoPedido;
    }

    public void setPontoPedido(Double pontoPedido) {
        this.pontoPedido = pontoPedido;
    }

    public Double getLoteEconomicoCompra() {
        return loteEconomicoCompra;
    }

    public void setLoteEconomicoCompra(Double loteEconomicoCompra) {
        this.loteEconomicoCompra = loteEconomicoCompra;
    }

    public Double getAliquotaIcmsPaf() {
        return aliquotaIcmsPaf;
    }

    public void setAliquotaIcmsPaf(Double aliquotaIcmsPaf) {
        this.aliquotaIcmsPaf = aliquotaIcmsPaf;
    }

    public Double getAliquotaIssqnPaf() {
        return aliquotaIssqnPaf;
    }

    public void setAliquotaIssqnPaf(Double aliquotaIssqnPaf) {
        this.aliquotaIssqnPaf = aliquotaIssqnPaf;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public Integer getCodigoBalanca() {
        return codigoBalanca;
    }

    public void setCodigoBalanca(Integer codigoBalanca) {
        this.codigoBalanca = codigoBalanca;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<NfeDetalheVO> getNfeDetalheVOList() {
        return nfeDetalheVOList;
    }

    public void setNfeDetalheVOList(List<NfeDetalheVO> nfeDetalheVOList) {
        this.nfeDetalheVOList = nfeDetalheVOList;
    }

    public List<TabelaPrecoProdutoVO> getTabelaPrecoProdutoVOList() {
        return tabelaPrecoProdutoVOList;
    }

    public void setTabelaPrecoProdutoVOList(List<TabelaPrecoProdutoVO> tabelaPrecoProdutoVOList) {
        this.tabelaPrecoProdutoVOList = tabelaPrecoProdutoVOList;
    }

    public List<UnidadeConversaoVO> getUnidadeConversaoVOList() {
        return unidadeConversaoVOList;
    }

    public void setUnidadeConversaoVOList(List<UnidadeConversaoVO> unidadeConversaoVOList) {
        this.unidadeConversaoVOList = unidadeConversaoVOList;
    }

    public List<EmpresaProdutoVO> getEmpresaProdutoVOList() {
        return empresaProdutoVOList;
    }

    public void setEmpresaProdutoVOList(List<EmpresaProdutoVO> empresaProdutoVOList) {
        this.empresaProdutoVOList = empresaProdutoVOList;
    }

    public TributIcmsCustomCabVO getIdTributIcmsCustomCab() {
        return idTributIcmsCustomCab;
    }

    public void setIdTributIcmsCustomCab(TributIcmsCustomCabVO idTributIcmsCustomCab) {
        this.idTributIcmsCustomCab = idTributIcmsCustomCab;
    }

    public AlmoxarifadoVO getIdAlmoxarifado() {
        return idAlmoxarifado;
    }

    public void setIdAlmoxarifado(AlmoxarifadoVO idAlmoxarifado) {
        this.idAlmoxarifado = idAlmoxarifado;
    }

    public TributGrupoTributarioVO getIdGrupoTributario() {
        return idGrupoTributario;
    }

    public void setIdGrupoTributario(TributGrupoTributarioVO idGrupoTributario) {
        this.idGrupoTributario = idGrupoTributario;
    }

    public ProdutoMarcaVO getIdMarcaProduto() {
        return idMarcaProduto;
    }

    public void setIdMarcaProduto(ProdutoMarcaVO idMarcaProduto) {
        this.idMarcaProduto = idMarcaProduto;
    }

    public ProdutoSubGrupoVO getIdSubGrupo() {
        return idSubGrupo;
    }

    public void setIdSubGrupo(ProdutoSubGrupoVO idSubGrupo) {
        this.idSubGrupo = idSubGrupo;
    }

    public UnidadeProdutoVO getUnidadeProdutoVO() {
        return unidadeProdutoVO;
    }

    public void setUnidadeProdutoVO(UnidadeProdutoVO unidadeProdutoVO) {
        this.unidadeProdutoVO = unidadeProdutoVO;
    }

    public List<FornecedorProdutoVO> getFornecedorProdutoVOList() {
        return fornecedorProdutoVOList;
    }

    public void setFornecedorProdutoVOList(List<FornecedorProdutoVO> fornecedorProdutoVOList) {
        this.fornecedorProdutoVOList = fornecedorProdutoVOList;
    }

    public List<FichaTecnicaVO> getFichaTecnicaVOList() {
        return fichaTecnicaVOList;
    }

    public void setFichaTecnicaVOList(List<FichaTecnicaVO> fichaTecnicaVOList) {
        this.fichaTecnicaVOList = fichaTecnicaVOList;
    }

    public List<ProdutoPromocaoVO> getProdutoPromocaoVOList() {
        return produtoPromocaoVOList;
    }

    public void setProdutoPromocaoVOList(List<ProdutoPromocaoVO> produtoPromocaoVOList) {
        this.produtoPromocaoVOList = produtoPromocaoVOList;
    }

    public List<VendaDetalheVO> getVendaDetalheVOList() {
        return vendaDetalheVOList;
    }

    public void setVendaDetalheVOList(List<VendaDetalheVO> vendaDetalheVOList) {
        this.vendaDetalheVOList = vendaDetalheVOList;
    }

    public List<ProdutoLoteVO> getProdutoLoteVOList() {
        return produtoLoteVOList;
    }

    public void setProdutoLoteVOList(List<ProdutoLoteVO> produtoLoteVOList) {
        this.produtoLoteVOList = produtoLoteVOList;
    }

    public List<ProdutoCodigoAdicionalVO> getProdutoCodigoAdicionalVOList() {
        return produtoCodigoAdicionalVOList;
    }

    public void setProdutoCodigoAdicionalVOList(List<ProdutoCodigoAdicionalVO> produtoCodigoAdicionalVOList) {
        this.produtoCodigoAdicionalVOList = produtoCodigoAdicionalVOList;
    }

    public List<ProdutoAlteracaoItemVO> getProdutoAlteracaoItemVOList() {
        return produtoAlteracaoItemVOList;
    }

    public void setProdutoAlteracaoItemVOList(List<ProdutoAlteracaoItemVO> produtoAlteracaoItemVOList) {
        this.produtoAlteracaoItemVOList = produtoAlteracaoItemVOList;
    }

    public List<EstoqueGradeVO> getEstoqueGradeVOList() {
        return estoqueGradeVOList;
    }

    public void setEstoqueGradeVOList(List<EstoqueGradeVO> estoqueGradeVOList) {
        this.estoqueGradeVOList = estoqueGradeVOList;
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
        if (!(object instanceof ProdutoVO)) {
            return false;
        }
        ProdutoVO other = (ProdutoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ProdutoVO[ id=" + id + " ]";
    }
    
}
