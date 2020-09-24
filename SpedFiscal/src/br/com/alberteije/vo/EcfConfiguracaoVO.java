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
@Table(name = "ecf_configuracao")
@NamedQueries({
    @NamedQuery(name = "EcfConfiguracaoVO.findAll", query = "SELECT e FROM EcfConfiguracaoVO e")})
public class EcfConfiguracaoVO implements Serializable {
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
    @Column(name = "ID_ECF_IMPRESSORA")
    private Integer idEcfImpressora;
    @Column(name = "ID_ECF_RESOLUCAO")
    private Integer idEcfResolucao;
    @Column(name = "ID_ECF_CAIXA")
    private Integer idEcfCaixa;
    @Column(name = "ID_ECF_EMPRESA")
    private Integer idEcfEmpresa;
    @Column(name = "MENSAGEM_CUPOM")
    private String mensagemCupom;
    @Column(name = "PORTA_ECF")
    private String portaEcf;
    @Column(name = "IP_SERVIDOR")
    private String ipServidor;
    @Column(name = "IP_SITEF")
    private String ipSitef;
    @Column(name = "TIPO_TEF")
    private String tipoTef;
    @Column(name = "TITULO_TELA_CAIXA")
    private String tituloTelaCaixa;
    @Column(name = "CAMINHO_IMAGENS_PRODUTOS")
    private String caminhoImagensProdutos;
    @Column(name = "CAMINHO_IMAGENS_MARKETING")
    private String caminhoImagensMarketing;
    @Column(name = "CAMINHO_IMAGENS_LAYOUT")
    private String caminhoImagensLayout;
    @Column(name = "COR_JANELAS_INTERNAS")
    private String corJanelasInternas;
    @Column(name = "MARKETING_ATIVO")
    private String marketingAtivo;
    @Column(name = "CFOP_ECF")
    private Integer cfopEcf;
    @Column(name = "CFOP_NF2")
    private Integer cfopNf2;
    @Column(name = "TIMEOUT_ECF")
    private Integer timeoutEcf;
    @Column(name = "INTERVALO_ECF")
    private Integer intervaloEcf;
    @Column(name = "DESCRICAO_SUPRIMENTO")
    private String descricaoSuprimento;
    @Column(name = "DESCRICAO_SANGRIA")
    private String descricaoSangria;
    @Column(name = "TEF_TIPO_GP")
    private Integer tefTipoGp;
    @Column(name = "TEF_TEMPO_ESPERA")
    private Integer tefTempoEspera;
    @Column(name = "TEF_ESPERA_STS")
    private Integer tefEsperaSts;
    @Column(name = "TEF_NUMERO_VIAS")
    private Integer tefNumeroVias;
    @Column(name = "DECIMAIS_QUANTIDADE")
    private Integer decimaisQuantidade;
    @Column(name = "DECIMAIS_VALOR")
    private Integer decimaisValor;
    @Column(name = "BITS_POR_SEGUNDO")
    private Integer bitsPorSegundo;
    @Column(name = "QTDE_MAXIMA_CARTOES")
    private Integer qtdeMaximaCartoes;
    @Column(name = "PESQUISA_PARTE")
    private String pesquisaParte;
    @Column(name = "CONFIGURACAO_BALANCA")
    private String configuracaoBalanca;
    @Column(name = "PARAMETROS_DIVERSOS")
    private String parametrosDiversos;
    @Column(name = "ULTIMA_EXCLUSAO")
    private Integer ultimaExclusao;
    @Column(name = "LAUDO")
    private String laudo;
    @Column(name = "INDICE_GERENCIAL")
    private String indiceGerencial;
    @Column(name = "DATA_ATUALIZACAO_ESTOQUE")
    @Temporal(TemporalType.DATE)
    private Date dataAtualizacaoEstoque;
    @Column(name = "DATA_SINCRONIZACAO")
    @Temporal(TemporalType.DATE)
    private Date dataSincronizacao;
    @Column(name = "HORA_SINCRONIZACAO")
    private String horaSincronizacao;

    public EcfConfiguracaoVO() {
    }

