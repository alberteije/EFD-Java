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
@Table(name = "nfe_transporte")
@NamedQueries({
    @NamedQuery(name = "NfeTransporteVO.findAll", query = "SELECT n FROM NfeTransporteVO n")})
public class NfeTransporteVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MODALIDADE_FRETE")
    private String modalidadeFrete;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "INSCRICAO_ESTADUAL")
    private String inscricaoEstadual;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "NOME_MUNICIPIO")
    private String nomeMunicipio;
    @Column(name = "UF")
    private String uf;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_SERVICO")
    private Double valorServico;
    @Column(name = "VALOR_BC_RETENCAO_ICMS")
    private Double valorBcRetencaoIcms;
    @Column(name = "ALIQUOTA_RETENCAO_ICMS")
    private Double aliquotaRetencaoIcms;
    @Column(name = "VALOR_ICMS_RETIDO")
    private Double valorIcmsRetido;
    @Column(name = "CFOP")
    private Integer cfop;
    @Column(name = "MUNICIPIO")
    private Integer municipio;
    @Column(name = "PLACA_VEICULO")
    private String placaVeiculo;
    @Column(name = "UF_VEICULO")
    private String ufVeiculo;
    @Column(name = "RNTC_VEICULO")
    private String rntcVeiculo;
    @Column(name = "VAGAO")
    private String vagao;
    @Column(name = "BALSA")
    private String balsa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeTransporte")
    private List<NfeTransporteVolumeVO> nfeTransporteVolumeVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNfeTransporte")
    private List<NfeTransporteReboqueVO> nfeTransporteReboqueVOList;
    @JoinColumn(name = "ID_TRANSPORTADORA", referencedColumnName = "ID")
    @ManyToOne
    private TransportadoraVO idTransportadora;
    @JoinColumn(name = "ID_NFE_CABECALHO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeCabecalhoVO idNfeCabecalho;

    public NfeTransporteVO() {
    }

    public NfeTransporteVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModalidadeFrete() {
        return modalidadeFrete;
    }

    public void setModalidadeFrete(String modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getValorBcRetencaoIcms() {
        return valorBcRetencaoIcms;
    }

    public void setValorBcRetencaoIcms(Double valorBcRetencaoIcms) {
        this.valorBcRetencaoIcms = valorBcRetencaoIcms;
    }

    public Double getAliquotaRetencaoIcms() {
        return aliquotaRetencaoIcms;
    }

    public void setAliquotaRetencaoIcms(Double aliquotaRetencaoIcms) {
        this.aliquotaRetencaoIcms = aliquotaRetencaoIcms;
    }

    public Double getValorIcmsRetido() {
        return valorIcmsRetido;
    }

    public void setValorIcmsRetido(Double valorIcmsRetido) {
        this.valorIcmsRetido = valorIcmsRetido;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getUfVeiculo() {
        return ufVeiculo;
    }

    public void setUfVeiculo(String ufVeiculo) {
        this.ufVeiculo = ufVeiculo;
    }

    public String getRntcVeiculo() {
        return rntcVeiculo;
    }

    public void setRntcVeiculo(String rntcVeiculo) {
        this.rntcVeiculo = rntcVeiculo;
    }

    public String getVagao() {
        return vagao;
    }

    public void setVagao(String vagao) {
        this.vagao = vagao;
    }

    public String getBalsa() {
        return balsa;
    }

    public void setBalsa(String balsa) {
        this.balsa = balsa;
    }

    public List<NfeTransporteVolumeVO> getNfeTransporteVolumeVOList() {
        return nfeTransporteVolumeVOList;
    }

    public void setNfeTransporteVolumeVOList(List<NfeTransporteVolumeVO> nfeTransporteVolumeVOList) {
        this.nfeTransporteVolumeVOList = nfeTransporteVolumeVOList;
    }

    public List<NfeTransporteReboqueVO> getNfeTransporteReboqueVOList() {
        return nfeTransporteReboqueVOList;
    }

    public void setNfeTransporteReboqueVOList(List<NfeTransporteReboqueVO> nfeTransporteReboqueVOList) {
        this.nfeTransporteReboqueVOList = nfeTransporteReboqueVOList;
    }

    public TransportadoraVO getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(TransportadoraVO idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public NfeCabecalhoVO getIdNfeCabecalho() {
        return idNfeCabecalho;
    }

    public void setIdNfeCabecalho(NfeCabecalhoVO idNfeCabecalho) {
        this.idNfeCabecalho = idNfeCabecalho;
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
        if (!(object instanceof NfeTransporteVO)) {
            return false;
        }
        NfeTransporteVO other = (NfeTransporteVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeTransporteVO[ id=" + id + " ]";
    }
    
}
