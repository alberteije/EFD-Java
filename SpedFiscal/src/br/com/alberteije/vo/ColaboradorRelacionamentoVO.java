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
@Table(name = "colaborador_relacionamento")
@NamedQueries({
    @NamedQuery(name = "ColaboradorRelacionamentoVO.findAll", query = "SELECT c FROM ColaboradorRelacionamentoVO c")})
public class ColaboradorRelacionamentoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DATA_NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "REGISTRO_MATRICULA")
    private String registroMatricula;
    @Column(name = "REGISTRO_CARTORIO")
    private String registroCartorio;
    @Column(name = "REGISTRO_CARTORIO_NUMERO")
    private String registroCartorioNumero;
    @Column(name = "REGISTRO_NUMERO_LIVRO")
    private String registroNumeroLivro;
    @Column(name = "REGISTRO_NUMERO_FOLHA")
    private String registroNumeroFolha;
    @Column(name = "DATA_ENTREGA_DOCUMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaDocumento;
    @Column(name = "SALARIO_FAMILIA")
    private String salarioFamilia;
    @Column(name = "SALARIO_FAMILIA_IDADE_LIMITE")
    private Integer salarioFamiliaIdadeLimite;
    @Column(name = "SALARIO_FAMILIA_DATA_FIM")
    @Temporal(TemporalType.DATE)
    private Date salarioFamiliaDataFim;
    @Column(name = "IMPOSTO_RENDA_IDADE_LIMITE")
    private Integer impostoRendaIdadeLimite;
    @Column(name = "IMPOSTO_RENDA_DATA_FIM")
    private Integer impostoRendaDataFim;
    @JoinColumn(name = "ID_TIPO_RELACIONAMENTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoRelacionamentoVO idTipoRelacionamento;
    @JoinColumn(name = "ID_COLABORADOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ColaboradorVO idColaborador;

    public ColaboradorRelacionamentoVO() {
    }

    public ColaboradorRelacionamentoVO(Integer id) {
        this.id = id;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(String registroMatricula) {
        this.registroMatricula = registroMatricula;
    }

    public String getRegistroCartorio() {
        return registroCartorio;
    }

    public void setRegistroCartorio(String registroCartorio) {
        this.registroCartorio = registroCartorio;
    }

    public String getRegistroCartorioNumero() {
        return registroCartorioNumero;
    }

    public void setRegistroCartorioNumero(String registroCartorioNumero) {
        this.registroCartorioNumero = registroCartorioNumero;
    }

    public String getRegistroNumeroLivro() {
        return registroNumeroLivro;
    }

    public void setRegistroNumeroLivro(String registroNumeroLivro) {
        this.registroNumeroLivro = registroNumeroLivro;
    }

    public String getRegistroNumeroFolha() {
        return registroNumeroFolha;
    }

    public void setRegistroNumeroFolha(String registroNumeroFolha) {
        this.registroNumeroFolha = registroNumeroFolha;
    }

    public Date getDataEntregaDocumento() {
        return dataEntregaDocumento;
    }

    public void setDataEntregaDocumento(Date dataEntregaDocumento) {
        this.dataEntregaDocumento = dataEntregaDocumento;
    }

    public String getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(String salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public Integer getSalarioFamiliaIdadeLimite() {
        return salarioFamiliaIdadeLimite;
    }

    public void setSalarioFamiliaIdadeLimite(Integer salarioFamiliaIdadeLimite) {
        this.salarioFamiliaIdadeLimite = salarioFamiliaIdadeLimite;
    }

    public Date getSalarioFamiliaDataFim() {
        return salarioFamiliaDataFim;
    }

    public void setSalarioFamiliaDataFim(Date salarioFamiliaDataFim) {
        this.salarioFamiliaDataFim = salarioFamiliaDataFim;
    }

    public Integer getImpostoRendaIdadeLimite() {
        return impostoRendaIdadeLimite;
    }

    public void setImpostoRendaIdadeLimite(Integer impostoRendaIdadeLimite) {
        this.impostoRendaIdadeLimite = impostoRendaIdadeLimite;
    }

    public Integer getImpostoRendaDataFim() {
        return impostoRendaDataFim;
    }

    public void setImpostoRendaDataFim(Integer impostoRendaDataFim) {
        this.impostoRendaDataFim = impostoRendaDataFim;
    }

    public TipoRelacionamentoVO getIdTipoRelacionamento() {
        return idTipoRelacionamento;
    }

    public void setIdTipoRelacionamento(TipoRelacionamentoVO idTipoRelacionamento) {
        this.idTipoRelacionamento = idTipoRelacionamento;
    }

    public ColaboradorVO getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(ColaboradorVO idColaborador) {
        this.idColaborador = idColaborador;
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
        if (!(object instanceof ColaboradorRelacionamentoVO)) {
            return false;
        }
        ColaboradorRelacionamentoVO other = (ColaboradorRelacionamentoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ColaboradorRelacionamentoVO[ id=" + id + " ]";
    }
    
}
