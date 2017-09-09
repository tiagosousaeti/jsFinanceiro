package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.Usuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.constante.Constante;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.constante.NivelDoUsuario;
import br.eti.tiagosousa.jsfinanceiro.modelo.dominio.constante.StatusDoUsuario;
import br.eti.tiagosousa.jsfinanceiro.util.MD5;
import java.awt.Dimension;
import java.awt.event.ActionListener;

/**
 * @author Tiago Sousa
 * 29/08/2017
 * www.tiagosousa.eti.br
 */
public class GUICadastroDeUsuario extends javax.swing.JInternalFrame {

    public GUICadastroDeUsuario() throws Exception {
        initComponents();
        md5 = new MD5();
        for (NivelDoUsuario nivel : NivelDoUsuario.values()) {
            cbNivel.addItem(nivel.name());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        pDadosUsuario = new javax.swing.JPanel();
        lNivel = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox();
        lUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lStatus = new javax.swing.JLabel();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        lSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        bGravarUsuario = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Financeiro - Cadastro de Usuário");

        pDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Sócio"));

        lNivel.setText("Nível");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));

        lUsuario.setText("Usuário");

        lEmail.setText("E-mail");

        lStatus.setText("Status");

        bgStatus.add(rbAtivo);
        rbAtivo.setText("Ativo");

        bgStatus.add(rbInativo);
        rbInativo.setText("Inativo");

        lSenha.setText("Senha");

        javax.swing.GroupLayout pDadosUsuarioLayout = new javax.swing.GroupLayout(pDadosUsuario);
        pDadosUsuario.setLayout(pDadosUsuarioLayout);
        pDadosUsuarioLayout.setHorizontalGroup(
            pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lUsuario)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNivel)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(rbAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbInativo))
                            .addComponent(lStatus)))
                    .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lEmail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lSenha)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pDadosUsuarioLayout.setVerticalGroup(
            pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lEmail)
                            .addComponent(lSenha))
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                        .addComponent(lNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDadosUsuarioLayout.createSequentialGroup()
                        .addComponent(lStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAtivo)
                            .addComponent(rbInativo))))
                .addContainerGap())
        );

        bGravarUsuario.setText("Gravar");

        bLimpar.setText("Limpar");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bGravarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGravarUsuario)
                    .addComponent(bLimpar)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_bLimparActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bGravarUsuario;
    private javax.swing.JButton bLimpar;
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JComboBox cbNivel;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNivel;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPanel pDadosUsuario;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
    
    private MD5 md5;
    private Usuario usuario;
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation(15 + (d.width - this.getSize().width) / 5, 15 + (d.height - this.getSize().height) / 5);
    }
    
    public Usuario getUsuario() throws JsFinanceiroException, Exception {
        String txtUsuario = tfUsuario.getText();
        if (txtUsuario == null || txtUsuario.trim().equals("")){
            tfUsuario.requestFocus();
            throw new JsFinanceiroException("Não foi informado o usuário.");
        } else {
            usuario.setUsuario(txtUsuario);
        }
        
        usuario.setEmail(tfEmail.getText());
        usuario.setSenha(md5.encrypt(tfSenha.getText()));
        
        int nivel = cbNivel.getSelectedIndex();
        if (nivel == 0) {
            throw new JsFinanceiroException("Não foi informado o nível do usuário.");
        } else {
            usuario.setNivel(nivel - 1);
        }
        
        if (rbAtivo.isSelected()){
            usuario.setStatus(StatusDoUsuario.Ativo.ordinal());
        } else if (rbInativo.isSelected()) {
            usuario.setStatus(StatusDoUsuario.Inativo.ordinal());
        } else {
            throw new JsFinanceiroException("Não foi informado o status do usuário.");
        }
        return usuario;
    }
    
    public void exibeDadosDoUsuario() throws JsFinanceiroException {
        limparCampos();
        if (usuario.getId() != Constante.NOVO) {
            tfUsuario.setText(usuario.getUsuario());
            tfEmail.setText(usuario.getEmail());
            tfSenha.setText(md5.decrypt(usuario.getSenha()));
            cbNivel.setSelectedIndex(usuario.getNivel() + 1);            
            if (usuario.getStatus() == StatusDoUsuario.Ativo.ordinal()) {
                rbAtivo.setSelected(true);
            }
            if (usuario.getStatus() == StatusDoUsuario.Inativo.ordinal()) {
                rbInativo.setSelected(true);
            }        
        }
    }
    
    public void setUsuario(Usuario usuario) throws JsFinanceiroException{
        this.usuario = usuario;
        this.exibeDadosDoUsuario();
    }
    
    public void bGravarUsuarioAddActionListener(ActionListener ouvinte) {
        bGravarUsuario.addActionListener(ouvinte);
    }
    
    public void limparCampos(){
        tfUsuario.setText(null);
        tfEmail.setText(null);
        tfSenha.setText(null);
        cbNivel.setSelectedIndex(0);
    }
}