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
@Table(name = "tribut_icms_custom_cab")
@NamedQueries({
    @NamedQuery(name = "TributIcmsCustomCabVO.findAll", query = "SELECT t FROM TributIcmsCustomCabVO t")})
public class TributIcmsCustomCabVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "ORIGEM_MERCADORIA")
    private String origemMercadoria;
    @OneToMany(mappedBy = "idTributIcmsCustomCab")
    private List<ProdutoVO> produtoVOList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributIcmsCustomCab")
    private List<TributIcmsCustomDetVO> tributIcmsCustomDetVOList;

    public TributIcmsCustomCabVO() {
    }

    public TributIcmsCustomCabVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigemMercadoria() {
        return origemMercadoria;
    }

    public void setOrigemMercadoria(String origemMercadoria) {
        this.origemMercadoria = origemMercadoria;
    }

    public List<ProdutoVO> getProdutoVOList() {
        return produtoVOList;
    }

    public void setProdutoVOList(List<ProdutoVO> produtoVOList) {
        this.produtoVOList = produtoVOList;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<TributIcmsCustomDetVO> getTributIcmsCustomDetVOList() {
        return tributIcmsCustomDetVOList;
    }

    public void setTributIcmsCustomDetVOList(List<TributIcmsCustomDetVO> tributIcmsCustomDetVOList) {
        this.tributIcmsCustomDetVOList = tributIcmsCustomDetVOList;
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
        if (!(object instanceof TributIcmsCustomCabVO)) {
            return false;
        }
        TributIcmsCustomCabVO other = (TributIcmsCustomCabVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributIcmsCustomCabVO[ id=" + id + " ]";
    }
    
}
