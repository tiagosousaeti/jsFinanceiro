package br.eti.tiagosousa.jsfinanceiro.visao.ouvinte;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.controle.ControleUsuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIMensagem;
import br.eti.tiagosousa.jsfinanceiro.visao.gui.GUIUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Tiago Sousa
 * 03/09/2017
 * www.tiagosousa.eti.br
 */
public class OuvinteDeGUIUsuarios {
    private final GUIUsuarios guiUsuarios;
    
    public OuvinteDeGUIUsuarios(GUIUsuarios guiUsuarios) {
        this.guiUsuarios = guiUsuarios;
        this.guiUsuarios.bPesquisarUsuarioAddActionListener(new OuvintePesquisarUsuario());
        this.guiUsuarios.bExcluirUsuarioAddActionListener(new OuvinteExcluirUsuario());
    }
    
    class OuvintePesquisarUsuario implements ActionListener {
        @Override
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
                    GUIMensagem.exibirMensagem(mensagem.toString(), "Cadastro de Usuário", true);
                }
            } catch (JsFinanceiroException ex) {
                GUIMensagem.exibirMensagem(ex.getMessage(), "Financeiro - Usuários", true);
            }
        }
    }
    
    class OuvinteExcluirUsuario implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Usuario usuario = guiUsuarios.getUsuarios();
                StringBuilder mensagem = new StringBuilder("Confirma a exclusão do usuário: ");
                mensagem.append("\nCódigo: ").append(usuario.getId());
                mensagem.append("\nNome: ").append(usuario.getUsuario());
                int resposta = guiUsuarios.pedirConfirmacao(mensagem.toString(), "Exclusão de registro", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.OK_OPTION) {
                    ControleUsuario controle = new ControleUsuario();
                    controle.excluirUsuario(usuario);
                    GUIMensagem.exibirMensagem("Usuário excluído com sucesso!", "Cadastro de Usuário", false);
                }
            } catch (JsFinanceiroException ex) {
                GUIMensagem.exibirMensagem(ex.getMessage(), "Financeiro - Usuários", true);
            }
        }
    }
}