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
@Table(name = "estoque_tamanho")
@NamedQueries({
    @NamedQuery(name = "EstoqueTamanhoVO.findAll", query = "SELECT e FROM EstoqueTamanhoVO e")})
public class EstoqueTamanhoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstoqueTamanho")
    private List<EstoqueGradeVO> estoqueGradeVOList;

    public EstoqueTamanhoVO() {
    }

    public EstoqueTamanhoVO(Integer id) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EstoqueGradeVO> getEstoqueGradeVOList() {
        return estoqueGradeVOList;
    }

    public void setEstoqueGradeVOList(List<EstoqueGradeVO> estoqueGradeVOList) {
        this.estoqueGradeVOList = estoqueGradeVOList;
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
        if (!(object instanceof EstoqueTamanhoVO)) {
            return false;
        }
        EstoqueTamanhoVO other = (EstoqueTamanhoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EstoqueTamanhoVO[ id=" + id + " ]";
    }
    
}
