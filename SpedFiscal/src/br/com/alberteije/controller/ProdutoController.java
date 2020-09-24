/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do produto</p>
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
import br.com.alberteije.vo.ProdutoAlteracaoItemVO;
import br.com.alberteije.vo.ProdutoVO;
import br.com.alberteije.vo.UnidadeProdutoVO;
import br.com.alberteije.vo.ViewSpedNfeItemVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public ProdutoVO consulta(String codigo) {
        ProdutoVO produtoVO = new ProdutoVO();
        UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
        produtoVO.setUnidadeProdutoVO(unidadeProdutoVO);
        consultaSQL =
                "select P.ID, P.ID_UNIDADE_PRODUTO, P.GTIN, P.CODIGO_INTERNO, "
                + "P.NOME AS NOME_PRODUTO, P.DESCRICAO, P.DESCRICAO_PDV, P.VALOR_VENDA, P.QUANTIDADE_ESTOQUE, "
                + "P.ESTOQUE_MINIMO, P.ESTOQUE_MAXIMO, P.IAT, P.IPPT, P.NCM, U.SIGLA, "
                + "U.PODE_FRACIONAR, P.ECF_ICMS_ST, P.CST, P.ALIQUOTA_ICMS_PAF, P.TOTALIZADOR_PARCIAL, U.PODE_FRACIONAR, "
                + "P.ALIQUOTA_ISSQN_PAF "
                + "from "
                + "PRODUTO P, "
                + "UNIDADE_PRODUTO U "
                + "where "
                + "P.GTIN = '" + codigo + "' "
                + "and P.ID_UNIDADE_PRODUTO = U.ID ";
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                produtoVO.setId(rs.getInt("ID"));
                produtoVO.setGtin(rs.getString("GTIN"));
                produtoVO.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                produtoVO.setValorVenda(rs.getDouble("VALOR_VENDA"));
                produtoVO.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                produtoVO.setNome(rs.getString("NOME_PRODUTO"));
                produtoVO.setDescricao(rs.getString("DESCRICAO"));
                produtoVO.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                produtoVO.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                produtoVO.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                produtoVO.setIat(rs.getString("IAT"));
                produtoVO.setIppt(rs.getString("IPPT"));
                produtoVO.setNcm(rs.getString("NCM"));
                produtoVO.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                produtoVO.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                produtoVO.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                produtoVO.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                produtoVO.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                produtoVO.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                return produtoVO;
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

    public ProdutoVO consulta(String pCodigo, Integer pTipo) {
        ProdutoVO produtoVO = new ProdutoVO();
        UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
        produtoVO.setUnidadeProdutoVO(unidadeProdutoVO);

        String clausulaWhere = "";

        switch (pTipo) {
            case 1: //código interno ou GTIN
                clausulaWhere =
                        " where "
                        + "((P.CODIGO_INTERNO = '" + pCodigo + "')"
                        + " or (P.GTIN = '" + pCodigo + "'))"
                        + " and (P.ID_UNIDADE_PRODUTO = U.ID)";
                break;
            case 2: //id
                clausulaWhere =
                        " where "
                        + "(P.ID = '" + pCodigo + "')"
                        + " and (P.ID_UNIDADE_PRODUTO = U.ID)";
                break;
        }

        consultaSQL =
                "select P.ID, P.ID_UNIDADE_PRODUTO, P.GTIN, P.CODIGO_INTERNO, "
                + "P.NOME AS NOME_PRODUTO, P.DESCRICAO, P.DESCRICAO_PDV, P.VALOR_VENDA, P.QUANTIDADE_ESTOQUE, "
                + "P.ESTOQUE_MINIMO, P.ESTOQUE_MAXIMO, P.IAT, P.IPPT, P.NCM, U.SIGLA, "
                + "U.PODE_FRACIONAR, P.ECF_ICMS_ST, P.CST, P.ALIQUOTA_ICMS_PAF, P.TOTALIZADOR_PARCIAL, U.PODE_FRACIONAR, "
                + "P.ALIQUOTA_ISSQN_PAF "
                + "from "
                + "PRODUTO P, "
                + "UNIDADE_PRODUTO U "
                + clausulaWhere;
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                produtoVO.setId(rs.getInt("ID"));
                produtoVO.setGtin(rs.getString("GTIN"));
                produtoVO.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                produtoVO.setValorVenda(rs.getDouble("VALOR_VENDA"));
                produtoVO.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                produtoVO.setNome(rs.getString("NOME_PRODUTO"));
                produtoVO.setDescricao(rs.getString("DESCRICAO"));
                produtoVO.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                produtoVO.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                produtoVO.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                produtoVO.setIat(rs.getString("IAT"));
                produtoVO.setIppt(rs.getString("IPPT"));
                produtoVO.setNcm(rs.getString("NCM"));
                produtoVO.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                produtoVO.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                produtoVO.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                produtoVO.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                produtoVO.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                produtoVO.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                return produtoVO;
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

    public ProdutoVO consultaId(Integer pId) {
        ProdutoVO produto = new ProdutoVO();
        UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
        produto.setUnidadeProdutoVO(unidadeProdutoVO);
        consultaSQL =
                "select P.ID, P.ID_UNIDADE_PRODUTO, P.GTIN, P.CODIGO_INTERNO, "
                + "P.NOME AS NOME_PRODUTO, P.DESCRICAO, P.DESCRICAO_PDV, P.VALOR_VENDA, P.QUANTIDADE_ESTOQUE, "
                + "P.ESTOQUE_MINIMO, P.ESTOQUE_MAXIMO, P.IAT, P.IPPT, P.NCM, U.SIGLA, "
                + "U.PODE_FRACIONAR, P.ECF_ICMS_ST, P.CST, P.ALIQUOTA_ICMS_PAF, P.TOTALIZADOR_PARCIAL, U.PODE_FRACIONAR, "
                + "P.ALIQUOTA_ISSQN_PAF "
                + "from "
                + "PRODUTO P, UNIDADE_PRODUTO U "
                + "where P.ID=" + pId + " "
                + "and P.ID_UNIDADE_PRODUTO = U.ID ";

        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                produto.setId(rs.getInt("ID"));
                produto.setGtin(rs.getString("GTIN"));
                produto.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                produto.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                produto.setNome(rs.getString("NOME_PRODUTO"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                produto.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                produto.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                produto.setIat(rs.getString("IAT"));
                produto.setIppt(rs.getString("IPPT"));
                produto.setNcm(rs.getString("NCM"));
                produto.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                produto.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                produto.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                produto.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                produto.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                produto.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                return produto;
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

    public List<ProdutoVO> tabelaProduto() {
        consultaSQL =
                "select count(*) as TOTAL "
                + "from PRODUTO P, UNIDADE_PRODUTO U "
                + "where P.ID_UNIDADE_PRODUTO = U.ID ";

        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.first();
            Integer totalRegistros = rs.getInt("TOTAL");

            if (totalRegistros > 0) {
                List<ProdutoVO> listaProduto = new ArrayList<ProdutoVO>();
                consultaSQL =
                        "select "
                        + " P.ID, "
                        + " P.ID_UNIDADE_PRODUTO, "
                        + " P.GTIN, "
                        + " P.CODIGO_INTERNO, "
                        + " P.NOME AS NOME_PRODUTO, "
                        + " P.DESCRICAO, "
                        + " P.DESCRICAO_PDV, "
                        + " P.VALOR_VENDA, "
                        + " P.QUANTIDADE_ESTOQUE, "
                        + " P.QUANTIDADE_ESTOQUE_ANTERIOR, "
                        + " P.ESTOQUE_MINIMO, "
                        + " P.ESTOQUE_MAXIMO, "
                        + " P.IAT, "
                        + " P.IPPT, "
                        + " P.NCM, "
                        + " P.TIPO_ITEM_SPED, "
                        + " P.ALIQUOTA_ISSQN_PAF, "
                        + " P.ALIQUOTA_ICMS_PAF, "
                        + " P.TOTALIZADOR_PARCIAL, "
                        + " P.CODIGO_BALANCA, "
                        + " U.SIGLA, "
                        + " U.PODE_FRACIONAR "
                        + "from "
                        + " PRODUTO P, UNIDADE_PRODUTO U "
                        + "where "
                        + " (P.ID_UNIDADE_PRODUTO = U.ID)";


                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    ProdutoVO produto = new ProdutoVO();
                    UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
                    produto.setUnidadeProdutoVO(unidadeProdutoVO);
                    produto.setId(rs.getInt("ID"));
                    produto.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                    produto.setGtin(rs.getString("GTIN"));
                    produto.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                    produto.setNome(rs.getString("NOME_PRODUTO"));
                    produto.setDescricao(rs.getString("DESCRICAO"));
                    produto.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                    produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                    produto.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                    produto.setQuantidadeEstoqueAnterior(rs.getDouble("QUANTIDADE_ESTOQUE_ANTERIOR"));
                    produto.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                    produto.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                    produto.setIat(rs.getString("IAT"));
                    produto.setIppt(rs.getString("IPPT"));
                    produto.setNcm(rs.getString("NCM"));
                    produto.setTipoItemSped(rs.getString("TIPO_ITEM_SPED"));
                    produto.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                    produto.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                    produto.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                    produto.setCodigoBalanca(rs.getInt("CODIGO_BALANCA"));
                    produto.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                    produto.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                    listaProduto.add(produto);
                }
                return listaProduto;
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

    public List<ProdutoVO> tabelaProduto(Integer pCodigoInicio, Integer pCodigoFim) {
        consultaSQL =
                "select count(*) as TOTAL "
                + "from PRODUTO P, UNIDADE_PRODUTO U "
                + "where (P.ID_UNIDADE_PRODUTO = U.ID) "
                + "and (P.ID between " + pCodigoInicio + " and " + pCodigoFim + ")";

        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.first();
            Integer totalRegistros = rs.getInt("TOTAL");

            if (totalRegistros > 0) {
                List<ProdutoVO> listaProduto = new ArrayList<ProdutoVO>();
                consultaSQL =
                        "select "
                        + " P.ID, "
                        + " P.ID_UNIDADE_PRODUTO, "
                        + " P.GTIN, "
                        + " P.CODIGO_INTERNO, "
                        + " P.NOME AS NOME_PRODUTO, "
                        + " P.DESCRICAO, "
                        + " P.DESCRICAO_PDV, "
                        + " P.VALOR_VENDA, "
                        + " P.QUANTIDADE_ESTOQUE, "
                        + " P.QUANTIDADE_ESTOQUE_ANTERIOR, "
                        + " P.ESTOQUE_MINIMO, "
                        + " P.ESTOQUE_MAXIMO, "
                        + " P.IAT, "
                        + " P.IPPT, "
                        + " P.NCM, "
                        + " P.TIPO_ITEM_SPED, "
                        + " P.ALIQUOTA_ISSQN_PAF, "
                        + " P.ALIQUOTA_ICMS_PAF, "
                        + " P.TOTALIZADOR_PARCIAL, "
                        + " P.CODIGO_BALANCA, "
                        + " U.SIGLA, "
                        + " U.PODE_FRACIONAR "
                        + "from "
                        + " PRODUTO P, UNIDADE_PRODUTO U "
                        + "where "
                        + " (P.ID_UNIDADE_PRODUTO = U.ID)"
                        + " and (P.ID between " + pCodigoInicio + " and " + pCodigoFim + ")";


                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    ProdutoVO produto = new ProdutoVO();
                    UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
                    produto.setUnidadeProdutoVO(unidadeProdutoVO);
                    produto.setId(rs.getInt("ID"));
                    produto.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                    produto.setGtin(rs.getString("GTIN"));
                    produto.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                    produto.setNome(rs.getString("NOME_PRODUTO"));
                    produto.setDescricao(rs.getString("DESCRICAO"));
                    produto.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                    produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                    produto.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                    produto.setQuantidadeEstoqueAnterior(rs.getDouble("QUANTIDADE_ESTOQUE_ANTERIOR"));
                    produto.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                    produto.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                    produto.setIat(rs.getString("IAT"));
                    produto.setIppt(rs.getString("IPPT"));
                    produto.setNcm(rs.getString("NCM"));
                    produto.setTipoItemSped(rs.getString("TIPO_ITEM_SPED"));
                    produto.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                    produto.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                    produto.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                    produto.setCodigoBalanca(rs.getInt("CODIGO_BALANCA"));
                    produto.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                    produto.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                    listaProduto.add(produto);
                }
                return listaProduto;
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

    public List<ProdutoVO> tabelaProduto(String pNomeInicio, String pNomeFim) {
        consultaSQL =
                "select count(*) as TOTAL "
                + "from PRODUTO P, UNIDADE_PRODUTO U "
                + "where (P.ID_UNIDADE_PRODUTO = U.ID) "
                + "and (P.NOME like '%" + pNomeInicio.trim() + "%' and '%" + pNomeFim.trim() + "%')";

        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.first();
            Integer totalRegistros = rs.getInt("TOTAL");

            if (totalRegistros > 0) {
                List<ProdutoVO> listaProduto = new ArrayList<ProdutoVO>();
                consultaSQL =
                        "select "
                        + " P.ID, "
                        + " P.ID_UNIDADE_PRODUTO, "
                        + " P.GTIN, "
                        + " P.CODIGO_INTERNO, "
                        + " P.NOME AS NOME_PRODUTO, "
                        + " P.DESCRICAO, "
                        + " P.DESCRICAO_PDV, "
                        + " P.VALOR_VENDA, "
                        + " P.QUANTIDADE_ESTOQUE, "
                        + " P.QUANTIDADE_ESTOQUE_ANTERIOR, "
                        + " P.ESTOQUE_MINIMO, "
                        + " P.ESTOQUE_MAXIMO, "
                        + " P.IAT, "
                        + " P.IPPT, "
                        + " P.NCM, "
                        + " P.TIPO_ITEM_SPED, "
                        + " P.ALIQUOTA_ISSQN_PAF, "
                        + " P.ALIQUOTA_ICMS_PAF, "
                        + " P.TOTALIZADOR_PARCIAL, "
                        + " P.CODIGO_BALANCA, "
                        + " U.SIGLA, "
                        + " U.PODE_FRACIONAR "
                        + "from "
                        + " PRODUTO P, UNIDADE_PRODUTO U "
                        + "where "
                        + " (P.ID_UNIDADE_PRODUTO = U.ID)"
                        + "and (P.NOME like '%" + pNomeInicio.trim() + "%' and '%" + pNomeFim.trim() + "%')";

                stm = bd.conectar().createStatement();
                rs = stm.executeQuery(consultaSQL);
                rs.beforeFirst();
                while (rs.next()) {
                    ProdutoVO produto = new ProdutoVO();
                    UnidadeProdutoVO unidadeProdutoVO = new UnidadeProdutoVO();
                    produto.setUnidadeProdutoVO(unidadeProdutoVO);
                    produto.setId(rs.getInt("ID"));
                    produto.getUnidadeProdutoVO().setId(rs.getInt("ID_UNIDADE_PRODUTO"));
                    produto.setGtin(rs.getString("GTIN"));
                    produto.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
                    produto.setNome(rs.getString("NOME_PRODUTO"));
                    produto.setDescricao(rs.getString("DESCRICAO"));
                    produto.setDescricaoPdv(rs.getString("DESCRICAO_PDV"));
                    produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                    produto.setQuantidadeEstoque(rs.getDouble("QUANTIDADE_ESTOQUE"));
                    produto.setQuantidadeEstoqueAnterior(rs.getDouble("QUANTIDADE_ESTOQUE_ANTERIOR"));
                    produto.setEstoqueMinimo(rs.getDouble("ESTOQUE_MINIMO"));
                    produto.setEstoqueMaximo(rs.getDouble("ESTOQUE_MAXIMO"));
                    produto.setIat(rs.getString("IAT"));
                    produto.setIppt(rs.getString("IPPT"));
                    produto.setNcm(rs.getString("NCM"));
                    produto.setTipoItemSped(rs.getString("TIPO_ITEM_SPED"));
                    produto.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));
                    produto.setAliquotaIssqnPaf(rs.getDouble("ALIQUOTA_ISSQN_PAF"));
                    produto.setTotalizadorParcial(rs.getString("TOTALIZADOR_PARCIAL"));
                    produto.setCodigoBalanca(rs.getInt("CODIGO_BALANCA"));
                    produto.getUnidadeProdutoVO().setSigla(rs.getString("SIGLA"));
                    produto.getUnidadeProdutoVO().setPodeFracionar(rs.getString("PODE_FRACIONAR"));
                    listaProduto.add(produto);
                }
                return listaProduto;
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

    public List<ViewSpedNfeItemVO> consultaProdutoSped(String pDataInicial, String pDataFinal) {

        try {
            List<ViewSpedNfeItemVO> listaProduto = new ArrayList<ViewSpedNfeItemVO>();

            consultaSQL =
                    "select * from VIEW_SPED_NFE_ITEM where "
                    + " ID in (select ID_PRODUTO from NFE_DETALHE JOIN NFE_CABECALHO ON NFE_DETALHE.ID_NFE_CABECALHO = NFE_CABECALHO.ID"
                    + " where NFE_CABECALHO.DATA_EMISSAO BETWEEN '" + pDataInicial + "' and '" + pDataFinal + "')";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedNfeItemVO produto = new ViewSpedNfeItemVO();

                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setGtin(rs.getString("GTIN"));
                produto.setIdUnidadeProduto(rs.getInt("ID_UNIDADE_PRODUTO"));
                produto.setSigla(rs.getString("SIGLA"));
                produto.setTipoItemSped(rs.getString("TIPO_ITEM_SPED"));
                produto.setNcm(rs.getString("NCM"));
                produto.setExTipi(rs.getString("EX_TIPI"));
                produto.setCodigoLst(rs.getString("CODIGO_LST"));
                produto.setAliquotaIcmsPaf(rs.getDouble("ALIQUOTA_ICMS_PAF"));

                listaProduto.add(produto);
            }
            if (listaProduto.size() > 0) {
                return listaProduto;
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


    public List<ProdutoAlteracaoItemVO> consultaProdutoAlterado(String pDataInicial, String pDataFinal) {

        try {
            List<ProdutoAlteracaoItemVO> listaProduto = new ArrayList<ProdutoAlteracaoItemVO>();

            consultaSQL =
                    "select * from PRODUTO_ALTERACAO_ITEM "
                    + " where DATA_INICIAL BETWEEN '" + pDataInicial + "' and '" + pDataFinal + "'";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ProdutoAlteracaoItemVO produto = new ProdutoAlteracaoItemVO();

                produto.setId(rs.getInt("ID"));
                produto.setIdProduto(rs.getInt("ID_PRODUTO"));
                produto.setCodigo(rs.getString("CODIGO"));
                produto.setNome(rs.getString("NOME"));
                produto.setDataInicial(rs.getDate("DATA_INICIAL"));
                produto.setDataFinal(rs.getDate("DATA_FINAL"));

                listaProduto.add(produto);
            }
            if (listaProduto.size() > 0) {
                return listaProduto;
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
    
    public boolean consultaIdProduto(Integer pId) {
        consultaSQL =
                "select "
                + " ID "
                + "from "
                + " PRODUTO "
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
}
