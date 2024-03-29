/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewOfLogin;

import javax.swing.JFrame;

/**
 *
 * @author anukul
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        emailTextArea = new javax.swing.JTextArea();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        emailTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 199, 180));
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        bgPanel.setBackground(new java.awt.Color(192, 199, 180));
        bgPanel.setForeground(new java.awt.Color(95, 148, 115));
        bgPanel.setMaximumSize(new java.awt.Dimension(1440, 1024));
        bgPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        bgPanel.setName(""); // NOI18N
        bgPanel.setPreferredSize(new java.awt.Dimension(1440, 1024));
        bgPanel.setLayout(null);

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        loginLabel.setText("LOGIN");
        bgPanel.add(loginLabel);
        loginLabel.setBounds(700, 200, 117, 84);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        emailLabel.setText("Email");
        bgPanel.add(emailLabel);
        emailLabel.setBounds(490, 340, 94, 40);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        passwordLabel.setText("Password");
        bgPanel.add(passwordLabel);
        passwordLabel.setBounds(480, 440, 166, 40);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        emailTextArea.setBackground(new java.awt.Color(223, 230, 216));
        emailTextArea.setColumns(20);
        emailTextArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emailTextArea.setRows(5);
        jScrollPane5.setViewportView(emailTextArea);

        bgPanel.add(jScrollPane5);
        jScrollPane5.setBounds(800, 340, 313, 43);

        loginButton.setBackground(new java.awt.Color(62, 117, 83));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(217, 217, 217));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        bgPanel.add(loginButton);
        loginButton.setBounds(620, 690, 246, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("If you are a new user:");
        bgPanel.add(jLabel2);
        jLabel2.setBounds(480, 540, 197, 53);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("CLINIC");
        bgPanel.add(jLabel3);
        jLabel3.setBounds(210, 150, 108, 36);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("GRACE CARE");
        bgPanel.add(jLabel7);
        jLabel7.setBounds(210, 100, 220, 40);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        emailTextArea1.setBackground(new java.awt.Color(223, 230, 216));
        emailTextArea1.setColumns(20);
        emailTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emailTextArea1.setRows(5);
        jScrollPane6.setViewportView(emailTextArea1);

        bgPanel.add(jScrollPane6);
        jScrollPane6.setBounds(800, 440, 313, 43);

        jButton1.setBackground(new java.awt.Color(62, 117, 83));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(223, 230, 216));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bgPanel.add(jButton1);
        jButton1.setBounds(800, 540, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewOfLogin/ledLogo.png"))); // NOI18N
        bgPanel.add(jLabel1);
        jLabel1.setBounds(40, 50, 151, 135);

        getContentPane().add(bgPanel);
        bgPanel.setBounds(0, 0, 1550, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailTextArea;
    private javax.swing.JTextArea emailTextArea1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
