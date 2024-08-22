/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.gestock.telalogin;

/**
 *
 * @author Administrator
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        venda = new javax.swing.JButton();
        CadastroFuncionarios = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Sangria = new javax.swing.JButton();
        CadastroProdutos = new javax.swing.JButton();
        Fornecedores = new javax.swing.JButton();
        SaidaEstoque = new javax.swing.JButton();
        Relatorios = new javax.swing.JButton();
        EntradaEstoque = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        AbrirFecharCaixa = new javax.swing.JButton();
        CadastroClientes = new javax.swing.JButton();
        Mesas = new javax.swing.JButton();
        DashboardFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        venda.setText("Venda");
        venda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.lightGray, java.awt.Color.lightGray));
        venda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaActionPerformed(evt);
            }
        });
        getContentPane().add(venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 185, 150));

        CadastroFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.png"))); // NOI18N
        CadastroFuncionarios.setText("Cadastro de funcionarios");
        CadastroFuncionarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        CadastroFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 562, 185, 150));

        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8.png"))); // NOI18N
        Estoque.setText("Estoque");
        Estoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 317, 185, 150));

        Sangria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        Sangria.setText("Sangria");
        Sangria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Sangria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sangria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SangriaActionPerformed(evt);
            }
        });
        getContentPane().add(Sangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 70, 185, 150));

        CadastroProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png"))); // NOI18N
        CadastroProdutos.setText("Cadastro de Produtos");
        CadastroProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        CadastroProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CadastroProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 70, 185, 150));

        Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.png"))); // NOI18N
        Fornecedores.setText("Fornecedores");
        Fornecedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Fornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Fornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 317, 185, 150));

        SaidaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        SaidaEstoque.setText("Saida/Estoque");
        SaidaEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        SaidaEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaidaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(SaidaEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 72, 185, 150));

        Relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10.png"))); // NOI18N
        Relatorios.setText("Relatorios");
        Relatorios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Relatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(Relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 317, 185, 150));

        EntradaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/12.png"))); // NOI18N
        EntradaEstoque.setText("Entrada/Estoque");
        EntradaEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        EntradaEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntradaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(EntradaEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 562, 185, 150));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/13.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 562, 185, 150));

        AbrirFecharCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        AbrirFecharCaixa.setText("Fechamento/abertura de caixa");
        AbrirFecharCaixa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        AbrirFecharCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbrirFecharCaixa.setOpaque(true);
        AbrirFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirFecharCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirFecharCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 185, 150));

        CadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7.png"))); // NOI18N
        CadastroClientes.setText("Cadastro de Clientes");
        CadastroClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        CadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClientesActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 317, 185, 150));

        Mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9.png"))); // NOI18N
        Mesas.setText("Mesas");
        Mesas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Mesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Mesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 317, 185, 150));

        DashboardFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DashboardFundo.jpg"))); // NOI18N
        DashboardFundo.setText("jLabel1");
        getContentPane().add(DashboardFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroClientesActionPerformed

    private void SaidaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaidaEstoqueActionPerformed

    private void CadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroFuncionariosActionPerformed

    private void SangriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SangriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SangriaActionPerformed

    private void EntradaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEstoqueActionPerformed

    private void RelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatoriosActionPerformed

    private void vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaActionPerformed

    private void AbrirFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirFecharCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbrirFecharCaixaActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirFecharCaixa;
    private javax.swing.JButton CadastroClientes;
    private javax.swing.JButton CadastroFuncionarios;
    private javax.swing.JButton CadastroProdutos;
    private javax.swing.JLabel DashboardFundo;
    private javax.swing.JButton EntradaEstoque;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Fornecedores;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Mesas;
    private javax.swing.JButton Relatorios;
    private javax.swing.JButton SaidaEstoque;
    private javax.swing.JButton Sangria;
    private javax.swing.JButton venda;
    // End of variables declaration//GEN-END:variables
}
