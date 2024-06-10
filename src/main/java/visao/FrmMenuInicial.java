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

        jMenuBar1 = new javax.swing.JMenuBar();
        JMCadastrar = new javax.swing.JMenu();
        JMFerramenta = new javax.swing.JMenuItem();
        JmCadastrarAmigo = new javax.swing.JMenuItem();
        JMRegistraEmprestimo = new javax.swing.JMenuItem();
        JMGerenciar = new javax.swing.JMenu();
        JMGerenciarFerramenta = new javax.swing.JMenuItem();
        JMGerenciarAmigo = new javax.swing.JMenuItem();
        JMGerenciarEmprestimo = new javax.swing.JMenuItem();
        JMRelatorio = new javax.swing.JMenu();
        JMRelátorioFerramenta = new javax.swing.JMenuItem();
        JMRelatorioEmprestimo = new javax.swing.JMenuItem();
        JMDevolucao = new javax.swing.JMenu();
        JMDevEmprestimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        JMCadastrar.setText("Cadastrar");
        JMCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCadastrarActionPerformed(evt);
            }
        });

        JMFerramenta.setText("Cadastrar Ferramenta");
        JMFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMFerramentaActionPerformed(evt);
            }
        });
        JMCadastrar.add(JMFerramenta);

        JmCadastrarAmigo.setText("Cadastrar Amigo");
        JmCadastrarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmCadastrarAmigoActionPerformed(evt);
            }
        });
        JMCadastrar.add(JmCadastrarAmigo);

        JMRegistraEmprestimo.setText("Cadastrar Emprestimo");
        JMRegistraEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRegistraEmprestimoActionPerformed(evt);
            }
        });
        JMCadastrar.add(JMRegistraEmprestimo);

        jMenuBar1.add(JMCadastrar);

        JMGerenciar.setText("Gerenciar");

        JMGerenciarFerramenta.setText("Gerenciar Ferramentas");
        JMGerenciarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGerenciarFerramentaActionPerformed(evt);
            }
        });
        JMGerenciar.add(JMGerenciarFerramenta);

        JMGerenciarAmigo.setText("Gerenciar Amigos");
        JMGerenciarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGerenciarAmigoActionPerformed(evt);
            }
        });
        JMGerenciar.add(JMGerenciarAmigo);

        JMGerenciarEmprestimo.setText("Gerenciar Emprestimos");
        JMGerenciarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMGerenciarEmprestimoActionPerformed(evt);
            }
        });
        JMGerenciar.add(JMGerenciarEmprestimo);

        jMenuBar1.add(JMGerenciar);

        JMRelatorio.setText("Relatorios");

        JMRelátorioFerramenta.setText("Relátorio de Ferramentas");
        JMRelátorioFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRelátorioFerramentaActionPerformed(evt);
            }
        });
        JMRelatorio.add(JMRelátorioFerramenta);

        JMRelatorioEmprestimo.setText("Relátorio de Emprestimos");
        JMRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMRelatorioEmprestimoActionPerformed(evt);
            }
        });
        JMRelatorio.add(JMRelatorioEmprestimo);

        jMenuBar1.add(JMRelatorio);

        JMDevolucao.setText("Devolução");

        JMDevEmprestimo.setText("Devolução de emprestimo");
        JMDevEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMDevEmprestimoActionPerformed(evt);
            }
        });
        JMDevolucao.add(JMDevEmprestimo);

        jMenuBar1.add(JMDevolucao);

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

        /**
         * Cria uma nova instância da janela de relatório de ferramenta e a
         * torna visível.
         *
         * @param rootPaneCheckingEnabled Indica se o mecanismo de validação do
         * painel raiz está habilitado.
         */
        FrmRelatorioFerramenta janela = new FrmRelatorioFerramenta();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMRelátorioFerramentaActionPerformed

    private void JMGerenciarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGerenciarEmprestimoActionPerformed

        /**
         * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o
         * exibe.
         */
        FrmGerenciaEmprestimo janela = new FrmGerenciaEmprestimo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMGerenciarEmprestimoActionPerformed

    private void JMGerenciarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGerenciarFerramentaActionPerformed

        /**
         * Cria uma nova instância da janela de gerenciamento de ferramenta e a
         * torna visível.
         */
        FrmGerenciaFerramenta janela = new FrmGerenciaFerramenta();
        janela.setVisible(true);
    }//GEN-LAST:event_JMGerenciarFerramentaActionPerformed

    private void JMCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMCadastrarActionPerformed

    private void JmCadastrarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmCadastrarAmigoActionPerformed

        /**
         * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o
         * exibe.
         */
        FrmCadastroAmigo janela = new FrmCadastroAmigo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JmCadastrarAmigoActionPerformed

    private void JMFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMFerramentaActionPerformed

        /**
         * Cria uma nova instância do formulário FrmGerenciarEmprestimo e o
         * exibe.
         */
        FrmCadastroFerramenta janela = new FrmCadastroFerramenta();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMFerramentaActionPerformed

    private void JMGerenciarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMGerenciarAmigoActionPerformed

        /**
         * Cria uma nova instância da janela de gerenciamento de amigo e a torna
         * visível.
         *
         * @param rootPaneCheckingEnabled Indica se o mecanismo de validação do
         * painel raiz está habilitado.
         */
        FrmGerenciaAmigo janela = new FrmGerenciaAmigo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMGerenciarAmigoActionPerformed

    private void JMDevEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMDevEmprestimoActionPerformed

        /**
         * Cria uma nova instância da janela de devolução de empréstimo e a
         * torna visível.
         *
         * @param rootPaneCheckingEnabled Indica se o mecanismo de validação do
         * painel raiz está habilitado.
         */
        FrmDevolucaoEmprestimo janela = new FrmDevolucaoEmprestimo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMDevEmprestimoActionPerformed

    private void JMRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMRelatorioEmprestimoActionPerformed

        /**
         * Cria uma nova instância da janela de relatório de empréstimo e a
         * torna visível.
         *
         * @param rootPaneCheckingEnabled Indica se o mecanismo de validação do
         * painel raiz está habilitado.
         */
        FrmRelatorioEmprestimo janela = new FrmRelatorioEmprestimo();
        janela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_JMRelatorioEmprestimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMCadastrar;
    private javax.swing.JMenuItem JMDevEmprestimo;
    private javax.swing.JMenu JMDevolucao;
    private javax.swing.JMenuItem JMFerramenta;
    private javax.swing.JMenu JMGerenciar;
    private javax.swing.JMenuItem JMGerenciarAmigo;
    private javax.swing.JMenuItem JMGerenciarEmprestimo;
    private javax.swing.JMenuItem JMGerenciarFerramenta;
    private javax.swing.JMenuItem JMRegistraEmprestimo;
    private javax.swing.JMenu JMRelatorio;
    private javax.swing.JMenuItem JMRelatorioEmprestimo;
    private javax.swing.JMenuItem JMRelátorioFerramenta;
    private javax.swing.JMenuItem JmCadastrarAmigo;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
