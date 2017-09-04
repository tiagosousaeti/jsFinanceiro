package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

import br.eti.tiagosousa.jsfinanceiro.persistencia.IPesquisadorDeUsuario;
import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import netscape.javascript.JSException;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public class PesquisadorDeUsuario implements IPesquisadorDeUsuario {
    private List criterios = new ArrayList();
    
    @Override
    public void adicionarCriterio(CriterioDePesquisa criterio) {
        this.criterios.add(criterio);
    }
    
    private String gerarClausulaWhere() {
        StringBuilder clausulaWhere = new StringBuilder();
        if (criterios.size() != 0) {
            clausulaWhere.append(" WHERE ");
            Iterator iterator = criterios.iterator();
            while (iterator.hasNext()) {
                if (clausulaWhere.length() != 7) {
                    clausulaWhere.append(" OR ");
                }
                CriterioDePesquisa criterio = (CriterioDePesquisa) iterator.next();
                clausulaWhere.append(criterio.gerarSQL());
            }
        }
        return clausulaWhere.toString();
    }
    
    private List encontrarUsuariosOnde(String clausulaWhere) throws JsFinanceiroException {
        String sql = "SELECT * FROM usuario" + clausulaWhere;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List resultado = new ArrayList();
        try {
            con = GerenciadorDeConexao.getConexao();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = criarUsuario(rs);
                resultado.add(usuario);
            }
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível realizar a consulta.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JSException(mensagem.toString());
        } finally {
            GerenciadorDeConexao.closeConexao(con, stmt, rs);
        }
        return resultado;
    }
    
    private Usuario criarUsuario(ResultSet rs) throws JsFinanceiroException {
        Usuario usuario = new Usuario();
        try {
            usuario.setId(rs.getLong("id"));
            usuario.setUsuario(rs.getString("usuario"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setNivel(rs.getInt("nivel"));
            usuario.setStatus(rs.getInt("status"));            
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível obter os dados do usuário.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JSException(mensagem.toString());
        }
        return usuario;
    }
    
    @Override
    public List realizarPesquisa() throws JsFinanceiroException {
        String clausulaWhere = this.gerarClausulaWhere();
        return encontrarUsuariosOnde(clausulaWhere);
    }
}