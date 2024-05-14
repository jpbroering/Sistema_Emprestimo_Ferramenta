/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Emprestimo;

public class FrmCadastroEmprestimo extends javax.swing.JFrame {

  private Emprestimo objetoEmprestimo;
    public FrmCadastroEmprestimo() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFIdferramenta = new javax.swing.JTextField();
        JTFIdamigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFdataDiaDev = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFdataDiaEmp = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTFIdferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdferramentaActionPerformed(evt);
            }
        });

        JTFIdamigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdamigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Id amigo:");

        jLabel2.setText("Id ferramenta:");

        jLabel3.setText("Data de emprestimo:");

        JTFdataDiaDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFdataDiaDevActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de devolução:");

        JTFdataDiaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFdataDiaEmpActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFIdferramenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFIdamigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFdataDiaDev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JTFdataDiaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFIdamigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFIdferramenta)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(JTFdataDiaEmp)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(JTFdataDiaDev)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar)
                    .addComponent(JBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFIdferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdferramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdferramentaActionPerformed

    private void JTFIdamigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdamigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdamigoActionPerformed

    private void JTFdataDiaDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFdataDiaDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFdataDiaDevActionPerformed

    private void JTFdataDiaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFdataDiaEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFdataDiaEmpActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try{
            int idAmigo = 0;
            int idFerramenta = 0;
            String dataDiaEmp = "";
            String dataDiaDev = "";
            
            
            
            if(this.JTFIdamigo.getText().length()<0){
                throw new Mensagens("O id deve ser maior que zero");
            } else {
                idAmigo = Integer.parseInt(this.JTFIdamigo.getText());
            }
            if(this.JTFIdferramenta.getText().length()<0){
                throw new Mensagens("O id deve ser maior que zero");
            } else {
                idFerramenta = Integer.parseInt(this.JTFIdferramenta.getText());
            }
            if(this.JTFdataDiaEmp.getText().length()<0){
                throw new Mensagens("O dia deve ter...");
            } else {
                dataDiaEmp = this.JTFdataDiaEmp.getText();
            }
                       
               if(this.JTFdataDiaDev.getText().length()<0){
                throw new Mensagens("O dia deve ter...");
            } else {
                dataDiaDev = this.JTFdataDiaDev.getText();
            }
           
               
               
                
                
                if(this.objetoEmprestimo.InsertEmprestimoBD(idFerramenta, idAmigo, dataDiaEmp, dataDiaDev)){
                JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado com Sucesso!");
                this.JTFIdamigo.setText("");
                this.JTFIdferramenta.setText("");
                this.JTFdataDiaEmp.setText("");
                this.JTFdataDiaDev.setText("");
                
       
                
                }
            System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        } catch(Mensagens erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage());
        } catch(NumberFormatException erro2){
            JOptionPane.showMessageDialog(null,"Imforme um número válido");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFIdamigo;
    private javax.swing.JTextField JTFIdferramenta;
    private javax.swing.JTextField JTFdataDiaDev;
    private javax.swing.JTextField JTFdataDiaEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
