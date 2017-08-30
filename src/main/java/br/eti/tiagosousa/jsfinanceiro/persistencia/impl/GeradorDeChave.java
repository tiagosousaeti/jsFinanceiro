package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public class GeradorDeChave {
    private static final byte INCREMENTO = 1;
    private Connection con;
    private String tabela;
    private long proximoCodigo;
    private long maximoCodigo;
    
    public GeradorDeChave(String tabela) throws JsFinanceiroException {
        this.con = GerenciadorDeConexao.getConexao();
        this.tabela = tabela;
        proximoCodigo = 0;
        maximoCodigo = 0;
        try {
            con.setAutoCommit(false);
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível desligar a confirmação automática");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        }
    }

    public synchronized long getProximoCodigo() throws JsFinanceiroException {
        if (proximoCodigo == maximoCodigo) {
            reservarCodigo();
        }
        return proximoCodigo;
    }

    private void reservarCodigo() throws JsFinanceiroException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        long proximoCodigoNovo;
        String sql = "SELECT proximoId FROM chaves WHERE tabela = ? FOR UPDATE";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tabela);
            rs = stmt.executeQuery();
            rs.next();
            proximoCodigoNovo = rs.getLong("proximoId");
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível gerar o próximo código");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        }
        long maximoCodigoNovo = proximoCodigoNovo + INCREMENTO;
        stmt = null;
        rs = null;
        try {
            sql = "UPDATE chaves SET proximoId = ? WHERE tabela = ?";
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, maximoCodigoNovo);
            stmt.setString(2, tabela);
            stmt.executeUpdate();
            con.commit();
            proximoCodigo = proximoCodigoNovo;
            maximoCodigo = maximoCodigoNovo;
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível gerar o código");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } finally {
            GerenciadorDeConexao.closeConexao(con, stmt, rs);
        }
    }        
}