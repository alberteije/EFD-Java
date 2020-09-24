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
@Table(name = "ecf_resolucao")
@NamedQueries({
    @NamedQuery(name = "EcfResolucaoVO.findAll", query = "SELECT e FROM EcfResolucaoVO e")})
public class EcfResolucaoVO implements Serializable {
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
    @Column(name = "RESOLUCAO_TELA")
    private String resolucaoTela;
    @Column(name = "LARGURA")
    private Integer largura;
    @Column(name = "ALTURA")
    private Integer altura;
    @Column(name = "IMAGEM_TELA")
    private String imagemTela;
    @Column(name = "IMAGEM_MENU")
    private String imagemMenu;
    @Column(name = "IMAGEM_SUBMENU")
    private String imagemSubmenu;
    @Column(name = "HOTTRACK_COLOR")
    private String hottrackColor;
    @Column(name = "ITEM_STYLE_FONT_NAME")
    private String itemStyleFontName;
    @Column(name = "ITEM_STYLE_FONT_COLOR")
    private String itemStyleFontColor;
    @Column(name = "ITEM_SEL_STYLE_COLOR")
    private String itemSelStyleColor;
    @Column(name = "LABEL_TOTAL_GERAL_FONT_COLOR")
    private String labelTotalGeralFontColor;
    @Column(name = "ITEM_STYLE_FONT_STYLE")
    private String itemStyleFontStyle;
    @Column(name = "EDITS_COLOR")
    private String editsColor;
    @Column(name = "EDITS_FONT_COLOR")
    private String editsFontColor;
    @Column(name = "EDITS_DISABLED_COLOR")
    private String editsDisabledColor;
    @Column(name = "EDITS_FONT_NAME")
    private String editsFontName;
    @Column(name = "EDITS_FONT_STYLE")
    private String editsFontStyle;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfResolucaoVO() {
    }

    public EcfResolucaoVO(Integer id) {
        this.id = id;
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

    public String getResolucaoTela() {
        return resolucaoTela;
    }

    public void setResolucaoTela(String resolucaoTela) {
        this.resolucaoTela = resolucaoTela;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getImagemTela() {
        return imagemTela;
    }

    public void setImagemTela(String imagemTela) {
        this.imagemTela = imagemTela;
    }

    public String getImagemMenu() {
        return imagemMenu;
    }

    public void setImagemMenu(String imagemMenu) {
        this.imagemMenu = imagemMenu;
    }

    public String getImagemSubmenu() {
        return imagemSubmenu;
    }

    public void setImagemSubmenu(String imagemSubmenu) {
        this.imagemSubmenu = imagemSubmenu;
    }

    public String getHottrackColor() {
        return hottrackColor;
    }

    public void setHottrackColor(String hottrackColor) {
        this.hottrackColor = hottrackColor;
    }

    public String getItemStyleFontName() {
        return itemStyleFontName;
    }

    public void setItemStyleFontName(String itemStyleFontName) {
        this.itemStyleFontName = itemStyleFontName;
    }

    public String getItemStyleFontColor() {
        return itemStyleFontColor;
    }

    public void setItemStyleFontColor(String itemStyleFontColor) {
        this.itemStyleFontColor = itemStyleFontColor;
    }

    public String getItemSelStyleColor() {
        return itemSelStyleColor;
    }

    public void setItemSelStyleColor(String itemSelStyleColor) {
        this.itemSelStyleColor = itemSelStyleColor;
    }

    public String getLabelTotalGeralFontColor() {
        return labelTotalGeralFontColor;
    }

    public void setLabelTotalGeralFontColor(String labelTotalGeralFontColor) {
        this.labelTotalGeralFontColor = labelTotalGeralFontColor;
    }

    public String getItemStyleFontStyle() {
        return itemStyleFontStyle;
    }

    public void setItemStyleFontStyle(String itemStyleFontStyle) {
        this.itemStyleFontStyle = itemStyleFontStyle;
    }

    public String getEditsColor() {
        return editsColor;
    }

    public void setEditsColor(String editsColor) {
        this.editsColor = editsColor;
    }

    public String getEditsFontColor() {
        return editsFontColor;
    }

    public void setEditsFontColor(String editsFontColor) {
        this.editsFontColor = editsFontColor;
    }

    public String getEditsDisabledColor() {
        return editsDisabledColor;
    }

    public void setEditsDisabledColor(String editsDisabledColor) {
        this.editsDisabledColor = editsDisabledColor;
    }

    public String getEditsFontName() {
        return editsFontName;
    }

    public void setEditsFontName(String editsFontName) {
        this.editsFontName = editsFontName;
    }

    public String getEditsFontStyle() {
        return editsFontStyle;
    }

    public void setEditsFontStyle(String editsFontStyle) {
        this.editsFontStyle = editsFontStyle;
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
        if (!(object instanceof EcfResolucaoVO)) {
            return false;
        }
        EcfResolucaoVO other = (EcfResolucaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfResolucaoVO[ id=" + id + " ]";
    }
    
}
