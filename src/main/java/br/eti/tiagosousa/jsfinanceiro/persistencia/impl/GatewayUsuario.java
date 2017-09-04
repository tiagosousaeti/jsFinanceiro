package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.constante.Constante;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IGatewayUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class GatewayUsuario implements IGatewayUsuario {

    private static final String SQL_INCLUIRUSUARIO = "INSERT INTO usuario (id, usuario, email, senha, nivel, status) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_ALTERARUSUARIO = "UPDATE usuario SET usuario = ?, email = ?, senha = ?, nivel = ?, status = ? WHERE id = ?";
    private static final String SQL_EXCLUIRUSUARIO = "DELETE FROM usuario WHERE id = ?";
    
    @Override
    public void gravarUsuario(Usuario usuario) throws JsFinanceiroException {
        if (usuario.getId() == Constante.NOVO) {
            incluirUsuario(usuario);
        } else {
            alterarUsuario(usuario);
        }
    }
    
    private void incluirUsuario(Usuario usuario) throws JsFinanceiroException {
        if (usuario == null) {
            String mensagem = "Não foi informado o socio a cadastrar.";
            throw new JsFinanceiroException(mensagem);
        }
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = GerenciadorDeConexao.getConexao();
            stmt = con.prepareStatement(SQL_INCLUIRUSUARIO);
            GeradorDeChave geradorDeChave = new GeradorDeChave("usuario");
            long id = geradorDeChave.getProximoCodigo();
            stmt.setLong(1, id);
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getNivel());
            stmt.setInt(6, usuario.getStatus());
            stmt.executeUpdate();
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível incluir o sócio.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } finally {
            GerenciadorDeConexao.closeConexao(con, stmt);
        }
    }
    
    private void alterarUsuario(Usuario u) throws JsFinanceiroException {
        if (u == null) {
            String mensagem = "Não foi informado o usuário a alterar";
            throw new JsFinanceiroException(mensagem);
        }
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = GerenciadorDeConexao.getConexao();
            stmt = con.prepareStatement(SQL_ALTERARUSUARIO);
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setInt(4, u.getNivel());
            stmt.setInt(5, u.getStatus());
            stmt.setLong(6, u.getId());
            stmt.executeUpdate();
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível atualizar os dados do usuário.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } finally {
            GerenciadorDeConexao.closeConexao(con, stmt);
        }
    }
    
    public void excluirUsuario(Usuario u) throws JsFinanceiroException {
        if (u == null) {
            String mensagem = "Não foi informado o usuário a excluir.";
            throw new JsFinanceiroException(mensagem);
        }
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = GerenciadorDeConexao.getConexao();
            stmt = con.prepareStatement(SQL_EXCLUIRUSUARIO);
            stmt.setLong(1, u.getId());
            stmt.executeUpdate();
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível excluir o usuário.");
            mensagem.append("\nMotivo:" + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } finally {
            GerenciadorDeConexao.closeConexao(con, stmt);
        }
    }
}