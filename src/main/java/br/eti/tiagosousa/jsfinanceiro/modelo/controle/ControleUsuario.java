package br.eti.tiagosousa.jsfinanceiro.modelo.controle;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IFabricaPersistencia;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IGatewayUsuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IPesquisadorDeUsuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.impl.CriterioDePesquisa;
import br.eti.tiagosousa.jsfinanceiro.persistencia.impl.CriterioDePesquisaContem;
import br.eti.tiagosousa.jsfinanceiro.persistencia.impl.FabricaPersistencia;
import java.util.List;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class ControleUsuario {
    
    private IPesquisadorDeUsuario pesquisador;
    
    public void gravarUsuario(Usuario usuario) throws JsFinanceiroException {
        IFabricaPersistencia fabricaPersistencia = new FabricaPersistencia();
        IGatewayUsuario gatewayUsuario = fabricaPersistencia.getGatewayUsuario();
        gatewayUsuario.gravarUsuario(usuario);
    }
    
    public void adicionarCriterioDePesquisaIgualA(String campo, int valor) {
        if (this.pesquisador == null) {
            this.criarPesquisador();
        }
        pesquisador.adicionarCriterio(CriterioDePesquisa.igualA(campo, valor));
    }
    
    public void adicionarCriterioDePesquisaContem(String campo, String valor) {
        if (this.pesquisador == null) {
            this.criarPesquisador();
        }
        pesquisador.adicionarCriterio(CriterioDePesquisaContem.contem(campo, valor));
    }
    
    public List realizarPesquisa() throws JsFinanceiroException {
        if (this.pesquisador == null) {
            this.criarPesquisador();
        }
        return pesquisador.realizarPesquisa();
    }
    
    private void criarPesquisador() {
        IFabricaPersistencia fabricaPersistencia = new FabricaPersistencia();
        this.pesquisador = fabricaPersistencia.getPesquisadorDeUsuario();
    }
}