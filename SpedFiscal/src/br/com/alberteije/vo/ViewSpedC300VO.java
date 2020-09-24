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
@Table(name = "view_sped_c300")
@NamedQueries({
    @NamedQuery(name = "ViewSpedC300VO.findAll", query = "SELECT v FROM ViewSpedC300VO v")})
public class ViewSpedC300VO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "SUBSERIE")
    private String subserie;
    @Column(name = "DATA_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOMA_TOTAL_NF")
    private Double somaTotalNf;
    @Column(name = "SOMA_PIS")
    private Double somaPis;
    @Column(name = "SOMA_COFINS")
    private Double somaCofins;

    public ViewSpedC300VO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getSomaTotalNf() {
        return somaTotalNf;
    }

    public void setSomaTotalNf(Double somaTotalNf) {
        this.somaTotalNf = somaTotalNf;
    }

    public Double getSomaPis() {
        return somaPis;
    }

    public void setSomaPis(Double somaPis) {
        this.somaPis = somaPis;
    }

    public Double getSomaCofins() {
        return somaCofins;
    }

    public void setSomaCofins(Double somaCofins) {
        this.somaCofins = somaCofins;
    }
    
}
