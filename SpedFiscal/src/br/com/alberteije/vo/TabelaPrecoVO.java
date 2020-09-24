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
@Table(name = "tabela_preco")
@NamedQueries({
    @NamedQuery(name = "TabelaPrecoVO.findAll", query = "SELECT t FROM TabelaPrecoVO t")})
public class TabelaPrecoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COEFICIENTE")
    private Double coeficiente;
    @Column(name = "PRINCIPAL")
    private String principal;
    @Column(name = "BASE_CUSTO")
    private String baseCusto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTabelaPreco")
    private List<TabelaPrecoProdutoVO> tabelaPrecoProdutoVOList;
    @OneToMany(mappedBy = "idTabelaMestre")
    private List<TabelaPrecoVO> tabelaPrecoVOList;
    @JoinColumn(name = "ID_TABELA_MESTRE", referencedColumnName = "ID")
    @ManyToOne
    private TabelaPrecoVO idTabelaMestre;

    public TabelaPrecoVO() {
    }

    public TabelaPrecoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getBaseCusto() {
        return baseCusto;
    }

    public void setBaseCusto(String baseCusto) {
        this.baseCusto = baseCusto;
    }

    public List<TabelaPrecoProdutoVO> getTabelaPrecoProdutoVOList() {
        return tabelaPrecoProdutoVOList;
    }

    public void setTabelaPrecoProdutoVOList(List<TabelaPrecoProdutoVO> tabelaPrecoProdutoVOList) {
        this.tabelaPrecoProdutoVOList = tabelaPrecoProdutoVOList;
    }

    public List<TabelaPrecoVO> getTabelaPrecoVOList() {
        return tabelaPrecoVOList;
    }

    public void setTabelaPrecoVOList(List<TabelaPrecoVO> tabelaPrecoVOList) {
        this.tabelaPrecoVOList = tabelaPrecoVOList;
    }

    public TabelaPrecoVO getIdTabelaMestre() {
        return idTabelaMestre;
    }

    public void setIdTabelaMestre(TabelaPrecoVO idTabelaMestre) {
        this.idTabelaMestre = idTabelaMestre;
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
        if (!(object instanceof TabelaPrecoVO)) {
            return false;
        }
        TabelaPrecoVO other = (TabelaPrecoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TabelaPrecoVO[ id=" + id + " ]";
    }
    
}
