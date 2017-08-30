package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public class GerenciadorDeConexao {
    private static String driver;
    private static String url;
    private static String usuario;
    private static String senha;
    
    private static void init() throws JsFinanceiroException {
        Properties properties = new Properties();
        FileInputStream arquivoDePropriedades = null;
        try {
            arquivoDePropriedades = new FileInputStream("database.properties");
            properties.load(arquivoDePropriedades);
            driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            usuario = properties.getProperty("jdbc.username");
            senha = properties.getProperty("jdbc.password");
            Class.forName(driver);
        } catch (FileNotFoundException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível conectar com banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } catch (IOException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível conectar com banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        } catch (ClassNotFoundException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível conectar com banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        }
    }
    
    static Connection getConexao() throws JsFinanceiroException {
        try {
            init();
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível estabelecer conexão com o banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        }
    }
    
    static void closeConexao(Connection con) throws JsFinanceiroException {
        closeConexao(con, null, null);
    }
    
    static void closeConexao(Connection con, PreparedStatement stmt) throws JsFinanceiroException {
        closeConexao(con, stmt, null);
    }
    
    static void closeConexao(Connection con, PreparedStatement stmt, ResultSet rs) throws JsFinanceiroException {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException exc) {
            StringBuilder mensagem = new StringBuilder("Não foi possível finalizar a conexão com banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JsFinanceiroException(mensagem.toString());
        }
    }
}