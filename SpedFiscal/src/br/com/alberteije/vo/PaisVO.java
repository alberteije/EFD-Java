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
@Table(name = "pais")
@NamedQueries({
    @NamedQuery(name = "PaisVO.findAll", query = "SELECT p FROM PaisVO p")})
public class PaisVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "NOME_EN")
    private String nomeEn;
    @Column(name = "NOME_PTBR")
    private String nomePtbr;
    @Column(name = "SIGLA2")
    private String sigla2;
    @Column(name = "SIGLA3")
    private String sigla3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPais")
    private List<UfVO> ufVOList;

    public PaisVO() {
    }

    public PaisVO(Integer id) {
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

    public String getNomeEn() {
        return nomeEn;
    }

    public void setNomeEn(String nomeEn) {
        this.nomeEn = nomeEn;
    }

    public String getNomePtbr() {
        return nomePtbr;
    }

    public void setNomePtbr(String nomePtbr) {
        this.nomePtbr = nomePtbr;
    }

    public String getSigla2() {
        return sigla2;
    }

    public void setSigla2(String sigla2) {
        this.sigla2 = sigla2;
    }

    public String getSigla3() {
        return sigla3;
    }

    public void setSigla3(String sigla3) {
        this.sigla3 = sigla3;
    }

    public List<UfVO> getUfVOList() {
        return ufVOList;
    }

    public void setUfVOList(List<UfVO> ufVOList) {
        this.ufVOList = ufVOList;
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
        if (!(object instanceof PaisVO)) {
            return false;
        }
        PaisVO other = (PaisVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.PaisVO[ id=" + id + " ]";
    }
    
}
