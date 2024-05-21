
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;

public class FrmGerenciaAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo;
    
    public FrmGerenciaAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.carregaTabela();
    }

    public void carregaTabela(){
         DefaultTableModel modelo = (DefaultTableModel) jTableAmigo.getModel();
        modelo.setNumRows(0);
        ArrayList<Amigo> minhaLista = objetoAmigo.getMinhaLista();
        for(Amigo a : minhaLista){
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmigo);

        jLabel1.setText("Nome:");

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone:");

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBCancelar)
                                        .addGap(39, 39, 39)))))
                        .addGap(8, 8, 8)
                        .addComponent(JBEditar)
                        .addGap(41, 41, 41)
                        .addComponent(JBApagar)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditar)
                    .addComponent(JBCancelar)
                    .addComponent(JBApagar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
          try{
            int id = 0;
            String nome = "";
            
            String telefone = "";
           

            if(this.JTFNome.getText().length()<2){
                throw new Mensagens("Nome deve conter pelo menos 2 caracteres");
            } else {
                nome = this.JTFNome.getName();
            }
           
            if(this.JTFTelefone.getText().length() <1){
                throw new Mensagens(" O número de telefone deve conter o DDD");
            } else {
                telefone = this.JTFTelefone.getText();
            }
           
            
             if(this.jTableAmigo.getSelectedRow() == -1){
                throw new Mensagens("Primeiro selecione um amigo para editar");
            } else {
                id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
            }
            if(this.objetoAmigo.updateAmigoBD(id, nome, telefone)){
                JOptionPane.showMessageDialog(rootPane, "Amigo Cadastrado com Sucesso!");
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                
            }
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch(Mensagens erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage());
        } catch(NumberFormatException erro2){
            JOptionPane.showMessageDialog(null,"Imforme um número válido");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try{
            int id = 0;
            if(this.jTableAmigo.getSelectedRow() == -1){
                throw new Mensagens("Primeiro Selecione um amigo para Apagar");
            } else{
                id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
            }
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse amigo?");
            if(respostaUsuario == 0){
                if(this.objetoAmigo.deleteAmigoBD(id)){
                    this.JTFNome.setText("");
                    this.JTFTelefone.setText("");
                    
                    JOptionPane.showMessageDialog(rootPane, "Amigo apagado com sucesso!");
                }
            }
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigoMouseClicked
if(this.jTableAmigo.getSelectedRow() != -1){
        String nome = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 1).toString();
        String telefone = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 2).toString();
        
        
        this.JTFNome.setText(nome);
        this.JTFTelefone.setText(telefone);
        
        }      
    }//GEN-LAST:event_jTableAmigoMouseClicked

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciaAmigo().setVisible(true);
            }
        }); */
      } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigo;
    // End of variables declaration//GEN-END:variables
}
