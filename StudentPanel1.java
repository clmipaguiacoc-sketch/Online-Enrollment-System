import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class StudentPanel1 extends javax.swing.JFrame {

    
    private String studentId;
    private String studentName;
    private String course;
    private String gradeLevel;
    private String semester;
    private String schoolYear;
    private String section;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentPanel.class.getName());

    public StudentPanel1 (){
        initComponents();
        
    }
    
    public StudentPanel1(String studentId) {

    initComponents();

    this.studentId = studentId;

    loadStudentInfo();
    loadStudentSection();
    loadStudentStatus();
    loadEnrolledSubjects();
}
    
   public StudentPanel1(
            String studentId,
            String studentName,
            String course,
            String gradeLevel,
            String semester,
            String schoolYear,
            String section) {

        initComponents();

        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.gradeLevel = gradeLevel;
        this.semester = semester;
        this.schoolYear = schoolYear;
        this.section = section;

        loadStudentInfo();
    }
   
   private void loadStudentInfo() {

        String sql =
                "SELECT name, age, gender, course, year_level, "
                + "semester, school_year, contact_number, email "
                + "FROM students "
                + "WHERE student_id = ?";

        try (
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setString(1, studentId);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                studentName = rs.getString("name");
                course = rs.getString("course");
                gradeLevel = rs.getString("year_level");
                semester = rs.getString("semester");
                schoolYear = rs.getString("school_year");

                String age =
                        String.valueOf(rs.getInt("age"));

                String gender =
                        rs.getString("gender");

                String contact =
                        rs.getString("contact_number");

                String email =
                        rs.getString("email");

               lblStudentID.setText(
                        "Student ID: " + studentId
                );

                lblName.setText(
                        "Name: " + studentName
                );

                lblAge.setText(
                        "Age: " + age
                );

                lblGender.setText(
                        "Gender: " + gender
                );

                lblGrade.setText(
                        "Grade: " + gradeLevel
                );

                lblStrand.setText(
                        "Strand: " + course
                );

                lblSemester.setText(
                        " Quarter: " + semester
                );

                lblSchoolYear.setText(
                        "School Year: " + schoolYear
                );

                lblSection.setText(
                        "Section: " + section
                );

                lblContact.setText(
                        "Contact: " + contact
                );

                lblEmail.setText(
                        "Email: " + email
                );

                loadStudentStatus();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Student information was not found."
                );
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Database Error:\n"
                    + e.getMessage()
            );
            loadStudentStatus();
