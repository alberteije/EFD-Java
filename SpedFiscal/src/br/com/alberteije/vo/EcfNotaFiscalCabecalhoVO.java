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
@Table(name = "ecf_nota_fiscal_cabecalho")
@NamedQueries({
    @NamedQuery(name = "EcfNotaFiscalCabecalhoVO.findAll", query = "SELECT e FROM EcfNotaFiscalCabecalhoVO e")})
public class EcfNotaFiscalCabecalhoVO implements Serializable {
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
    @Column(name = "ID_ECF_FUNCIONARIO")
    private Integer idEcfFuncionario;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "CPF_CNPJ_CLIENTE")
    private String cpfCnpjCliente;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "HORA_EMISSAO")
    private String horaEmissao;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "SUBSERIE")
    private String subserie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_PRODUTOS")
    private Double totalProdutos;
    @Column(name = "TOTAL_NF")
    private Double totalNf;
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
    @Column(name = "IPI")
    private Double ipi;
    @Column(name = "TAXA_ACRESCIMO")
    private Double taxaAcrescimo;
    @Column(name = "ACRESCIMO")
    private Double acrescimo;
    @Column(name = "ACRESCIMO_ITENS")
    private Double acrescimoItens;
    @Column(name = "TAXA_DESCONTO")
    private Double taxaDesconto;
    @Column(name = "DESCONTO")
    private Double desconto;
    @Column(name = "DESCONTO_ITENS")
    private Double descontoItens;
    @Column(name = "CANCELADA")
    private String cancelada;
    @Column(name = "TIPO_NOTA")
    private String tipoNota;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfNotaFiscalCabecalhoVO() {
    }

    public EcfNotaFiscalCabecalhoVO(Integer id) {
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

    public Integer getIdEcfFuncionario() {
        return idEcfFuncionario;
    }

    public void setIdEcfFuncionario(Integer idEcfFuncionario) {
        this.idEcfFuncionario = idEcfFuncionario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
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

    public String getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(String horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public Double getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(Double totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public Double getTotalNf() {
        return totalNf;
    }

    public void setTotalNf(Double totalNf) {
        this.totalNf = totalNf;
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

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
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

    public Double getAcrescimoItens() {
        return acrescimoItens;
    }

    public void setAcrescimoItens(Double acrescimoItens) {
        this.acrescimoItens = acrescimoItens;
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

    public Double getDescontoItens() {
        return descontoItens;
    }

    public void setDescontoItens(Double descontoItens) {
        this.descontoItens = descontoItens;
    }

    public String getCancelada() {
        return cancelada;
    }

    public void setCancelada(String cancelada) {
        this.cancelada = cancelada;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
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
        if (!(object instanceof EcfNotaFiscalCabecalhoVO)) {
            return false;
        }
        EcfNotaFiscalCabecalhoVO other = (EcfNotaFiscalCabecalhoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfNotaFiscalCabecalhoVO[ id=" + id + " ]";
    }
    
}
