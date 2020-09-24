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
@Table(name = "nfe_transporte_volume")
@NamedQueries({
    @NamedQuery(name = "NfeTransporteVolumeVO.findAll", query = "SELECT n FROM NfeTransporteVolumeVO n")})
public class NfeTransporteVolumeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "NUMERACAO")
    private String numeracao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO_LIQUIDO")
    private Double pesoLiquido;
    @Column(name = "PESO_BRUTO")
    private Double pesoBruto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeTransporteVolume")
    private List<NfeTransporteVolumeLacreVO> nfeTransporteVolumeLacreVOList;
    @JoinColumn(name = "ID_NFE_TRANSPORTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeTransporteVO idNfeTransporte;

    public NfeTransporteVolumeVO() {
    }

    public NfeTransporteVolumeVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public List<NfeTransporteVolumeLacreVO> getNfeTransporteVolumeLacreVOList() {
        return nfeTransporteVolumeLacreVOList;
    }

    public void setNfeTransporteVolumeLacreVOList(List<NfeTransporteVolumeLacreVO> nfeTransporteVolumeLacreVOList) {
        this.nfeTransporteVolumeLacreVOList = nfeTransporteVolumeLacreVOList;
    }

    public NfeTransporteVO getIdNfeTransporte() {
        return idNfeTransporte;
    }

    public void setIdNfeTransporte(NfeTransporteVO idNfeTransporte) {
        this.idNfeTransporte = idNfeTransporte;
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
        if (!(object instanceof NfeTransporteVolumeVO)) {
            return false;
        }
        NfeTransporteVolumeVO other = (NfeTransporteVolumeVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeTransporteVolumeVO[ id=" + id + " ]";
    }
    
}
