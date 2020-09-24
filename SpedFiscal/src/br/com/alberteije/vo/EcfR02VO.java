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
@Table(name = "ecf_r02")
@NamedQueries({
    @NamedQuery(name = "EcfR02VO.findAll", query = "SELECT e FROM EcfR02VO e")})
public class EcfR02VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME_CAIXA")
    private String nomeCaixa;
    @Column(name = "ID_GERADO_CAIXA")
    private Integer idGeradoCaixa;
    @Column(name = "ID_EMPRESA")
    private Integer idEmpresa;
    @Basic(optional = false)
    @Column(name = "ID_OPERADOR")
    private int idOperador;
    @Basic(optional = false)
    @Column(name = "ID_IMPRESSORA")
    private int idImpressora;
    @Column(name = "ID_ECF_CAIXA")
    private Integer idEcfCaixa;
    @Column(name = "SERIE_ECF")
    private String serieEcf;
    @Column(name = "CRZ")
    private Integer crz;
    @Column(name = "COO")
    private Integer coo;
    @Column(name = "CRO")
    private Integer cro;
    @Column(name = "DATA_MOVIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataMovimento;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "HORA_EMISSAO")
    private String horaEmissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VENDA_BRUTA")
    private Double vendaBruta;
    @Column(name = "GRANDE_TOTAL")
    private Double grandeTotal;
    @Column(name = "HASH_TRIPA")
    private String hashTripa;
    @Column(name = "HASH_INCREMENTO")
    private Integer hashIncremento;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfR02VO() {
    }

    public EcfR02VO(Integer id) {
        this.id = id;
    }

    public EcfR02VO(Integer id, int idOperador, int idImpressora) {
        this.id = id;
        this.idOperador = idOperador;
        this.idImpressora = idImpressora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCaixa() {
        return nomeCaixa;
    }

    public void setNomeCaixa(String nomeCaixa) {
        this.nomeCaixa = nomeCaixa;
    }

    public Integer getIdGeradoCaixa() {
        return idGeradoCaixa;
    }

    public void setIdGeradoCaixa(Integer idGeradoCaixa) {
        this.idGeradoCaixa = idGeradoCaixa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public int getIdImpressora() {
        return idImpressora;
    }

    public void setIdImpressora(int idImpressora) {
        this.idImpressora = idImpressora;
    }

    public Integer getIdEcfCaixa() {
        return idEcfCaixa;
    }

    public void setIdEcfCaixa(Integer idEcfCaixa) {
        this.idEcfCaixa = idEcfCaixa;
    }

    public String getSerieEcf() {
        return serieEcf;
    }

    public void setSerieEcf(String serieEcf) {
        this.serieEcf = serieEcf;
    }

    public Integer getCrz() {
        return crz;
    }

    public void setCrz(Integer crz) {
        this.crz = crz;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Integer getCro() {
        return cro;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(String horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(Double vendaBruta) {
        this.vendaBruta = vendaBruta;
    }

    public Double getGrandeTotal() {
        return grandeTotal;
    }

    public void setGrandeTotal(Double grandeTotal) {
        this.grandeTotal = grandeTotal;
    }

    public String getHashTripa() {
        return hashTripa;
    }

    public void setHashTripa(String hashTripa) {
        this.hashTripa = hashTripa;
    }

    public Integer getHashIncremento() {
        return hashIncremento;
    }

    public void setHashIncremento(Integer hashIncremento) {
        this.hashIncremento = hashIncremento;
    }

    public Date getDataSincronizacao() {
        return dataSincronizacao;
    }

    public void setDataSincronizacao(Date dataSincronizacao) {
        this.dataSincronizacao = dataSincronizacao;
    }

    public String getHoraSincronizacao() {
        return horaSincronizacao;
    }

    public void setHoraSincronizacao(String horaSincronizacao) {
        this.horaSincronizacao = horaSincronizacao;
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
        if (!(object instanceof EcfR02VO)) {
            return false;
        }
        EcfR02VO other = (EcfR02VO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfR02VO[ id=" + id + " ]";
    }
    
}
