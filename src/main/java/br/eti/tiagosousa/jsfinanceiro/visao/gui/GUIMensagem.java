package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import javax.swing.JOptionPane;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class GUIMensagem extends JOptionPane {
    
    public static void exibirMensagem(String mensagem, String titulo, boolean isErro) {
        int tipo;
        if (isErro) {
            tipo = JOptionPane.ERROR_MESSAGE;
        } else {
            tipo = JOptionPane.INFORMATION_MESSAGE;
        }
        showMessageDialog(null, mensagem, titulo, tipo);
    }
}