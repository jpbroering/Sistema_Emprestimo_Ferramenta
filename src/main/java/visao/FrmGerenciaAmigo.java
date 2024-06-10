package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;

/**
 * Classe que representa a interface gráfica para gerenciamento de amigos. Esta
 * classe estende a classe javax.swing.JFrame.
 */
public class FrmGerenciaAmigo extends javax.swing.JFrame {

    // Atributo para armazenar o objeto Amigo
    private Amigo objetoAmigo;

    /**
     * Construtor padrão da classe FrmGerenciaAmigo. Inicializa os componentes
     * da interface gráfica, cria um novo objeto Amigo e carrega a tabela de
     * amigos.
     */
    public FrmGerenciaAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.carregaTabela();
    }

    /**
     * Método para carregar os dados dos amigos na tabela. Obtém a referência ao
     * modelo da tabela, limpa suas linhas e preenche com os dados dos amigos
     * presentes na lista.
     */
    public void carregaTabela() {

        // Obtém o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) jTableAmigo.getModel();

        // Limpa todas as linhas do modelo
        modelo.setNumRows(0);

        // Obtém a lista de amigos
        ArrayList<Amigo> minhaLista = objetoAmigo.getMinhaLista();

        // Para cada amigo na lista, adiciona uma nova linha na tabela
        for (Amigo a : minhaLista) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de amigo");

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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed

        /**
         * Método para atualizar um amigo existente. Este método é acionado
         * quando o usuário tenta atualizar as informações de um amigo na
         * interface gráfica. Verifica se o nome e o número de telefone são
         * válidos. Selecione um amigo na tabela antes de editar. Atualiza o
         * amigo no banco de dados e limpa os campos de texto após a atualização
         * bem-sucedida. Lança e trata exceções para erros específicos, como
         * nome curto, número de telefone ausente ou seleção de amigo não
         * realizada. Se ocorrer uma exceção, exibe uma mensagem de erro
         * correspondente. Finalmente, recarrega a tabela de amigos para
         * refletir as alterações realizadas.
         */
        try {
            // Variáveis para armazenar os dados do amigo
            int id = 0;
            String nome = "";
            String telefone = "";

            // Verifica se o nome tem pelo menos 2 caracteres
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter pelo menos 2 caracteres");
            } else {
                nome = this.JTFNome.getText();

            }

            // Verifica se o número de telefone contém o DDD
            if (this.JTFTelefone.getText().length() != 11) {
                throw new Mensagem(" O número de telefone deve conter o DDD");
            } else {
                telefone = this.JTFTelefone.getText();
            }

            // Verifica se um amigo foi selecionado na tabela para edição
            if (this.jTableAmigo.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione um amigo para editar");
            } else {
                id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
            }

            // Atualiza o amigo no banco de dados e exibe uma mensagem de sucesso
            if (this.objetoAmigo.updateAmigoBD(id, nome, telefone)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo atualizado com Sucesso!");

                // Limpa os campos de texto após a atualização bem-sucedida
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");

            }

            // Imprime a lista atualizada de amigos no console (para fins de depuração)
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch (Mensagem erro) {

            // Captura e exibe uma mensagem de erro específica definida pelo usuário
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {

            // Captura e exibe uma mensagem de erro se um número inválido for inserido
            JOptionPane.showMessageDialog(null, "Imforme um número válido");
        } finally {

            // Recarrega a tabela de amigos, independentemente de qualquer exceção ocorrida
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed

        /**
         * Método para excluir um amigo existente. Este método é acionado quando
         * o usuário tenta excluir um amigo na interface gráfica. Verifica se um
         * amigo foi selecionado na tabela antes de prosseguir com a exclusão.
         * Exibe um diálogo de confirmação para garantir que o usuário deseja
         * realmente excluir o amigo selecionado. Se o usuário confirmar a
         * exclusão, o amigo é removido do banco de dados. Após a exclusão
         * bem-sucedida, limpa os campos de texto e exibe uma mensagem de
         * sucesso. Se ocorrer uma exceção, exibe uma mensagem de erro
         * correspondente. Finalmente, recarrega a tabela de amigos para
         * refletir as alterações realizadas.
         */
        try {

            // Variável para armazenar o ID do amigo a ser excluído
            int id = 0;

            // Verifica se um amigo foi selecionado na tabela para exclusão
            if (this.jTableAmigo.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um amigo para Apagar");
            } else {
                id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
            }

            // Exibe um diálogo de confirmação para garantir que o usuário deseja excluir o amigo selecionado
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse amigo?");
            if (respostaUsuario == 0) {

                if (this.objetoAmigo.verificaAmigo(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Este amigo possuí emprestimos vinculados, primeiro apague esses emprestimos para poder apagar o amigo!");
                } else {

                    // Remove o amigo do banco de dados e exibe uma mensagem de sucesso
                    if (this.objetoAmigo.deleteAmigoBD(id)) {
                        this.JTFNome.setText("");
                        this.JTFTelefone.setText("");

                        JOptionPane.showMessageDialog(rootPane, "Amigo apagado com sucesso!");
                    }
                }
            }
            // Imprime a lista atualizada de amigos no console (para fins de depuração)
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch (Mensagem erro) {

            // Captura e exibe uma mensagem de erro específica definida pelo usuário
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            // Recarrega a tabela de amigos, independentemente de qualquer exceção ocorrida
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigoMouseClicked
        /**
         * Atualiza os campos de texto com as informações do amigo selecionado
         * na tabela. Este trecho de código é acionado quando o usuário
         * seleciona um amigo na tabela. Verifica se algum amigo foi selecionado
         * antes de prosseguir com a atualização dos campos de texto. Obtém o
         * nome e o telefone do amigo selecionado na tabela e os define nos
         * campos de texto correspondentes.
         */
        if (this.jTableAmigo.getSelectedRow() != -1) {// Verifica se algum amigo foi selecionado na tabela

            // Obtém o nome e o telefone do amigo selecionado na tabela
            String nome = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 1).toString();
            String telefone = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 2).toString();

            // Define o nome e o telefone nos campos de texto correspondentes na interface gráfica
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
