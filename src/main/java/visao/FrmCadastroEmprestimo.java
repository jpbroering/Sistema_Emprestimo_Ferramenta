package visao;

import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.Emprestimo;

/**
 * Classe para criar uma interface de cadastro de empréstimo.
 */
public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;

    /**
     * Construtor padrão da classe FrmCadastroEmprestimo. Inicializa a interface
     * gráfica e o objeto de empréstimo.
     */
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
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JTFdataDiaEmp = new javax.swing.JFormattedTextField();
        JBPreencheData = new javax.swing.JButton();

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

        JTFdataDiaEmp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        JTFdataDiaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFdataDiaEmpActionPerformed(evt);
            }
        });

        JBPreencheData.setText("Auto preencher");
        JBPreencheData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPreencheDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFdataDiaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPreencheData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFIdferramenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFIdamigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFIdamigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFIdferramenta)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFdataDiaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPreencheData))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar)
                    .addComponent(JBCancelar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFIdferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdferramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdferramentaActionPerformed

    private void JTFIdamigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdamigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdamigoActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed

        /**
         * Método para processar o cadastro de um novo empréstimo.
         */
        try {
            int idAmigo = 0;
            int idFerramenta = 0;
            Date dataDiaEmp;
            String[] dataOrdenada = new String[3];

            // Verifica se o campo do ID do amigo foi preenchido corretamente
            if (this.JTFIdamigo.getText().length() < 0) {
                throw new Mensagens("O id deve ser maior que zero");
            } else {
                idAmigo = Integer.parseInt(this.JTFIdamigo.getText());
            }

            // Verifica se o campo do ID da ferramenta foi preenchido corretamente
            if (this.JTFIdferramenta.getText().length() < 0) {
                throw new Mensagens("O id deve ser maior que zero");
            } else {
                idFerramenta = Integer.parseInt(this.JTFIdferramenta.getText());
            }

            // Verifica se o campo da data do empréstimo foi preenchido corretamente
            if (this.JTFdataDiaEmp.getText().length() < 0) {
                throw new Mensagens("O dia deve ter...");
            } else {
                dataOrdenada = this.JTFdataDiaEmp.getText().split("/");
                dataDiaEmp = new Date(Integer.parseInt(dataOrdenada[0])-1900,Integer.parseInt(dataOrdenada[1])-1,Integer.parseInt(dataOrdenada[2]));
                System.out.println(dataDiaEmp);
            }

            // Insere o empréstimo no banco de dados e exibe uma mensagem de sucesso
            if (this.objetoEmprestimo.verificaEmprestimoPendente(idAmigo)) {
                JOptionPane.showMessageDialog(rootPane, "Este amigo tem emprestimos não concluidos");
            }
            if (this.objetoEmprestimo.verificaFerramentaEmprestada(idFerramenta)) {
                if (this.objetoEmprestimo.insertEmprestimoBD(idFerramenta, idAmigo, dataDiaEmp)) {
                    JOptionPane.showMessageDialog(rootPane, "Emprestimo cadastrada com Sucesso!");
                    this.JTFIdamigo.setText("");
                    this.JTFIdferramenta.setText("");
                    this.JTFdataDiaEmp.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Esta ferrramenta está indisponivel");
            }
            // Exibe a lista atualizada de empréstimos no console
            System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        } catch (Mensagens erro) {

            // Exibe mensagens de erro personalizadas caso ocorra uma exceção do tipo Mensagens
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {

            // Exibe uma mensagem de erro genérica caso ocorra uma exceção do tipo NumberFormatException
            JOptionPane.showMessageDialog(null, "Imforme um número válido");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFdataDiaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFdataDiaEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFdataDiaEmpActionPerformed

    private void JBPreencheDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPreencheDataActionPerformed
        long data = System.currentTimeMillis();
        Date dataAtual = new Date(data);
        String dataFormatada = dataAtual.toString().replace("-", "/");
        JTFdataDiaEmp.setText(dataFormatada);
    }//GEN-LAST:event_JBPreencheDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBPreencheData;
    private javax.swing.JTextField JTFIdamigo;
    private javax.swing.JTextField JTFIdferramenta;
    private javax.swing.JFormattedTextField JTFdataDiaEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
