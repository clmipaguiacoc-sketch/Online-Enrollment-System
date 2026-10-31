public class Student extends Person {

    private String course;
    private String gradeLevel;
    private String semester;
    private String schoolYear;
    private String contactNumber;
    private String studentId;
    private String gmail;

    public Student(String studentId, String name, int age, String gender,
                   String course, String gradeLevel, String semester,
                   String schoolYear, String contactNumber, String gmail) {

        super(name, age, gender);

        this.studentId = studentId;
        this.course = course;
        this.gradeLevel = gradeLevel;
        this.semester = semester;
        this.schoolYear = schoolYear;
        this.contactNumber = contactNumber;
        this.gmail = gmail;
    }

    

    public String getstudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String getInformation() {
        return getName() + " - " + course;
    }
}