package visao;

import java.util.ArrayList;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

/**
 * Janela para exibição de relatório de empréstimos.
 */
public class FrmRelatorioEmprestimo extends javax.swing.JFrame {

    Ferramenta objetoFerramenta;
    Emprestimo objetoEmprestimo;
    Amigo objetoAmigo;
    ArrayList<Ferramenta> listaFerramenta = new ArrayList<Ferramenta>();
    ArrayList<Emprestimo> listaEmprestimo = new ArrayList<Emprestimo>();
    ArrayList<Amigo> listaAmigo = new ArrayList<Amigo>();

    /**
     * Construtor da classe FrmRelatorioEmprestimo. Inicializa os componentes da
     * janela e os objetos necessários para o relatório.
     */
    public FrmRelatorioEmprestimo() {
        initComponents();
        objetoFerramenta = new Ferramenta();
        objetoEmprestimo = new Emprestimo();
        objetoAmigo = new Amigo();
        listaFerramenta = objetoFerramenta.getMinhaLista();
        listaEmprestimo = objetoEmprestimo.getMinhaLista();
        listaAmigo = objetoAmigo.getMinhaLista();
    }

    /**
     * Formata um objeto de empréstimo para exibição no relatório.
     *
     * @param e O objeto de empréstimo a ser formatado.
     * @return Uma string contendo as informações formatadas do empréstimo.
     */
    public String formataEmprestimo(Emprestimo e) {
        String relatorio = "";
        for (Ferramenta f : listaFerramenta) {
            if (e.getIdFerramenta() == f.getId()) {
                relatorio = f.getNome() + " da marca " + f.getMarca() + " emprestada para ";
            }
        }
        for (Amigo a : listaAmigo) {
            if (e.getIdAmigo() == a.getId()) {
                relatorio = relatorio + a.getNome() + ":\n" + e.getDataEmprestimo();
            }
        }
        return relatorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTARelatorio = new javax.swing.JTextArea();
        JBCancelar = new javax.swing.JButton();
        JBGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTARelatorio.setColumns(20);
        JTARelatorio.setRows(5);
        JTARelatorio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTARelatorio.setEnabled(false);
        jScrollPane1.setViewportView(JTARelatorio);

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBGerar.setText("Gerar");
        JBGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBGerar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBGerar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerarActionPerformed

        // Cria strings para diferentes seções do relatório
        String concluido = "Empréstimo concluidos\n\n";
        String andamento = "Empréstimos em andamento\n\n";
        String relatorio = "Relatório\n\n";
        String info = "Informações adicionais\nMais Emprestimos\n\n" + objetoEmprestimo.identificaQtdEmprestimo() + "Amigos sem devoluções\n\n" + objetoEmprestimo.identificaSemDevolucao();
        
        // Itera sobre a lista de empréstimos para criar o relatório
        for (Emprestimo e : listaEmprestimo) {
            if (e.getDataDevolucao() != null) {
                // Adiciona empréstimos concluídos ao relatório
                concluido = concluido + formataEmprestimo(e) + " - " + e.getDataDevolucao() + "\n\n";
                // Adiciona empréstimos em andamento ao relatório
            } else {
                andamento = andamento + formataEmprestimo(e) + " - em andamento\n\n";
            }
        }

// Concatena as seções do relatório
        relatorio = relatorio + andamento + concluido + info;

// Define o texto do JTextArea com o relatório gerado
        this.JTARelatorio.setText(relatorio);
    }//GEN-LAST:event_JBGerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBGerar;
    private javax.swing.JTextArea JTARelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
