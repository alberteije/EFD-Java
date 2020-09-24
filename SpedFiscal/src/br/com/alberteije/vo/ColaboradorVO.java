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
@Table(name = "colaborador")
@NamedQueries({
    @NamedQuery(name = "ColaboradorVO.findAll", query = "SELECT c FROM ColaboradorVO c")})
public class ColaboradorVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MATRICULA")
    private String matricula;
    @Lob
    @Column(name = "FOTO_34")
    private String foto34;
    @Column(name = "DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(name = "DATA_ADMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    @Column(name = "VENCIMENTO_FERIAS")
    @Temporal(TemporalType.DATE)
    private Date vencimentoFerias;
    @Column(name = "DATA_TRANSFERENCIA")
    @Temporal(TemporalType.DATE)
    private Date dataTransferencia;
    @Column(name = "FGTS_OPTANTE")
    private String fgtsOptante;
    @Column(name = "FGTS_DATA_OPCAO")
    @Temporal(TemporalType.DATE)
    private Date fgtsDataOpcao;
    @Column(name = "FGTS_CONTA")
    private Integer fgtsConta;
    @Column(name = "PAGAMENTO_FORMA")
    private String pagamentoForma;
    @Column(name = "PAGAMENTO_BANCO")
    private String pagamentoBanco;
    @Column(name = "PAGAMENTO_AGENCIA")
    private String pagamentoAgencia;
    @Column(name = "PAGAMENTO_AGENCIA_DIGITO")
    private String pagamentoAgenciaDigito;
    @Column(name = "PAGAMENTO_CONTA")
    private String pagamentoConta;
    @Column(name = "PAGAMENTO_CONTA_DIGITO")
    private String pagamentoContaDigito;
    @Column(name = "EXAME_MEDICO_ULTIMO")
    @Temporal(TemporalType.DATE)
    private Date exameMedicoUltimo;
    @Column(name = "EXAME_MEDICO_VENCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date exameMedicoVencimento;
    @Column(name = "PIS_DATA_CADASTRO")
    @Temporal(TemporalType.DATE)
    private Date pisDataCadastro;
    @Column(name = "PIS_NUMERO")
    private String pisNumero;
    @Column(name = "PIS_BANCO")
    private String pisBanco;
    @Column(name = "PIS_AGENCIA")
    private String pisAgencia;
    @Column(name = "PIS_AGENCIA_DIGITO")
    private String pisAgenciaDigito;
    @Column(name = "CTPS_NUMERO")
    private String ctpsNumero;
    @Column(name = "CTPS_SERIE")
    private String ctpsSerie;
    @Column(name = "CTPS_DATA_EXPEDICAO")
    @Temporal(TemporalType.DATE)
    private Date ctpsDataExpedicao;
    @Column(name = "CTPS_UF")
    private String ctpsUf;
    @Column(name = "DESCONTO_PLANO_SAUDE")
    private String descontoPlanoSaude;
    @Column(name = "SAI_NA_RAIS")
    private String saiNaRais;
    @Column(name = "CATEGORIA_SEFIP")
    private String categoriaSefip;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "OCORRENCIA_SEFIP")
    private Integer ocorrenciaSefip;
    @Column(name = "CODIGO_ADMISSAO_CAGED")
    private Integer codigoAdmissaoCaged;
    @Column(name = "CODIGO_DEMISSAO_CAGED")
    private Integer codigoDemissaoCaged;
    @Column(name = "CODIGO_DEMISSAO_SEFIP")
    private Integer codigoDemissaoSefip;
    @Column(name = "DATA_DEMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dataDemissao;
    @Column(name = "CODIGO_TURMA_PONTO")
    private String codigoTurmaPonto;
    @JoinColumn(name = "ID_TIPO_ADMISSAO", referencedColumnName = "ID")
    @ManyToOne
    private TipoAdmissaoVO idTipoAdmissao;
    @JoinColumn(name = "ID_SITUACAO_COLABORADOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private SituacaoColaboradorVO idSituacaoColaborador;
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaVO idPessoa;
    @JoinColumn(name = "ID_NIVEL_FORMACAO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NivelFormacaoVO idNivelFormacao;
    @JoinColumn(name = "ID_TIPO_COLABORADOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoColaboradorVO idTipoColaborador;
    @JoinColumn(name = "ID_CARGO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private CargoVO idCargo;
    @JoinColumn(name = "ID_SETOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private SetorVO idSetor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idColaborador")
    private List<ColaboradorRelacionamentoVO> colaboradorRelacionamentoVOList;
    @OneToMany(mappedBy = "idColaborador")
    private List<VendedorVO> vendedorVOList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idColaborador")
    private List<UsuarioVO> usuarioVOList;

    public ColaboradorVO() {
    }

    public ColaboradorVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFoto34() {
        return foto34;
    }

    public void setFoto34(String foto34) {
        this.foto34 = foto34;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getVencimentoFerias() {
        return vencimentoFerias;
    }

    public void setVencimentoFerias(Date vencimentoFerias) {
        this.vencimentoFerias = vencimentoFerias;
    }

    public Date getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Date dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public String getFgtsOptante() {
        return fgtsOptante;
    }

    public void setFgtsOptante(String fgtsOptante) {
        this.fgtsOptante = fgtsOptante;
    }

    public Date getFgtsDataOpcao() {
        return fgtsDataOpcao;
    }

    public void setFgtsDataOpcao(Date fgtsDataOpcao) {
        this.fgtsDataOpcao = fgtsDataOpcao;
    }

    public Integer getFgtsConta() {
        return fgtsConta;
    }

    public void setFgtsConta(Integer fgtsConta) {
        this.fgtsConta = fgtsConta;
    }

    public String getPagamentoForma() {
        return pagamentoForma;
    }

    public void setPagamentoForma(String pagamentoForma) {
        this.pagamentoForma = pagamentoForma;
    }

    public String getPagamentoBanco() {
        return pagamentoBanco;
    }

    public void setPagamentoBanco(String pagamentoBanco) {
        this.pagamentoBanco = pagamentoBanco;
    }

    public String getPagamentoAgencia() {
        return pagamentoAgencia;
    }

    public void setPagamentoAgencia(String pagamentoAgencia) {
        this.pagamentoAgencia = pagamentoAgencia;
    }

    public String getPagamentoAgenciaDigito() {
        return pagamentoAgenciaDigito;
    }

    public void setPagamentoAgenciaDigito(String pagamentoAgenciaDigito) {
        this.pagamentoAgenciaDigito = pagamentoAgenciaDigito;
    }

    public String getPagamentoConta() {
        return pagamentoConta;
    }

    public void setPagamentoConta(String pagamentoConta) {
        this.pagamentoConta = pagamentoConta;
    }

    public String getPagamentoContaDigito() {
        return pagamentoContaDigito;
    }

    public void setPagamentoContaDigito(String pagamentoContaDigito) {
        this.pagamentoContaDigito = pagamentoContaDigito;
    }

    public Date getExameMedicoUltimo() {
        return exameMedicoUltimo;
    }

    public void setExameMedicoUltimo(Date exameMedicoUltimo) {
        this.exameMedicoUltimo = exameMedicoUltimo;
    }

    public Date getExameMedicoVencimento() {
        return exameMedicoVencimento;
    }

    public void setExameMedicoVencimento(Date exameMedicoVencimento) {
        this.exameMedicoVencimento = exameMedicoVencimento;
    }

    public Date getPisDataCadastro() {
        return pisDataCadastro;
    }

    public void setPisDataCadastro(Date pisDataCadastro) {
        this.pisDataCadastro = pisDataCadastro;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisBanco() {
        return pisBanco;
    }

    public void setPisBanco(String pisBanco) {
        this.pisBanco = pisBanco;
    }

    public String getPisAgencia() {
        return pisAgencia;
    }

    public void setPisAgencia(String pisAgencia) {
        this.pisAgencia = pisAgencia;
    }

    public String getPisAgenciaDigito() {
        return pisAgenciaDigito;
    }

    public void setPisAgenciaDigito(String pisAgenciaDigito) {
        this.pisAgenciaDigito = pisAgenciaDigito;
    }

    public String getCtpsNumero() {
        return ctpsNumero;
    }

    public void setCtpsNumero(String ctpsNumero) {
        this.ctpsNumero = ctpsNumero;
    }

    public String getCtpsSerie() {
        return ctpsSerie;
    }

    public void setCtpsSerie(String ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }

    public Date getCtpsDataExpedicao() {
        return ctpsDataExpedicao;
    }

    public void setCtpsDataExpedicao(Date ctpsDataExpedicao) {
        this.ctpsDataExpedicao = ctpsDataExpedicao;
    }

    public String getCtpsUf() {
        return ctpsUf;
    }

    public void setCtpsUf(String ctpsUf) {
        this.ctpsUf = ctpsUf;
    }

    public String getDescontoPlanoSaude() {
        return descontoPlanoSaude;
    }

    public void setDescontoPlanoSaude(String descontoPlanoSaude) {
        this.descontoPlanoSaude = descontoPlanoSaude;
    }

    public String getSaiNaRais() {
        return saiNaRais;
    }

    public void setSaiNaRais(String saiNaRais) {
        this.saiNaRais = saiNaRais;
    }

    public String getCategoriaSefip() {
        return categoriaSefip;
    }

    public void setCategoriaSefip(String categoriaSefip) {
        this.categoriaSefip = categoriaSefip;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getOcorrenciaSefip() {
        return ocorrenciaSefip;
    }

    public void setOcorrenciaSefip(Integer ocorrenciaSefip) {
        this.ocorrenciaSefip = ocorrenciaSefip;
    }

    public Integer getCodigoAdmissaoCaged() {
        return codigoAdmissaoCaged;
    }

    public void setCodigoAdmissaoCaged(Integer codigoAdmissaoCaged) {
        this.codigoAdmissaoCaged = codigoAdmissaoCaged;
    }

    public Integer getCodigoDemissaoCaged() {
        return codigoDemissaoCaged;
    }

    public void setCodigoDemissaoCaged(Integer codigoDemissaoCaged) {
        this.codigoDemissaoCaged = codigoDemissaoCaged;
    }

    public Integer getCodigoDemissaoSefip() {
        return codigoDemissaoSefip;
    }

    public void setCodigoDemissaoSefip(Integer codigoDemissaoSefip) {
        this.codigoDemissaoSefip = codigoDemissaoSefip;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCodigoTurmaPonto() {
        return codigoTurmaPonto;
    }

    public void setCodigoTurmaPonto(String codigoTurmaPonto) {
        this.codigoTurmaPonto = codigoTurmaPonto;
    }

    public TipoAdmissaoVO getIdTipoAdmissao() {
        return idTipoAdmissao;
    }

    public void setIdTipoAdmissao(TipoAdmissaoVO idTipoAdmissao) {
        this.idTipoAdmissao = idTipoAdmissao;
    }

    public SituacaoColaboradorVO getIdSituacaoColaborador() {
        return idSituacaoColaborador;
    }

    public void setIdSituacaoColaborador(SituacaoColaboradorVO idSituacaoColaborador) {
        this.idSituacaoColaborador = idSituacaoColaborador;
    }

    public PessoaVO getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(PessoaVO idPessoa) {
        this.idPessoa = idPessoa;
    }

    public NivelFormacaoVO getIdNivelFormacao() {
        return idNivelFormacao;
    }

    public void setIdNivelFormacao(NivelFormacaoVO idNivelFormacao) {
        this.idNivelFormacao = idNivelFormacao;
    }

    public TipoColaboradorVO getIdTipoColaborador() {
        return idTipoColaborador;
    }

    public void setIdTipoColaborador(TipoColaboradorVO idTipoColaborador) {
        this.idTipoColaborador = idTipoColaborador;
    }

    public CargoVO getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(CargoVO idCargo) {
        this.idCargo = idCargo;
    }

    public SetorVO getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(SetorVO idSetor) {
        this.idSetor = idSetor;
    }

    public List<ColaboradorRelacionamentoVO> getColaboradorRelacionamentoVOList() {
        return colaboradorRelacionamentoVOList;
    }

    public void setColaboradorRelacionamentoVOList(List<ColaboradorRelacionamentoVO> colaboradorRelacionamentoVOList) {
        this.colaboradorRelacionamentoVOList = colaboradorRelacionamentoVOList;
    }

    public List<VendedorVO> getVendedorVOList() {
        return vendedorVOList;
    }

    public void setVendedorVOList(List<VendedorVO> vendedorVOList) {
        this.vendedorVOList = vendedorVOList;
    }

    public List<UsuarioVO> getUsuarioVOList() {
        return usuarioVOList;
    }

    public void setUsuarioVOList(List<UsuarioVO> usuarioVOList) {
        this.usuarioVOList = usuarioVOList;
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
        if (!(object instanceof ColaboradorVO)) {
            return false;
        }
        ColaboradorVO other = (ColaboradorVO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.ColaboradorVO[ id=" + id + " ]";
    }
    
}
