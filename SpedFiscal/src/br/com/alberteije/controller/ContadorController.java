/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller do contador</p>
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
import br.com.alberteije.vo.ContadorVO;
import br.com.alberteije.vo.PessoaVO;
import br.com.alberteije.vo.ViewPessoaContadorVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ContadorController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public ViewPessoaContadorVO pegaContador(Integer pId) {
        ViewPessoaContadorVO contador = new ViewPessoaContadorVO();
        
        consultaSQL =
                "select * from VIEW_PESSOA_CONTADOR where ID=" + pId;
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                contador.setId(rs.getInt("ID"));
                contador.setNome(rs.getString("NOME"));
                contador.setCpfCnpj(rs.getString("CPF_CNPJ"));
                contador.setInscricaoCrc(rs.getString("INSCRICAO_CRC"));
                contador.setFone(rs.getString("FONE"));
                contador.setFax(rs.getString("FAX"));
                contador.setLogradouro(rs.getString("LOGRADOURO"));
                contador.setNumero(rs.getString("NUMERO"));
                contador.setComplemento(rs.getString("COMPLEMENTO"));
                contador.setBairro(rs.getString("BAIRRO"));
                contador.setCep(rs.getString("CEP"));
                contador.setMunicipioIbge(rs.getInt("MUNICIPIO_IBGE"));
                contador.setUf(rs.getString("UF"));
                contador.setEmail(rs.getString("EMAIL"));
                return contador;
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
