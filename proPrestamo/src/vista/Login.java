/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.Toolkit;
import logica.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Jesús
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public Image getIconImage(){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
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

        jLabel1 = new javax.swing.JLabel();
        JLabelIcono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTxtUsuario = new javax.swing.JTextField();
        jTxpass = new javax.swing.JPasswordField();
        jBInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jLabel1.setToolTipText("");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 120, 30));

        JLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(JLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 90, -1));

        jTxtUsuario.setBackground(new java.awt.Color(0, 0, 51));
        jTxtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 270, 30));

        jTxpass.setBackground(new java.awt.Color(0, 0, 51));
        jTxpass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTxpass.setForeground(new java.awt.Color(255, 255, 255));
        jTxpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxpassActionPerformed(evt);
            }
        });
        getContentPane().add(jTxpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 270, 30));

        jBInicio.setBackground(new java.awt.Color(0, 0, 51));
        jBInicio.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        jBInicio.setForeground(new java.awt.Color(255, 255, 255));
        jBInicio.setText("Iniciar Sesion");
        jBInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBInicioMouseClicked(evt);
            }
        });
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 200, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("J.Y Entrerprise");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    private void jTxpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxpassActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInicioMouseClicked
       try{
           String user= jTxtUsuario.getText();
           String pass= jTxpass.getText();
           
           
                   
                   
                   
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Rellene todos los campos");
       }
       
       
    }//GEN-LAST:event_jBInicioMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelIcono;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jTxpass;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
