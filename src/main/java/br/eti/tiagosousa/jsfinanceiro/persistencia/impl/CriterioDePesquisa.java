package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public class CriterioDePesquisa {
 
    protected String operadorSQl;
    protected String campo;
    protected Object valor;
    
    protected CriterioDePesquisa(String operadorSQL, String nomeDoCampo, Object valor){
        this.operadorSQl = operadorSQL;
        this.campo = nomeDoCampo;
        this.valor = valor;
    }
    
    protected CriterioDePesquisa(String nomeDoCampo, Object valor){
        this.campo = nomeDoCampo;
        this.valor = valor;
    }
    
    public static CriterioDePesquisa igualA(String nomeDoCampo, int valor){
        return CriterioDePesquisa.igualA(nomeDoCampo, new Integer(valor));
    }
    
    public static CriterioDePesquisa igualA(String nomeDoCampo, Object valor){
        return new CriterioDePesquisa("=", nomeDoCampo, valor);
    }
    
    public static CriterioDePesquisa contem(String nomeDoCampo, String valor){
        return new CriterioDePesquisaContem(nomeDoCampo, valor);
    }
    
    public String gerarSQL(){
        return campo + operadorSQl + valor;
    }
}