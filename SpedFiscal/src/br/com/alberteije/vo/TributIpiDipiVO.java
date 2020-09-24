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
@Table(name = "tribut_ipi_dipi")
@NamedQueries({
    @NamedQuery(name = "TributIpiDipiVO.findAll", query = "SELECT t FROM TributIpiDipiVO t")})
public class TributIpiDipiVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CST_IPI")
    private String cstIpi;
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
    @JoinColumn(name = "ID_TRIBUT_CONFIGURA_OF_GT", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TributConfiguraOfGtVO idTributConfiguraOfGt;
    @JoinColumn(name = "ID_TIPO_RECEITA_DIPI", referencedColumnName = "ID")
    @ManyToOne
    private TipoReceitaDipiVO idTipoReceitaDipi;

    public TributIpiDipiVO() {
    }

    public TributIpiDipiVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
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

    public TributConfiguraOfGtVO getIdTributConfiguraOfGt() {
        return idTributConfiguraOfGt;
    }

    public void setIdTributConfiguraOfGt(TributConfiguraOfGtVO idTributConfiguraOfGt) {
        this.idTributConfiguraOfGt = idTributConfiguraOfGt;
    }

    public TipoReceitaDipiVO getIdTipoReceitaDipi() {
        return idTipoReceitaDipi;
    }

    public void setIdTipoReceitaDipi(TipoReceitaDipiVO idTipoReceitaDipi) {
        this.idTipoReceitaDipi = idTipoReceitaDipi;
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
        if (!(object instanceof TributIpiDipiVO)) {
            return false;
        }
        TributIpiDipiVO other = (TributIpiDipiVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributIpiDipiVO[ id=" + id + " ]";
    }
    
}
