/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEdB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author lab-07
 */
public class ConsultasFilmeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConsultasFilmeJFrame
     */
    public ConsultasFilmeJFrame() {
        initComponents();
        conectaECarrega();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfGenero = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        tfProdutora = new javax.swing.JTextField();
        tfDataCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btAnterior = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btMais10 = new javax.swing.JButton();
        btMenos10 = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGeneroActionPerformed(evt);
            }
        });

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        tfProdutora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdutoraActionPerformed(evt);
            }
        });

        tfDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataCompraActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Gênero:");

        jLabel3.setText("Título:");

        jLabel4.setText("Produtora:");

        jLabel5.setText("Data de Compra: ");

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btPrimeiro.setText("Primeiro");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });

        btUltimo.setText("Ultimo");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });

        btMais10.setText("Mais10");
        btMais10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMais10ActionPerformed(evt);
            }
        });

        btMenos10.setText("Menos10");
        btMenos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenos10ActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btMais10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btMenos10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfProdutora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProdutora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(btPrimeiro)
                    .addComponent(btUltimo)
                    .addComponent(btMais10)
                    .addComponent(btMenos10)
                    .addComponent(btSair)
                    .addComponent(btProximo))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("Data de Compra:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void conectaECarrega() {

        bancoDeDados = new BD();
        if (!bancoDeDados.getConnectiom()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar!" + "\nSistema será encerrado. ");
            System.exit(0);
        }
        carregaTabela();
        atualizaCampos();

    }

    public void carregaTabela() {
        String sql = "Select * from filmes";
        try {
            pstConsulta = bancoDeDados.connection.prepareStatement(sql);
            rsResultado = pstConsulta.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de consulta" + e.toString());

        }
    }

    public void atualizaCampos() {
        try {
            //isAfter verifica se o ponteiro esta no final dos registros
            if (rsResultado.isAfterLast()) {
                rsResultado.last();
            } //isBefore verifica se o ponteiro esta no inicio dos registros
            else if (rsResultado.isBeforeFirst()) {
                rsResultado.first();
            }

            tfCodigo.setText("" + rsResultado.getInt("Codigo"));
            tfTitulo.setText(rsResultado.getString("Titulo"));
            tfGenero.setText(rsResultado.getString("Genero"));
            tfProdutora.setText(rsResultado.getString("Produtora"));
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
            tfDataCompra.setText("" + format.format(rsResultado.getString("Data de Compra")));

        } catch (SQLException e) {
        }

    }

    private void tfDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataCompraActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGeneroActionPerformed

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfProdutoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdutoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProdutoraActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        try {
            rsResultado.close();
            pstConsulta.close();

        } catch (SQLException e) {
            bancoDeDados.close();
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        try {
            rsResultado.next();
            atualizaCampos();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        try {
            rsResultado.previous();
            atualizaCampos();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        try {
            rsResultado.first();
            atualizaCampos();

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        try {
            rsResultado.last();
            atualizaCampos();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btMais10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMais10ActionPerformed
        try {
            rsResultado.relative(10);
            atualizaCampos();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btMais10ActionPerformed

    private void btMenos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenos10ActionPerformed
        try {
            if (rsResultado.getRow() > 10) {
                rsResultado.relative(-10);
            }
            atualizaCampos();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btMenos10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultasFilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasFilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasFilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasFilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasFilmeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btMais10;
    private javax.swing.JButton btMenos10;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDataCompra;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfProdutora;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
    private BD bancoDeDados;
    private PreparedStatement pstConsulta;
    private ResultSet rsResultado;

}
