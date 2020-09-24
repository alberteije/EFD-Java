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
@Table(name = "ecf_impressora")
@NamedQueries({
    @NamedQuery(name = "EcfImpressoraVO.findAll", query = "SELECT e FROM EcfImpressoraVO e")})
public class EcfImpressoraVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "IDENTIFICACAO")
    private String identificacao;
    @Column(name = "MC")
    private String mc;
    @Column(name = "MD")
    private String md;
    @Column(name = "VR")
    private String vr;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "MODELO_ACBR")
    private String modeloAcbr;
    @Column(name = "MODELO_DOCUMENTO_FISCAL")
    private String modeloDocumentoFiscal;
    @Column(name = "VERSAO")
    private String versao;
    @Column(name = "LE")
    private String le;
    @Column(name = "LEF")
    private String lef;
    @Column(name = "MFD")
    private String mfd;
    @Column(name = "LACRE_NA_MFD")
    private String lacreNaMfd;
    @Column(name = "DATA_INSTALACAO_SB")
    @Temporal(TemporalType.DATE)
    private Date dataInstalacaoSb;
    @Column(name = "HORA_INSTALACAO_SB")
    private String horaInstalacaoSb;
    @Column(name = "DOCTO")
    private String docto;
    @Column(name = "ECF_IMPRESSORA")
    private String ecfImpressora;

    public EcfImpressoraVO() {
    }

    public EcfImpressoraVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getVr() {
        return vr;
    }

    public void setVr(String vr) {
        this.vr = vr;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModeloAcbr() {
        return modeloAcbr;
    }

    public void setModeloAcbr(String modeloAcbr) {
        this.modeloAcbr = modeloAcbr;
    }

    public String getModeloDocumentoFiscal() {
        return modeloDocumentoFiscal;
    }

    public void setModeloDocumentoFiscal(String modeloDocumentoFiscal) {
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public String getLef() {
        return lef;
    }

    public void setLef(String lef) {
        this.lef = lef;
    }

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public String getLacreNaMfd() {
        return lacreNaMfd;
    }

    public void setLacreNaMfd(String lacreNaMfd) {
        this.lacreNaMfd = lacreNaMfd;
    }

    public Date getDataInstalacaoSb() {
        return dataInstalacaoSb;
    }

    public void setDataInstalacaoSb(Date dataInstalacaoSb) {
        this.dataInstalacaoSb = dataInstalacaoSb;
    }

    public String getHoraInstalacaoSb() {
        return horaInstalacaoSb;
    }

    public void setHoraInstalacaoSb(String horaInstalacaoSb) {
        this.horaInstalacaoSb = horaInstalacaoSb;
    }

    public String getDocto() {
        return docto;
    }

    public void setDocto(String docto) {
        this.docto = docto;
    }

    public String getEcfImpressora() {
        return ecfImpressora;
    }

    public void setEcfImpressora(String ecfImpressora) {
        this.ecfImpressora = ecfImpressora;
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
        if (!(object instanceof EcfImpressoraVO)) {
            return false;
        }
        EcfImpressoraVO other = (EcfImpressoraVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfImpressoraVO[ id=" + id + " ]";
    }
    
}
