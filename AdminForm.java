import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminForm.class.getName());

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {

    initComponents();

    setupTable();

    loadStudents();
}

    private void setupTable() {

    DefaultTableModel model =
            (DefaultTableModel) tblStudents.getModel();

    model.setColumnIdentifiers(
            new Object[]{
                "Student ID",
                "Student Name",
                "Grade",
                "Strand",
                "Section",
                "Semester",
                "School Year",
                "Status"
            }
    );

    tblStudents.setSelectionMode(
            javax.swing.ListSelectionModel.SINGLE_SELECTION
    );

    tblStudents.getTableHeader()
            .setReorderingAllowed(false);

    tblStudents.setDefaultEditor(
            Object.class,
            null
    );
}
    public void refreshStudents() {
    loadStudents();
}
    
 private void loadStudents() {

    DefaultTableModel model =
            (DefaultTableModel) tblStudents.getModel();

    model.setRowCount(0);

    String search =
            txtSearch.getText().trim();

    String status =
            cmbStatus.getSelectedItem().toString();

    String sql =
            "SELECT "
            + "s.student_id, "
            + "s.name, "
            + "s.year_level, "
            + "s.course, "
            + "MAX(e.section) AS section, "
            + "s.semester, "
            + "s.school_year, "
            + "s.enrollment_status "

            + "FROM students s "

            + "INNER JOIN enrollments e "
            + "ON s.student_id = e.student_id "

            + "WHERE "
            + "(s.student_id LIKE ? "
            + "OR s.name LIKE ?) ";

    if (!status.equals("ALL")) {
        sql += "AND s.enrollment_status = ? ";
    }

    sql +=
            "GROUP BY "
            + "s.student_id, "
            + "s.name, "
            + "s.year_level, "
            + "s.course, "
            + "s.semester, "
            + "s.school_year, "
            + "s.enrollment_status "

            + "ORDER BY s.name";

    try (
        Connection con =
                DatabaseConnection.getConnection();

        PreparedStatement pst =
                con.prepareStatement(sql)
    ) {

        String searchValue =
                "%" + search + "%";

        pst.setString(1, searchValue);
        pst.setString(2, searchValue);

        if (!status.equals("ALL")) {

            pst.setString(
                    3,
                    status
            );
        }

        ResultSet rs =
                pst.executeQuery();

        while (rs.next()) {

            model.addRow(new Object[]{

                rs.getString("student_id"),

                rs.getString("name"),

                rs.getString("year_level"),

                rs.getString("course"),

                rs.getString("section"),

                rs.getString("semester"),

                rs.getString("school_year"),

                rs.getString("enrollment_status")
            });
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Database Error:\n"
                + e.getMessage()
        );

        e.printStackTrace();
    }
}
  
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEnrolledSubjects2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblStatusFilter = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Grade", "Strand", "Section", "Semester", "School Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        btnRefresh.setBackground(new java.awt.Color(40, 120, 200));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        btnLogout.setBackground(new java.awt.Color(220, 38, 38));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        btnApprove.setBackground(new java.awt.Color(22, 163, 74));
        btnApprove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(this::btnApproveActionPerformed);

        btnViewDetails.setBackground(new java.awt.Color(40, 120, 200));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("VIEW DETAILS");
        btnViewDetails.addActionListener(this::btnViewDetailsActionPerformed);

        btnEdit.setBackground(new java.awt.Color(100, 116, 139));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnReject.setBackground(new java.awt.Color(220, 38, 38));
        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("REJECT");
        btnReject.addActionListener(this::btnRejectActionPerformed);

        jPanel3.setBackground(new java.awt.Color(23, 69, 116));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BONBON NATIONAL HIGH SCHOOL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("ADMIN PANEL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(340, 340, 340))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblEnrolledSubjects2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEnrolledSubjects2.setText("STUDENT MANAGEMENT");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cmbStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "PENDING", "APPROVED", " " }));
        cmbStatus.addActionListener(this::cmbStatusActionPerformed);

        lblStatusFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatusFilter.setText("Status:");

        txtSearch.addActionListener(this::txtSearchActionPerformed);

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSearch.setText("Search Students:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblStatusFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusFilter)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(lblEnrolledSubjects2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnViewDetails)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogout)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addGap(20, 20, 20)
                                .addComponent(btnApprove))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addGap(18, 18, 18)
                                .addComponent(btnReject)))
                        .addGap(454, 454, 454))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnrolledSubjects2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnEdit)
                    .addComponent(btnApprove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnLogout)
                    .addComponent(btnReject))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
