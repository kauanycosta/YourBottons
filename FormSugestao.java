/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import TableModel.SugestaoTableModel;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelDominio.Sugestao;

/**
 *
 * @author Kauany
 */
public class FormSugestao extends javax.swing.JDialog {

    private SugestaoTableModel sugestaomodel;

    public void atualizarTabela() {
        sugestaomodel = new SugestaoTableModel(BottonsCliente.ccont.listaSugestao());
        tablesugestao.setModel(sugestaomodel);
    }

    public FormSugestao() {
        initComponents();
        atualizarTabela();
        jBVoltar.setBackground(Color.white);
        jBNegar.setBackground(Color.white);
        jBAceitar.setBackground(Color.white);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jBVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesugestao = new javax.swing.JTable();
        jBAceitar = new javax.swing.JButton();
        jBNegar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sugestões");

        jPanel1.setBackground(new java.awt.Color(230, 215, 255));

        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/icons8-back-arrow-30.png"))); // NOI18N
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        tablesugestao.setModel(new javax.swing.table.DefaultTableModel(
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
        tablesugestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesugestaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablesugestao);

        jBAceitar.setText("Aceitar");
        jBAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceitarActionPerformed(evt);
            }
        });

        jBNegar.setText("Negar");
        jBNegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNegarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jBAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNegar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNegar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void tablesugestaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesugestaoMouseClicked
        if (evt.getClickCount() == 2) {
            Sugestao sugestao = sugestaomodel.getSugestao(tablesugestao.getSelectedRow());
            FormSugestaoExpandida frmexp = new FormSugestaoExpandida(sugestao);
            frmexp.setModal(true);
            frmexp.setVisible(true);
        }
    }//GEN-LAST:event_tablesugestaoMouseClicked

    private void jBAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceitarActionPerformed
        if (tablesugestao.getSelectedRow() >= 0) {
            Sugestao sugestao = sugestaomodel.getSugestao(tablesugestao.getSelectedRow());

            if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja marcar como aceita?",
                    this.getTitle(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                int sugesta_Aceita = 1;
                int codsugestao = sugestao.getCodsugestao();
                Sugestao sg = new Sugestao(codsugestao, sugesta_Aceita);
             
                BottonsCliente.ccont.AceitarSugestao(sg);
                JOptionPane.showMessageDialog(this, "Sugestão aceita!", this.getTitle(),
                        JOptionPane.INFORMATION_MESSAGE);
                
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao aceitar sugestão!", this.getTitle(),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBAceitarActionPerformed

    private void jBNegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNegarActionPerformed

        if (tablesugestao.getSelectedRow() >= 0) {
            Sugestao sugestao = sugestaomodel.getSugestao(tablesugestao.getSelectedRow());
            if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja marcar como negada?",
                    this.getTitle(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                BottonsCliente.ccont.NegarSugestao(sugestao);
                JOptionPane.showMessageDialog(this, "Sugestão apagada!", this.getTitle(),
                        JOptionPane.INFORMATION_MESSAGE);
                atualizarTabela();

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao negar sugestão!", this.getTitle(),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBNegarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceitar;
    private javax.swing.JButton jBNegar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable tablesugestao;
    // End of variables declaration//GEN-END:variables
}
