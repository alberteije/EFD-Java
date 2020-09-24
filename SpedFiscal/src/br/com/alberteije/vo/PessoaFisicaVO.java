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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pessoa_fisica")
@NamedQueries({
    @NamedQuery(name = "PessoaFisicaVO.findAll", query = "SELECT p FROM PessoaFisicaVO p")})
public class PessoaFisicaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG")
    private String rg;
    @Column(name = "ORGAO_RG")
    private String orgaoRg;
    @Column(name = "DATA_EMISSAO_RG")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaoRg;
    @Column(name = "DATA_NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "NATURALIDADE")
    private String naturalidade;
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @Column(name = "RACA")
    private String raca;
    @Column(name = "TIPO_SANGUE")
    private String tipoSangue;
    @Column(name = "CNH_NUMERO")
    private String cnhNumero;
    @Column(name = "CNH_CATEGORIA")
    private String cnhCategoria;
    @Column(name = "CNH_VENCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date cnhVencimento;
    @Column(name = "TITULO_ELEITORAL_NUMERO")
    private String tituloEleitoralNumero;
    @Column(name = "TITULO_ELEITORAL_ZONA")
    private Integer tituloEleitoralZona;
    @Column(name = "TITULO_ELEITORAL_SECAO")
    private Integer tituloEleitoralSecao;
    @Column(name = "RESERVISTA_NUMERO")
    private String reservistaNumero;
    @Column(name = "RESERVISTA_CATEGORIA")
    private Integer reservistaCategoria;
    @Column(name = "NOME_MAE")
    private String nomeMae;
    @Column(name = "NOME_PAI")
    private String nomePai;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;
    @JoinColumn(name = "ID_ESTADO_CIVIL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EstadoCivilVO idEstadoCivil;

    public PessoaFisicaVO() {
    }

    public PessoaFisicaVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoRg() {
        return orgaoRg;
    }

    public void setOrgaoRg(String orgaoRg) {
        this.orgaoRg = orgaoRg;
    }

    public Date getDataEmissaoRg() {
        return dataEmissaoRg;
    }

    public void setDataEmissaoRg(Date dataEmissaoRg) {
        this.dataEmissaoRg = dataEmissaoRg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getCnhNumero() {
        return cnhNumero;
    }

    public void setCnhNumero(String cnhNumero) {
        this.cnhNumero = cnhNumero;
    }

    public String getCnhCategoria() {
        return cnhCategoria;
    }

    public void setCnhCategoria(String cnhCategoria) {
        this.cnhCategoria = cnhCategoria;
    }

    public Date getCnhVencimento() {
        return cnhVencimento;
    }

    public void setCnhVencimento(Date cnhVencimento) {
        this.cnhVencimento = cnhVencimento;
    }

    public String getTituloEleitoralNumero() {
        return tituloEleitoralNumero;
    }

    public void setTituloEleitoralNumero(String tituloEleitoralNumero) {
        this.tituloEleitoralNumero = tituloEleitoralNumero;
    }

    public Integer getTituloEleitoralZona() {
        return tituloEleitoralZona;
    }

    public void setTituloEleitoralZona(Integer tituloEleitoralZona) {
        this.tituloEleitoralZona = tituloEleitoralZona;
    }

    public Integer getTituloEleitoralSecao() {
        return tituloEleitoralSecao;
    }

    public void setTituloEleitoralSecao(Integer tituloEleitoralSecao) {
        this.tituloEleitoralSecao = tituloEleitoralSecao;
    }

    public String getReservistaNumero() {
        return reservistaNumero;
    }

    public void setReservistaNumero(String reservistaNumero) {
        this.reservistaNumero = reservistaNumero;
    }

    public Integer getReservistaCategoria() {
        return reservistaCategoria;
    }

    public void setReservistaCategoria(Integer reservistaCategoria) {
        this.reservistaCategoria = reservistaCategoria;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public PessoaVO getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(PessoaVO idPessoa) {
        this.idPessoa = idPessoa;
    }

    public EstadoCivilVO getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(EstadoCivilVO idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
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
        if (!(object instanceof PessoaFisicaVO)) {
            return false;
        }
        PessoaFisicaVO other = (PessoaFisicaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PessoaFisicaVO[ id=" + id + " ]";
    }
    
}
