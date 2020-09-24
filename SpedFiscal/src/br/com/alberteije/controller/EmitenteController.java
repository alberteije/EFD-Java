/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do emitente</p>
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
import br.com.alberteije.vo.ViewSpedNfeEmitenteVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmitenteController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<ViewSpedNfeEmitenteVO> tabelaEmitente(String pDataInicial, String pDataFinal) {

        try {
            List<ViewSpedNfeEmitenteVO> listaEmitente = new ArrayList<ViewSpedNfeEmitenteVO>();
            consultaSQL =
                    "select * from VIEW_SPED_NFE_EMITENTE where ID in (select ID_FORNECEDOR from NFE_CABECALHO where DATA_EMISSAO BETWEEN '" + pDataInicial + "' and '" + pDataFinal + "')";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedNfeEmitenteVO emitente = new ViewSpedNfeEmitenteVO();
                emitente.setId(rs.getInt("ID"));
                emitente.setRazaoSocial(rs.getString("RAZAO_SOCIAL"));
                emitente.setCpfCnpj(rs.getString("CPF_CNPJ"));
                emitente.setInscricaoEstadual(rs.getString("INSCRICAO_ESTADUAL"));
                emitente.setCodigoMunicipio(rs.getInt("CODIGO_MUNICIPIO"));
                emitente.setSuframa(rs.getString("SUFRAMA"));
                emitente.setLogradouro(rs.getString("LOGRADOURO"));
                emitente.setNumero(rs.getString("NUMERO"));
                emitente.setComplemento(rs.getString("COMPLEMENTO"));
                emitente.setBairro(rs.getString("BAIRRO"));
                listaEmitente.add(emitente);
            }
            if (listaEmitente.size() > 0) {
                return listaEmitente;
            }
            else
            {
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
