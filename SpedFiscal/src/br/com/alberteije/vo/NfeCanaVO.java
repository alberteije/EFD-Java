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
@Table(name = "nfe_cana")
@NamedQueries({
    @NamedQuery(name = "NfeCanaVO.findAll", query = "SELECT n FROM NfeCanaVO n")})
public class NfeCanaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SAFRA")
    private String safra;
    @Column(name = "MES_ANO_REFERENCIA")
    private String mesAnoReferencia;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCana")
    private List<NfeCanaDeducoesSafraVO> nfeCanaDeducoesSafraVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeCana")
    private List<NfeCanaFornecimentoDiarioVO> nfeCanaFornecimentoDiarioVOList;

    public NfeCanaVO() {
    }

    public NfeCanaVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSafra() {
        return safra;
    }

    public void setSafra(String safra) {
        this.safra = safra;
    }

    public String getMesAnoReferencia() {
        return mesAnoReferencia;
    }

    public void setMesAnoReferencia(String mesAnoReferencia) {
        this.mesAnoReferencia = mesAnoReferencia;
    }

    public NfeCabecalhoVO getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(NfeCabecalhoVO idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
    }

    public List<NfeCanaDeducoesSafraVO> getNfeCanaDeducoesSafraVOList() {
        return nfeCanaDeducoesSafraVOList;
    }

    public void setNfeCanaDeducoesSafraVOList(List<NfeCanaDeducoesSafraVO> nfeCanaDeducoesSafraVOList) {
        this.nfeCanaDeducoesSafraVOList = nfeCanaDeducoesSafraVOList;
    }

    public List<NfeCanaFornecimentoDiarioVO> getNfeCanaFornecimentoDiarioVOList() {
        return nfeCanaFornecimentoDiarioVOList;
    }

    public void setNfeCanaFornecimentoDiarioVOList(List<NfeCanaFornecimentoDiarioVO> nfeCanaFornecimentoDiarioVOList) {
        this.nfeCanaFornecimentoDiarioVOList = nfeCanaFornecimentoDiarioVOList;
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
        if (!(object instanceof NfeCanaVO)) {
            return false;
        }
        NfeCanaVO other = (NfeCanaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeCanaVO[ id=" + id + " ]";
    }
    
}
