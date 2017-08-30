package br.eti.tiagosousa.jsfinanceiro.modelo.dominio;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public class Usuario {
    private long id;
    private String usuario;
    private String email;
    private String senha;
    private Integer nivel;
    private Integer status;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws JsFinanceiroException {
        if (!this.isUsuarioValido(usuario.trim())){
            throw new JsFinanceiroException("O usuário deve ser informado!");
        }
        
        this.usuario = usuario;             
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
        
    private boolean isUsuarioValido(String usuario){
        if (usuario == null || usuario.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}