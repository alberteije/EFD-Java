/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "view_sped_nfe_item")
@NamedQueries({
    @NamedQuery(name = "ViewSpedNfeItemVO.findAll", query = "SELECT v FROM ViewSpedNfeItemVO v")})
public class ViewSpedNfeItemVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "GTIN")
    private String gtin;
    @Basic(optional = false)
    @Column(name = "ID_UNIDADE_PRODUTO")
    private int idUnidadeProduto;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "TIPO_ITEM_SPED")
    private String tipoItemSped;
    @Column(name = "NCM")
    private String ncm;
    @Column(name = "EX_TIPI")
    private String exTipi;
    @Column(name = "CODIGO_LST")
    private String codigoLst;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQUOTA_ICMS_PAF")
    private Double aliquotaIcmsPaf;

    public ViewSpedNfeItemVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public int getIdUnidadeProduto() {
        return idUnidadeProduto;
    }

    public void setIdUnidadeProduto(int idUnidadeProduto) {
        this.idUnidadeProduto = idUnidadeProduto;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoItemSped() {
        return tipoItemSped;
    }

    public void setTipoItemSped(String tipoItemSped) {
        this.tipoItemSped = tipoItemSped;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getExTipi() {
        return exTipi;
    }

    public void setExTipi(String exTipi) {
        this.exTipi = exTipi;
    }

    public String getCodigoLst() {
        return codigoLst;
    }

    public void setCodigoLst(String codigoLst) {
        this.codigoLst = codigoLst;
    }

    public Double getAliquotaIcmsPaf() {
        return aliquotaIcmsPaf;
    }

    public void setAliquotaIcmsPaf(Double aliquotaIcmsPaf) {
        this.aliquotaIcmsPaf = aliquotaIcmsPaf;
    }
    
}
