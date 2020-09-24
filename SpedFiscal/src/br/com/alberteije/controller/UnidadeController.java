/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller da unidade do produto</p>
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
import br.com.alberteije.vo.UnidadeConversaoVO;
import br.com.alberteije.vo.UnidadeProdutoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UnidadeController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<UnidadeProdutoVO> tabelaUnidade() {

        consultaSQL = "select * from UNIDADE_PRODUTO";

        try {
            List<UnidadeProdutoVO> listaUnidade = new ArrayList<UnidadeProdutoVO>();

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                UnidadeProdutoVO unidade = new UnidadeProdutoVO();
                unidade.setId(rs.getInt("ID"));
                unidade.setSigla(rs.getString("SIGLA"));
                unidade.setDescricao(rs.getString("DESCRICAO"));
                unidade.setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                listaUnidade.add(unidade);
            }
            return listaUnidade;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

    public List<UnidadeProdutoVO> unidadeSped(String pDataInicio, String pDataFim) {
        try {
            consultaSQL =
                    "SELECT distinct U.* "
                    + " FROM UNIDADE_PRODUTO U, PRODUTO P, ECF_VENDA_CABECALHO V, ECF_VENDA_DETALHE D "
                    + " WHERE V.DATA_VENDA BETWEEN '" + pDataInicio + "' and '" + pDataFim
                    + "' AND P.ID_UNIDADE_PRODUTO=U.ID "
                    + " AND V.ID=D.ID_ECF_VENDA_CABECALHO"
                    + " AND D.ID_ECF_PRODUTO=P.ID";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            List<UnidadeProdutoVO> listaUnidade = new ArrayList<UnidadeProdutoVO>();
            while (rs.next()) {
                UnidadeProdutoVO unidade = new UnidadeProdutoVO();
                unidade.setId(rs.getInt("ID"));
                unidade.setSigla(rs.getString("SIGLA"));
                unidade.setDescricao(rs.getString("DESCRICAO"));
                unidade.setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                listaUnidade.add(unidade);
            }
            return listaUnidade;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            bd.desconectar();
        }
    }

    public boolean consultaIdUnidade(Integer pId) {
        consultaSQL =
                "select "
                + " ID "
                + "from "
                + " UNIDADE_PRODUTO "
                + "where "
                + " ID = " + pId;

        try {
            pstm = bd.conectar().prepareStatement(consultaSQL);
            rs = pstm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            bd.desconectar();
        }
    }

    public UnidadeConversaoVO consultaUnidadeConversao(Integer idProduto, Integer idUnidadeProduto) {
        UnidadeConversaoVO unidadeConversao = new UnidadeConversaoVO();
        consultaSQL =
                "select * from UNIDADE_CONVERSAO "
                + "where "
                + "ID_PRODUTO = " + idProduto
                + " and ID_UNIDADE_PRODUTO = " + idUnidadeProduto;
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                unidadeConversao.setId(rs.getInt("ID"));
                unidadeConversao.setIdProduto(rs.getInt("ID_PRODUTO"));
                unidadeConversao.setIdUnidadeProduto(rs.getInt("ID_UNIDADE_PRODUTO"));
                unidadeConversao.setSigla(rs.getString("SIGLA"));
                unidadeConversao.setDescricao(rs.getString("DESCRICAO"));
                unidadeConversao.setFatorConversao(rs.getDouble("FATOR_CONVERSAO"));
                return unidadeConversao;
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
}