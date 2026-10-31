import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;

public class LoginForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginForm.class.getName());

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();
        JPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 245, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 155, 31));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(this::btnLoginActionPerformed);
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, -1, -1));

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(this::btnRegisterActionPerformed);
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, -1, -1));

        btnForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnForgotPassword.setText("Forgot Password");
        btnForgotPassword.addActionListener(this::btnForgotPasswordActionPerformed);
        jPanel1.add(btnForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, -1, -1));

        JPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JPasswordField.addActionListener(this::JPasswordFieldActionPerformed);
        jPanel1.add(JPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 155, 31));

        jLabel4.setText("..");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2291, 216, 246, 231));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel5.setText("BONBON NATIONAL HIGHSCHOOL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 500, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel8.setText("LOGIN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel9.setText("STUDENT / ADMIN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.bnhs-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 450, 410));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setText("ONLINE ENROLLMENT SYSTEM");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed



    String username = txtUsername.getText().trim();
    String password = new String(JPasswordField.getPassword());

    // CHECK EMPTY FIELDS
    if (username.isEmpty() || password.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Please enter username and password."
        );

        return;
    }


    // ==========================================
    // CHECK USER LOGIN
    // ==========================================

    String sql =
            "SELECT role FROM users "
            + "WHERE username = ? AND password = ?";


    try (
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql)
    ) {

        pst.setString(1, username);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();


        // INVALID LOGIN
        if (!rs.next()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid username or password."
            );

            return;
        }


        // GET ROLE
        String role = rs.getString("role");


        // ==========================================
        // ADMIN
        // ==========================================

        if (role != null && role.equalsIgnoreCase("admin")) {

            AdminForm adminForm = new AdminForm();

            adminForm.setLocationRelativeTo(null);
            adminForm.setVisible(true);

            this.dispose();

            return;
        }


        // ==========================================
        // CHECK IF STUDENT ALREADY FILLED FORM
        // ==========================================

        String studentSql =
                "SELECT student_id "
                + "FROM students "
                + "WHERE username = ?";


        try (
            PreparedStatement studentPst =
                    con.prepareStatement(studentSql)
        ) {

            studentPst.setString(1, username);

            ResultSet studentRs =
                    studentPst.executeQuery();


            // ==========================================
            // STUDENT ALREADY REGISTERED
            // ==========================================

            if (studentRs.next()) {

                String studentId =
                        studentRs.getString("student_id");


                StudentPanel studentPanel =
                        new StudentPanel(studentId);

                studentPanel.setLocationRelativeTo(null);
                studentPanel.setVisible(true);

                this.dispose();

            }


            // ==========================================
            // ACCOUNT REGISTERED BUT NO STUDENT INFO YET
            // ==========================================

            else {

                Form form = new Form(username);

                form.setLocationRelativeTo(null);
                form.setVisible(true);

                this.dispose();
            }
        }


    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Database Error:\n" + e.getMessage()
        );

        e.printStackTrace();
    }

    }//GEN-LAST:event_btnLoginActionPerformed

    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
RegisterForm registerForm = new RegisterForm();
registerForm.setLocationRelativeTo(null);
registerForm.setVisible(true);

this.dispose();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
ForgotPasswordForm forgotForm =
        new ForgotPasswordForm();

forgotForm.setLocationRelativeTo(null);
forgotForm.setVisible(true);

this.dispose();

    }//GEN-LAST:event_btnForgotPasswordActionPerformed

    private void JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPasswordFieldActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordField;
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}