package visao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

/**
 * Classe que gerencia a interface gráfica para gestão de empréstimos.
 */
public class FrmGerenciaEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo; // Objeto que representa um empréstimo.

    /**
     * Construtor da classe. Inicializa os componentes e carrega os dados na
     * tabela.
     */
    public FrmGerenciaEmprestimo() {
        initComponents(); // Inicializa os componentes da interface gráfica.
        objetoEmprestimo = new Emprestimo(); // Cria uma nova instância do objeto Emprestimo.
        carregaTabela(); // Carrega os dados dos empréstimos na tabela.
    }

    /**
     * Carrega os dados de empréstimos na tabela.
     */
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) JTEmprestimo.getModel(); // Obtém o modelo da tabela.
        modelo.setNumRows(0); // Limpa a tabela.
        ArrayList<Emprestimo> listaEmprestimo = objetoEmprestimo.getMinhaLista(); // Obtém a lista de empréstimos.
        for (Emprestimo a : listaEmprestimo) {
            modelo.addRow(new Object[]{
                a.getId(), // Adiciona o ID do empréstimo.
                objetoEmprestimo.transformaData(a.getDataEmprestimo()), // Formata e adiciona a data de empréstimo.
                objetoEmprestimo.transformaData(a.getDataDevolucao()), // Formata e adiciona a data de devolução.
                a.getIdAmigo(), // Adiciona o ID do amigo.
                a.getIdFerramenta() // Adiciona o ID da ferramenta.
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmprestimo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFIdAmigo = new javax.swing.JTextField();
        JTFIdFerramenta = new javax.swing.JTextField();
        JFTFDataEmprestimo = new javax.swing.JFormattedTextField();
        JFTFDataDevolucao = new javax.swing.JFormattedTextField();
        JBRemover = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "criação", "devoluçao", "id amigo", "id ferramenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEmprestimo);

        jLabel2.setText("criação:");

        jLabel3.setText("devolução");

        jLabel4.setText("amigo:");

        jLabel5.setText("ferramenta:");

        JFTFDataEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        JFTFDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JFTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFIdFerramenta)
                            .addComponent(JTFIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCancelar)
                .addGap(18, 18, 18)
                .addComponent(JBEditar)
                .addGap(18, 18, 18)
                .addComponent(JBRemover)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(JFTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JFTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTFIdAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTFIdFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRemover)
                    .addComponent(JBEditar)
                    .addComponent(JBCancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEmprestimoMouseClicked
        if (this.JTEmprestimo.getSelectedRow() != -1) {
            // Declaração de variáveis para armazenar os dados da linha selecionada.
            String id, dataCriacao, dataDevolucao, idAmigo, idFerramenta;

            // Obtém os valores das colunas da linha selecionada na tabela.
            dataCriacao = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 1).toString();
            dataDevolucao = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 2).toString();
            idAmigo = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 3).toString();
            idFerramenta = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 4).toString();

            // Preenche os campos de texto com os valores obtidos da tabela.
            this.JFTFDataEmprestimo.setText(dataCriacao);
            this.JFTFDataDevolucao.setText(dataDevolucao);
            this.JTFIdAmigo.setText(idAmigo);
            this.JTFIdFerramenta.setText(idFerramenta);
        }
    }//GEN-LAST:event_JTEmprestimoMouseClicked

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        try {
            int id = 0;

            // Verifica se uma linha da tabela está selecionada.
            if (this.JTEmprestimo.getSelectedRow() == -1) {
                // Lança uma exceção personalizada caso nenhuma linha esteja selecionada.
                throw new Mensagem("Primeiro selecione um emprestimo para apagar");
            } else {
                // Obtém o ID do empréstimo da linha selecionada na tabela.
                id = Integer.parseInt(this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 0).toString());
            }

            // Exibe uma caixa de diálogo de confirmação para o usuário.
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse Emprestimo?");

            // Verifica se o usuário confirmou a exclusão.
            if (respostaUsuario == 0) {
                // Tenta apagar o empréstimo do banco de dados.
                if (this.objetoEmprestimo.deleteEmprestimoBD(id)) {
                    // Limpa os campos de texto na interface.
                    this.JTFIdAmigo.setText("");
                    this.JTFIdFerramenta.setText("");
                    this.JFTFDataDevolucao.setText("");
                    this.JFTFDataEmprestimo.setText("");
                    // Exibe uma mensagem de sucesso para o usuário.
                    JOptionPane.showMessageDialog(rootPane, "Emprestimo apagado com sucesso!");
                }
                // Imprime a lista de empréstimos atualizada no console.
                System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
            }
        } catch (Mensagem erro) {
            // Exibe uma mensagem de erro caso a exceção personalizada seja lançada.
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        } finally {
            // Recarrega a tabela de empréstimos para refletir as mudanças.
            carregaTabela();
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        try {
            int id = 0;
            int idAmigo = 0;
            int idFerramenta = 0;
            Date dataDiaEmp;
            Date dataDiaDev;
            String[] dataOrdenada = new String[3];

            // Verifica se uma linha da tabela está selecionada.
            if (this.JTEmprestimo.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione um Emprestimo para editar");
            } else {
                // Obtém o ID do empréstimo da linha selecionada na tabela.
                id = Integer.parseInt(this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 0).toString());
            }

            // Verifica se o campo do ID do amigo foi preenchido corretamente
            if (this.JTFIdAmigo.getText().length() < 0) {
                throw new Mensagem("O id deve ser maior que zero");
            } else {
                // Obtém o ID do amigo a partir do campo de texto
                idAmigo = Integer.parseInt(this.JTFIdAmigo.getText());
            }

            // Verifica se o campo do ID da ferramenta foi preenchido corretamente
            if (this.JTFIdFerramenta.getText().length() < 0) {
                throw new Mensagem("O id deve ser maior que zero");
            } else {
                // Obtém o ID da ferramenta a partir do campo de texto
                idFerramenta = Integer.parseInt(this.JTFIdFerramenta.getText());
            }

            // Verifica se o campo da data do empréstimo foi preenchido corretamente
            if (this.JFTFDataEmprestimo.getText().length() < 0) {
                throw new Mensagem("O dia deve ter...");
            } else {
                // Converte a data do empréstimo para o formato Date
                dataOrdenada = this.JFTFDataEmprestimo.getText().split("-");
                dataDiaEmp = new Date(Integer.parseInt(dataOrdenada[0]) - 1900, Integer.parseInt(dataOrdenada[1]) - 1, Integer.parseInt(dataOrdenada[2]));
            }

            // Verifica se o campo da data de devolução foi preenchido corretamente
            if (this.JFTFDataDevolucao.getText().split("-").length != 3 && this.JFTFDataDevolucao.getText() != "") {
                throw new Mensagem("O dia deve ter...");
            } else {
                // Converte a data de devolução para o formato Date, se preenchida
                if (this.JFTFDataDevolucao.getText() == "") {
                    dataDiaDev = null;
                } else {
                    dataOrdenada = this.JFTFDataDevolucao.getText().split("-");
                    dataDiaDev = new Date(Integer.parseInt(dataOrdenada[0]) - 1900, Integer.parseInt(dataOrdenada[1]) - 1, Integer.parseInt(dataOrdenada[2]));
                }
            }

            // Verifica se o amigo tem empréstimos pendentes
            if (this.objetoEmprestimo.verificaEmprestimoPendente(idAmigo)) {
                JOptionPane.showMessageDialog(rootPane, "Este amigo tem emprestimos não concluidos");
            }

            // Atualiza o empréstimo no banco de dados e exibe uma mensagem de sucesso
            if (this.objetoEmprestimo.updateEmprestimoBD(id, idFerramenta, idAmigo, dataDiaEmp, dataDiaDev)) {
                JOptionPane.showMessageDialog(rootPane, "Emprestimo atualizado com Sucesso!");
                // Limpa os campos de texto na interface
                this.JFTFDataEmprestimo.setText("");
                this.JFTFDataDevolucao.setText("");
                this.JTFIdAmigo.setText("");
                this.JTFIdFerramenta.setText("");
            }

            // Exibe a lista atualizada de empréstimos no console
            System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        } catch (Mensagem erro) {
            // Exibe mensagens de erro personalizadas caso ocorra uma exceção do tipo Mensagem
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            // Exibe uma mensagem de erro genérica caso ocorra uma exceção do tipo NumberFormatException
            JOptionPane.showMessageDialog(null, "Imforme um número válido");
        } finally {
            // Recarrega a tabela de empréstimos para refletir as mudanças
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // Fecha a janela atual
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JFormattedTextField JFTFDataDevolucao;
    private javax.swing.JFormattedTextField JFTFDataEmprestimo;
    private javax.swing.JTable JTEmprestimo;
    private javax.swing.JTextField JTFIdAmigo;
    private javax.swing.JTextField JTFIdFerramenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