    public EcfConfiguracaoVO(Integer id) {
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

    public Integer getIdEcfImpressora() {
        return idEcfImpressora;
    }

    public void setIdEcfImpressora(Integer idEcfImpressora) {
        this.idEcfImpressora = idEcfImpressora;
    }

    public Integer getIdEcfResolucao() {
        return idEcfResolucao;
    }

    public void setIdEcfResolucao(Integer idEcfResolucao) {
        this.idEcfResolucao = idEcfResolucao;
    }

    public Integer getIdEcfCaixa() {
        return idEcfCaixa;
    }

    public void setIdEcfCaixa(Integer idEcfCaixa) {
        this.idEcfCaixa = idEcfCaixa;
    }

    public Integer getIdEcfEmpresa() {
        return idEcfEmpresa;
    }

    public void setIdEcfEmpresa(Integer idEcfEmpresa) {
        this.idEcfEmpresa = idEcfEmpresa;
    }

    public String getMensagemCupom() {
        return mensagemCupom;
    }

    public void setMensagemCupom(String mensagemCupom) {
        this.mensagemCupom = mensagemCupom;
    }

    public String getPortaEcf() {
        return portaEcf;
    }

    public void setPortaEcf(String portaEcf) {
        this.portaEcf = portaEcf;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

    public String getIpSitef() {
        return ipSitef;
    }

    public void setIpSitef(String ipSitef) {
        this.ipSitef = ipSitef;
    }

    public String getTipoTef() {
        return tipoTef;
    }

    public void setTipoTef(String tipoTef) {
        this.tipoTef = tipoTef;
    }

    public String getTituloTelaCaixa() {
        return tituloTelaCaixa;
    }

    public void setTituloTelaCaixa(String tituloTelaCaixa) {
        this.tituloTelaCaixa = tituloTelaCaixa;
    }

    public String getCaminhoImagensProdutos() {
        return caminhoImagensProdutos;
    }

    public void setCaminhoImagensProdutos(String caminhoImagensProdutos) {
        this.caminhoImagensProdutos = caminhoImagensProdutos;
    }

    public String getCaminhoImagensMarketing() {
        return caminhoImagensMarketing;
    }

    public void setCaminhoImagensMarketing(String caminhoImagensMarketing) {
        this.caminhoImagensMarketing = caminhoImagensMarketing;
    }

    public String getCaminhoImagensLayout() {
        return caminhoImagensLayout;
    }

    public void setCaminhoImagensLayout(String caminhoImagensLayout) {
        this.caminhoImagensLayout = caminhoImagensLayout;
    }

    public String getCorJanelasInternas() {
        return corJanelasInternas;
    }

    public void setCorJanelasInternas(String corJanelasInternas) {
        this.corJanelasInternas = corJanelasInternas;
    }

    public String getMarketingAtivo() {
        return marketingAtivo;
    }

    public void setMarketingAtivo(String marketingAtivo) {
        this.marketingAtivo = marketingAtivo;
    }

    public Integer getCfopEcf() {
        return cfopEcf;
    }

    public void setCfopEcf(Integer cfopEcf) {
        this.cfopEcf = cfopEcf;
    }

    public Integer getCfopNf2() {
        return cfopNf2;
    }

    public void setCfopNf2(Integer cfopNf2) {
        this.cfopNf2 = cfopNf2;
    }

    public Integer getTimeoutEcf() {
        return timeoutEcf;
    }

    public void setTimeoutEcf(Integer timeoutEcf) {
        this.timeoutEcf = timeoutEcf;
    }

    public Integer getIntervaloEcf() {
        return intervaloEcf;
    }

    public void setIntervaloEcf(Integer intervaloEcf) {
        this.intervaloEcf = intervaloEcf;
    }

    public String getDescricaoSuprimento() {
        return descricaoSuprimento;
    }

    public void setDescricaoSuprimento(String descricaoSuprimento) {
        this.descricaoSuprimento = descricaoSuprimento;
    }

    public String getDescricaoSangria() {
        return descricaoSangria;
    }

    public void setDescricaoSangria(String descricaoSangria) {
        this.descricaoSangria = descricaoSangria;
    }

    public Integer getTefTipoGp() {
        return tefTipoGp;
    }

    public void setTefTipoGp(Integer tefTipoGp) {
        this.tefTipoGp = tefTipoGp;
    }

    public Integer getTefTempoEspera() {
        return tefTempoEspera;
    }

    public void setTefTempoEspera(Integer tefTempoEspera) {
        this.tefTempoEspera = tefTempoEspera;
    }

    public Integer getTefEsperaSts() {
        return tefEsperaSts;
    }

    public void setTefEsperaSts(Integer tefEsperaSts) {
        this.tefEsperaSts = tefEsperaSts;
    }

    public Integer getTefNumeroVias() {
        return tefNumeroVias;
    }

    public void setTefNumeroVias(Integer tefNumeroVias) {
        this.tefNumeroVias = tefNumeroVias;
    }

    public Integer getDecimaisQuantidade() {
        return decimaisQuantidade;
    }

    public void setDecimaisQuantidade(Integer decimaisQuantidade) {
        this.decimaisQuantidade = decimaisQuantidade;
    }

    public Integer getDecimaisValor() {
        return decimaisValor;
    }

    public void setDecimaisValor(Integer decimaisValor) {
        this.decimaisValor = decimaisValor;
    }

    public Integer getBitsPorSegundo() {
        return bitsPorSegundo;
    }

    public void setBitsPorSegundo(Integer bitsPorSegundo) {
        this.bitsPorSegundo = bitsPorSegundo;
    }

    public Integer getQtdeMaximaCartoes() {
        return qtdeMaximaCartoes;
    }

    public void setQtdeMaximaCartoes(Integer qtdeMaximaCartoes) {
        this.qtdeMaximaCartoes = qtdeMaximaCartoes;
    }

    public String getPesquisaParte() {
        return pesquisaParte;
    }

    public void setPesquisaParte(String pesquisaParte) {
        this.pesquisaParte = pesquisaParte;
    }

    public String getConfiguracaoBalanca() {
        return configuracaoBalanca;
    }

    public void setConfiguracaoBalanca(String configuracaoBalanca) {
        this.configuracaoBalanca = configuracaoBalanca;
    }

    public String getParametrosDiversos() {
        return parametrosDiversos;
    }

    public void setParametrosDiversos(String parametrosDiversos) {
        this.parametrosDiversos = parametrosDiversos;
    }

    public Integer getUltimaExclusao() {
        return ultimaExclusao;
    }

    public void setUltimaExclusao(Integer ultimaExclusao) {
        this.ultimaExclusao = ultimaExclusao;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getIndiceGerencial() {
        return indiceGerencial;
    }

    public void setIndiceGerencial(String indiceGerencial) {
        this.indiceGerencial = indiceGerencial;
    }

    public Date getDataAtualizacaoEstoque() {
        return dataAtualizacaoEstoque;
    }

    public void setDataAtualizacaoEstoque(Date dataAtualizacaoEstoque) {
        this.dataAtualizacaoEstoque = dataAtualizacaoEstoque;
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
        if (!(object instanceof EcfConfiguracaoVO)) {
            return false;
        }
        EcfConfiguracaoVO other = (EcfConfiguracaoVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.EcfConfiguracaoVO[ id=" + id + " ]";
    }
    
}
