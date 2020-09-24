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
import javax.persistence.Lob;
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
@Table(name = "view_pessoa_fornecedor")
@NamedQueries({
    @NamedQuery(name = "ViewPessoaFornecedorVO.findAll", query = "SELECT v FROM ViewPessoaFornecedorVO v")})
public class ViewPessoaFornecedorVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "ID_PESSOA")
    private int idPessoa;
    @Basic(optional = false)
    @Column(name = "ID_ATIVIDADE_FOR_CLI")
    private int idAtividadeForCli;
    @Basic(optional = false)
    @Column(name = "ID_SITUACAO_FOR_CLI")
    private int idSituacaoForCli;
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
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "MUNICIPIO_IBGE")
    private Integer municipioIbge;
    @Column(name = "UF")
    private String uf;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "FAX")
    private String fax;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private char tipo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SITE")
    private String site;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

    public ViewPessoaFornecedorVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdAtividadeForCli() {
        return idAtividadeForCli;
    }

    public void setIdAtividadeForCli(int idAtividadeForCli) {
        this.idAtividadeForCli = idAtividadeForCli;
    }

    public int getIdSituacaoForCli() {
        return idSituacaoForCli;
    }

    public void setIdSituacaoForCli(int idSituacaoForCli) {
        this.idSituacaoForCli = idSituacaoForCli;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getMunicipioIbge() {
        return municipioIbge;
    }

    public void setMunicipioIbge(Integer municipioIbge) {
        this.municipioIbge = municipioIbge;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    
}
