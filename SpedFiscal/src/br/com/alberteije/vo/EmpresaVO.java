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
@Table(name = "empresa")
@NamedQueries({
    @NamedQuery(name = "EmpresaVO.findAll", query = "SELECT e FROM EmpresaVO e")})
public class EmpresaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "NOME_FANTASIA")
    private String nomeFantasia;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "INSCRICAO_ESTADUAL")
    private String inscricaoEstadual;
    @Column(name = "INSCRICAO_ESTADUAL_ST")
    private String inscricaoEstadualSt;
    @Column(name = "INSCRICAO_MUNICIPAL")
    private String inscricaoMunicipal;
    @Column(name = "INSCRICAO_JUNTA_COMERCIAL")
    private String inscricaoJuntaComercial;
    @Column(name = "DATA_INSC_JUNTA_COMERCIAL")
    @Temporal(TemporalType.DATE)
    private Date dataInscJuntaComercial;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(name = "DATA_INICIO_ATIVIDADES")
    @Temporal(TemporalType.DATE)
    private Date dataInicioAtividades;
    @Column(name = "SUFRAMA")
    private String suframa;
    @Column(name = "EMAIL")
    private String email;
    @Lob
    @Column(name = "IMAGEM_LOGOTIPO")
    private String imagemLogotipo;
    @Column(name = "CRT")
    private String crt;
    @Column(name = "TIPO_REGIME")
    private String tipoRegime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALIQUOTA_PIS")
    private Double aliquotaPis;
    @Column(name = "CONTATO")
    private String contato;
    @Column(name = "ALIQUOTA_COFINS")
    private Double aliquotaCofins;
    @Column(name = "CODIGO_IBGE_CIDADE")
    private Integer codigoIbgeCidade;
    @Column(name = "CODIGO_IBGE_UF")
    private Integer codigoIbgeUf;
    @Column(name = "CODIGO_TERCEIROS")
    private Integer codigoTerceiros;
    @Column(name = "CODIGO_GPS")
    private Integer codigoGps;
    @Column(name = "ALIQUOTA_SAT")
    private Double aliquotaSat;
    @Column(name = "CEI")
    private String cei;
    @Column(name = "CODIGO_CNAE_PRINCIPAL")
    private String codigoCnaePrincipal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<NfeNumeroVO> nfeNumeroVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaPessoaVO> empresaPessoaVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<FiscalApuracaoIcmsVO> fiscalApuracaoIcmsVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaProdutoVO> empresaProdutoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TributIcmsCustomCabVO> tributIcmsCustomCabVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<ConvenioVO> convenioVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<NfeConfiguracaoVO> nfeConfiguracaoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<CargoVO> cargoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<SetorVO> setorVOList;
    @OneToMany(mappedBy = "idEmpresa")
    private List<ContatoVO> contatoVOList;
    @OneToMany(mappedBy = "idEmpresa")
    private List<EnderecoVO> enderecoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaCnaeVO> empresaCnaeVOList;
    @OneToMany(mappedBy = "idEmpresa")
    private List<NfeCabecalhoVO> nfeCabecalhoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TributGrupoTributarioVO> tributGrupoTributarioVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<AlmoxarifadoVO> almoxarifadoVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<TributOperacaoFiscalVO> tributOperacaoFiscalVOList;
    @OneToMany(mappedBy = "idEmpresa")
    private List<EmpresaVO> empresaVOList;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne
    private EmpresaVO idEmpresa;
    @JoinColumn(name = "ID_CONTADOR", referencedColumnName = "ID")
    @ManyToOne
    private ContadorVO idContador;

    public EmpresaVO() {
    }

    public EmpresaVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoEstadualSt() {
        return inscricaoEstadualSt;
    }

    public void setInscricaoEstadualSt(String inscricaoEstadualSt) {
        this.inscricaoEstadualSt = inscricaoEstadualSt;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoJuntaComercial() {
        return inscricaoJuntaComercial;
    }

    public void setInscricaoJuntaComercial(String inscricaoJuntaComercial) {
        this.inscricaoJuntaComercial = inscricaoJuntaComercial;
    }

    public Date getDataInscJuntaComercial() {
        return dataInscJuntaComercial;
    }

    public void setDataInscJuntaComercial(Date dataInscJuntaComercial) {
        this.dataInscJuntaComercial = dataInscJuntaComercial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataInicioAtividades() {
        return dataInicioAtividades;
    }

    public void setDataInicioAtividades(Date dataInicioAtividades) {
        this.dataInicioAtividades = dataInicioAtividades;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagemLogotipo() {
        return imagemLogotipo;
    }

    public void setImagemLogotipo(String imagemLogotipo) {
        this.imagemLogotipo = imagemLogotipo;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public String getTipoRegime() {
        return tipoRegime;
    }

    public void setTipoRegime(String tipoRegime) {
        this.tipoRegime = tipoRegime;
    }

    public Double getAliquotaPis() {
        return aliquotaPis;
    }

    public void setAliquotaPis(Double aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Double getAliquotaCofins() {
        return aliquotaCofins;
    }

    public void setAliquotaCofins(Double aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public Integer getCodigoIbgeCidade() {
        return codigoIbgeCidade;
    }

    public void setCodigoIbgeCidade(Integer codigoIbgeCidade) {
        this.codigoIbgeCidade = codigoIbgeCidade;
    }

    public Integer getCodigoIbgeUf() {
        return codigoIbgeUf;
    }

    public void setCodigoIbgeUf(Integer codigoIbgeUf) {
        this.codigoIbgeUf = codigoIbgeUf;
    }

    public Integer getCodigoTerceiros() {
        return codigoTerceiros;
    }

    public void setCodigoTerceiros(Integer codigoTerceiros) {
        this.codigoTerceiros = codigoTerceiros;
    }

    public Integer getCodigoGps() {
        return codigoGps;
    }

    public void setCodigoGps(Integer codigoGps) {
        this.codigoGps = codigoGps;
    }

    public Double getAliquotaSat() {
        return aliquotaSat;
    }

    public void setAliquotaSat(Double aliquotaSat) {
        this.aliquotaSat = aliquotaSat;
    }

    public String getCei() {
        return cei;
    }

    public void setCei(String cei) {
        this.cei = cei;
    }

    public String getCodigoCnaePrincipal() {
        return codigoCnaePrincipal;
    }

    public void setCodigoCnaePrincipal(String codigoCnaePrincipal) {
        this.codigoCnaePrincipal = codigoCnaePrincipal;
    }

    public List<NfeNumeroVO> getNfeNumeroVOList() {
        return nfeNumeroVOList;
    }

    public void setNfeNumeroVOList(List<NfeNumeroVO> nfeNumeroVOList) {
        this.nfeNumeroVOList = nfeNumeroVOList;
    }

    public List<EmpresaPessoaVO> getEmpresaPessoaVOList() {
        return empresaPessoaVOList;
    }

    public void setEmpresaPessoaVOList(List<EmpresaPessoaVO> empresaPessoaVOList) {
        this.empresaPessoaVOList = empresaPessoaVOList;
    }

    public List<FiscalApuracaoIcmsVO> getFiscalApuracaoIcmsVOList() {
        return fiscalApuracaoIcmsVOList;
    }

    public void setFiscalApuracaoIcmsVOList(List<FiscalApuracaoIcmsVO> fiscalApuracaoIcmsVOList) {
        this.fiscalApuracaoIcmsVOList = fiscalApuracaoIcmsVOList;
    }

    public List<EmpresaProdutoVO> getEmpresaProdutoVOList() {
        return empresaProdutoVOList;
    }

    public void setEmpresaProdutoVOList(List<EmpresaProdutoVO> empresaProdutoVOList) {
        this.empresaProdutoVOList = empresaProdutoVOList;
    }

    public List<TributIcmsCustomCabVO> getTributIcmsCustomCabVOList() {
        return tributIcmsCustomCabVOList;
    }

    public void setTributIcmsCustomCabVOList(List<TributIcmsCustomCabVO> tributIcmsCustomCabVOList) {
        this.tributIcmsCustomCabVOList = tributIcmsCustomCabVOList;
    }

    public List<ConvenioVO> getConvenioVOList() {
        return convenioVOList;
    }

    public void setConvenioVOList(List<ConvenioVO> convenioVOList) {
        this.convenioVOList = convenioVOList;
    }

    public List<NfeConfiguracaoVO> getNfeConfiguracaoVOList() {
        return nfeConfiguracaoVOList;
    }

    public void setNfeConfiguracaoVOList(List<NfeConfiguracaoVO> nfeConfiguracaoVOList) {
        this.nfeConfiguracaoVOList = nfeConfiguracaoVOList;
    }

    public List<CargoVO> getCargoVOList() {
        return cargoVOList;
    }

    public void setCargoVOList(List<CargoVO> cargoVOList) {
        this.cargoVOList = cargoVOList;
    }

    public List<SetorVO> getSetorVOList() {
        return setorVOList;
    }

    public void setSetorVOList(List<SetorVO> setorVOList) {
        this.setorVOList = setorVOList;
    }

    public List<ContatoVO> getContatoVOList() {
        return contatoVOList;
    }

    public void setContatoVOList(List<ContatoVO> contatoVOList) {
        this.contatoVOList = contatoVOList;
    }

    public List<EnderecoVO> getEnderecoVOList() {
        return enderecoVOList;
    }

    public void setEnderecoVOList(List<EnderecoVO> enderecoVOList) {
        this.enderecoVOList = enderecoVOList;
    }

    public List<EmpresaCnaeVO> getEmpresaCnaeVOList() {
        return empresaCnaeVOList;
    }

    public void setEmpresaCnaeVOList(List<EmpresaCnaeVO> empresaCnaeVOList) {
        this.empresaCnaeVOList = empresaCnaeVOList;
    }

    public List<NfeCabecalhoVO> getNfeCabecalhoVOList() {
        return nfeCabecalhoVOList;
    }

    public void setNfeCabecalhoVOList(List<NfeCabecalhoVO> nfeCabecalhoVOList) {
        this.nfeCabecalhoVOList = nfeCabecalhoVOList;
    }

    public List<TributGrupoTributarioVO> getTributGrupoTributarioVOList() {
        return tributGrupoTributarioVOList;
    }

    public void setTributGrupoTributarioVOList(List<TributGrupoTributarioVO> tributGrupoTributarioVOList) {
        this.tributGrupoTributarioVOList = tributGrupoTributarioVOList;
    }

    public List<AlmoxarifadoVO> getAlmoxarifadoVOList() {
        return almoxarifadoVOList;
    }

    public void setAlmoxarifadoVOList(List<AlmoxarifadoVO> almoxarifadoVOList) {
        this.almoxarifadoVOList = almoxarifadoVOList;
    }

    public List<TributOperacaoFiscalVO> getTributOperacaoFiscalVOList() {
        return tributOperacaoFiscalVOList;
    }

    public void setTributOperacaoFiscalVOList(List<TributOperacaoFiscalVO> tributOperacaoFiscalVOList) {
        this.tributOperacaoFiscalVOList = tributOperacaoFiscalVOList;
    }

    public List<EmpresaVO> getEmpresaVOList() {
        return empresaVOList;
    }

    public void setEmpresaVOList(List<EmpresaVO> empresaVOList) {
        this.empresaVOList = empresaVOList;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public ContadorVO getIdContador() {
        return idContador;
    }

    public void setIdContador(ContadorVO idContador) {
        this.idContador = idContador;
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
        if (!(object instanceof EmpresaVO)) {
            return false;
        }
        EmpresaVO other = (EmpresaVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EmpresaVO[ id=" + id + " ]";
    }
    
}
