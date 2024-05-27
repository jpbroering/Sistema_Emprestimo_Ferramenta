package visao;

/**
 * Classe que representa a janela do menu inicial da aplicação.
 */
public class FrmMenuInicial extends javax.swing.JFrame {

    /**
     * Construtor da classe FrmMenuInicial. Inicializa os componentes da
     * interface gráfica.
     */
    public FrmMenuInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmCadastrarFerramenta = new javax.swing.JMenu();
        JMFerramenta = new javax.swing.JMenuItem();
        JmCadastrarAmigo = new javax.swing.JMenuItem();
        JMRegistraEmprestimo = new javax.swing.JMenuItem();
        JMGerenciarFerramenta = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMGerenciarAmigo = new javax.swing.JMenuItem();
        JMGerenciarEmprestimo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        JMRelátorioFerramenta = new javax.swing.JMenuItem();
        JMRelatorioEmprestimo = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JmCadastrarFerramenta.setText("Cadastrar");
        JmCadastrarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmCadastrarFerramentaActionPerformed(evt);
            }
        });

        JMFerramenta.setText("Cadastrar Ferramenta");
        JMFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMFerramentaActionPerformed(evt);
            }
        });
        JmCadastrarFerramenta.add(JMFerramenta);

        JmCadastrarAmigo.setText("Cadastrar Amigo");
        JmCadastrarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmCadastrarAmigoActionPerformed(evt);
            }
        });
        JmCadastrarFerramenta.add(JmCadastrarAmigo);

        JMRegistraEmprestimo.setText("Cadastrar Emprestimo");
        JMRegistraEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRegistraEmprestimoActionPerformed(evt);
            }
        });
        JmCadastrarFerramenta.add(JMRegistraEmprestimo);

        jMenuBar1.add(JmCadastrarFerramenta);

        JMGerenciarFerramenta.setText("Gerenciar");

        jMenuItem2.setText("Gerenciar Ferramentas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMGerenciarFerramenta.add(jMenuItem2);

        JMGerenciarAmigo.setText("Gerenciar Amigos");
        JMGerenciarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGerenciarAmigoActionPerformed(evt);
            }
        });
        JMGerenciarFerramenta.add(JMGerenciarAmigo);

        JMGerenciarEmprestimo.setText("Gerenciar Emprestimos");
        JMGerenciarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGerenciarEmprestimoActionPerformed(evt);
            }
        });
        JMGerenciarFerramenta.add(JMGerenciarEmprestimo);

        jMenuBar1.add(JMGerenciarFerramenta);

        jMenu5.setText("Relatorios");

        JMRelátorioFerramenta.setText("Relátorio de Ferramentas");
        JMRelátorioFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRelátorioFerramentaActionPerformed(evt);
            }
        });
        jMenu5.add(JMRelátorioFerramenta);

        JMRelatorioEmprestimo.setText("Relátorio de Emprestimos");
        jMenu5.add(JMRelatorioEmprestimo);

        jMenuItem3.setText("Relátorio de Amigos");
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMRegistraEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRegistraEmprestimoActionPerformed

    /**
    * Cria uma nova instância do formulário FrmCadastroEmprestimo e o
    * exibe.
    */
        FrmCadastroEmprestimo janela = new FrmCadastroEmprestimo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMRegistraEmprestimoActionPerformed

    private void JMRelátorioFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRelátorioFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMRelátorioFerramentaActionPerformed

    private void JMGerenciarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGerenciarEmprestimoActionPerformed
       
    /**
    * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o exibe.
    */
        FrmGerenciarEmprestimo janela = new FrmGerenciarEmprestimo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMGerenciarEmprestimoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JmCadastrarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmCadastrarFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmCadastrarFerramentaActionPerformed

    private void JmCadastrarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmCadastrarAmigoActionPerformed
       
    /**
    * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o exibe.
    */
        FrmCadastroAmigo janela = new FrmCadastroAmigo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JmCadastrarAmigoActionPerformed

    private void JMFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMFerramentaActionPerformed
       
    /**
    * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o exibe.
    */
        FrmCadastroFerramenta janela = new FrmCadastroFerramenta();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMFerramentaActionPerformed

    private void JMGerenciarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGerenciarAmigoActionPerformed
        FrmGerenciaAmigo janela = new FrmGerenciaAmigo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMGerenciarAmigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMFerramenta;
    private javax.swing.JMenuItem JMGerenciarAmigo;
    private javax.swing.JMenuItem JMGerenciarEmprestimo;
    private javax.swing.JMenu JMGerenciarFerramenta;
    private javax.swing.JMenuItem JMRegistraEmprestimo;
    private javax.swing.JMenuItem JMRelatorioEmprestimo;
    private javax.swing.JMenuItem JMRelátorioFerramenta;
    private javax.swing.JMenuItem JmCadastrarAmigo;
    private javax.swing.JMenu JmCadastrarFerramenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
