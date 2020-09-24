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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "tribut_configura_of_gt")
@NamedQueries({
    @NamedQuery(name = "TributConfiguraOfGtVO.findAll", query = "SELECT t FROM TributConfiguraOfGtVO t")})
public class TributConfiguraOfGtVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ID_TRIBUT_GRUPO_TRIBUTARIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TributGrupoTributarioVO idTributGrupoTributario;
    @JoinColumn(name = "ID_TRIBUT_OPERACAO_FISCAL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TributOperacaoFiscalVO idTributOperacaoFiscal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributConfiguraOfGt")
    private List<TributPisCodApuracaoVO> tributPisCodApuracaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributConfiguraOfGt")
    private List<TributIpiDipiVO> tributIpiDipiVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributConfiguraOfGt")
    private List<TributCofinsCodApuracaoVO> tributCofinsCodApuracaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributConfiguraOfGt")
    private List<TributIcmsUfVO> tributIcmsUfVOList;

    public TributConfiguraOfGtVO() {
    }

    public TributConfiguraOfGtVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TributGrupoTributarioVO getIdTributGrupoTributario() {
        return idTributGrupoTributario;
    }

    public void setIdTributGrupoTributario(TributGrupoTributarioVO idTributGrupoTributario) {
        this.idTributGrupoTributario = idTributGrupoTributario;
    }

    public TributOperacaoFiscalVO getIdTributOperacaoFiscal() {
        return idTributOperacaoFiscal;
    }

    public void setIdTributOperacaoFiscal(TributOperacaoFiscalVO idTributOperacaoFiscal) {
        this.idTributOperacaoFiscal = idTributOperacaoFiscal;
    }

    public List<TributPisCodApuracaoVO> getTributPisCodApuracaoVOList() {
        return tributPisCodApuracaoVOList;
    }

    public void setTributPisCodApuracaoVOList(List<TributPisCodApuracaoVO> tributPisCodApuracaoVOList) {
        this.tributPisCodApuracaoVOList = tributPisCodApuracaoVOList;
    }

    public List<TributIpiDipiVO> getTributIpiDipiVOList() {
        return tributIpiDipiVOList;
    }

    public void setTributIpiDipiVOList(List<TributIpiDipiVO> tributIpiDipiVOList) {
        this.tributIpiDipiVOList = tributIpiDipiVOList;
    }

    public List<TributCofinsCodApuracaoVO> getTributCofinsCodApuracaoVOList() {
        return tributCofinsCodApuracaoVOList;
    }

    public void setTributCofinsCodApuracaoVOList(List<TributCofinsCodApuracaoVO> tributCofinsCodApuracaoVOList) {
        this.tributCofinsCodApuracaoVOList = tributCofinsCodApuracaoVOList;
    }

    public List<TributIcmsUfVO> getTributIcmsUfVOList() {
        return tributIcmsUfVOList;
    }

    public void setTributIcmsUfVOList(List<TributIcmsUfVO> tributIcmsUfVOList) {
        this.tributIcmsUfVOList = tributIcmsUfVOList;
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
        if (!(object instanceof TributConfiguraOfGtVO)) {
            return false;
        }
        TributConfiguraOfGtVO other = (TributConfiguraOfGtVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributConfiguraOfGtVO[ id=" + id + " ]";
    }
    
}
