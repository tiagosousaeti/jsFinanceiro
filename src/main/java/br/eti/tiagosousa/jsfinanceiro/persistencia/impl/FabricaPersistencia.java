package br.eti.tiagosousa.jsfinanceiro.persistencia.impl;

import br.eti.tiagosousa.jsfinanceiro.persistencia.IFabricaPersistencia;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IGatewayUsuario;
import br.eti.tiagosousa.jsfinanceiro.persistencia.IPesquisadorDeUsuario;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class FabricaPersistencia implements IFabricaPersistencia {

    @Override
    public IGatewayUsuario getGatewayUsuario() {
        return new GatewayUsuario();
    }
    
    public IPesquisadorDeUsuario getPesquisadorDeUsuario() {
        return new PesquisadorDeUsuario();
    }
}