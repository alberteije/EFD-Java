/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do Sped Fiscal</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2013 Albert Eije</p>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * The author may be contacted at: alberteije@gmail.com</p>
 *
 * @author Albert Eije
 * @version 1.0
 */
package br.com.alberteije.controller;

import br.com.alberteije.bd.AcessoBanco;
import br.com.alberteije.plugins.sped.fiscal.bloco0.Registro0150;
import br.com.alberteije.plugins.sped.fiscal.bloco0.Registro0190;
import br.com.alberteije.plugins.sped.fiscal.bloco0.Registro0200;
import br.com.alberteije.plugins.sped.fiscal.bloco0.Registro0205;
import br.com.alberteije.plugins.sped.fiscal.bloco0.Registro0220;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC100;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC114;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC190;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC300;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC310;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC320;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC321;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC350;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC370;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC390;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC400;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC405;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC420;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC460;
import br.com.alberteije.plugins.sped.fiscal.blococ.RegistroC470;
import br.com.alberteije.plugins.sped.fiscal.blocoe.RegistroE100;
import br.com.alberteije.plugins.sped.fiscal.blocoe.RegistroE110;
import br.com.alberteije.spedfiscal.SpedFiscal;
import br.com.alberteije.vo.EcfImpressoraVO;
import br.com.alberteije.vo.EcfNotaFiscalCabecalhoVO;
import br.com.alberteije.vo.EcfR02VO;
import br.com.alberteije.vo.EcfR03VO;
import br.com.alberteije.vo.EcfVendaCabecalhoVO;
import br.com.alberteije.vo.EcfVendaDetalheVO;
import br.com.alberteije.vo.EmpresaVO;
import br.com.alberteije.vo.NfeCabecalhoVO;
import br.com.alberteije.vo.NfeCupomFiscalReferenciadoVO;
import br.com.alberteije.vo.ProdutoAlteracaoItemVO;
import br.com.alberteije.vo.UnidadeConversaoVO;
import br.com.alberteije.vo.UnidadeProdutoVO;
import br.com.alberteije.vo.ViewPessoaContadorVO;
import br.com.alberteije.vo.ViewSpedC190VO;
import br.com.alberteije.vo.ViewSpedC321VO;
import br.com.alberteije.vo.ViewSpedC370VO;
import br.com.alberteije.vo.ViewSpedC390VO;
import br.com.alberteije.vo.ViewSpedNfeDestinatarioVO;
import br.com.alberteije.vo.ViewSpedNfeEmitenteVO;
import br.com.alberteije.vo.ViewSpedNfeItemVO;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpedFiscalController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();
    // Variáveis utilizadas na geração do arquivo
    SpedFiscal spedFiscal;
    String strDataIni = "";
    String strDataFim = "";
    Integer idEmpresa = 1;
    Integer idContador = 1;
    Integer versaoLeiaute;
    Integer finalidadeArquivo;
    Integer perfilApresentacao;
    Date dataInicio;
    Date dataFim;

    // TODO: Leitor - Analise com calma todos os procedimentos de consulta e certifique-se
    // de que a informação esteja de acordo com o exigido pelo Sped
    // *** EXISTEM ERROS PROPOSITAIS PARA SEREM DESCOBERTOS E CORRIGIDOS *** //
    
//<editor-fold defaultstate="collapsed" desc="----- Consultas no Banco de Dados --">
    public List<ViewSpedC370VO> tabelaC370(String pDataInicio, String pDataFim) {
        try {
            List<ViewSpedC370VO> lista = new ArrayList<ViewSpedC370VO>();

            consultaSQL =
                    "SELECT * from VIEW_SPED_C370 where "
                    + " DATA_EMISSAO BETWEEN '" + pDataInicio + "' and '" + pDataFim + "'";

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedC370VO sped = new ViewSpedC370VO();
                sped.setId(rs.getInt("ID"));
                sped.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                sped.setIdProduto(rs.getInt("ID_PRODUTO"));
                sped.setItem(rs.getInt("ITEM"));
                sped.setIdUnidadeProduto(rs.getInt("ID_UNIDADE_PRODUTO"));
                sped.setQuantidade(rs.getDouble("QUANTIDADE"));
                sped.setValorTotal(rs.getDouble("VALOR_TOTAL"));
                sped.setCst(rs.getString("CST"));
                sped.setDesconto(rs.getDouble("DESCONTO"));

                lista.add(sped);
            }
            if (lista.size() > 0) {
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bd.desconectar();
        }
        return null;
    }

    public List<ViewSpedC390VO> tabelaC390(String pDataInicio, String pDataFim) {
        try {
            List<ViewSpedC390VO> lista = new ArrayList<ViewSpedC390VO>();

            consultaSQL =
                    "SELECT * from VIEW_SPED_C390 where "
                    + " DATA_EMISSAO BETWEEN '" + pDataInicio + "' and '" + pDataFim + "'";

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedC390VO sped = new ViewSpedC390VO();
                sped.setId(rs.getInt("ID"));
                sped.setCst(rs.getString("CST"));
                sped.setCfop(rs.getInt("CFOP"));
                sped.setTaxaIcms(rs.getDouble("TAXA_ICMS"));
                sped.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                sped.setSomaItem(rs.getDouble("SOMA_ITEM"));
                sped.setSomaBaseIcms(rs.getDouble("SOMA_BASE_ICMS"));
                sped.setSomaIcms(rs.getDouble("SOMA_ICMS"));
                sped.setSomaIcmsOutras(rs.getDouble("SOMA_ICMS_OUTRAS"));

                lista.add(sped);
            }
            if (lista.size() > 0) {
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bd.desconectar();
        }
        return null;
    }

    public List<ViewSpedC321VO> tabelaC321(String pDataInicio, String pDataFim) {
        try {
            List<ViewSpedC321VO> lista = new ArrayList<ViewSpedC321VO>();

            consultaSQL =
                    "SELECT * from VIEW_SPED_C321 where "
                    + " DATA_EMISSAO BETWEEN '" + pDataInicio + "' and '" + pDataFim + "'";

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedC321VO sped = new ViewSpedC321VO();
                sped.setId(rs.getInt("ID"));
                sped.setIdProduto(rs.getInt("ID_PRODUTO"));
                sped.setDescricaoUnidade(rs.getString("DESCRICAO_UNIDADE"));
                sped.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                sped.setSomaQuantidade(rs.getDouble("SOMA_QUANTIDADE"));
                sped.setSomaItem(rs.getDouble("SOMA_ITEM"));
                sped.setSomaDesconto(rs.getDouble("SOMA_DESCONTO"));
                sped.setSomaBaseIcms(rs.getDouble("SOMA_BASE_ICMS"));
                sped.setSomaIcms(rs.getDouble("SOMA_ICMS"));
                sped.setSomaPis(rs.getDouble("SOMA_PIS"));
                sped.setSomaCofins(rs.getDouble("SOMA_COFINS"));

                lista.add(sped);
            }
            if (lista.size() > 0) {
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bd.desconectar();
        }
        return null;
    }
    //</editor-fold>

