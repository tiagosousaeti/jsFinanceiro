package br.eti.tiagosousa.jsfinanceiro.persistencia;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.persistencia.impl.CriterioDePesquisa;
import java.util.List;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public interface IPesquisadorDeUsuario {
    public void adicionarCriterio(CriterioDePesquisa criterio);
    public List realizarPesquisa() throws JsFinanceiroException;   
}