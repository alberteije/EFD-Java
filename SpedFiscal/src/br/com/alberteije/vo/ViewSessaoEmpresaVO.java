/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alberteije.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Eije
 */
@Entity
@Table(name = "view_sessao_empresa")
@NamedQueries({
    @NamedQuery(name = "ViewSessaoEmpresaVO.findAll", query = "SELECT v FROM ViewSessaoEmpresaVO v")})
public class ViewSessaoEmpresaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_EMPRESA")
    private int idEmpresa;
    @Basic(optional = false)
    @Column(name = "ID_PESSOA")
    private int idPessoa;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;

    public ViewSessaoEmpresaVO() {
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
}
