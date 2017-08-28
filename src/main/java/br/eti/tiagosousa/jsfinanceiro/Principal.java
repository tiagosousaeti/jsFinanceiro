package br.eti.tiagosousa.jsfinanceiro;

import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIPrincipal;

/**
 * @data 27/08/2017
 * @author Tiago Sousa
 * www.tiagosousa.eti.br
 */
public class Principal {
    public static void main(String args[]) {
        GUIPrincipal guiPrincipal = new GUIPrincipal();
        guiPrincipal.setLocationRelativeTo(null);
        guiPrincipal.setVisible(true);
    }
}