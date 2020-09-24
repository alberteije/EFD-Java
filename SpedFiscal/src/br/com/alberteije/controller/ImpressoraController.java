/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller da impressora (ECF)</p>
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
import br.com.alberteije.vo.EcfImpressoraVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImpressoraController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public List<EcfImpressoraVO> tabelaImpressora() {
        try {
            List<EcfImpressoraVO> listaImpressora = new ArrayList<EcfImpressoraVO>();
            consultaSQL = "select * from ECF_IMPRESSORA";

            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            while (rs.next()) {
                EcfImpressoraVO impressora = new EcfImpressoraVO();
                impressora.setId(rs.getInt("ID"));
                impressora.setNumero(rs.getInt("NUMERO"));
                impressora.setCodigo(rs.getString("CODIGO"));
                impressora.setSerie(rs.getString("SERIE"));
                impressora.setIdentificacao(rs.getString("IDENTIFICACAO"));
                impressora.setMc(rs.getString("MC"));
                impressora.setMd(rs.getString("MD"));
                impressora.setVr(rs.getString("VR"));
                impressora.setTipo(rs.getString("TIPO"));
                impressora.setMarca(rs.getString("MARCA"));
                impressora.setModelo(rs.getString("MODELO"));
                impressora.setModeloAcbr(rs.getString("MODELO_ACBR"));
                impressora.setModeloDocumentoFiscal(rs.getString("MODELO_DOCUMENTO_FISCAL"));
                impressora.setVersao(rs.getString("VERSAO"));
                impressora.setLe(rs.getString("LE"));
                impressora.setLef(rs.getString("LEF"));
                impressora.setMfd(rs.getString("MFD"));
                impressora.setLacreNaMfd(rs.getString("LACRE_NA_MFD"));
                impressora.setDocto(rs.getString("DOCTO"));
                impressora.setDataInstalacaoSb(rs.getDate("DATA_INSTALACAO_SB"));
                impressora.setHoraInstalacaoSb(rs.getString("HORA_INSTALACAO_SB"));
                listaImpressora.add(impressora);
            }
            if (listaImpressora.size() > 0) {
                return listaImpressora;
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

    public boolean consultaIdImpressora(Integer pId) {
        consultaSQL =
                "select "
                + " ID "
                + "from "
                + " ECF_IMPRESSORA "
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
