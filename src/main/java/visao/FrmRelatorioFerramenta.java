package visao;

import java.util.ArrayList;
import modelo.Ferramenta;

public class FrmRelatorioFerramenta extends javax.swing.JFrame {
    
    Ferramenta objetoFerramenta;
    
    public FrmRelatorioFerramenta() {
        initComponents();
        objetoFerramenta = new Ferramenta();
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

    private void JBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerarActionPerformed
        ArrayList<Ferramenta> listaFerramenta = new ArrayList<Ferramenta>();
        listaFerramenta = objetoFerramenta.getMinhaLista();
        
        String relatorio = "Relatorio\n\n";
        float total = 0;
        for(Ferramenta f : listaFerramenta){
            total = total + f.getCusto();
            relatorio = relatorio + f.getNome() + " da marca " + f.getMarca() + ": "+f.getCusto()+" R$\n\n";
        }
        relatorio = relatorio + "Custo total: "+total+" R$";
        this.JTARelatorio.setText(relatorio);
    }//GEN-LAST:event_JBGerarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBGerar;
    private javax.swing.JTextArea JTARelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
