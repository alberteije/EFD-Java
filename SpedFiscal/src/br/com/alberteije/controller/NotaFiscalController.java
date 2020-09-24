/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller da nota fiscal - NF2 e NFe</p>
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
import br.com.alberteije.vo.EcfNotaFiscalCabecalhoVO;
import br.com.alberteije.vo.EcfNotaFiscalDetalheVO;
import br.com.alberteije.vo.NfeCabecalhoVO;
import br.com.alberteije.vo.NfeCupomFiscalReferenciadoVO;
import br.com.alberteije.vo.ProdutoVO;
import br.com.alberteije.vo.ViewSpedC190VO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<EcfNotaFiscalCabecalhoVO> consultaNotaCabecalhoSped(String pDataInicio, String pDataFim, String pCancelada) {
        try {
            List<EcfNotaFiscalCabecalhoVO> listaNotaCabecalho = new ArrayList<EcfNotaFiscalCabecalhoVO>();

            consultaSQL =
                    "SELECT * from ECF_NOTA_FISCAL_CABECALHO where CANCELADA = '" + pCancelada + "'"
                    + " and (DATA_EMISSAO BETWEEN '" + pDataInicio + "' and '" + pDataFim + "')";

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                EcfNotaFiscalCabecalhoVO notaCabecalho = new EcfNotaFiscalCabecalhoVO();
                notaCabecalho.setId(rs.getInt("ID"));
                notaCabecalho.setIdEcfFuncionario(rs.getInt("ID_ECF_FUNCIONARIO"));
                notaCabecalho.setIdCliente(rs.getInt("ID_CLIENTE"));
                notaCabecalho.setCpfCnpjCliente(rs.getString("CPF_CNPJ_CLIENTE"));
                notaCabecalho.setCfop(rs.getInt("CFOP"));
                notaCabecalho.setNumero(rs.getString("NUMERO"));
                notaCabecalho.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                notaCabecalho.setHoraEmissao(rs.getString("HORA_EMISSAO"));
                notaCabecalho.setSerie(rs.getString("SERIE"));
                notaCabecalho.setSubserie(rs.getString("SUBSERIE"));
                notaCabecalho.setTotalProdutos(rs.getDouble("TOTAL_PRODUTOS"));
                notaCabecalho.setTotalNf(rs.getDouble("TOTAL_NF"));
                notaCabecalho.setBaseIcms(rs.getDouble("BASE_ICMS"));
                notaCabecalho.setIcms(rs.getDouble("ICMS"));
                notaCabecalho.setIcmsOutras(rs.getDouble("ICMS_OUTRAS"));
                notaCabecalho.setIssqn(rs.getDouble("ISSQN"));
                notaCabecalho.setPis(rs.getDouble("PIS"));
                notaCabecalho.setCofins(rs.getDouble("COFINS"));
                notaCabecalho.setIpi(rs.getDouble("IPI"));
                notaCabecalho.setTaxaAcrescimo(rs.getDouble("TAXA_ACRESCIMO"));
                notaCabecalho.setAcrescimo(rs.getDouble("ACRESCIMO"));
                notaCabecalho.setAcrescimoItens(rs.getDouble("ACRESCIMO_ITENS"));
                notaCabecalho.setTaxaDesconto(rs.getDouble("TAXA_DESCONTO"));
                notaCabecalho.setDesconto(rs.getDouble("DESCONTO"));
                notaCabecalho.setDescontoItens(rs.getDouble("DESCONTO_ITENS"));
                notaCabecalho.setCancelada(rs.getString("CANCELADA"));
                notaCabecalho.setTipoNota(rs.getString("TIPO_NOTA"));
                listaNotaCabecalho.add(notaCabecalho);
            }
            if (listaNotaCabecalho.size() > 0) {
                return listaNotaCabecalho;
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

    public List<EcfNotaFiscalDetalheVO> consultaNotaDetalheSped(Integer pId) {
        try {
                List<EcfNotaFiscalDetalheVO> listaNotaDetalhe = new ArrayList<EcfNotaFiscalDetalheVO>();

                consultaSQL =
                        "select * from ECF_NOTA_FISCAL_DETALHE where ID=?";

                pstm = bd.conectar().prepareStatement(consultaSQL);
                pstm.setInt(1, pId);
                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    ProdutoVO produto = new ProdutoVO();
                    produto = new ProdutoController().consultaId(rs.getInt("ID_PRODUTO"));
                    EcfNotaFiscalDetalheVO notaDetalhe = new EcfNotaFiscalDetalheVO();

                    notaDetalhe.setId(rs.getInt("ID"));
                    notaDetalhe.setIdProduto(rs.getInt("ID_PRODUTO"));
                    notaDetalhe.setCfop(rs.getInt("CFOP"));
                    notaDetalhe.setItem(rs.getInt("ITEM"));
                    notaDetalhe.setQuantidade(rs.getDouble("QUANTIDADE"));
                    notaDetalhe.setValorUnitario(rs.getDouble("VALOR_UNITARIO"));
                    notaDetalhe.setValorTotal(rs.getDouble("VALOR_TOTAL"));
                    notaDetalhe.setBaseIcms(rs.getDouble("BASE_ICMS"));
                    notaDetalhe.setTaxaIcms(rs.getDouble("TAXA_ICMS"));
                    notaDetalhe.setIcms(rs.getDouble("ICMS"));
                    notaDetalhe.setIcmsOutras(rs.getDouble("ICMS_OUTRAS"));
                    notaDetalhe.setIcmsIsento(rs.getDouble("ICMS_ISENTO"));
                    notaDetalhe.setTaxaDesconto(rs.getDouble("TAXA_DESCONTO"));
                    notaDetalhe.setDesconto(rs.getDouble("DESCONTO"));
                    notaDetalhe.setTaxaIssqn(rs.getDouble("TAXA_ISSQN"));
                    notaDetalhe.setIssqn(rs.getDouble("ISSQN"));
                    notaDetalhe.setTaxaPis(rs.getDouble("TAXA_PIS"));
                    notaDetalhe.setPis(rs.getDouble("PIS"));
                    notaDetalhe.setTaxaCofins(rs.getDouble("TAXA_COFINS"));
                    notaDetalhe.setCofins(rs.getDouble("COFINS"));
                    notaDetalhe.setTaxaAcrescimo(rs.getDouble("TAXA_ACRESCIMO"));
                    notaDetalhe.setAcrescimo(rs.getDouble("ACRESCIMO"));
                    notaDetalhe.setTaxaIpi(rs.getDouble("TAXA_IPI"));
                    notaDetalhe.setIpi(rs.getDouble("IPI"));
                    notaDetalhe.setCancelado(rs.getString("CANCELADO"));
                    notaDetalhe.setCst(rs.getString("CST"));
                    notaDetalhe.setMovimentaEstoque(rs.getString("MOVIMENTA_ESTOQUE"));
                    notaDetalhe.setEcfIcmsSt(rs.getString("ECF_ICMS_ST"));
                    listaNotaDetalhe.add(notaDetalhe);
                }
                return listaNotaDetalhe;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bd.desconectar();
        }
        return null;
    }

    public List<NfeCabecalhoVO> consultaNfeCabecalhoSped(String pDataInicio, String pDataFim) {
        try {
            List<NfeCabecalhoVO> listaNotaCabecalho = new ArrayList<NfeCabecalhoVO>();

            consultaSQL =
                    "SELECT * from NFE_CABECALHO where "
                    + " DATA_EMISSAO BETWEEN '" + pDataInicio + "' and '" + pDataFim + "'";

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                NfeCabecalhoVO notaCabecalho = new NfeCabecalhoVO();
                notaCabecalho.setId(rs.getInt("ID"));
                notaCabecalho.setTipoOperacao(rs.getString("TIPO_OPERACAO"));
                notaCabecalho.setIdCliente(rs.getInt("ID_CLIENTE"));
                notaCabecalho.setIdFornecedor(rs.getInt("ID_FORNECEDOR"));
                notaCabecalho.setCodigoModelo(rs.getString("CODIGO_MODELO"));
                notaCabecalho.setStatusNota(rs.getString("STATUS_NOTA"));
                notaCabecalho.setSerie(rs.getString("SERIE"));
                notaCabecalho.setNumero(rs.getString("NUMERO"));
                notaCabecalho.setChaveAcesso(rs.getString("CHAVE_ACESSO"));
                notaCabecalho.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                notaCabecalho.setDataEntradaSaida(rs.getDate("DATA_ENTRADA_SAIDA"));
                notaCabecalho.setValorTotal(rs.getDouble("VALOR_TOTAL"));
                notaCabecalho.setIndicadorFormaPagamento(rs.getString("INDICADOR_FORMA_PAGAMENTO"));
                notaCabecalho.setValorDesconto(rs.getDouble("VALOR_DESCONTO"));
                notaCabecalho.setValorTotalProdutos(rs.getDouble("VALOR_TOTAL_PRODUTOS"));
                notaCabecalho.setValorFrete(rs.getDouble("VALOR_FRETE"));
                notaCabecalho.setValorSeguro(rs.getDouble("VALOR_SEGURO"));
                notaCabecalho.setValorDespesasAcessorias(rs.getDouble("VALOR_DESPESAS_ACESSORIAS"));
                notaCabecalho.setBaseCalculoIcms(rs.getDouble("BASE_CALCULO_ICMS"));
                notaCabecalho.setValorIcms(rs.getDouble("VALOR_ICMS"));
                notaCabecalho.setBaseCalculoIcmsSt(rs.getDouble("BASE_CALCULO_ICMS_ST"));
                notaCabecalho.setValorIcmsSt(rs.getDouble("VALOR_ICMS_ST"));
                notaCabecalho.setValorPis(rs.getDouble("VALOR_PIS"));
                notaCabecalho.setValorCofins(rs.getDouble("VALOR_COFINS"));
                notaCabecalho.setValorIpi(rs.getDouble("VALOR_IPI"));
                listaNotaCabecalho.add(notaCabecalho);
            }
            if (listaNotaCabecalho.size() > 0) {
                return listaNotaCabecalho;
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

    public List<NfeCupomFiscalReferenciadoVO> consultaNfeCupomReferenciado(Integer pIdNfeCabecalho) {
        try {
            List<NfeCupomFiscalReferenciadoVO> listaCupomVinculado = new ArrayList<NfeCupomFiscalReferenciadoVO>();

            consultaSQL =
                    "SELECT * from NFE_CUPOM_FISCAL_REFERENCIADO where "
                    + " ID_NFE_CABECALHO = " + pIdNfeCabecalho;

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                NfeCupomFiscalReferenciadoVO cupom = new NfeCupomFiscalReferenciadoVO();
                cupom.setId(rs.getInt("ID"));
                cupom.setModeloDocumentoFiscal(rs.getString("MODELO_DOCUMENTO_FISCAL"));
                cupom.setNumeroOrdemEcf(rs.getInt("NUMERO_ORDEM_ECF"));
                cupom.setCoo(rs.getInt("COO"));
                cupom.setDataEmissaoCupom(rs.getDate("DATA_EMISSAO_CUPOM"));
                cupom.setNumeroCaixa(rs.getInt("NUMERO_CAIXA"));
                cupom.setNumeroSerieEcf(rs.getString("NUMERO_SERIE_ECF"));
                listaCupomVinculado.add(cupom);
            }
            if (listaCupomVinculado.size() > 0) {
                return listaCupomVinculado;
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


    public List<ViewSpedC190VO> consultaNfeAnalitico(Integer pIdNfeCabecalho) {
        try {
            List<ViewSpedC190VO> listaNfeAnalitico = new ArrayList<ViewSpedC190VO>();

            consultaSQL =
                    "SELECT * from VIEW_SPED_C190 where "
                    + " ID = " + pIdNfeCabecalho;

            pstm = bd.conectar().prepareStatement(consultaSQL);
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedC190VO analitico = new ViewSpedC190VO();
                analitico.setId(rs.getInt("ID"));
                analitico.setCstIcms(rs.getString("CST_ICMS"));
                analitico.setCfop(rs.getInt("CFOP"));
                analitico.setAliquotaIcms(rs.getDouble("ALIQUOTA_ICMS"));
                analitico.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                analitico.setSomaValorOperacao(rs.getDouble("SOMA_VALOR_OPERACAO"));
                analitico.setSomaBaseCalculoIcms(rs.getDouble("SOMA_BASE_CALCULO_ICMS"));
                analitico.setSomaValorIcms(rs.getDouble("SOMA_VALOR_ICMS"));
                analitico.setSomaBaseCalculoIcmsSt(rs.getDouble("SOMA_BASE_CALCULO_ICMS_ST"));
                analitico.setSomaValorIcmsSt(rs.getDouble("SOMA_VALOR_ICMS_ST"));
                analitico.setSomaVlRedBc(rs.getDouble("SOMA_VL_RED_BC"));
                analitico.setSomaValorIpi(rs.getDouble("SOMA_VALOR_IPI"));
                
                listaNfeAnalitico.add(analitico);
            }
            if (listaNfeAnalitico.size() > 0) {
                return listaNfeAnalitico;
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
}
