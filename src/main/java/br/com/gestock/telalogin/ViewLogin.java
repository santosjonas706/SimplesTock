package br.com.gestock.telalogin;

/**
 *
 * @author Administrator
 */
public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        CampoLogin = new javax.swing.JTextField();
        CompoSenha = new javax.swing.JPasswordField();
        ButtonEntrar = new javax.swing.JButton();
        TelaImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("LOGIN");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 40, -1));

        senha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("SENHA");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
        getContentPane().add(CampoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 300, 30));
        getContentPane().add(CompoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 300, 30));

        ButtonEntrar.setText("ENTRAR");
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        TelaImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaLogin.png"))); // NOI18N
        getContentPane().add(TelaImgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewLogin().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JPasswordField CompoSenha;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel TelaImgFundo;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
