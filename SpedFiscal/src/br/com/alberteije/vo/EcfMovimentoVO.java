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
@Table(name = "ecf_movimento")
@NamedQueries({
    @NamedQuery(name = "EcfMovimentoVO.findAll", query = "SELECT e FROM EcfMovimentoVO e")})
public class EcfMovimentoVO implements Serializable {
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
    @Column(name = "ID_ECF_EMPRESA")
    private Integer idEcfEmpresa;
    @Column(name = "ID_ECF_TURNO")
    private Integer idEcfTurno;
    @Column(name = "ID_ECF_IMPRESSORA")
    private Integer idEcfImpressora;
    @Column(name = "ID_ECF_OPERADOR")
    private Integer idEcfOperador;
    @Column(name = "ID_ECF_CAIXA")
    private Integer idEcfCaixa;
    @Basic(optional = false)
    @Column(name = "ID_GERENTE_SUPERVISOR")
    private int idGerenteSupervisor;
    @Column(name = "DATA_ABERTURA")
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    @Column(name = "HORA_ABERTURA")
    private String horaAbertura;
    @Column(name = "DATA_FECHAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataFechamento;
    @Column(name = "HORA_FECHAMENTO")
    private String horaFechamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_SUPRIMENTO")
    private Double totalSuprimento;
    @Column(name = "TOTAL_SANGRIA")
    private Double totalSangria;
    @Column(name = "TOTAL_NAO_FISCAL")
    private Double totalNaoFiscal;
    @Column(name = "TOTAL_VENDA")
    private Double totalVenda;
    @Column(name = "TOTAL_DESCONTO")
    private Double totalDesconto;
    @Column(name = "TOTAL_ACRESCIMO")
    private Double totalAcrescimo;
    @Column(name = "TOTAL_FINAL")
    private Double totalFinal;
    @Column(name = "TOTAL_RECEBIDO")
    private Double totalRecebido;
    @Column(name = "TOTAL_TROCO")
    private Double totalTroco;
    @Column(name = "TOTAL_CANCELADO")
    private Double totalCancelado;
    @Basic(optional = false)
    @Column(name = "STATUS_MOVIMENTO")
    private char statusMovimento;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfMovimentoVO() {
    }

    public EcfMovimentoVO(Integer id) {
        this.id = id;
    }

    public EcfMovimentoVO(Integer id, int idGerenteSupervisor, char statusMovimento) {
        this.id = id;
        this.idGerenteSupervisor = idGerenteSupervisor;
        this.statusMovimento = statusMovimento;
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

    public Integer getIdEcfEmpresa() {
        return idEcfEmpresa;
    }

    public void setIdEcfEmpresa(Integer idEcfEmpresa) {
        this.idEcfEmpresa = idEcfEmpresa;
    }

    public Integer getIdEcfTurno() {
        return idEcfTurno;
    }

    public void setIdEcfTurno(Integer idEcfTurno) {
        this.idEcfTurno = idEcfTurno;
    }

    public Integer getIdEcfImpressora() {
        return idEcfImpressora;
    }

    public void setIdEcfImpressora(Integer idEcfImpressora) {
        this.idEcfImpressora = idEcfImpressora;
    }

    public Integer getIdEcfOperador() {
        return idEcfOperador;
    }

    public void setIdEcfOperador(Integer idEcfOperador) {
        this.idEcfOperador = idEcfOperador;
    }

    public Integer getIdEcfCaixa() {
        return idEcfCaixa;
    }

    public void setIdEcfCaixa(Integer idEcfCaixa) {
        this.idEcfCaixa = idEcfCaixa;
    }

    public int getIdGerenteSupervisor() {
        return idGerenteSupervisor;
    }

    public void setIdGerenteSupervisor(int idGerenteSupervisor) {
        this.idGerenteSupervisor = idGerenteSupervisor;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public Double getTotalSuprimento() {
        return totalSuprimento;
    }

    public void setTotalSuprimento(Double totalSuprimento) {
        this.totalSuprimento = totalSuprimento;
    }

    public Double getTotalSangria() {
        return totalSangria;
    }

    public void setTotalSangria(Double totalSangria) {
        this.totalSangria = totalSangria;
    }

    public Double getTotalNaoFiscal() {
        return totalNaoFiscal;
    }

    public void setTotalNaoFiscal(Double totalNaoFiscal) {
        this.totalNaoFiscal = totalNaoFiscal;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(Double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    public Double getTotalAcrescimo() {
        return totalAcrescimo;
    }

    public void setTotalAcrescimo(Double totalAcrescimo) {
        this.totalAcrescimo = totalAcrescimo;
    }

    public Double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(Double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Double getTotalTroco() {
        return totalTroco;
    }

    public void setTotalTroco(Double totalTroco) {
        this.totalTroco = totalTroco;
    }

    public Double getTotalCancelado() {
        return totalCancelado;
    }

    public void setTotalCancelado(Double totalCancelado) {
        this.totalCancelado = totalCancelado;
    }

    public char getStatusMovimento() {
        return statusMovimento;
    }

    public void setStatusMovimento(char statusMovimento) {
        this.statusMovimento = statusMovimento;
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
        if (!(object instanceof EcfMovimentoVO)) {
            return false;
        }
        EcfMovimentoVO other = (EcfMovimentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfMovimentoVO[ id=" + id + " ]";
    }
    
}
