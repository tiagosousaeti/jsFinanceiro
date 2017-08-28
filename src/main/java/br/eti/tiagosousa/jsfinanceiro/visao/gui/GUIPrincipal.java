package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import javax.swing.JFrame;

/**
 * @data 27/08/2017
 * @author Tiago Sousa
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
        menuAjuda = new javax.swing.JMenu();
        itemDeMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JS - Financeiro");

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

        menuAjuda.setMnemonic('h');
        menuAjuda.setText("Ajuda");

        itemDeMenuSobre.setMnemonic('a');
        itemDeMenuSobre.setText("Sobre");
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
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}