package br.eti.tiagosousa.jsfinanceiro.excecao;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public class JsFinanceiroException extends Exception {

    public JsFinanceiroException() {
        super("Causa do erro: Desconhecida");
    }    

    public JsFinanceiroException(String message) {
        super(message);
    }
}