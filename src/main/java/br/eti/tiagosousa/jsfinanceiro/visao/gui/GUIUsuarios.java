package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.constante.Constante;
import br.eti.tiagosousa.jsfinanceiro.visao.ouvinte.OuvinteDeGUICadastroDeUsuario;
import java.awt.Dimension;
import java.beans.PropertyVetoException;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class GUIUsuarios extends javax.swing.JInternalFrame {

    public GUIUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tUsuarios = new javax.swing.JTable();
        bNovoUsuario = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        pPesquisarUsuario = new javax.swing.JPanel();
        lUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Financeiro - Usuários");

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tUsuarios);

        bNovoUsuario.setText("Novo usuário");
        bNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoUsuarioActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bAlterar.setText("Alterar");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        pPesquisarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Critério de Pesquisa"));

        lUsuario.setText("Usuário");

        bPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout pPesquisarUsuarioLayout = new javax.swing.GroupLayout(pPesquisarUsuario);
        pPesquisarUsuario.setLayout(pPesquisarUsuarioLayout);
        pPesquisarUsuarioLayout.setHorizontalGroup(
            pPesquisarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPesquisarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPesquisarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPesquisar)
                    .addComponent(lUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pPesquisarUsuarioLayout.createSequentialGroup()
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        pPesquisarUsuarioLayout.setVerticalGroup(
            pPesquisarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPesquisarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovoUsuario)
                    .addComponent(bAlterar)
                    .addComponent(bExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoUsuarioActionPerformed
        Usuario usuario = new Usuario();        
        usuario.setId(Constante.NOVO);
        this.abrirGUICadastroDeUsuario(usuario);
    }//GEN-LAST:event_bNovoUsuarioActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bNovoUsuario;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPanel pPesquisarUsuario;
    private javax.swing.JTable tUsuarios;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    private GUICadastroDeUsuario guiCadastroDeUsuario;
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 6, (d.height - this.getSize().height) / 6);
    }
    
    private void abrirGUICadastroDeUsuario (Usuario usuario) {
        if ((guiCadastroDeUsuario == null) || (!guiCadastroDeUsuario.isVisible())) {
            guiCadastroDeUsuario = new GUICadastroDeUsuario();
            OuvinteDeGUICadastroDeUsuario ouvinte = new OuvinteDeGUICadastroDeUsuario(guiCadastroDeUsuario);
            this.getParent().add(guiCadastroDeUsuario);
            guiCadastroDeUsuario.setPosicao();
            guiCadastroDeUsuario.setVisible(true);
            guiCadastroDeUsuario.setUsuario(usuario);
        }
        try {
            guiCadastroDeUsuario.setSelected(true);
        } catch (PropertyVetoException exc) {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Não foi possível selecionar a janela de cadastro de usuário!");
            mensagem.append("\nMotivo: " + exc.getMessage());
            GUIMensagem.exibirMensagem(mensagem.toString(), "Financeiro - Cadastro de usuário", true);
        }
    }
}