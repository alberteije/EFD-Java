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
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "FornecedorVO.findAll", query = "SELECT f FROM FornecedorVO f")})
public class FornecedorVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESDE")
    @Temporal(TemporalType.DATE)
    private Date desde;
    @Column(name = "OPTANTE_SIMPLES_NACIONAL")
    private String optanteSimplesNacional;
    @Column(name = "LOCALIZACAO")
    private String localizacao;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(name = "SOFRE_RETENCAO")
    private String sofreRetencao;
    @Column(name = "CHEQUE_NOMINAL_A")
    private String chequeNominalA;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "CONTA_REMETENTE")
    private String contaRemetente;
    @Column(name = "PRAZO_MEDIO_ENTREGA")
    private Short prazoMedioEntrega;
    @Column(name = "GERA_FATURAMENTO")
    private String geraFaturamento;
    @Column(name = "NUM_DIAS_PRIMEIRO_VENCIMENTO")
    private Integer numDiasPrimeiroVencimento;
    @Column(name = "NUM_DIAS_INTERVALO")
    private Integer numDiasIntervalo;
    @Column(name = "QUANTIDADE_PARCELAS")
    private Integer quantidadeParcelas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFornecedor")
    private List<FornecedorProdutoVO> fornecedorProdutoVOList;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;
    @JoinColumn(name = "ID_ATIVIDADE_FOR_CLI", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private AtividadeForCliVO idAtividadeForCli;
    @JoinColumn(name = "ID_SITUACAO_FOR_CLI", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private SituacaoForCliVO idSituacaoForCli;
    @OneToMany(mappedBy = "idFornecedor")
    private List<NfeCabecalhoVO> nfeCabecalhoVOList;

    public FornecedorVO() {
    }

    public FornecedorVO(Integer id) {
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

    public String getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(String optanteSimplesNacional) {
        this.optanteSimplesNacional = optanteSimplesNacional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSofreRetencao() {
        return sofreRetencao;
    }

    public void setSofreRetencao(String sofreRetencao) {
        this.sofreRetencao = sofreRetencao;
    }

    public String getChequeNominalA() {
        return chequeNominalA;
    }

    public void setChequeNominalA(String chequeNominalA) {
        this.chequeNominalA = chequeNominalA;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getContaRemetente() {
        return contaRemetente;
    }

    public void setContaRemetente(String contaRemetente) {
        this.contaRemetente = contaRemetente;
    }

    public Short getPrazoMedioEntrega() {
        return prazoMedioEntrega;
    }

    public void setPrazoMedioEntrega(Short prazoMedioEntrega) {
        this.prazoMedioEntrega = prazoMedioEntrega;
    }

    public String getGeraFaturamento() {
        return geraFaturamento;
    }

    public void setGeraFaturamento(String geraFaturamento) {
        this.geraFaturamento = geraFaturamento;
    }

    public Integer getNumDiasPrimeiroVencimento() {
        return numDiasPrimeiroVencimento;
    }

    public void setNumDiasPrimeiroVencimento(Integer numDiasPrimeiroVencimento) {
        this.numDiasPrimeiroVencimento = numDiasPrimeiroVencimento;
    }

    public Integer getNumDiasIntervalo() {
        return numDiasIntervalo;
    }

    public void setNumDiasIntervalo(Integer numDiasIntervalo) {
        this.numDiasIntervalo = numDiasIntervalo;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public List<FornecedorProdutoVO> getFornecedorProdutoVOList() {
        return fornecedorProdutoVOList;
    }

    public void setFornecedorProdutoVOList(List<FornecedorProdutoVO> fornecedorProdutoVOList) {
        this.fornecedorProdutoVOList = fornecedorProdutoVOList;
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
        if (!(object instanceof FornecedorVO)) {
            return false;
        }
        FornecedorVO other = (FornecedorVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.FornecedorVO[ id=" + id + " ]";
    }
    
}
