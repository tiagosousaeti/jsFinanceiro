package br.eti.tiagosousa.jsfinanceiro.modelo.controle;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IFabricaPersistencia;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IGatewayUsuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.impl.FabricaPersistencia;

/**
 * @author Tiago Sousa
 * 28/08/2017
 * www.tiagosousa.eti.br
 */
public class ControleUsuario {
    public void gravarSocio(Usuario usuario) throws JsFinanceiroException {
        IFabricaPersistencia fabricaPersistencia = new FabricaPersistencia();
        IGatewayUsuario gatewayUsuario = fabricaPersistencia.getGatewayUsuario();
        gatewayUsuario.gravarUsuario(usuario);
    }
}