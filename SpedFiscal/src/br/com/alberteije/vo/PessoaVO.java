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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "PessoaVO.findAll", query = "SELECT p FROM PessoaVO p")})
public class PessoaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
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
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "FORNECEDOR")
    private String fornecedor;
    @Column(name = "COLABORADOR")
    private String colaborador;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "CONTADOR")
    private String contador;
    @Column(name = "TRANSPORTADORA")
    private String transportadora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<ColaboradorVO> colaboradorVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<EmpresaPessoaVO> empresaPessoaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<ClienteVO> clienteVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<ConvenioVO> convenioVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<TransportadoraVO> transportadoraVOList;
    @OneToMany(mappedBy = "idPessoa")
    private List<ContatoVO> contatoVOList;
    @OneToMany(mappedBy = "idPessoa")
    private List<EnderecoVO> enderecoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<ContadorVO> contadorVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<FornecedorVO> fornecedorVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<PessoaFisicaVO> pessoaFisicaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoa")
    private List<PessoaJuridicaVO> pessoaJuridicaVOList;

    public PessoaVO() {
    }

    public PessoaVO(Integer id) {
        this.id = id;
    }

    public PessoaVO(Integer id, String nome, char tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public List<ColaboradorVO> getColaboradorVOList() {
        return colaboradorVOList;
    }

    public void setColaboradorVOList(List<ColaboradorVO> colaboradorVOList) {
        this.colaboradorVOList = colaboradorVOList;
    }

    public List<EmpresaPessoaVO> getEmpresaPessoaVOList() {
        return empresaPessoaVOList;
    }

    public void setEmpresaPessoaVOList(List<EmpresaPessoaVO> empresaPessoaVOList) {
        this.empresaPessoaVOList = empresaPessoaVOList;
    }

    public List<ClienteVO> getClienteVOList() {
        return clienteVOList;
    }

    public void setClienteVOList(List<ClienteVO> clienteVOList) {
        this.clienteVOList = clienteVOList;
    }

    public List<ConvenioVO> getConvenioVOList() {
        return convenioVOList;
    }

    public void setConvenioVOList(List<ConvenioVO> convenioVOList) {
        this.convenioVOList = convenioVOList;
    }

    public List<TransportadoraVO> getTransportadoraVOList() {
        return transportadoraVOList;
    }

    public void setTransportadoraVOList(List<TransportadoraVO> transportadoraVOList) {
        this.transportadoraVOList = transportadoraVOList;
    }

    public List<ContatoVO> getContatoVOList() {
        return contatoVOList;
    }

    public void setContatoVOList(List<ContatoVO> contatoVOList) {
        this.contatoVOList = contatoVOList;
    }

    public List<EnderecoVO> getEnderecoVOList() {
        return enderecoVOList;
    }

    public void setEnderecoVOList(List<EnderecoVO> enderecoVOList) {
        this.enderecoVOList = enderecoVOList;
    }

    public List<ContadorVO> getContadorVOList() {
        return contadorVOList;
    }

    public void setContadorVOList(List<ContadorVO> contadorVOList) {
        this.contadorVOList = contadorVOList;
    }

    public List<FornecedorVO> getFornecedorVOList() {
        return fornecedorVOList;
    }

    public void setFornecedorVOList(List<FornecedorVO> fornecedorVOList) {
        this.fornecedorVOList = fornecedorVOList;
    }

    public List<PessoaFisicaVO> getPessoaFisicaVOList() {
        return pessoaFisicaVOList;
    }

    public void setPessoaFisicaVOList(List<PessoaFisicaVO> pessoaFisicaVOList) {
        this.pessoaFisicaVOList = pessoaFisicaVOList;
    }

    public List<PessoaJuridicaVO> getPessoaJuridicaVOList() {
        return pessoaJuridicaVOList;
    }

    public void setPessoaJuridicaVOList(List<PessoaJuridicaVO> pessoaJuridicaVOList) {
        this.pessoaJuridicaVOList = pessoaJuridicaVOList;
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
        if (!(object instanceof PessoaVO)) {
            return false;
        }
        PessoaVO other = (PessoaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PessoaVO[ id=" + id + " ]";
    }
    
}
