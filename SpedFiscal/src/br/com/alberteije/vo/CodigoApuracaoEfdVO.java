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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "codigo_apuracao_efd")
@NamedQueries({
    @NamedQuery(name = "CodigoApuracaoEfdVO.findAll", query = "SELECT c FROM CodigoApuracaoEfdVO c")})
public class CodigoApuracaoEfdVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCodigoApuracaoEfd")
    private List<CodApuracaoReceitaDaconVO> codApuracaoReceitaDaconVOList;

    public CodigoApuracaoEfdVO() {
    }

    public CodigoApuracaoEfdVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<CodApuracaoReceitaDaconVO> getCodApuracaoReceitaDaconVOList() {
        return codApuracaoReceitaDaconVOList;
    }

    public void setCodApuracaoReceitaDaconVOList(List<CodApuracaoReceitaDaconVO> codApuracaoReceitaDaconVOList) {
        this.codApuracaoReceitaDaconVOList = codApuracaoReceitaDaconVOList;
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
        if (!(object instanceof CodigoApuracaoEfdVO)) {
            return false;
        }
        CodigoApuracaoEfdVO other = (CodigoApuracaoEfdVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.CodigoApuracaoEfdVO[ id=" + id + " ]";
    }
    
}
