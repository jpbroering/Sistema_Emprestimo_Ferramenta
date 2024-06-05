package visao;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

public class FrmDevolucaoEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo; // Objeto que representa um empréstimo.

    /**
     * Construtor da classe. Inicializa os componentes e carrega os dados na
     * tabela.
     */
    public FrmDevolucaoEmprestimo() {
        initComponents();
        objetoEmprestimo = new Emprestimo();
        carregaTabela();
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
        JFTFDataDevolucao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JLId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Criação", "Devoluçao", "Id amigo", "Id ferramenta"
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

        JFTFDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel1.setText("Data de devolução:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JLId.setText("ID: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(47, 47, 47)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLId)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(JLId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEmprestimoMouseClicked
        if (this.JTEmprestimo.getSelectedRow() != -1) {
            // Declaração de variáveis para armazenar os dados da linha selecionada.
            String id, dataDevolucao;

            // Obtém os valores das colunas da linha selecionada na tabela.
            dataDevolucao = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 2).toString();
            id = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 0).toString();

            // Preenche os campos de texto com os valores obtidos da tabela.
            this.JFTFDataDevolucao.setText(dataDevolucao);
            this.JLId.setText("ID: " + id);
        }
    }//GEN-LAST:event_JTEmprestimoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Fecha a janela atual
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
                // Obtém os dados do empréstimo da linha selecionada na tabela.
                id = Integer.parseInt(this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 0).toString());
                idAmigo = Integer.parseInt(this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 3).toString());
                idFerramenta = Integer.parseInt(this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 4).toString());
                dataOrdenada = this.JTEmprestimo.getValueAt(this.JTEmprestimo.getSelectedRow(), 1).toString().split("-");
                dataDiaEmp = new Date(Integer.parseInt(dataOrdenada[0]) - 1900, Integer.parseInt(dataOrdenada[1]) - 1, Integer.parseInt(dataOrdenada[2]));
            }

            // Verifica se o campo da data de devolução foi preenchido corretamente
            if (this.JFTFDataDevolucao.getText().split("-").length != 3 && this.JFTFDataDevolucao.getText() != "") {
                throw new Mensagem("O dia deve estar formatado em yyyy-MM-dd");
            } else {
                // Converte a data de devolução para o formato Date, se preenchida
                if (this.JFTFDataDevolucao.getText() == "") {
                    throw new Mensagem("Digite uma data");
                } else {
                    // Converte a data de devolução para o formato Date
                    dataOrdenada = this.JFTFDataDevolucao.getText().split("-");
                    dataDiaDev = new Date(Integer.parseInt(dataOrdenada[0]) - 1900, Integer.parseInt(dataOrdenada[1]) - 1, Integer.parseInt(dataOrdenada[2]));

                    // Verifica se adata de devolução está depois da data de criação do emprestimo
                    if (dataDiaEmp.compareTo(dataDiaDev) > 0) {
                        throw new Mensagem("Digite uma data posterior a data de criação do emprestimo");
                    } else {
                        // Atualiza o empréstimo no banco de dados e exibe uma mensagem de sucesso
                        if (this.objetoEmprestimo.updateEmprestimoBD(id, idFerramenta, idAmigo, dataDiaEmp, dataDiaDev)) {
                            JOptionPane.showMessageDialog(rootPane, "Devolução registrada com Sucesso!");
                            // Limpa os campos de texto na interface
                            this.JFTFDataDevolucao.setText("");
                        }
                    }
                }
            }
        } catch (Mensagem erro) {
            // Exibe uma mensagem de erro caso a exceção personalizada seja lançada.
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        } finally {
            // Recarrega a tabela de empréstimos para refletir as mudanças.
            carregaTabela();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JFTFDataDevolucao;
    private javax.swing.JLabel JLId;
    private javax.swing.JTable JTEmprestimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
