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
@Table(name = "vendedor")
@NamedQueries({
    @NamedQuery(name = "VendedorVO.findAll", query = "SELECT v FROM VendedorVO v")})
public class VendedorVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMISSAO")
    private Double comissao;
    @Column(name = "META_VENDAS")
    private Double metaVendas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVendedor")
    private List<VendaCabecalhoVO> vendaCabecalhoVOList;
    @JoinColumn(name = "ID_COLABORADOR", referencedColumnName = "ID")
    @ManyToOne
    private ColaboradorVO idColaborador;

    public VendedorVO() {
    }

    public VendedorVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(Double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public List<VendaCabecalhoVO> getVendaCabecalhoVOList() {
        return vendaCabecalhoVOList;
    }

    public void setVendaCabecalhoVOList(List<VendaCabecalhoVO> vendaCabecalhoVOList) {
        this.vendaCabecalhoVOList = vendaCabecalhoVOList;
    }

    public ColaboradorVO getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(ColaboradorVO idColaborador) {
        this.idColaborador = idColaborador;
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
        if (!(object instanceof VendedorVO)) {
            return false;
        }
        VendedorVO other = (VendedorVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.VendedorVO[ id=" + id + " ]";
    }
    
}
