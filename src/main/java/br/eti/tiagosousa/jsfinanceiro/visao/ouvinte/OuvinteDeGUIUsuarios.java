package br.eti.tiagosousa.jsfinanceiro.visao.ouvinte;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.controle.ControleUsuario;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIMensagem;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public class OuvinteDeGUIUsuarios {
    private GUIUsuarios guiUsuarios;
    
    public OuvinteDeGUIUsuarios(GUIUsuarios guiUsuarios) {
        this.guiUsuarios = guiUsuarios;
        this.guiUsuarios.bPesquisarUsuarioAddActionListener(new OuvintePesquisarUsuario());
    }
    
    class OuvintePesquisarUsuario implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                ControleUsuario controle = new ControleUsuario();
                String usuario = guiUsuarios.getUsuario();
                if (usuario != null && !usuario.trim().equals("")) {
                    controle.adicionarCriterioDePesquisaContem("usuario", usuario);
                }
                List usuarios = controle.realizarPesquisa();
                if(usuarios.size() > 0){
                    guiUsuarios.exibirUsuarios(usuarios);
                } else {
                    StringBuilder mensagem = new StringBuilder();
                    mensagem.append("Não há usuários cadastrados ou que");
                    mensagem.append("\natendam ao critério informado.");
                    GUIMensagem.exibirMensagem(mensagem.toString(), "Cadastro de usuário", true);
                }
            } catch (JsFinanceiroException ex) {
                GUIMensagem.exibirMensagem(ex.getMessage(), "Financeiros - Usuários", true);
            }
        }
    }
}