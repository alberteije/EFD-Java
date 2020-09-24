/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
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

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_importacao_detalhe")
@NamedQueries({
    @NamedQuery(name = "NfeImportacaoDetalheVO.findAll", query = "SELECT n FROM NfeImportacaoDetalheVO n")})
public class NfeImportacaoDetalheVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_ADICAO")
    private Integer numeroAdicao;
    @Column(name = "NUMERO_SEQUENCIAL")
    private Integer numeroSequencial;
    @Column(name = "CODIGO_FABRICANTE_ESTRANGEIRO")
    private String codigoFabricanteEstrangeiro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;
    @JoinColumn(name = "ID_NFE_DECLARACAO_IMPORTACAO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDeclaracaoImportacaoVO idNfeDeclaracaoImportacao;

    public NfeImportacaoDetalheVO() {
    }

    public NfeImportacaoDetalheVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroAdicao() {
        return numeroAdicao;
    }

    public void setNumeroAdicao(Integer numeroAdicao) {
        this.numeroAdicao = numeroAdicao;
    }

    public Integer getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(Integer numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    public String getCodigoFabricanteEstrangeiro() {
        return codigoFabricanteEstrangeiro;
    }

    public void setCodigoFabricanteEstrangeiro(String codigoFabricanteEstrangeiro) {
        this.codigoFabricanteEstrangeiro = codigoFabricanteEstrangeiro;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public NfeDeclaracaoImportacaoVO getIdNfeDeclaracaoImportacao() {
        return idNfeDeclaracaoImportacao;
    }

    public void setIdNfeDeclaracaoImportacao(NfeDeclaracaoImportacaoVO idNfeDeclaracaoImportacao) {
        this.idNfeDeclaracaoImportacao = idNfeDeclaracaoImportacao;
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
        if (!(object instanceof NfeImportacaoDetalheVO)) {
            return false;
        }
        NfeImportacaoDetalheVO other = (NfeImportacaoDetalheVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeImportacaoDetalheVO[ id=" + id + " ]";
    }
    
}