//<editor-fold defaultstate="collapsed" desc="----- Gerar Arquivo Sped --">
    public void gerarArquivoSpedFiscal(Date pDataInicio, Date pDataFim, Integer pVersao, Integer pFinalidade, Integer pPerfil) {

        SimpleDateFormat formataData = null;
        formataData = new SimpleDateFormat("yyyy-MM-dd");
        this.strDataIni = formataData.format(pDataInicio);
        this.strDataFim = formataData.format(pDataFim);
        this.versaoLeiaute = pVersao;
        this.finalidadeArquivo = pFinalidade;
        this.perfilApresentacao = pPerfil;
        this.dataInicio = pDataInicio;
        this.dataFim = pDataFim;

        spedFiscal = new SpedFiscal();
        spedFiscal.getBloco0().getRegistro0000().setDtIni(pDataInicio);
        spedFiscal.getBloco0().getRegistro0000().setDtFin(pDataFim);

        gerarBloco0();
        gerarBlocoC();
        // BLOCO D: DOCUMENTOS FISCAIS II - SERVIÇOS (ICMS).
        // Bloco de registros dos dados relativos à emissão ou ao recebimento de documentos fiscais que acobertam as prestações de serviços de comunicação, transporte intermunicipal e interestadual.
        // Implementado a critério do Leitor
        gerarBlocoE();
        // BLOCO G – CONTROLE DO CRÉDITO DE ICMS DO ATIVO PERMANENTE CIAP
        // Implementado a critério do Leitor
        gerarBlocoH();
        // BLOCO 1: OUTRAS INFORMAÇÕES
        // Implementado a critério do Leitor

        try {
            spedFiscal.geraArquivoTxt(new File("SpedFiscal.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//<editor-fold defaultstate="collapsed" desc="----- BLOCO 0: ABERTURA, IDENTIFICAÇÃO E REFERÊNCIAS --">
    public void gerarBloco0() {
        EmpresaVO empresa = new EmpresaController().pegaEmpresa(idEmpresa);
        ViewPessoaContadorVO contador = new ContadorController().pegaContador(idContador);
        List<ViewSpedNfeEmitenteVO> listaEmitente = new EmitenteController().tabelaEmitente(strDataIni, strDataFim);
        List<ViewSpedNfeDestinatarioVO> listaDestinatario = new DestinatarioController().tabelaDestinatario(strDataIni, strDataFim);
        List<ViewSpedNfeItemVO> listaProduto = new ProdutoController().consultaProdutoSped(strDataIni, strDataFim);
        List<ProdutoAlteracaoItemVO> listaProdutoAlterado = new ProdutoController().consultaProdutoAlterado(strDataIni, strDataFim);


        // REGISTRO 0000: ABERTURA DO ARQUIVO DIGITAL E IDENTIFICAÇÃO DA ENTIDADE
        spedFiscal.getBloco0().getRegistro0000().setCodVer(this.versaoLeiaute.toString());
        spedFiscal.getBloco0().getRegistro0000().setCodFin(this.finalidadeArquivo.toString());
        spedFiscal.getBloco0().getRegistro0000().setIndPerfil(this.perfilApresentacao.toString());
        spedFiscal.getBloco0().getRegistro0000().setNome(empresa.getRazaoSocial());
        spedFiscal.getBloco0().getRegistro0000().setCnpj(empresa.getCnpj());
        spedFiscal.getBloco0().getRegistro0000().setCpf("");
        spedFiscal.getBloco0().getRegistro0000().setUf(empresa.getEnderecoVOList().get(0).getUf());
        spedFiscal.getBloco0().getRegistro0000().setIe(empresa.getInscricaoEstadual());
        spedFiscal.getBloco0().getRegistro0000().setCodMun(empresa.getCodigoIbgeCidade());
        spedFiscal.getBloco0().getRegistro0000().setIm(empresa.getInscricaoMunicipal());
        spedFiscal.getBloco0().getRegistro0000().setSuframa(empresa.getSuframa());
        spedFiscal.getBloco0().getRegistro0000().setIndAtiv("1");

        // REGISTRO 0001: ABERTURA DO BLOCO 0
        spedFiscal.getBloco0().getRegistro0001().setIndMov(0);

        // REGISTRO 0005: DADOS COMPLEMENTARES DA ENTIDADE
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setFantasia(empresa.getNomeFantasia());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setCep(empresa.getEnderecoVOList().get(0).getCep());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setEndereco(empresa.getEnderecoVOList().get(0).getLogradouro());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setNum(empresa.getEnderecoVOList().get(0).getNumero());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setCompl(empresa.getEnderecoVOList().get(0).getComplemento());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setBairro(empresa.getEnderecoVOList().get(0).getBairro());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setFone(empresa.getEnderecoVOList().get(0).getFone());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setFax(empresa.getEnderecoVOList().get(0).getFax());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0005().setEmail(empresa.getEmail());

        // REGISTRO 0015: DADOS DO CONTRIBUINTE SUBSTITUTO
        // Implementado a critério do Leitor

        // REGISTRO 0100: DADOS DO CONTABILISTA
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setNome(contador.getNome());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setCpf(contador.getCpfCnpj());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setCrc(contador.getInscricaoCrc());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setCep(contador.getCep());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setEndereco(contador.getLogradouro());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setNum(contador.getNumero());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setCompl(contador.getComplemento());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setBairro(contador.getBairro());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setFone(contador.getFone());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setFax(contador.getFax());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setEmail(contador.getEmail());
        spedFiscal.getBloco0().getRegistro0001().getRegistro0100().setCodMun(contador.getMunicipioIbge());

        // REGISTRO 0150: TABELA DE CADASTRO DO PARTICIPANTE
        if (listaEmitente != null) {
            for (int i = 0; i < listaEmitente.size(); i++) {
                Registro0150 registro0150 = new Registro0150();
                registro0150.setCodPart('C' + listaEmitente.get(i).getId().toString());
                registro0150.setNome(listaEmitente.get(i).getRazaoSocial());
                registro0150.setCodPais("01058");
                if (listaEmitente.get(i).getCpfCnpj().length() == 11) {
                    registro0150.setCpf(listaEmitente.get(i).getCpfCnpj());
                } else {
                    registro0150.setCnpj(listaEmitente.get(i).getCpfCnpj());
                }
                registro0150.setIe(listaEmitente.get(i).getInscricaoEstadual());
                registro0150.setCodMun(listaEmitente.get(i).getCodigoMunicipio());
                registro0150.setSuframa(listaEmitente.get(i).getSuframa());
                registro0150.setEndereco(listaEmitente.get(i).getLogradouro());
                registro0150.setNum(listaEmitente.get(i).getNumero());
                registro0150.setCompl(listaEmitente.get(i).getComplemento());
                registro0150.setBairro(listaEmitente.get(i).getBairro());

                spedFiscal.getBloco0().getRegistro0001().getRegistro0150List().add(registro0150);
            }
        }

        if (listaDestinatario != null) {
            for (int i = 0; i < listaDestinatario.size(); i++) {
                Registro0150 registro0150 = new Registro0150();
                registro0150.setCodPart('F' + listaDestinatario.get(i).getId().toString());
                registro0150.setNome(listaDestinatario.get(i).getRazaoSocial());
                registro0150.setCodPais("01058");
                if (listaDestinatario.get(i).getCpfCnpj().length() == 11) {
                    registro0150.setCpf(listaDestinatario.get(i).getCpfCnpj());
                } else {
                    registro0150.setCnpj(listaDestinatario.get(i).getCpfCnpj());
                }
                registro0150.setIe(listaDestinatario.get(i).getInscricaoEstadual());
                registro0150.setCodMun(listaDestinatario.get(i).getCodigoMunicipio());
                registro0150.setSuframa(listaDestinatario.get(i).getSuframa());
                registro0150.setEndereco(listaDestinatario.get(i).getLogradouro());
                registro0150.setNum(listaDestinatario.get(i).getNumero());
                registro0150.setCompl(listaDestinatario.get(i).getComplemento());
                registro0150.setBairro(listaDestinatario.get(i).getBairro());

                spedFiscal.getBloco0().getRegistro0001().getRegistro0150List().add(registro0150);
            }
        }

        // REGISTRO 0175: ALTERAÇÃO DA TABELA DE CADASTRO DE PARTICIPANTE
        // Implementado a critério do Leitor

        //REGISTRO 0200: TABELA DE IDENTIFICAÇÃO DO ITEM (PRODUTO E SERVIÇOS)
        List<UnidadeProdutoVO> listaUnidade = new ArrayList<UnidadeProdutoVO>();
        List<String> listaSiglaUnidade = new ArrayList<String>();
        if (listaProduto != null) {
            for (int i = 0; i < listaProduto.size(); i++) {
                Registro0200 registro0200 = new Registro0200();
                registro0200.setCodItem(String.valueOf(listaProduto.get(i).getId()));
                registro0200.setDescrItem(listaProduto.get(i).getNome());
                registro0200.setCodBarra(listaProduto.get(i).getGtin());
                registro0200.setCodAntItem("");
                registro0200.setUnidInv(String.valueOf(listaProduto.get(i).getIdUnidadeProduto()));
                registro0200.setTipoItem(listaProduto.get(i).getTipoItemSped());
                registro0200.setCodNcm(listaProduto.get(i).getNcm());
                registro0200.setExIpi(listaProduto.get(i).getExTipi());
                registro0200.setCodGen(listaProduto.get(i).getNcm().substring(0, 2));
                registro0200.setCodLst(listaProduto.get(i).getCodigoLst());
                registro0200.setAliqIcms(listaProduto.get(i).getAliquotaIcmsPaf());

                spedFiscal.getBloco0().getRegistro0001().getRegistro0200List().add(registro0200);

                if (listaSiglaUnidade.indexOf(String.valueOf(listaProduto.get(i).getIdUnidadeProduto())) == -1) {
                    listaSiglaUnidade.add(String.valueOf(listaProduto.get(i).getIdUnidadeProduto()));
                    UnidadeProdutoVO unidade = new UnidadeProdutoVO();

                    unidade.setId(listaProduto.get(i).getIdUnidadeProduto());
                    unidade.setSigla(listaProduto.get(i).getSigla());
                    listaUnidade.add(unidade);

                    // REGISTRO 0220: FATORES DE CONVERSÃO DE UNIDADES
                    UnidadeConversaoVO unidadeConversao = new UnidadeController().consultaUnidadeConversao(listaProduto.get(i).getId(), listaProduto.get(i).getIdUnidadeProduto());
                    if (unidadeConversao != null) {
                        Registro0220 registro0220 = new Registro0220();
                        registro0220.setUnidConv(String.valueOf(unidadeConversao.getIdUnidadeProduto()));
                        registro0220.setFatConv(unidadeConversao.getFatorConversao());

                        spedFiscal.getBloco0().getRegistro0001().getRegistro0200List().get(i).getRegistro0220List().add(registro0220);
                    }
                }

                // REGISTRO 0205: ALTERAÇÃO DO ITEM
                if (listaProdutoAlterado != null) {
                    for (int j = 0; j < listaProdutoAlterado.size(); j++) {
                        Registro0205 registro0205 = new Registro0205();
                        registro0205.setDescrAntItem(listaProdutoAlterado.get(j).getNome());
                        registro0205.setDtIni(listaProdutoAlterado.get(j).getDataInicial());
                        registro0205.setDtFin(listaProdutoAlterado.get(j).getDataFinal());
                        registro0205.setCodAntItem(listaProdutoAlterado.get(j).getCodigo());

                        spedFiscal.getBloco0().getRegistro0001().getRegistro0200List().get(j).getRegistro0205List().add(registro0205);
                    }
                }

            }
        }

        // REGISTRO 0190: IDENTIFICAÇÃO DAS UNIDADES DE MEDIDA
        if (listaUnidade != null) {
            for (int i = 0; i < listaUnidade.size(); i++) {
                Registro0190 registro0190 = new Registro0190();
                registro0190.setUnid(listaUnidade.get(i).getId().toString());
                registro0190.setDescr(listaUnidade.get(i).getSigla());

                spedFiscal.getBloco0().getRegistro0001().getRegistro0190List().add(registro0190);
            }
        }

        // REGISTRO 0206: CÓDIGO DE PRODUTO CONFORME TABELA PUBLICADA PELA ANP (COMBUSTÍVEIS)
        // Implementado a critério do Leitor

        // REGISTRO 0300: CADASTRO DE BENS OU COMPONENTES DO ATIVO IMOBILIZADO
        // REGISTRO 0305: INFORMAÇÃO SOBRE A UTILIZAÇÃO DO BEM
        // Implementado a critério do Leitor

        // REGISTRO 0400: TABELA DE NATUREZA DA OPERAÇÃO/PRESTAÇÃO
        // Implementado a critério do Leitor

        // REGISTRO 0450: TABELA DE INFORMAÇÃO COMPLEMENTAR DO DOCUMENTO FISCAL
        // Implementado a critério do Leitor

        // REGISTRO 0460: TABELA DE OBSERVAÇÕES DO LANÇAMENTO FISCAL
        // Implementado a critério do Leitor

        // REGISTRO 0500: PLANO DE CONTAS CONTÁBEIS
        // Implementado a critério do Leitor

        // REGISTRO 0600: CENTRO DE CUSTOS
        // Implementado a critério do Leitor    
    }
    //</editor-fold>

//<editor-fold defaultstate="collapsed" desc="----- BLOCO C: DOCUMENTOS FISCAIS I - MERCADORIAS (ICMS/IPI) --">
    public void gerarBlocoC() {

        // REGISTRO C001: ABERTURA DO BLOCO C
        spedFiscal.getBlocoC().getRegistroC001().setIndMov(0);

        List<EcfNotaFiscalCabecalhoVO> listaNf2Cabecalho = new NotaFiscalController().consultaNotaCabecalhoSped(strDataIni, strDataFim, "N");
        List<EcfNotaFiscalCabecalhoVO> listaNf2CabecalhoCanceladas = new NotaFiscalController().consultaNotaCabecalhoSped(strDataIni, strDataFim, "S");
        List<NfeCabecalhoVO> listaNfeCabecalho = new NotaFiscalController().consultaNfeCabecalhoSped(strDataIni, strDataFim);

        /////////////////
        /// Perfil A ////
        /////////////////
        if (perfilApresentacao == 0) {
            if (listaNfeCabecalho != null) {
                for (int i = 0; i < listaNfeCabecalho.size() - 1; i++) {
                    // REGISTRO C100: NOTA FISCAL (CÓDIGO 01), NOTA FISCAL AVULSA (CÓDIGO 1B), NOTA FISCAL DE PRODUTOR (CÓDIGO 04), NF-e (CÓDIGO 55) e NFC-e (CÓDIGO 65)
                    RegistroC100 registroC100 = new RegistroC100();
                    registroC100.setIndOper(listaNfeCabecalho.get(i).getIndicadorFormaPagamento());
                    registroC100.setIndEmit("0");
                    if (listaNfeCabecalho.get(i).getIdCliente() > 0) {
                        registroC100.setCodPart("C" + listaNfeCabecalho.get(i).getIdCliente());
                    } else {
                        registroC100.setCodPart("F" + listaNfeCabecalho.get(i).getIdFornecedor());
                    }
                    registroC100.setCodMod(listaNfeCabecalho.get(i).getCodigoModelo());
                    registroC100.setCodSit("");
                    registroC100.setSer(listaNfeCabecalho.get(i).getSerie());
                    registroC100.setNumDoc(listaNfeCabecalho.get(i).getNumero());
                    registroC100.setChvNfe(listaNfeCabecalho.get(i).getChaveAcesso());
                    registroC100.setDtDoc(listaNfeCabecalho.get(i).getDataEmissao());
                    registroC100.setDtES(listaNfeCabecalho.get(i).getDataEntradaSaida());
                    registroC100.setVlDoc(listaNfeCabecalho.get(i).getValorTotal());
                    registroC100.setIndPgto(listaNfeCabecalho.get(i).getIndicadorFormaPagamento());
                    registroC100.setVlDesc(listaNfeCabecalho.get(i).getValorDesconto());
                    registroC100.setVlAbatNt(0D);
                    registroC100.setVlMerc(listaNfeCabecalho.get(i).getValorTotalProdutos());
                    registroC100.setIndFrt("");
                    registroC100.setVlFrt(listaNfeCabecalho.get(i).getValorFrete());
                    registroC100.setVlSeg(listaNfeCabecalho.get(i).getValorSeguro());
                    registroC100.setVlOutDa(listaNfeCabecalho.get(i).getValorDespesasAcessorias());
                    registroC100.setVlBcIcms(listaNfeCabecalho.get(i).getBaseCalculoIcms());
                    registroC100.setVlIcms(listaNfeCabecalho.get(i).getValorIcms());
                    registroC100.setVlBcIcmsSt(listaNfeCabecalho.get(i).getBaseCalculoIcmsSt());
                    registroC100.setVlIcmsSt(listaNfeCabecalho.get(i).getValorIcmsSt());
                    registroC100.setVlIpi(listaNfeCabecalho.get(i).getValorIpi());
                    registroC100.setVlPis(listaNfeCabecalho.get(i).getValorPis());
                    registroC100.setVlCofins(listaNfeCabecalho.get(i).getValorCofins());
                    registroC100.setVlPisSt(0D);
                    registroC100.setVlCofinsSt(0D);

                    spedFiscal.getBlocoC().getRegistroC001().getRegistroC100List().add(registroC100);

                    // REGISTRO C105: OPERAÇÕES COM ICMS ST RECOLHIDO PARA UF DIVERSA DO DESTINATÁRIO DO DOCUMENTO FISCAL (CÓDIGO 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C110: INFORMAÇÃO COMPLEMENTAR DA NOTA FISCAL (CÓDIGO 01, 1B, 04 e 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C111: PROCESSO REFERENCIADO
                    // Implementado a critério do Leitor    

                    // REGISTRO C112: DOCUMENTO DE ARRECADAÇÃO REFERENCIADO.
                    // Implementado a critério do Leitor    

                    // REGISTRO C113: DOCUMENTO FISCAL REFERENCIADO.
                    // Implementado a critério do Leitor    

                    // Registro C114
                    List<NfeCupomFiscalReferenciadoVO> listaCupomReferenciado = new NotaFiscalController().consultaNfeCupomReferenciado(listaNfeCabecalho.get(i).getId());
                    if (listaCupomReferenciado != null) {
                        for (int j = 0; j < listaCupomReferenciado.size() - 1; j++) {
                            RegistroC114 registroC114 = new RegistroC114();
                            registroC114.setCodMod(listaCupomReferenciado.get(j).getModeloDocumentoFiscal());
                            registroC114.setEcfFab(listaCupomReferenciado.get(j).getNumeroSerieEcf());
                            registroC114.setEcfCx(listaCupomReferenciado.get(j).getNumeroCaixa().toString());
                            registroC114.setNumDoc(listaCupomReferenciado.get(j).getCoo().toString());
                            registroC114.setDtDoc(listaCupomReferenciado.get(j).getDataEmissaoCupom());
                        }
                    }

                    // REGISTRO C115: LOCAL DA COLETA E/OU ENTREGA (CÓDIGO 01, 1B E 04).
                    // Implementado a critério do Leitor    

                    // REGISTRO C116: CUPOM FISCAL ELETRÔNICO REFERENCIADO
                    // Implementado a critério do Leitor    

                    // REGISTRO C120: COMPLEMENTO DE DOCUMENTO - OPERAÇÕES DE IMPORTAÇÃO (CÓDIGOS 01 e 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C130: ISSQN, IRRF E PREVIDÊNCIA SOCIAL.
                    // Implementado a critério do Leitor    

                    // REGISTRO C140: FATURA (CÓDIGO 01)
                    // Implementado a critério do Leitor    

                    // REGISTRO C141: VENCIMENTO DA FATURA (CÓDIGO 01).
                    // Implementado a critério do Leitor    

                    // REGISTRO C160: VOLUMES TRANSPORTADOS (CÓDIGO 01 E 04) - EXCETO COMBUSTÍVEIS.
                    // Implementado a critério do Leitor    

                    // REGISTRO C165: OPERAÇÕES COM COMBUSTÍVEIS (CÓDIGO 01).
                    // Implementado a critério do Leitor    

                    // REGISTRO C170: ITENS DO DOCUMENTO (CÓDIGO 01, 1B, 04 e 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C171: ARMAZENAMENTO DE COMBUSTIVEIS (código 01, 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C172: OPERAÇÕES COM ISSQN (CÓDIGO 01)
                    // Implementado a critério do Leitor    

                    // REGISTRO C173: OPERAÇÕES COM MEDICAMENTOS (CÓDIGO 01 e 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C174: OPERAÇÕES COM ARMAS DE FOGO (CÓDIGO 01).
                    // Implementado a critério do Leitor    

                    // REGISTRO C175: OPERAÇÕES COM VEÍCULOS NOVOS (CÓDIGO 01 e 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C176: RESSARCIMENTO DE ICMS EM OPERAÇÕES COM SUBSTITUIÇÃO TRIBUTÁRIA (CÓDIGO 01, 55).
                    // Implementado a critério do Leitor    

                    // REGISTRO C177: OPERAÇÕES COM PRODUTOS SUJEITOS A SELO DE CONTROLE IPI.
                    // Implementado a critério do Leitor    

                    // REGISTRO C178: OPERAÇÕES COM PRODUTOS SUJEITOS À TRIBUTAÇÀO DE IPI POR UNIDADE OU QUANTIDADE DE PRODUTO.
                    // Implementado a critério do Leitor    

                    // REGISTRO C179: INFORMAÇÕES COMPLEMENTARES ST (CÓDIGO 01).
                    // Implementado a critério do Leitor    

                    // REGISTRO C190: REGISTRO ANALÍTICO DO DOCUMENTO (CÓDIGO 01, 1B, 04 ,55 e 65).
                    List<ViewSpedC190VO> listaNfeAnalitico = new NotaFiscalController().consultaNfeAnalitico(listaNfeCabecalho.get(i).getId());
                    if (listaNfeAnalitico != null) {
                        for (int j = 0; j < listaNfeAnalitico.size() - 1; j++) {
                            RegistroC190 registroC190 = new RegistroC190();
                            registroC190.setCstIcms(listaNfeAnalitico.get(j).getCstIcms());
                            registroC190.setCfop(listaNfeAnalitico.get(j).getCfop().toString());
                            registroC190.setAliqIcms(listaNfeAnalitico.get(j).getAliquotaIcms());
                            registroC190.setVlOpr(listaNfeAnalitico.get(j).getSomaValorOperacao());
                            registroC190.setVlBcIcms(listaNfeAnalitico.get(j).getSomaBaseCalculoIcms());
                            registroC190.setVlIcms(listaNfeAnalitico.get(j).getSomaValorIcms());
                            registroC190.setVlBcIcmsSt(listaNfeAnalitico.get(j).getSomaBaseCalculoIcmsSt());
                            registroC190.setVlIcmsSt(listaNfeAnalitico.get(j).getSomaValorIcmsSt());
                            registroC190.setVlRedBc(listaNfeAnalitico.get(j).getSomaVlRedBc());
                            registroC190.setVlIpi(listaNfeAnalitico.get(j).getSomaValorIpi());
                            registroC190.setCodObs("");

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC100List().get(i).getRegistroC190List().add(registroC190);
                        }

                        // REGISTRO C195: OBSERVAÇOES DO LANÇAMENTO FISCAL (CÓDIGO 01, 1B E 55)
                        // Implementado a critério do Leitor    

                        // REGISTRO C197: OUTRAS OBRIGAÇÕES TRIBUTÁRIAS, AJUSTES E INFORMAÇÕES DE VALORES PROVENIENTES DE DOCUMENTO FISCAL.
                        // Implementado a critério do Leitor    
                    }
                }
            } //if (listaNfeCabecalho != null)


            if (listaNf2Cabecalho != null) {
                for (int i = 0; i < listaNf2Cabecalho.size() - 1; i++) {
                    // REGISTRO C350: NOTA FISCAL DE VENDA A CONSUMIDOR (CÓDIGO 02)
                    RegistroC350 registroC350 = new RegistroC350();
                    registroC350.setSer(listaNf2Cabecalho.get(i).getSerie());
                    registroC350.setSubSer(listaNf2Cabecalho.get(i).getSubserie());
                    registroC350.setNumDoc(listaNf2Cabecalho.get(i).getNumero());
                    registroC350.setDtDoc(listaNf2Cabecalho.get(i).getDataEmissao());
                    registroC350.setCnpjCpf(listaNf2Cabecalho.get(i).getCpfCnpjCliente());
                    registroC350.setVlMerc(listaNf2Cabecalho.get(i).getTotalProdutos());
                    registroC350.setVlDoc(listaNf2Cabecalho.get(i).getTotalNf());
                    registroC350.setVlDesc(listaNf2Cabecalho.get(i).getDesconto());
                    registroC350.setVlPis(listaNf2Cabecalho.get(i).getPis());
                    registroC350.setVlCofins(listaNf2Cabecalho.get(i).getCofins());
                    registroC350.setCodCta("");

                    spedFiscal.getBlocoC().getRegistroC001().getRegistroC350List().add(registroC350);

                    // REGISTRO C370: ITENS DO DOCUMENTO (CÓDIGO 02)
                    List<ViewSpedC370VO> listaC370 = tabelaC370(strDataIni, strDataFim);
                    if (listaC370 != null) {
                        for (int j = 0; j < listaC370.size() - 1; j++) {
                            RegistroC370 registroC370 = new RegistroC370();
                            registroC370.setNumItem(listaC370.get(j).getItem().toString());
                            registroC370.setCodItem(listaC370.get(j).getIdProduto().toString());
                            registroC370.setQtd(listaC370.get(j).getQuantidade());
                            registroC370.setUnid(listaC370.get(j).getIdUnidadeProduto().toString());
                            registroC370.setVlItem(listaC370.get(j).getValorTotal());
                            registroC370.setVlDesc(listaC370.get(j).getDesconto());

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC350List().get(i).getRegistroC370List().add(registroC370);
                        }
                    }

                    // REGISTRO C390: REGISTRO ANALÍTICO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CÓDIGO 02)
                    List<ViewSpedC390VO> listaC390 = tabelaC390(strDataIni, strDataFim);
                    if (listaC390 != null) {
                        for (int j = 0; j < listaC390.size() - 1; j++) {
                            RegistroC390 registroC390 = new RegistroC390();
                            registroC390.setCstIcms(listaC390.get(j).getCst());
                            registroC390.setCfop(listaC390.get(j).getCfop().toString());
                            registroC390.setAliqIcms(listaC390.get(j).getTaxaIcms());
                            registroC390.setVlOpr(listaC390.get(j).getSomaItem());
                            registroC390.setVlBcIcms(listaC390.get(j).getSomaBaseIcms());
                            registroC390.setVlIcms(listaC390.get(j).getSomaIcms());
                            registroC390.setVlRedBc(listaC390.get(j).getSomaIcmsOutras());

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC350List().get(i).getRegistroC390List().add(registroC390);
                        }
                    }
                }
            }
        } // Fim Perfil A


        /////////////////
        /// Perfil B ////
        /////////////////
        if (perfilApresentacao == 1) {
            if (listaNf2Cabecalho != null) {
                for (int i = 0; i < listaNf2Cabecalho.size() - 1; i++) {
                    // REGISTRO C300: RESUMO DIÁRIO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CÓDIGO 02)
                    RegistroC300 registroC300 = new RegistroC300();
                    registroC300.setCodMod("02");
                    registroC300.setSer(listaNf2Cabecalho.get(i).getSerie());
                    registroC300.setSub(listaNf2Cabecalho.get(i).getSubserie());
                    registroC300.setDtDoc(listaNf2Cabecalho.get(i).getDataEmissao());
                    registroC300.setVlDoc(listaNf2Cabecalho.get(i).getTotalNf());
                    registroC300.setVlPis(listaNf2Cabecalho.get(i).getPis());
                    registroC300.setVlCofins(listaNf2Cabecalho.get(i).getCofins());
                    registroC300.setCodCta("");

                    spedFiscal.getBlocoC().getRegistroC001().getRegistroC300List().add(registroC300);

                    // REGISTRO C310: DOCUMENTOS CANCELADOS DE NOTAS FISCAIS DE VENDA A CONSUMIDOR (CÓDIGO 02).
                    List listaC310 = new ArrayList();
                    if (listaC310 != null) {
                        for (int j = 0; j < listaC310.size() - 1; j++) {
                            RegistroC310 registroC310 = new RegistroC310();
                            registroC310.setNumDocCanc(listaNf2CabecalhoCanceladas.get(i).getNumero());

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC300List().get(i).getRegistroC310List().add(registroC310);
                        }
                    }

                    // REGISTRO C320: REGISTRO ANALÍTICO DO RESUMO DIÁRIO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CÓDIGO 02). ---> igual ao C390
                    List<ViewSpedC390VO> listaC390 = tabelaC390(strDataIni, strDataFim);
                    if (listaC390 != null) {
                        for (int j = 0; j < listaC390.size() - 1; j++) {
                            RegistroC320 registroC320 = new RegistroC320();
                            registroC320.setCstIcms(listaC390.get(j).getCst());
                            registroC320.setCfop(listaC390.get(j).getCfop().toString());
                            registroC320.setAliqIcms(listaC390.get(j).getTaxaIcms());
                            registroC320.setVlOpr(listaC390.get(j).getSomaItem());
                            registroC320.setVlBcIcms(listaC390.get(j).getSomaBaseIcms());
                            registroC320.setVlIcms(listaC390.get(j).getSomaIcms());
                            registroC320.setVlRedBc(listaC390.get(j).getSomaIcmsOutras());

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC300List().get(i).getRegistroC320List().add(registroC320);

                            // REGISTRO C321: ITENS DO RESUMO DIÁRIO DOS DOCUMENTOS (CÓDIGO 02).
                            List<ViewSpedC321VO> listaC321 = tabelaC321(strDataIni, strDataFim);
                            if (listaC321 != null) {
                                for (int k = 0; k < listaC321.size() - 1; k++) {
                                    RegistroC321 registroC321 = new RegistroC321();
                                    registroC321.setCodItem(listaC321.get(k).getIdProduto().toString());
                                    registroC321.setQtd(listaC321.get(k).getSomaQuantidade());
                                    registroC321.setUnid(listaC321.get(k).getDescricaoUnidade());
                                    registroC321.setVlItem(listaC321.get(k).getSomaItem());
                                    registroC321.setVlDesc(listaC321.get(k).getSomaDesconto());
                                    registroC321.setVlBcIcms(listaC321.get(j).getSomaBaseIcms());
                                    registroC321.setVlIcms(listaC321.get(j).getSomaIcms());
                                    registroC321.setVlPis(listaC321.get(j).getSomaPis());
                                    registroC321.setVlCofins(listaC321.get(j).getSomaCofins());

                                    spedFiscal.getBlocoC().getRegistroC001().getRegistroC300List().get(i).getRegistroC320List().get(j).getRegistroC321List().add(registroC321);
                                }
                            }
                        }
                    }
                }
            }
        } // Fim Perfil B


        /////////////////
        ///  Ambos   ////
        /////////////////
        List<EcfImpressoraVO> listaImpressora = new ImpressoraController().tabelaImpressora();

        int indice400 = -1;

        if (listaImpressora != null) {
            for (int i = 0; i < listaImpressora.size() - 1; i++) {
                // REGISTRO C400: EQUIPAMENTO ECF (CÓDIGO 02, 2D e 60).
                RegistroC400 registroC400 = new RegistroC400();
                indice400++;
                registroC400.setCodMod(listaImpressora.get(i).getModeloDocumentoFiscal());
                registroC400.setEcfMod(listaImpressora.get(i).getModelo());
                registroC400.setEcfFab(listaImpressora.get(i).getSerie());
                registroC400.setEcfCx(listaImpressora.get(i).getNumero().toString());

                spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().add(registroC400);

                // verifica se existe movimento no periodo para aquele ECF
                List<EcfR02VO> listaR02 = new RegistroRController().tabelaR02(strDataIni, strDataFim, listaImpressora.get(i).getId());
                if (listaR02 != null) {
                    for (int j = 0; j < listaR02.size() - 1; j++) {
                        // REGISTRO C405: REDUÇÃO Z (CÓDIGO 02, 2D e 60).
                        RegistroC405 registroC405 = new RegistroC405();
                        registroC405.setDtDoc(listaR02.get(j).getDataMovimento());
                        registroC405.setCro(listaR02.get(j).getCro());
                        registroC405.setCrz(listaR02.get(j).getCrz());
                        registroC405.setNumCooFin(listaR02.get(j).getCoo());
                        registroC405.setGtFin(listaR02.get(j).getGrandeTotal());
                        registroC405.setVlBrt(listaR02.get(j).getVendaBruta());

                        spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().get(indice400).getRegistroC405List().add(registroC405);

                        // REGISTRO C410: PIS E COFINS TOTALIZADOS NO DIA (CÓDIGO 02 e 2D).
                        // Implementado a critério do Leitor    

                        // REGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (COD 02, 2D e 60).
                        List<EcfR03VO> listaR03 = new RegistroRController().tabelaR03(listaR02.get(j).getId());
                        for (int k = 0; k < listaR03.size() - 1; k++) {
                            RegistroC420 registroC420 = new RegistroC420();
                            registroC420.setCodTotPar(listaR03.get(k).getTotalizadorParcial());
                            registroC420.setVlrAcumTot(listaR03.get(k).getValorAcumulado());
                            registroC420.setNrTot(0);

                            spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().get(indice400).getRegistroC405List().get(j).getRegistroC420List().add(registroC420);

                            // REGISTRO C425: RESUMO DE ITENS DO MOVIMENTO DIÁRIO (CÓDIGO 02 e 2D).
                            // Implementado a critério do Leitor - Use a View C425
                        }

                        // se tiver o perfil A, gera o C460 com C470
                        if (perfilApresentacao == 0) {
                            // REGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CÓDIGO 02, 2D e 60).
                            List<EcfVendaCabecalhoVO> listaR04 = new RegistroRController().tabelaR04(strDataIni, strDataFim);
                            if (listaR04 != null) {
                                for (int l = 0; l < listaR04.size() - 1; l++) {
                                    RegistroC460 registroC460 = new RegistroC460();
                                    registroC460.setCodMod("02");
                                    registroC460.setNumDoc(listaR04.get(l).getCoo().toString());

                                    if (listaR04.get(l).getStatusVenda().equals("C")) {
                                        registroC460.setCodSit("02");
                                    } else {
                                        registroC460.setCodSit("00");
                                    }

                                    if (registroC460.getCodSit().equals("00")) {
                                        registroC460.setDtDoc(listaR04.get(l).getDataVenda());
                                        registroC460.setVlDoc(listaR04.get(l).getValorFinal());
                                        registroC460.setVlPis(listaR04.get(l).getPis());
                                        registroC460.setVlCofins(listaR04.get(l).getCofins());
                                        registroC460.setCpfCnpj(listaR04.get(l).getCpfCnpjCliente());
                                        registroC460.setNomAdq(listaR04.get(l).getNomeCliente());
                                    }

                                    spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().get(indice400).getRegistroC405List().get(j).getRegistroC460List().add(registroC460);

                                    // REGISTRO C465: COMPLEMENTO DO CUPOM FISCAL ELETRÔNICO EMITIDO POR ECF – CF-e-ECF (CÓDIGO 60).
                                    // Implementado a critério do Leitor    

                                    if (registroC460.getCodSit().equals("00")) {
                                        // Registro C470
                                        List<EcfVendaDetalheVO> listaR05 = new RegistroRController().tabelaR05(listaR04.get(l).getId());
                                        if (listaR05 != null) {
                                            for (int m = 0; m < listaR05.size() - 1; m++) {
                                                RegistroC470 registroC470 = new RegistroC470();
                                                registroC470.setCodItem(listaR05.get(m).getIdEcfProduto().toString());
                                                registroC470.setQtd(listaR05.get(m).getQuantidade());
                                                registroC470.setVlItem(listaR05.get(m).getTotalItem());
                                                registroC470.setCstIcms(listaR05.get(m).getCst());
                                                registroC470.setCfop(listaR05.get(m).getCfop().toString());
                                                registroC470.setAliqIcms(listaR05.get(m).getTaxaIcms());
                                                registroC470.setVlPis(listaR05.get(m).getPis());
                                                registroC470.setVlCofins(listaR05.get(m).getCofins());

                                                spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().get(indice400).getRegistroC405List().get(j).getRegistroC460List().get(l).getRegistroC470List().add(registroC470);
                                            }
                                        }
                                    }

                                }
                            }
                        }

                        // REGISTRO C490: REGISTRO ANALÍTICO DO MOVIMENTO DIÁRIO (CÓDIGO 02, 2D e 60).
                        // Implementado a critério do Leitor    
                        /*
                         List<ViewFiscalC490VO> listaC490 = tabelaC490(strDataIni, strDataFim);
                         for (int g = 0; g < listaC490.size() - 1; g++) {
                         RegistroC490 registroC490 = new RegistroC490();
                         registroC490.setCstIcms(listaC490.get(g).getCst());
                         registroC490.setCfop(listaC490.get(g).getCfop().toString());
                         registroC490.setAliqIcms(listaC490.get(g).getTaxaIcms());
                         registroC490.setVlOpr(listaC490.get(g).getSomaValor());
                         registroC490.setVlBcIcms(listaC490.get(g).getSomaBaseIcms());
                         registroC490.setVlIcms(listaC490.get(g).getSomaIcms());

                         spedFiscal.getBlocoC().getRegistroC001().getRegistroC400List().get(indice400).getRegistroC405List().get(j).getRegistroC490List().add(registroC490);
                         }
                         */
                    }
                }
                // REGISTRO C500: NOTA FISCAL/CONTA DE ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL CONSUMO FORNECIMENTO DE GÁS (CÓDIGO 28).
                // REGISTRO C510: ITENS DO DOCUMENTO NOTA FISCAL/CONTA ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28).
                // REGISTRO C590: REGISTRO ANALÍTICO DO DOCUMENTO - NOTA FISCAL/CONTA DE ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL CONSUMO FORNECIMENTO DE GÁS (CÓDIGO 28).
                // REGISTRO C600: CONSOLIDAÇÃO DIÁRIA DE NOTAS FISCAIS/CONTAS DE ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28) (EMPRESAS NÃO OBRIGADAS AO CONVÊNIO ICMS 115/03).
                // REGISTRO C601: DOCUMENTOS CANCELADOS - CONSOLIDAÇÃO DIÁRIA DE NOTAS FISCAIS/CONTAS DE ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28)
                // REGISTRO C610: ITENS DO DOCUMENTO CONSOLIDADO (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28) (EMPRESAS NÃO OBRIGADAS AO CONVÊNIO ICMS 115/03).
                // REGISTRO C690: REGISTRO ANALÍTICO DOS DOCUMENTOS (NOTAS FISCAIS/CONTAS DE ENERGIA ELÉTRICA (CÓDIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D’ÁGUA CANALIZADA (CÓDIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS (CÓDIGO 28)
                // REGISTRO C700: CONSOLIDAÇÃO DOS DOCUMENTOS NF/CONTA ENERGIA ELÉTRICA (CÓD 06), EMITIDAS EM VIA ÚNICA (EMPRESAS OBRIGADAS À ENTREGA DO ARQUIVO PREVISTO NO CONVÊNIO ICMS 115/03) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GÁS CANALIZADO (CÓDIGO 28)
                // REGISTRO C790: REGISTRO ANALÍTICO DOS DOCUMENTOS (CÓDIGOS 06 e 28).
                // REGISTRO C791: REGISTRO DE INFORMAÇÕES DE ST POR UF (COD 06)
                // REGISTRO C800: CUPOM FISCAL ELETRÔNICO (CÓDIGO 59)
                // REGISTRO C850: REGISTRO ANALÍTICO DO CF-E (CODIGO 59)
                // REGISTRO C860: IDENTIFICAÇÃO DO EQUIPAMENTO SAT-CF-E
                // REGISTRO C890: RESUMO DIÁRIO DO CF-E (CÓDIGO 59) POR EQUIPAMENTO SATCF-E
                // Implementado a critério do Leitor    

            }
        }
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="----- BLOCO E: APURAÇÃO DO ICMS E DO IPI --">
    public void gerarBlocoE() {
        // REGISTRO E001: ABERTURA DO BLOCO E
        spedFiscal.getBlocoE().getRegistroE001().setIndMov(0);

        // REGISTRO E100: PERÍODO DA APURAÇÃO DO ICMS.
        RegistroE100 registroE100 = new RegistroE100();
        registroE100.setDtIni(this.dataInicio);
        registroE100.setDtIni(this.dataFim);
        spedFiscal.getBlocoE().getRegistroE001().getRegistroE100List().add(registroE100);

        // REGISTRO E110: APURAÇÃO DO ICMS – OPERAÇÕES PRÓPRIAS.
        // Leitor - Implemente usando a tabela FISCAL_APURACAO_ICMS
        List listaE110 = new ArrayList();
        if (true) {
            //for (int i = 0; i < listaE110.size(); i++) {
                // Registro E110
                RegistroE110 registroE110 = new RegistroE110();
                registroE110.setVlTotDebitos(1d);
                registroE110.setVlAjDebitos(2D);
                registroE110.setVlTotAjDebitos(3D);
                registroE110.setVlEstornosCred(4D);
                registroE110.setVlTotCreditos(5D);
                registroE110.setVlAjCreditos(6D);
                registroE110.setVlTotAjCreditos(7D);
                registroE110.setVlEstornosDeb(8D);
                registroE110.setVlSldCredorAnt(9D);
                registroE110.setVlSldApurado(10d);
                registroE110.setVlTotDed(11D);
                registroE110.setVlIcmsRecolher(10D);
                registroE110.setVlSldCredorTransportar(10D);
                registroE110.setDebEsp(10D);

                spedFiscal.getBlocoE().getRegistroE001().getRegistroE100List().get(0).setRegistroE110(registroE110);
            //}
        }

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="----- BLOCO H: INVENTÁRIO FÍSICO --">
    public void gerarBlocoH() {
        // REGISTRO H001: ABERTURA DO BLOCO H
        spedFiscal.getBlocoH().getRegistroH001().setIndMov(1);

        // REGISTRO H005: TOTAIS DO INVENTÁRIO
        // REGISTRO H010: INVENTÁRIO.
        // REGISTRO H020: Informação complementar do Inventário.
        // Implementado a critério do Leitor    
    }
//</editor-fold>

//</editor-fold>   
}
