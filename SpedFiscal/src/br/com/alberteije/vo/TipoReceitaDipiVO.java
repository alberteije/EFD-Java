/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "tipo_receita_dipi")
@NamedQueries({
    @NamedQuery(name = "TipoReceitaDipiVO.findAll", query = "SELECT t FROM TipoReceitaDipiVO t")})
public class TipoReceitaDipiVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(mappedBy = "idTipoReceitaDipi")
    private List<TributIpiDipiVO> tributIpiDipiVOList;

    public TipoReceitaDipiVO() {
    }

    public TipoReceitaDipiVO(Integer id) {
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

    public List<TributIpiDipiVO> getTributIpiDipiVOList() {
        return tributIpiDipiVOList;
    }

    public void setTributIpiDipiVOList(List<TributIpiDipiVO> tributIpiDipiVOList) {
        this.tributIpiDipiVOList = tributIpiDipiVOList;
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
        if (!(object instanceof TipoReceitaDipiVO)) {
            return false;
        }
        TipoReceitaDipiVO other = (TipoReceitaDipiVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TipoReceitaDipiVO[ id=" + id + " ]";
    }
    
}
