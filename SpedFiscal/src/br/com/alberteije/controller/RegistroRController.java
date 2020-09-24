/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do registro R</p>
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
import br.com.alberteije.vo.EcfR02VO;
import br.com.alberteije.vo.EcfR03VO;
import br.com.alberteije.vo.EcfR06VO;
import br.com.alberteije.vo.EcfR07VO;
import br.com.alberteije.vo.EcfVendaCabecalhoVO;
import br.com.alberteije.vo.EcfVendaDetalheVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * =============================================================================
 * Observações importantes
 *
 * Registro tipo R01 - Identificação do ECF, do Usuário, do PAF-ECF e da Empresa Desenvolvedora e Dados do Arquivo; 
 * Registro tipo EcfR02 - Relação de Reduções Z;
 * Registro tipo EcfR03 - Detalhe da Redução Z; 
 * Registro tipo EcfR04 - Cupom Fiscal, Nota Fiscal de Venda a Consumidor ou Bilhete de Passagem; 
 * Registro tipo EcfR05 - Detalhe do Cupom Fiscal, da Nota Fiscal de Venda a Consumidor ou do Bilhete de Passagem; 
 * Registro tipo EcfR06 - Demais documentos emitidos pelo ECF;
 * Registro tipo EcfR07 - Detalhe do Cupom Fiscal e do Documento Não Fiscal - Meio de Pagamento; 
 * Registro EAD - Assinatura digital.
 *
 * =============================================================================
 */
