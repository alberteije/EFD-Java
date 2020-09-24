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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "tipo_receita_dacon")
@NamedQueries({
    @NamedQuery(name = "TipoReceitaDaconVO.findAll", query = "SELECT t FROM TipoReceitaDaconVO t")})
public class TipoReceitaDaconVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoReceitaDacon")
    private List<CodApuracaoReceitaDaconVO> codApuracaoReceitaDaconVOList;

    public TipoReceitaDaconVO() {
    }

    public TipoReceitaDaconVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        if (!(object instanceof TipoReceitaDaconVO)) {
            return false;
        }
        TipoReceitaDaconVO other = (TipoReceitaDaconVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TipoReceitaDaconVO[ id=" + id + " ]";
    }
    
}
