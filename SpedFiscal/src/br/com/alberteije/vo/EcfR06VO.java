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
@Table(name = "ecf_r06")
@NamedQueries({
    @NamedQuery(name = "EcfR06VO.findAll", query = "SELECT e FROM EcfR06VO e")})
public class EcfR06VO implements Serializable {
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
    @Column(name = "COO")
    private Integer coo;
    @Column(name = "GNF")
    private Integer gnf;
    @Column(name = "GRG")
    private Integer grg;
    @Column(name = "CDC")
    private Integer cdc;
    @Column(name = "DENOMINACAO")
    private String denominacao;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "HORA_EMISSAO")
    private String horaEmissao;
    @Column(name = "HASH_TRIPA")
    private String hashTripa;
    @Column(name = "HASH_INCREMENTO")
    private Integer hashIncremento;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfR06VO() {
    }

    public EcfR06VO(Integer id) {
        this.id = id;
    }

    public EcfR06VO(Integer id, int idOperador, int idImpressora) {
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

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Integer getGnf() {
        return gnf;
    }

    public void setGnf(Integer gnf) {
        this.gnf = gnf;
    }

    public Integer getGrg() {
        return grg;
    }

    public void setGrg(Integer grg) {
        this.grg = grg;
    }

    public Integer getCdc() {
        return cdc;
    }

    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
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
        if (!(object instanceof EcfR06VO)) {
            return false;
        }
        EcfR06VO other = (EcfR06VO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfR06VO[ id=" + id + " ]";
    }
    
}
