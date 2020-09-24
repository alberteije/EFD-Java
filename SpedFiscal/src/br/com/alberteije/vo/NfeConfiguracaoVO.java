/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "nfe_configuracao")
@NamedQueries({
    @NamedQuery(name = "NfeConfiguracaoVO.findAll", query = "SELECT n FROM NfeConfiguracaoVO n")})
public class NfeConfiguracaoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CERTIFICADO_DIGITAL_SERIE")
    private String certificadoDigitalSerie;
    @Column(name = "CERTIFICADO_DIGITAL_CAMINHO")
    private String certificadoDigitalCaminho;
    @Column(name = "CERTIFICADO_DIGITAL_SENHA")
    private String certificadoDigitalSenha;
    @Column(name = "TIPO_EMISSAO")
    private String tipoEmissao;
    @Column(name = "FORMATO_IMPRESSAO_DANFE")
    private String formatoImpressaoDanfe;
    @Column(name = "PROCESSO_EMISSAO")
    private String processoEmissao;
    @Column(name = "VERSAO_PROCESSO_EMISSAO")
    private String versaoProcessoEmissao;
    @Column(name = "CAMINHO_LOGOMARCA")
    private String caminhoLogomarca;
    @Column(name = "SALVAR_XML")
    private String salvarXml;
    @Column(name = "CAMINHO_SALVAR_XML")
    private String caminhoSalvarXml;
    @Column(name = "CAMINHO_SCHEMAS")
    private String caminhoSchemas;
    @Column(name = "CAMINHO_ARQUIVO_DANFE")
    private String caminhoArquivoDanfe;
    @Column(name = "CAMINHO_SALVAR_PDF")
    private String caminhoSalvarPdf;
    @Column(name = "WEBSERVICE_UF")
    private String webserviceUf;
    @Column(name = "WEBSERVICE_AMBIENTE")
    private String webserviceAmbiente;
    @Column(name = "WEBSERVICE_PROXY_HOST")
    private String webserviceProxyHost;
    @Column(name = "WEBSERVICE_PROXY_PORTA")
    private Integer webserviceProxyPorta;
    @Column(name = "WEBSERVICE_PROXY_USUARIO")
    private String webserviceProxyUsuario;
    @Column(name = "WEBSERVICE_PROXY_SENHA")
    private String webserviceProxySenha;
    @Column(name = "WEBSERVICE_VISUALIZAR")
    private String webserviceVisualizar;
    @Column(name = "EMAIL_SERVIDOR_SMTP")
    private String emailServidorSmtp;
    @Column(name = "EMAIL_PORTA")
    private Integer emailPorta;
    @Column(name = "EMAIL_USUARIO")
    private String emailUsuario;
    @Column(name = "EMAIL_SENHA")
    private String emailSenha;
    @Column(name = "EMAIL_ASSUNTO")
    private String emailAssunto;
    @Column(name = "EMAIL_AUTENTICA_SSL")
    private String emailAutenticaSsl;
    @Lob
    @Column(name = "EMAIL_TEXTO")
    private String emailTexto;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO idEmpresa;

    public NfeConfiguracaoVO() {
    }

    public NfeConfiguracaoVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificadoDigitalSerie() {
        return certificadoDigitalSerie;
    }

    public void setCertificadoDigitalSerie(String certificadoDigitalSerie) {
        this.certificadoDigitalSerie = certificadoDigitalSerie;
    }

    public String getCertificadoDigitalCaminho() {
        return certificadoDigitalCaminho;
    }

    public void setCertificadoDigitalCaminho(String certificadoDigitalCaminho) {
        this.certificadoDigitalCaminho = certificadoDigitalCaminho;
    }

    public String getCertificadoDigitalSenha() {
        return certificadoDigitalSenha;
    }

    public void setCertificadoDigitalSenha(String certificadoDigitalSenha) {
        this.certificadoDigitalSenha = certificadoDigitalSenha;
    }

    public String getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(String tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public String getFormatoImpressaoDanfe() {
        return formatoImpressaoDanfe;
    }

    public void setFormatoImpressaoDanfe(String formatoImpressaoDanfe) {
        this.formatoImpressaoDanfe = formatoImpressaoDanfe;
    }

    public String getProcessoEmissao() {
        return processoEmissao;
    }

    public void setProcessoEmissao(String processoEmissao) {
        this.processoEmissao = processoEmissao;
    }

    public String getVersaoProcessoEmissao() {
        return versaoProcessoEmissao;
    }

    public void setVersaoProcessoEmissao(String versaoProcessoEmissao) {
        this.versaoProcessoEmissao = versaoProcessoEmissao;
    }

    public String getCaminhoLogomarca() {
        return caminhoLogomarca;
    }

    public void setCaminhoLogomarca(String caminhoLogomarca) {
        this.caminhoLogomarca = caminhoLogomarca;
    }

    public String getSalvarXml() {
        return salvarXml;
    }

    public void setSalvarXml(String salvarXml) {
        this.salvarXml = salvarXml;
    }

    public String getCaminhoSalvarXml() {
        return caminhoSalvarXml;
    }

    public void setCaminhoSalvarXml(String caminhoSalvarXml) {
        this.caminhoSalvarXml = caminhoSalvarXml;
    }

    public String getCaminhoSchemas() {
        return caminhoSchemas;
    }

    public void setCaminhoSchemas(String caminhoSchemas) {
        this.caminhoSchemas = caminhoSchemas;
    }

    public String getCaminhoArquivoDanfe() {
        return caminhoArquivoDanfe;
    }

    public void setCaminhoArquivoDanfe(String caminhoArquivoDanfe) {
        this.caminhoArquivoDanfe = caminhoArquivoDanfe;
    }

    public String getCaminhoSalvarPdf() {
        return caminhoSalvarPdf;
    }

    public void setCaminhoSalvarPdf(String caminhoSalvarPdf) {
        this.caminhoSalvarPdf = caminhoSalvarPdf;
    }

    public String getWebserviceUf() {
        return webserviceUf;
    }

    public void setWebserviceUf(String webserviceUf) {
        this.webserviceUf = webserviceUf;
    }

    public String getWebserviceAmbiente() {
        return webserviceAmbiente;
    }

    public void setWebserviceAmbiente(String webserviceAmbiente) {
        this.webserviceAmbiente = webserviceAmbiente;
    }

    public String getWebserviceProxyHost() {
        return webserviceProxyHost;
    }

    public void setWebserviceProxyHost(String webserviceProxyHost) {
        this.webserviceProxyHost = webserviceProxyHost;
    }

    public Integer getWebserviceProxyPorta() {
        return webserviceProxyPorta;
    }

    public void setWebserviceProxyPorta(Integer webserviceProxyPorta) {
        this.webserviceProxyPorta = webserviceProxyPorta;
    }

    public String getWebserviceProxyUsuario() {
        return webserviceProxyUsuario;
    }

    public void setWebserviceProxyUsuario(String webserviceProxyUsuario) {
        this.webserviceProxyUsuario = webserviceProxyUsuario;
    }

    public String getWebserviceProxySenha() {
        return webserviceProxySenha;
    }

    public void setWebserviceProxySenha(String webserviceProxySenha) {
        this.webserviceProxySenha = webserviceProxySenha;
    }

    public String getWebserviceVisualizar() {
        return webserviceVisualizar;
    }

    public void setWebserviceVisualizar(String webserviceVisualizar) {
        this.webserviceVisualizar = webserviceVisualizar;
    }

    public String getEmailServidorSmtp() {
        return emailServidorSmtp;
    }

    public void setEmailServidorSmtp(String emailServidorSmtp) {
        this.emailServidorSmtp = emailServidorSmtp;
    }

    public Integer getEmailPorta() {
        return emailPorta;
    }

    public void setEmailPorta(Integer emailPorta) {
        this.emailPorta = emailPorta;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEmailSenha() {
        return emailSenha;
    }

    public void setEmailSenha(String emailSenha) {
        this.emailSenha = emailSenha;
    }

    public String getEmailAssunto() {
        return emailAssunto;
    }

    public void setEmailAssunto(String emailAssunto) {
        this.emailAssunto = emailAssunto;
    }

    public String getEmailAutenticaSsl() {
        return emailAutenticaSsl;
    }

    public void setEmailAutenticaSsl(String emailAutenticaSsl) {
        this.emailAutenticaSsl = emailAutenticaSsl;
    }

    public String getEmailTexto() {
        return emailTexto;
    }

    public void setEmailTexto(String emailTexto) {
        this.emailTexto = emailTexto;
    }

    public EmpresaVO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaVO idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof NfeConfiguracaoVO)) {
            return false;
        }
        NfeConfiguracaoVO other = (NfeConfiguracaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.NfeConfiguracaoVO[ id=" + id + " ]";
    }
    
}
