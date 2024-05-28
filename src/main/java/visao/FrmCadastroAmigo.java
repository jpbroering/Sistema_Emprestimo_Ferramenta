package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;

/**
 * Classe que representa o formulário de cadastro de amigos.
 */
public class FrmCadastroAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo;

    /**
     * Construtor que inicializa os componentes da interface gráfica e o objeto
     * Amigo.
     */
    public FrmCadastroAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(306, 306, 306))
                        .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        /**
         * Método para processar o cadastro de um novo aluno.
         */
        try {
            String nomeAmigo = "";
            String telefoneAmigo = "";

            // Verifica se o campo do nome do amigo foi preenchido corretamente
            if (this.JTFNome.getText().length() <= 0) {
                throw new Mensagem("O nome deve ser preenchido");
            } else {
                nomeAmigo = this.JTFNome.getText();
            }

            // Verifica se o campo do telefone do amigo foi preenchido corretamente
            if (this.JTFTelefone.getText().length() != 11) {
                throw new Mensagem("O número de telefone adicionado deve apresentar o DDD");
            } else {
                telefoneAmigo = this.JTFTelefone.getText();
            }

            // Insere o amigo no banco de dados e exibe uma mensagem de sucesso
            if (this.objetoAmigo.InsertAmigoBD(nomeAmigo, telefoneAmigo)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo cadastrado com sucesso");
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
            }

            // Exibe a lista atualizada de amigos no console
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch (Mensagem erro) {
            // Exibe mensagens de erro personalizadas caso ocorra uma exceção do tipo Mensagem
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            // Exibe uma mensagem de erro genérica caso ocorra uma exceção do tipo NumberFormatException
            JOptionPane.showMessageDialog(null, "Informe um número válido");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
