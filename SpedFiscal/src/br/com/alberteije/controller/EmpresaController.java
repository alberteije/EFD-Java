/**
 * <p>Title: AlbertEije ERP</p>
 *
 * <p>Description: Controller da empresa</p>
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
import br.com.alberteije.vo.EmpresaVO;
import br.com.alberteije.vo.EnderecoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpresaController {

    String consultaSQL;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    AcessoBanco bd = new AcessoBanco();

    public EmpresaVO pegaEmpresa(Integer pId) {
        EmpresaVO empresa = new EmpresaVO();
        EnderecoVO endereco = new EnderecoVO();
        List<EnderecoVO> listaEndereco = new ArrayList<EnderecoVO>();
        listaEndereco.add(endereco);
        empresa.setEnderecoVOList(listaEndereco);
        
        consultaSQL =
                "select * from EMPRESA E, ENDERECO EN where EN.ID_EMPRESA = E.ID and EN.PRINCIPAL='S' and E.ID=" + pId;
        try {
            stm = bd.conectar().createStatement();
            rs = stm.executeQuery(consultaSQL);
            rs.beforeFirst();
            if (rs.next()) {
                empresa.setId(rs.getInt("ID"));
                empresa.setCnpj(rs.getString("CNPJ"));
                empresa.setInscricaoEstadual(rs.getString("INSCRICAO_ESTADUAL"));
                empresa.setInscricaoMunicipal(rs.getString("INSCRICAO_MUNICIPAL"));
                empresa.setRazaoSocial(rs.getString("RAZAO_SOCIAL"));
                empresa.setNomeFantasia(rs.getString("NOME_FANTASIA"));
                empresa.setDataCadastro(rs.getDate("DATA_CADASTRO"));
                empresa.setCodigoIbgeCidade(rs.getInt("CODIGO_IBGE_CIDADE"));
                empresa.setCodigoIbgeUf(rs.getInt("CODIGO_IBGE_UF"));
                empresa.setContato(rs.getString("CONTATO"));
                empresa.getEnderecoVOList().get(0).setLogradouro(rs.getString("LOGRADOURO"));
                empresa.getEnderecoVOList().get(0).setComplemento(rs.getString("COMPLEMENTO"));
                empresa.getEnderecoVOList().get(0).setBairro(rs.getString("BAIRRO"));
                empresa.getEnderecoVOList().get(0).setCidade(rs.getString("CIDADE"));
                empresa.getEnderecoVOList().get(0).setCep(rs.getString("CEP"));
                empresa.getEnderecoVOList().get(0).setFone(rs.getString("FONE"));
                empresa.getEnderecoVOList().get(0).setFax(rs.getString("FAX"));
                empresa.getEnderecoVOList().get(0).setUf(rs.getString("UF"));
                return empresa;
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