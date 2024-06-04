package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

public class FrmGerenciaFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;

    public FrmGerenciaFerramenta() {

        initComponents();
        objetoFerramenta = new Ferramenta();
        carregaTabela();

    }

    /**
     * Método para carregar os dados das Ferramentas na tabela. Obtém a referência ao
     * modelo da tabela, limpa suas linhas e preenche com os dados das Ferramentas
     * presentes na lista.
     */
    public void carregaTabela() {

        // Obtém o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) jTableFerramenta.getModel();

        // Limpa todas as linhas do modelo
        modelo.setNumRows(0);

        // Obtém a lista de ferramentas
        ArrayList<Ferramenta> minhaLista = objetoFerramenta.getMinhaLista();

        // Para cada ferramenta na lista, adiciona uma nova linha na tabela
        for (Ferramenta a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getCusto()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFCusto = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Marca", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramenta);

        jLabel1.setText("Nome:");

        jLabel2.setText("Custo");

        jLabel3.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(173, 173, 173)
                                    .addComponent(JBEditar)
                                    .addGap(41, 41, 41)
                                    .addComponent(JBApagar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(JBCancelar))
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24))))
                            .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
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
         * Método para atualizar uma ferramenta existente. Este método é acionado
         * quando o usuário tenta atualizar as informações de uma ferramenta na
         * interface gráfica. Verifica se o nome e o número de telefone são
         * válidos. Selecione uma ferramenta na tabela antes de editar. Atualiza a
         * ferramenta no banco de dados e limpa os campos de texto após a atualização
         * bem-sucedida. Lança e trata exceções para erros específicos, como
         * nome curto, número de telefone ausente ou seleção de ferramenta não
         * realizada. Se ocorrer uma exceção, exibe uma mensagem de erro
         * correspondente. Finalmente, recarrega a tabela de ferramentas para
         * refletir as alterações realizadas.
         */
        try {
            // Variáveis para armazenar os dados das ferramentas
            int id = 0;
            String nome = "";
            String marca = "";
            float custo = 0;
            // Verifica se o nome tem pelo menos 2 caracteres
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter pelo menos 2 caracteres");
            } else {
                nome = this.JTFNome.getText();

            }

            // Verifica se o número de telefone contém o DDD
            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagem(" Marca deve conter pelo menos 2 caracteres");
            } else {
                marca = this.JTFMarca.getText();
            }
            if (Float.parseFloat(this.JTFCusto.getText()) < 0) {
                throw new Mensagem(" Custo não pode ser negativo ");
            } else {
                custo = Float.parseFloat(this.JTFCusto.getText());
            }
            // Verifica se uma ferramenta foi selecionado na tabela para edição
            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione uma Ferramenta para editar");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            // Atualiza a ferramenta no banco de dados e exibe uma mensagem de sucesso
            if (this.objetoFerramenta.updateFerramentaBD(id, nome, marca, custo)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta atualizada com Sucesso!");

                // Limpa os campos de texto após a atualização bem-sucedida
                this.JTFNome.setText("");
                this.JTFCusto.setText("");
                this.JTFMarca.setText("");
            }

            // Imprime a lista atualizada de ferramentas no console (para fins de depuração)
            System.out.println(this.objetoFerramenta.getMinhaLista().toString());
        } catch (Mensagem erro) {

            // Captura e exibe uma mensagem de erro específica definida pelo usuário
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {

            // Captura e exibe uma mensagem de erro se um número inválido for inserido
            JOptionPane.showMessageDialog(null, "Imforme um número válido");
        } finally {

            // Recarrega a tabela de ferramenta, independentemente de qualquer exceção ocorrida
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed

        /**
         * Método para excluir uma ferramenta existente. Este método é acionado quando
         * o usuário tenta excluir uma ferramenta na interface gráfica. Verifica se uma
         * ferramenta foi selecionado na tabela antes de prosseguir com a exclusão.
         * Exibe um diálogo de confirmação para garantir que o usuário deseja
         * realmente excluir a ferramenta selecionado. Se o usuário confirmar a
         * exclusão, a ferramenta é removido do banco de dados. Após a exclusão
         * bem-sucedida, limpa os campos de texto e exibe uma mensagem de
         * sucesso. Se ocorrer uma exceção, exibe uma mensagem de erro
         * correspondente. Finalmente, recarrega a tabela de ferramentas para
         * refletir as alterações realizadas.
         */
        try {

            // Variável para armazenar o ID da ferramenta a ser excluído
            int id = 0;

            // Verifica se uma ferramenta foi selecionado na tabela para exclusão
            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma Ferramenta para Apagar");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            // Exibe um diálogo de confirmação para garantir que o usuário deseja excluir a ferramenta selecionado
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar essa Ferramenta?");
            if (respostaUsuario == 0) {

                if (this.objetoFerramenta.verificaFerramenta(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Esta Ferramenta possuí emprestimos vinculados, primeiro apague esses emprestimos para poder apagar a Ferramenta!");
                } else {

                    // Remove a ferramenta do banco de dados e exibe uma mensagem de sucesso
                    if (this.objetoFerramenta.deleteFerramentaBD(id)) {
                        this.JTFNome.setText("");
                        this.JTFCusto.setText("");

                        JOptionPane.showMessageDialog(rootPane, "Ferramenta apagada com sucesso!");
                    }
                }
            }
            // Imprime a lista atualizada de ferramentas no console (para fins de depuração)
            System.out.println(this.objetoFerramenta.getMinhaLista().toString());
        } catch (Mensagem erro) {

            // Captura e exibe uma mensagem de erro específica definida pelo usuário
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            // Recarrega a tabela de ferramenta, independentemente de qualquer exceção ocorrida
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentaMouseClicked
        /**
         * Atualiza os campos de texto com as informações da ferramenta selecionado
         * na tabela. Este trecho de código é acionado quando o usuário
         * seleciona uma ferramenta na tabela. Verifica se alguma ferramenta foi selecionado
         * antes de prosseguir com a atualização dos campos de texto. Obtém o
         * nome e o telefone da ferramenta selecionado na tabela e os define nos
         * campos de texto correspondentes.
         */
        if (this.jTableFerramenta.getSelectedRow() != -1) {// Verifica se alguma ferramenta foi selecionado na tabela

            // Obtém o nome e o telefone da ferramenta selecionado na tabela
            String nome = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 1).toString();
            String marca = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 2).toString();
            String custo = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 3).toString();

            // Define o nome e o telefone nos campos de texto correspondentes na interface gráfica
            this.JTFNome.setText(nome);
            this.JTFCusto.setText(custo);
            this.JTFMarca.setText(marca);
        }
    }//GEN-LAST:event_jTableFerramentaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramenta;
    // End of variables declaration//GEN-END:variables
}
