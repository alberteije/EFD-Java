/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "transportadora")
@NamedQueries({
    @NamedQuery(name = "TransportadoraVO.findAll", query = "SELECT t FROM TransportadoraVO t")})
public class TransportadoraVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(mappedBy = "idTransportadora")
    private List<VendaCabecalhoVO> vendaCabecalhoVOList;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTransportadora")
    private List<TransportadoraMunicipioVO> transportadoraMunicipioVOList;
    @OneToMany(mappedBy = "idTransportadora")
    private List<NfeTransporteVO> nfeTransporteVOList;

    public TransportadoraVO() {
    }

    public TransportadoraVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<VendaCabecalhoVO> getVendaCabecalhoVOList() {
        return vendaCabecalhoVOList;
    }

    public void setVendaCabecalhoVOList(List<VendaCabecalhoVO> vendaCabecalhoVOList) {
        this.vendaCabecalhoVOList = vendaCabecalhoVOList;
    }

    public PessoaVO getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(PessoaVO idPessoa) {
        this.idPessoa = idPessoa;
    }

    public List<TransportadoraMunicipioVO> getTransportadoraMunicipioVOList() {
        return transportadoraMunicipioVOList;
    }

    public void setTransportadoraMunicipioVOList(List<TransportadoraMunicipioVO> transportadoraMunicipioVOList) {
        this.transportadoraMunicipioVOList = transportadoraMunicipioVOList;
    }

    public List<NfeTransporteVO> getNfeTransporteVOList() {
        return nfeTransporteVOList;
    }

    public void setNfeTransporteVOList(List<NfeTransporteVO> nfeTransporteVOList) {
        this.nfeTransporteVOList = nfeTransporteVOList;
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
        if (!(object instanceof TransportadoraVO)) {
            return false;
        }
        TransportadoraVO other = (TransportadoraVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.TransportadoraVO[ id=" + id + " ]";
    }
    
}
