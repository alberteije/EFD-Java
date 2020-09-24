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
@Table(name = "pessoa_juridica")
@NamedQueries({
    @NamedQuery(name = "PessoaJuridicaVO.findAll", query = "SELECT p FROM PessoaJuridicaVO p")})
public class PessoaJuridicaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "FANTASIA")
    private String fantasia;
    @Column(name = "INSCRICAO_MUNICIPAL")
    private String inscricaoMunicipal;
    @Column(name = "INSCRICAO_ESTADUAL")
    private String inscricaoEstadual;
    @Column(name = "DATA_CONSTITUICAO")
    @Temporal(TemporalType.DATE)
    private Date dataConstituicao;
    @Column(name = "TIPO_REGIME")
    private String tipoRegime;
    @Column(name = "CRT")
    private String crt;
    @Column(name = "SUFRAMA")
    private String suframa;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;

    public PessoaJuridicaVO() {
    }

    public PessoaJuridicaVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Date getDataConstituicao() {
        return dataConstituicao;
    }

    public void setDataConstituicao(Date dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public String getTipoRegime() {
        return tipoRegime;
    }

    public void setTipoRegime(String tipoRegime) {
        this.tipoRegime = tipoRegime;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public PessoaVO getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(PessoaVO idPessoa) {
        this.idPessoa = idPessoa;
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
        if (!(object instanceof PessoaJuridicaVO)) {
            return false;
        }
        PessoaJuridicaVO other = (PessoaJuridicaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PessoaJuridicaVO[ id=" + id + " ]";
    }
    
}
