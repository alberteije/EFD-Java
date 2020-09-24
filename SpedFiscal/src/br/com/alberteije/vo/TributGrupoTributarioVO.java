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
import javax.persistence.Lob;
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
@Table(name = "tribut_grupo_tributario")
@NamedQueries({
    @NamedQuery(name = "TributGrupoTributarioVO.findAll", query = "SELECT t FROM TributGrupoTributarioVO t")})
public class TributGrupoTributarioVO implements Serializable {
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
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTributGrupoTributario")
    private List<TributConfiguraOfGtVO> tributConfiguraOfGtVOList;
    @OneToMany(mappedBy = "idGrupoTributario")
    private List<ProdutoVO> produtoVOList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public TributGrupoTributarioVO() {
    }

    public TributGrupoTributarioVO(Integer id) {
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<TributConfiguraOfGtVO> getTributConfiguraOfGtVOList() {
        return tributConfiguraOfGtVOList;
    }

    public void setTributConfiguraOfGtVOList(List<TributConfiguraOfGtVO> tributConfiguraOfGtVOList) {
        this.tributConfiguraOfGtVOList = tributConfiguraOfGtVOList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TributGrupoTributarioVO)) {
            return false;
        }
        TributGrupoTributarioVO other = (TributGrupoTributarioVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TributGrupoTributarioVO[ id=" + id + " ]";
    }
    
}
