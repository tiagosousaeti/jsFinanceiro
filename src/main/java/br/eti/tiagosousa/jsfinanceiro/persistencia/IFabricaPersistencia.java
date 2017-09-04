package br.eti.tiagosousa.jsfinanceiro.persistencia;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public interface IFabricaPersistencia {
    public IGatewayUsuario getGatewayUsuario();
    public IPesquisadorDeUsuario getPesquisadorDeUsuario();
}