loadStudentSection();
loadEnrolledSubjects();
        }
    }

     private void loadStudentStatus() {

        String sql =
                "SELECT enrollment_status "
                + "FROM students "
                + "WHERE student_id = ?";

        try (
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setString(1, studentId);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String status =
                        rs.getString("enrollment_status");

                if (status == null || status.trim().isEmpty()) {
                    status = "PENDING";
                }

                lblStatus.setText(
                        "Enrollment Status: " + status
                );

                if ("APPROVED".equalsIgnoreCase(status)) {


                } 

            } else {

                lblStatus.setText(
                        "Enrollment Status: PENDING"
                );

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error checking enrollment status:\n"
                    + e.getMessage()
            );
            loadStudentStatus();
loadStudentSection();
loadEnrolledSubjects();
        }
    }
     
     private void loadStudentSection() {

    String sql =
            "SELECT section "
            + "FROM enrollments "
            + "WHERE student_id = ? "
            + "LIMIT 1";

    try (
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            section = rs.getString("section");

            if (section == null) {
                section = "";
            }

            lblSection.setText(
                    "Section: " + section
            );

        } else {

            section = "";

            lblSection.setText(
                    "Section:"
            );
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Error loading section:\n"
                + e.getMessage()
        );
        loadStudentStatus();
loadStudentSection();
loadEnrolledSubjects();
    }
}
     
     private void loadEnrolledSubjects() {

    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel)
            tblEnrolledSubjects.getModel();

    model.setRowCount(0);

    String sql =
            "SELECT subject_id, subject_name, schedule, "
            + "room, floor, section "
            + "FROM enrollments "
            + "WHERE student_id = ? "
            + "ORDER BY enrollment_id";

    try (
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {

    String subjectId = rs.getString("subject_id");
    String subjectName = rs.getString("subject_name");
    String schedule = rs.getString("schedule");
    String room = rs.getString("room");
    String floor = rs.getString("floor");
    String savedSection = rs.getString("section");

    String adviser = new EnrollmentManager().getAdviser(
            subjectId,
            subjectName,
            gradeLevel,
            course,
            schoolYear,
            semester,
            savedSection
    );

    model.addRow(new Object[]{
        subjectId,
        subjectName,
        schedule,
        room,
        floor,
        savedSection,
        adviser
    });
}

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Error loading enrolled subjects:\n"
                + e.getMessage()
        );

        e.printStackTrace();
    }
}
      public void refreshStudentPanel() {

        loadStudentInfo();

        revalidate();
        repaint();
    }
      
      
   
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnrolledSubjects = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStudentID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblStrand = new javax.swing.JLabel();
        lblSection = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblSchoolYear = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblEnrolledSubjects1 = new javax.swing.JLabel();
        lblEnrolledSubjects2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 245, 249));

        tblEnrolledSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Subject ID", "Subject Name", "Schedule", "Room", "Floor", "Section", "Adviser"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnrolledSubjects);

        btnBack.setBackground(new java.awt.Color(40, 120, 200));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(this::btnBackActionPerformed);

        jPanel3.setBackground(new java.awt.Color(23, 69, 116));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BONBON NATIONAL HIGH SCHOOL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("STUDENT PORTAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(340, 340, 340))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStudentID.setText("Student ID:");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAge.setText("Age:");

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGender.setText("Gender:");

        lblGrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGrade.setText("Grade:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setText("Email:");

        lblStrand.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStrand.setText("Strand:");

        lblSection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSection.setText("Section:");

        lblSemester.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSemester.setText("  Quarter:");

        lblSchoolYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSchoolYear.setText("School Year:");

        lblContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContact.setText("Contact:");

        lblStatus.setBackground(new java.awt.Color(102, 255, 102));
        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setText("Enrollment Status:");

        lblEnrolledSubjects1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEnrolledSubjects1.setText("STUDENT INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentID)
                    .addComponent(lblName)
                    .addComponent(lblAge)
                    .addComponent(lblGender)
                    .addComponent(lblGrade)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSchoolYear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSemester, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSection, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStrand, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(lblEnrolledSubjects1)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblEnrolledSubjects1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStrand)
                        .addGap(8, 8, 8)
                        .addComponent(lblSection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSemester)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSchoolYear)
                        .addGap(10, 10, 10)
                        .addComponent(lblContact)
                        .addGap(14, 14, 14)
                        .addComponent(lblStatus))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStudentID)
                        .addGap(6, 6, 6)
                        .addComponent(lblName)
                        .addGap(14, 14, 14)
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGender)
                        .addGap(10, 10, 10)
                        .addComponent(lblGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)))
                .addContainerGap())
        );

        lblEnrolledSubjects2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEnrolledSubjects2.setText("ENROLLED SUBJECTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(lblEnrolledSubjects2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(596, 596, 596))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEnrolledSubjects2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
AdminForm adminForm = new AdminForm();

    adminForm.setLocationRelativeTo(null);
    adminForm.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
private ArrayList<Subject> getEnrolledSubjects() {

    ArrayList<Subject> subjects =
            new ArrayList<>();

    String sql =
            "SELECT subject_id, subject_name, schedule, "
            + "room, floor, section "
            + "FROM enrollments "
            + "WHERE student_id = ? "
            + "AND semester = ? "
            + "AND school_year = ?";

    try (
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql)
    ) {

        pst.setString(1, studentId);
        pst.setString(2, semester);
        pst.setString(3, schoolYear);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {

            String subjectId =
                    rs.getString("subject_id");

            String subjectName =
                    rs.getString("subject_name");

            String schedule =
                    rs.getString("schedule");

            String room =
                    rs.getString("room");

            String floor =
                    rs.getString("floor");

            String savedSection =
                    rs.getString("section");

            // Get section from the enrollment record
            if (savedSection != null
                    && !savedSection.trim().isEmpty()) {

                section = savedSection;
            }

            Subject subject = new Subject(
                    subjectId,
                    subjectName,
                    course,
                    schoolYear,
                    gradeLevel,
                    semester,
                    room,
                    floor,
                    schedule
            );

subject.setSection(savedSection);

String adviser = new EnrollmentManager().getAdviser(
        subjectId,
        subjectName,
        gradeLevel,
        course,
        schoolYear,
        semester,
        savedSection
);

subject.setAdviser(adviser);
            subjects.add(subject);
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
                this,
                "Error loading enrolled subjects:\n"
                + e.getMessage()
        );

        e.printStackTrace();
    }

    return subjects;
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
        java.awt.EventQueue.invokeLater(() -> new StudentPanel().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnrolledSubjects1;
    private javax.swing.JLabel lblEnrolledSubjects2;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSchoolYear;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStrand;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTable tblEnrolledSubjects;
    // End of variables declaration//GEN-END:variables
}