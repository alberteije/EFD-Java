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
@Table(name = "tribut_iss")
@NamedQueries({
    @NamedQuery(name = "TributIssVO.findAll", query = "SELECT t FROM TributIssVO t")})
public class TributIssVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MODALIDADE_BASE_CALCULO")
    private String modalidadeBaseCalculo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTO_BASE_CALCULO")
    private Double porcentoBaseCalculo;
    @Column(name = "ALIQUOTA_PORCENTO")
    private Double aliquotaPorcento;
    @Column(name = "ALIQUOTA_UNIDADE")
    private Double aliquotaUnidade;
    @Column(name = "VALOR_PRECO_MAXIMO")
    private Double valorPrecoMaximo;
    @Column(name = "VALOR_PAUTA_FISCAL")
    private Double valorPautaFiscal;
    @Column(name = "ITEM_LISTA_SERVICO")
    private Integer itemListaServico;
    @Column(name = "CODIGO_TRIBUTACAO")
    private String codigoTributacao;
    @JoinColumn(name = "ID_TRIBUT_OPERACAO_FISCAL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TributOperacaoFiscalVO idTributOperacaoFiscal;

    public TributIssVO() {
    }

    public TributIssVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModalidadeBaseCalculo() {
        return modalidadeBaseCalculo;
    }

    public void setModalidadeBaseCalculo(String modalidadeBaseCalculo) {
        this.modalidadeBaseCalculo = modalidadeBaseCalculo;
    }

    public Double getPorcentoBaseCalculo() {
        return porcentoBaseCalculo;
    }

    public void setPorcentoBaseCalculo(Double porcentoBaseCalculo) {
        this.porcentoBaseCalculo = porcentoBaseCalculo;
    }

    public Double getAliquotaPorcento() {
        return aliquotaPorcento;
    }

    public void setAliquotaPorcento(Double aliquotaPorcento) {
        this.aliquotaPorcento = aliquotaPorcento;
    }

    public Double getAliquotaUnidade() {
        return aliquotaUnidade;
    }

    public void setAliquotaUnidade(Double aliquotaUnidade) {
        this.aliquotaUnidade = aliquotaUnidade;
    }

    public Double getValorPrecoMaximo() {
        return valorPrecoMaximo;
    }

    public void setValorPrecoMaximo(Double valorPrecoMaximo) {
        this.valorPrecoMaximo = valorPrecoMaximo;
    }

    public Double getValorPautaFiscal() {
        return valorPautaFiscal;
    }

    public void setValorPautaFiscal(Double valorPautaFiscal) {
        this.valorPautaFiscal = valorPautaFiscal;
    }

    public Integer getItemListaServico() {
        return itemListaServico;
    }

    public void setItemListaServico(Integer itemListaServico) {
        this.itemListaServico = itemListaServico;
    }

    public String getCodigoTributacao() {
        return codigoTributacao;
    }

    public void setCodigoTributacao(String codigoTributacao) {
        this.codigoTributacao = codigoTributacao;
    }

    public TributOperacaoFiscalVO getIdTributOperacaoFiscal() {
        return idTributOperacaoFiscal;
    }

    public void setIdTributOperacaoFiscal(TributOperacaoFiscalVO idTributOperacaoFiscal) {
        this.idTributOperacaoFiscal = idTributOperacaoFiscal;
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
        if (!(object instanceof TributIssVO)) {
            return false;
        }
        TributIssVO other = (TributIssVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributIssVO[ id=" + id + " ]";
    }
    
}
