package br.eti.tiagosousa.jsfinanceiro.visao.gui;

import java.awt.Dimension;

/**
 * @author tiago
 * 27/08/2017
 * www.tiagosousa.eti.br
 */
public class GUISobre extends javax.swing.JInternalFrame {

    public GUISobre() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lAutor = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        lDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        lLicenca = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taLicenca = new javax.swing.JTextArea();
        bFechar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Financeiro - Sobre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("JS - Financeiro");

        lAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lAutor.setText("Autor");

        tfAutor.setEditable(false);
        tfAutor.setText("Tiago Sousa");

        lDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lDescricao.setText("Descrição");

        taDescricao.setEditable(false);
        taDescricao.setColumns(20);
        taDescricao.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        taDescricao.setLineWrap(true);
        taDescricao.setRows(5);
        taDescricao.setText("Aplicativo implementado com o propósito de\ndemonstrar a utilização de patterns no projeto\ne construção de softwares desktop.");
        taDescricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taDescricao);

        lLicenca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lLicenca.setText("Licença");

        taLicenca.setEditable(false);
        taLicenca.setColumns(20);
        taLicenca.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        taLicenca.setLineWrap(true);
        taLicenca.setRows(5);
        taLicenca.setText("Licença Pública da GNU (GNU General Public License),\nconforme publicada pela Free Software Foundation.");
        taLicenca.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taLicenca);

        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lAutor)
                                    .addComponent(lDescricao)
                                    .addComponent(lLicenca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(bFechar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAutor)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLicenca)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        dispose();
    }//GEN-LAST:event_bFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lAutor;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lLicenca;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextArea taLicenca;
    private javax.swing.JTextField tfAutor;
    // End of variables declaration//GEN-END:variables
}
