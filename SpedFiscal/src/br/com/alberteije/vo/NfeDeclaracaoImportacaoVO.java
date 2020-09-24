/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_declaracao_importacao")
@NamedQueries({
    @NamedQuery(name = "NfeDeclaracaoImportacaoVO.findAll", query = "SELECT n FROM NfeDeclaracaoImportacaoVO n")})
public class NfeDeclaracaoImportacaoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "DATA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    @Column(name = "LOCAL_DESEMBARACO")
    private String localDesembaraco;
    @Column(name = "UF_DESEMBARACO")
    private String ufDesembaraco;
    @Column(name = "DATA_DESEMBARACO")
    @Temporal(TemporalType.DATE)
    private Date dataDesembaraco;
    @Column(name = "CODIGO_EXPORTADOR")
    private String codigoExportador;
    @JoinColumn(name = "ID_NFE_DETALHE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeDetalheVO idNfeDetalhe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeDeclaracaoImportacao")
    private List<NfeImportacaoDetalheVO> nfeImportacaoDetalheVOList;

    public NfeDeclaracaoImportacaoVO() {
    }

    public NfeDeclaracaoImportacaoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getLocalDesembaraco() {
        return localDesembaraco;
    }

    public void setLocalDesembaraco(String localDesembaraco) {
        this.localDesembaraco = localDesembaraco;
    }

    public String getUfDesembaraco() {
        return ufDesembaraco;
    }

    public void setUfDesembaraco(String ufDesembaraco) {
        this.ufDesembaraco = ufDesembaraco;
    }

    public Date getDataDesembaraco() {
        return dataDesembaraco;
    }

    public void setDataDesembaraco(Date dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public String getCodigoExportador() {
        return codigoExportador;
    }

    public void setCodigoExportador(String codigoExportador) {
        this.codigoExportador = codigoExportador;
    }

    public NfeDetalheVO getIdNfeDetalhe() {
        return idNfeDetalhe;
    }

    public void setIdNfeDetalhe(NfeDetalheVO idNfeDetalhe) {
        this.idNfeDetalhe = idNfeDetalhe;
    }

    public List<NfeImportacaoDetalheVO> getNfeImportacaoDetalheVOList() {
        return nfeImportacaoDetalheVOList;
    }

    public void setNfeImportacaoDetalheVOList(List<NfeImportacaoDetalheVO> nfeImportacaoDetalheVOList) {
        this.nfeImportacaoDetalheVOList = nfeImportacaoDetalheVOList;
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
        if (!(object instanceof NfeDeclaracaoImportacaoVO)) {
            return false;
        }
        NfeDeclaracaoImportacaoVO other = (NfeDeclaracaoImportacaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeDeclaracaoImportacaoVO[ id=" + id + " ]";
    }
    
}
