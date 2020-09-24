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
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "ClienteVO.findAll", query = "SELECT c FROM ClienteVO c")})
public class ClienteVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESDE")
    @Temporal(TemporalType.DATE)
    private Date desde;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "CONTA_TOMADOR")
    private String contaTomador;
    @Column(name = "GERA_FINANCEIRO")
    private String geraFinanceiro;
    @Column(name = "INDICADOR_PRECO")
    private String indicadorPreco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTO_DESCONTO")
    private Double porcentoDesconto;
    @Column(name = "FORMA_DESCONTO")
    private String formaDesconto;
    @Column(name = "LIMITE_CREDITO")
    private Double limiteCredito;
    @Column(name = "TIPO_FRETE")
    private String tipoFrete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<VendaCabecalhoVO> vendaCabecalhoVOList;
    @JoinColumn(name = "ID_OPERACAO_FISCAL", referencedColumnName = "ID")
    @ManyToOne
    private TributOperacaoFiscalVO idOperacaoFiscal;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;
    @JoinColumn(name = "ID_ATIVIDADE_FOR_CLI", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private AtividadeForCliVO idAtividadeForCli;
    @JoinColumn(name = "ID_SITUACAO_FOR_CLI", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private SituacaoForCliVO idSituacaoForCli;
    @OneToMany(mappedBy = "idCliente")
    private List<NfeCabecalhoVO> nfeCabecalhoVOList;

    public ClienteVO() {
    }

    public ClienteVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getContaTomador() {
        return contaTomador;
    }

    public void setContaTomador(String contaTomador) {
        this.contaTomador = contaTomador;
    }

    public String getGeraFinanceiro() {
        return geraFinanceiro;
    }

    public void setGeraFinanceiro(String geraFinanceiro) {
        this.geraFinanceiro = geraFinanceiro;
    }

    public String getIndicadorPreco() {
        return indicadorPreco;
    }

    public void setIndicadorPreco(String indicadorPreco) {
        this.indicadorPreco = indicadorPreco;
    }

    public Double getPorcentoDesconto() {
        return porcentoDesconto;
    }

    public void setPorcentoDesconto(Double porcentoDesconto) {
        this.porcentoDesconto = porcentoDesconto;
    }

    public String getFormaDesconto() {
        return formaDesconto;
    }

    public void setFormaDesconto(String formaDesconto) {
        this.formaDesconto = formaDesconto;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public List<VendaCabecalhoVO> getVendaCabecalhoVOList() {
        return vendaCabecalhoVOList;
    }

    public void setVendaCabecalhoVOList(List<VendaCabecalhoVO> vendaCabecalhoVOList) {
        this.vendaCabecalhoVOList = vendaCabecalhoVOList;
    }

    public TributOperacaoFiscalVO getIdOperacaoFiscal() {
        return idOperacaoFiscal;
    }

    public void setIdOperacaoFiscal(TributOperacaoFiscalVO idOperacaoFiscal) {
        this.idOperacaoFiscal = idOperacaoFiscal;
    }

    public PessoaVO getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(PessoaVO idPessoa) {
        this.idPessoa = idPessoa;
    }

    public AtividadeForCliVO getIdAtividadeForCli() {
        return idAtividadeForCli;
    }

    public void setIdAtividadeForCli(AtividadeForCliVO idAtividadeForCli) {
        this.idAtividadeForCli = idAtividadeForCli;
    }

    public SituacaoForCliVO getIdSituacaoForCli() {
        return idSituacaoForCli;
    }

    public void setIdSituacaoForCli(SituacaoForCliVO idSituacaoForCli) {
        this.idSituacaoForCli = idSituacaoForCli;
    }

    public List<NfeCabecalhoVO> getNfeCabecalhoVOList() {
        return nfeCabecalhoVOList;
    }

    public void setNfeCabecalhoVOList(List<NfeCabecalhoVO> nfeCabecalhoVOList) {
        this.nfeCabecalhoVOList = nfeCabecalhoVOList;
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
        if (!(object instanceof ClienteVO)) {
            return false;
        }
        ClienteVO other = (ClienteVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ClienteVO[ id=" + id + " ]";
    }
    
}
