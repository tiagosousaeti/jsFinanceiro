package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import java.beans.PropertyVetoException;
import javax.swing.JFrame;

/**
 * @author Tiago Sousa
 * 27/08/2017
 * www.tiagosousa.eti.br
 */
public class GUIPrincipal extends javax.swing.JFrame {

    public GUIPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemDeMenuImportar = new javax.swing.JMenuItem();
        itemDeMenuExportar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemDeMenuSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        itemDeMenuUsuario = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemDeMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financeiro");

        menuArquivo.setMnemonic('f');
        menuArquivo.setText("Arquivo");

        itemDeMenuImportar.setMnemonic('o');
        itemDeMenuImportar.setText("Importar...");
        menuArquivo.add(itemDeMenuImportar);

        itemDeMenuExportar.setMnemonic('s');
        itemDeMenuExportar.setText("Exportar...");
        menuArquivo.add(itemDeMenuExportar);
        menuArquivo.add(jSeparator1);

        itemDeMenuSair.setMnemonic('x');
        itemDeMenuSair.setText("Sair");
        itemDeMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemDeMenuSair);

        menuBar.add(menuArquivo);

        menuCadastro.setText("Cadastro");

        itemDeMenuUsuario.setText("Usuarios");
        itemDeMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemDeMenuUsuario);

        menuBar.add(menuCadastro);

        menuAjuda.setMnemonic('h');
        menuAjuda.setText("Ajuda");

        itemDeMenuSobre.setMnemonic('a');
        itemDeMenuSobre.setText("Sobre");
        itemDeMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemDeMenuSobre);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDeMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemDeMenuSairActionPerformed

    private void itemDeMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSobreActionPerformed
        if ((guiSobre == null) || (!guiSobre.isVisible())) {
            guiSobre = new GUISobre();
            desktopPane.add(guiSobre);
            guiSobre.setPosicao();
            guiSobre.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuSobreActionPerformed

    private void itemDeMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuUsuarioActionPerformed
        if ((guiUsuarios == null) || (!guiUsuarios.isVisible())) {
            guiUsuarios = new GUIUsuarios();
            desktopPane.add(guiUsuarios);
            guiUsuarios.setPosicao();
            guiUsuarios.setVisible(true);
        }
        try {
            guiUsuarios.setSelected(true);
        } catch (PropertyVetoException exc) {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Não foi possível selecionar a janela!");
            mensagem.append("\nMotivo: " + exc.getMessage());
            GUIMensagem.exibirMensagem(mensagem.toString(), "Financeiro - Usuários", true);
        }
    }//GEN-LAST:event_itemDeMenuUsuarioActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemDeMenuExportar;
    private javax.swing.JMenuItem itemDeMenuImportar;
    private javax.swing.JMenuItem itemDeMenuSair;
    private javax.swing.JMenuItem itemDeMenuSobre;
    private javax.swing.JMenuItem itemDeMenuUsuario;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    // End of variables declaration//GEN-END:variables

    private GUISobre guiSobre;
    private GUIUsuarios guiUsuarios;
}