/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do Destinatario</p>
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
import br.com.alberteije.vo.ViewSpedNfeDestinatarioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DestinatarioController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<ViewSpedNfeDestinatarioVO> tabelaDestinatario(String pDataInicial, String pDataFinal) {

        try {
            List<ViewSpedNfeDestinatarioVO> listaDestinatario = new ArrayList<ViewSpedNfeDestinatarioVO>();
            consultaSQL =
                    "select * from VIEW_SPED_NFE_Destinatario where ID in (select ID_FORNECEDOR from NFE_CABECALHO where DATA_EMISSAO BETWEEN '" + pDataInicial + "' and '" + pDataFinal + "')";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                ViewSpedNfeDestinatarioVO Destinatario = new ViewSpedNfeDestinatarioVO();
                Destinatario.setId(rs.getInt("ID"));
                Destinatario.setRazaoSocial(rs.getString("RAZAO_SOCIAL"));
                Destinatario.setCpfCnpj(rs.getString("CPF_CNPJ"));
                Destinatario.setInscricaoEstadual(rs.getString("INSCRICAO_ESTADUAL"));
                Destinatario.setCodigoMunicipio(rs.getInt("CODIGO_MUNICIPIO"));
                Destinatario.setSuframa(rs.getString("SUFRAMA"));
                Destinatario.setLogradouro(rs.getString("LOGRADOURO"));
                Destinatario.setNumero(rs.getString("NUMERO"));
                Destinatario.setComplemento(rs.getString("COMPLEMENTO"));
                Destinatario.setBairro(rs.getString("BAIRRO"));
                listaDestinatario.add(Destinatario);
            }
            if (listaDestinatario.size() > 0) {
                return listaDestinatario;
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
