package br.eti.tiagosousa.jsfinanceiro.visao.ouvinte;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.controle.ControleUsuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUICadastroDeUsuario;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIMensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class OuvinteDeGUICadastroDeUsuario {
    private final GUICadastroDeUsuario guiCadastroDeUsuario;

    public OuvinteDeGUICadastroDeUsuario(GUICadastroDeUsuario guiCadastroDeUsuario) {
        this.guiCadastroDeUsuario = guiCadastroDeUsuario;
        guiCadastroDeUsuario.bGravarUsuarioAddActionListener(new OuvinteGravarUsuario());
    }
    
    class OuvinteGravarUsuario implements ActionListener {        
        @Override
        public void actionPerformed(ActionEvent e) {
            Usuario usuario;
            try {
                usuario = guiCadastroDeUsuario.getUsuario();
                ControleUsuario controle = new ControleUsuario();
                controle.gravarUsuario(usuario);
                GUIMensagem.exibirMensagem("Usuário gravado com sucesso!", "Financeiro - Usuário", false);
                guiCadastroDeUsuario.limparCampos();
            } catch (JsFinanceiroException ex) {
                GUIMensagem.exibirMensagem(ex.getMessage(), "Financeiro - Usuário", true);
            }
        }
    }
}