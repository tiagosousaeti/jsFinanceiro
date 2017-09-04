package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public class CriterioDePesquisaContem extends CriterioDePesquisa {

    public CriterioDePesquisaContem(String nomeDoCampo, String valor) {
        super(nomeDoCampo, valor);
    }
    
    public String gerarSQL (){
        return "UPPER (" + this.campo + ") LIKE UPPER ('%" + this.valor + "%')";
    }
}