public class RegistroRController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<EcfR02VO> tabelaR02(String pDataInicio, String pDataFim, Integer pIdImpressora) {
        try {
            consultaSQL =
                    "select count(*) as TOTAL from ECF_R02 where "
                    + "ID_IMPRESSORA=" + pIdImpressora
                    + " and  (DATA_MOVIMENTO between '"
                    + pDataInicio + "' and '" + pDataFim + "')";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.first();
            Integer totalRegistros = rs.getInt("TOTAL");

            if (totalRegistros > 0) {
                List<EcfR02VO> listaEcfR02 = new ArrayList<EcfR02VO>();
                consultaSQL =
                        "select * from ECF_R02 where "
                        + "ID_IMPRESSORA=" + pIdImpressora
                        + " and  (DATA_MOVIMENTO between '"
                        + pDataInicio + "' and '" + pDataFim + "')";

                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    EcfR02VO EcfR02 = new EcfR02VO();
                    EcfR02.setId(rs.getInt("ID"));
                    EcfR02.setIdEcfCaixa(rs.getInt("ID_ECF_CAIXA"));
                    EcfR02.setIdOperador(rs.getInt("ID_OPERADOR"));
                    EcfR02.setIdImpressora(rs.getInt("ID_IMPRESSORA"));
                    EcfR02.setCrz(rs.getInt("CRZ"));
                    EcfR02.setCoo(rs.getInt("COO"));
                    EcfR02.setCro(rs.getInt("CRO"));
                    EcfR02.setDataMovimento(rs.getDate("DATA_MOVIMENTO"));
                    EcfR02.setDataEmissao(rs.getDate("DATA_EMISSAO"));
                    EcfR02.setSerieEcf(rs.getString("SERIE_ECF"));
                    EcfR02.setHoraEmissao(rs.getString("HORA_EMISSAO"));
                    EcfR02.setVendaBruta(rs.getDouble("VENDA_BRUTA"));
                    EcfR02.setGrandeTotal(rs.getDouble("GRANDE_TOTAL"));
                    listaEcfR02.add(EcfR02);
                }
                return listaEcfR02;
            } else {
                //caso nao existam registros retorna nulo
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

    public List<EcfR03VO> tabelaR03(Integer pId) {
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery("select count(*) AS TOTAL from ECF_R03 where ID_R02=" + pId);
            rs.first();
            Integer totalRegistros = rs.getInt("TOTAL");

            if (totalRegistros > 0) {
                List<EcfR03VO> listaEcfR03 = new ArrayList<EcfR03VO>();
                consultaSQL = "select * from ECF_R03 where ID_R02=" + pId;

                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    EcfR03VO EcfR03 = new EcfR03VO();
                    EcfR03.setId(rs.getInt("ID"));
                    EcfR03.setIdR02(rs.getInt("ID_R02"));
                    EcfR03.setSerieEcf(rs.getString("SERIE_ECF"));
                    EcfR03.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                    EcfR03.setValorAcumulado(rs.getDouble("VALOR_ACUMULADO"));
                    EcfR03.setCrz(rs.getInt("CRZ"));
                    EcfR03.setHashTripa(rs.getString("HASH_TRIPA"));
                    EcfR03.setHashIncremento(rs.getInt("HASH_INCREMENTO"));
                    listaEcfR03.add(EcfR03);
                }
                return listaEcfR03;
            } else {
                //caso nao existam registros retorna nulo
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

    public List<EcfVendaCabecalhoVO> tabelaR04(String pDataInicio, String pDataFim) {
        try {
            List<EcfVendaCabecalhoVO> listaEcfR04 = new ArrayList<EcfVendaCabecalhoVO>();

            consultaSQL =
                    "select * "
                    + "from ECF_VENDA_CABECALHO "
                    + "where "
                    + " (DATA_VENDA between '"
                    + pDataInicio + "' and '" + pDataFim + "')";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                EcfVendaCabecalhoVO EcfR04 = new EcfVendaCabecalhoVO();
                EcfR04.setId(rs.getInt("VCID"));
                EcfR04.setCcf(rs.getInt("CCF"));
                EcfR04.setCoo(rs.getInt("COO"));
                EcfR04.setDataVenda(rs.getDate("DATA_VENDA"));
                EcfR04.setValorVenda(rs.getDouble("VALOR_VENDA"));
                EcfR04.setDesconto(rs.getDouble("DESCONTO"));
                EcfR04.setAcrescimo(rs.getDouble("ACRESCIMO"));
                EcfR04.setValorFinal(rs.getDouble("VALOR_FINAL"));
                EcfR04.setStatusVenda(rs.getString("STATUS_VENDA"));
                EcfR04.setNomeCliente(rs.getString("NOME_CLIENTE"));
                EcfR04.setCpfCnpjCliente(rs.getString("CPF_CNPJ_CLIENTE"));
                listaEcfR04.add(EcfR04);
            }
            if (listaEcfR04.size() > 0) {
                return listaEcfR04;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

    public List<EcfVendaDetalheVO> tabelaR05(Integer pId) {
        try {
                List<EcfVendaDetalheVO> listaEcfR05 = new ArrayList<EcfVendaDetalheVO>();
                consultaSQL =
                        "select * from ECF_VENDA_DETALHE where ID_ECF_VENDA_CABECALHO=" + pId;

                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    EcfVendaDetalheVO EcfR05 = new EcfVendaDetalheVO();
                    EcfR05.setId(rs.getInt("ID"));
                    EcfR05.setIdEcfProduto(rs.getInt("ID_ECF_PRODUTO"));
                    EcfR05.setQuantidade(rs.getDouble("QUANTIDADE"));
                    EcfR05.setTotalItem(rs.getDouble("TOTAL_ITEM"));
                    EcfR05.setCst(rs.getString("CST"));
                    EcfR05.setCfop(rs.getInt("CFOP"));
                    EcfR05.setTaxaIcms(rs.getDouble("TAXA_ICMS"));
                    EcfR05.setPis(rs.getDouble("PIS"));
                    EcfR05.setCofins(rs.getDouble("COFINS"));

                    listaEcfR05.add(EcfR05);
                }
                if (listaEcfR05.size() >0) {
                return listaEcfR05;
                
            } else {
                //caso nao existam registros retorna nulo
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

}