loadStudents();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
 LoginForm loginForm =
            new LoginForm();

    loginForm.setLocationRelativeTo(null);
    loginForm.setVisible(true);

    this.dispose();

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed

    int row =
            tblStudents.getSelectedRow();

    if (row == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Please select a student first."
        );

        return;
    }

    String studentId =
            tblStudents
                    .getValueAt(row, 0)
                    .toString();

    int confirm =
            JOptionPane.showConfirmDialog(
                    this,
                    "Approve this student's enrollment?",
                    "Confirm Approval",
                    JOptionPane.YES_NO_OPTION
            );

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String sql =
            "UPDATE students "
            + "SET enrollment_status = 'APPROVED' "
            + "WHERE student_id = ?";

    try (
        Connection con =
                DatabaseConnection.getConnection();

        PreparedStatement pst =
                con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);

        int updated =
                pst.executeUpdate();

        if (updated > 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Student approved successfully."
            );

            loadStudents();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Student was not found."
            );
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Approval Error:\n"
                + e.getMessage()
        );
    }

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed


    int row = tblStudents.getSelectedRow();

    if (row == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Please select a student first."
        );

        return;
    }

    String studentId =
            tblStudents.getValueAt(row, 0).toString();

    StudentPanel1 studentPanel1 =
            new StudentPanel1(studentId);

    studentPanel1.setLocationRelativeTo(null);
    studentPanel1.setVisible(true);

    this.setVisible(false);

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed


    int row =
            tblStudents.getSelectedRow();

    if (row == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Please select a student first."
        );

        return;
    }

    String studentId =
            tblStudents
                    .getValueAt(row, 0)
                    .toString();

    int confirm =
            JOptionPane.showConfirmDialog(
                    this,
                    "Reject this student's enrollment?",
                    "Confirm Rejection",
                    JOptionPane.YES_NO_OPTION
            );

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String sql =
            "UPDATE students "
            + "SET enrollment_status = 'REJECTED' "
            + "WHERE student_id = ?";

    try (
        Connection con =
                DatabaseConnection.getConnection();

        PreparedStatement pst =
                con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);

        int updated =
                pst.executeUpdate();

        if (updated > 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Student enrollment rejected."
            );

            loadStudents();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Student was not found."
            );
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Rejection Error:\n"
                + e.getMessage()
        );
    }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    loadStudents();


    }//GEN-LAST:event_txtSearchActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
    loadStudents();
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed


    int row = tblStudents.getSelectedRow();

    if (row == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Please select a student first."
        );

        return;
    }

    String studentId =
            tblStudents.getValueAt(row, 0).toString();

    EditStudentForm editForm =
            new EditStudentForm();

    editForm.setStudentId(studentId);

    editForm.setAdminForm(this);

    editForm.setLocationRelativeTo(null);
    editForm.setVisible(true);

    this.setVisible(false);

    }//GEN-LAST:event_btnEditActionPerformed
private void showStudentDetails(
        String studentId) {

    String sql =
            "SELECT "
            + "s.student_id, "
            + "s.name, "
            + "s.age, "
            + "s.gender, "
            + "s.course, "
            + "s.year_level, "
            + "s.semester, "
            + "s.school_year, "
            + "s.contact_number, "
            + "s.email, "
            + "s.enrollment_status, "
            + "MAX(e.section) AS section, "
            + "GROUP_CONCAT("
            + "e.subject_id "
            + "ORDER BY e.enrollment_id "
            + "SEPARATOR ', '"
            + ") AS subject_ids, "
            + "GROUP_CONCAT("
            + "e.subject_name "
            + "ORDER BY e.enrollment_id "
            + "SEPARATOR ', '"
            + ") AS subject_names, "
            + "GROUP_CONCAT("
            + "e.schedule "
            + "ORDER BY e.enrollment_id "
            + "SEPARATOR ', '"
            + ") AS schedules "

            + "FROM students s "

            + "INNER JOIN enrollments e "
            + "ON s.student_id = e.student_id "

            + "WHERE s.student_id = ? "

            + "GROUP BY "
            + "s.student_id, "
            + "s.name, "
            + "s.age, "
            + "s.gender, "
            + "s.course, "
            + "s.year_level, "
            + "s.semester, "
            + "s.school_year, "
            + "s.contact_number, "
            + "s.email, "
            + "s.enrollment_status";

    try (
        Connection con =
                DatabaseConnection.getConnection();

        PreparedStatement pst =
                con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);

        ResultSet rs =
                pst.executeQuery();

        if (rs.next()) {

            String details =
                    "STUDENT DETAILS\n\n"

                    + "Student ID: "
                    + rs.getString("student_id")
                    + "\n"

                    + "Name: "
                    + rs.getString("name")
                    + "\n"

                    + "Age: "
                    + rs.getInt("age")
                    + "\n"

                    + "Gender: "
                    + rs.getString("gender")
                    + "\n"

                    + "Grade: "
                    + rs.getString("year_level")
                    + "\n"

                    + "Strand: "
                    + rs.getString("course")
                    + "\n"

                    + "Section: "
                    + rs.getString("section")
                    + "\n"

                    + "Semester: "
                    + rs.getString("semester")
                    + "\n"

                    + "School Year: "
                    + rs.getString("school_year")
                    + "\n"

                    + "Contact: "
                    + rs.getString("contact_number")
                    + "\n"

                    + "Email: "
                    + rs.getString("email")
                    + "\n"

                    + "Status: "
                    + rs.getString("enrollment_status")
                    + "\n\n"

                    + "SUBJECTS\n\n"

                    + "Subject ID:\n"
                    + rs.getString("subject_ids")
                    + "\n\n"

                    + "Subject Name:\n"
                    + rs.getString("subject_names")
                    + "\n\n"

                    + "Schedule:\n"
                    + rs.getString("schedules");

            JOptionPane.showMessageDialog(
                    this,
                    details,
                    "Student Details",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Student details were not found."
            );
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Database Error:\n"
                + e.getMessage()
        );

        e.printStackTrace();
    }
}
    
    
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
        java.awt.EventQueue.invokeLater(() -> new AdminForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnrolledSubjects2;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStatusFilter;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}