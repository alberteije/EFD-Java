/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "produto_promocao")
@NamedQueries({
    @NamedQuery(name = "ProdutoPromocaoVO.findAll", query = "SELECT p FROM ProdutoPromocaoVO p")})
public class ProdutoPromocaoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "DATA_FIM")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE_EM_PROMOCAO")
    private Double quantidadeEmPromocao;
    @Column(name = "QUANTIDADE_MAXIMA_CLIENTE")
    private Double quantidadeMaximaCliente;
    @Column(name = "VALOR")
    private Double valor;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ProdutoVO idProduto;

    public ProdutoPromocaoVO() {
    }

    public ProdutoPromocaoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Double getQuantidadeEmPromocao() {
        return quantidadeEmPromocao;
    }

    public void setQuantidadeEmPromocao(Double quantidadeEmPromocao) {
        this.quantidadeEmPromocao = quantidadeEmPromocao;
    }

    public Double getQuantidadeMaximaCliente() {
        return quantidadeMaximaCliente;
    }

    public void setQuantidadeMaximaCliente(Double quantidadeMaximaCliente) {
        this.quantidadeMaximaCliente = quantidadeMaximaCliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ProdutoVO getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ProdutoVO idProduto) {
        this.idProduto = idProduto;
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
        if (!(object instanceof ProdutoPromocaoVO)) {
            return false;
        }
        ProdutoPromocaoVO other = (ProdutoPromocaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ProdutoPromocaoVO[ id=" + id + " ]";
    }
    
}
