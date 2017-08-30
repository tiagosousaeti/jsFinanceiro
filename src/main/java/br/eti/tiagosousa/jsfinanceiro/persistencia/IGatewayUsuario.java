package br.eti.tiagosousa.jsfinanceiro.persistencia;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public interface IGatewayUsuario {
    public abstract void gravarUsuario(Usuario usuario) throws JsFinanceiroException;
}