/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import SEGURIDAD.seguridad;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Jiss
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    seguridad seg = new seguridad();
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
  
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbuttonConectar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JbuttonConectar.setText("Conectar");
        JbuttonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonConectarActionPerformed(evt);
            }
        });
        getContentPane().add(JbuttonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSmall.png"))); // NOI18N
        jLabelLogo.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, 180));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 110, -1));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo naranja.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void JbuttonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonConectarActionPerformed
        String ingresoClave="";
        for (int i = 0; i < jPassword.getPassword().length; i++) {
            ingresoClave+=jPassword.getPassword()[i];
        }
        if(seg.iniciarSesion(jTextFieldUser.getText(), ingresoClave)==true){
            JOptionPane.showMessageDialog(null, "Bienvenido!", "Exito!", JOptionPane.DEFAULT_OPTION);
            ProductoForm prod = new ProductoForm();
            prod.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "ERROR usuario o contraseña invalidos", "error!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_JbuttonConectarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbuttonConectar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
