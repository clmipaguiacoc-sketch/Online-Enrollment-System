public class Subject {

    private String subjectId;
    private String subjectName;
    private String course;
    private String schoolYear;
    private String gradeLevel;
    private String semester;

    private int units;
    private String schedule;
    private double tuitionFee;

    private String room;
    private String floor;
    private String section;
    private String adviser;

    // Main constructor used by EnrollmentManager
    public Subject(
            String subjectId,
            String subjectName,
            String course,
            String schoolYear,
            String gradeLevel,
            String semester,
            String room,
            String floor,
            String schedule) {

        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.course = course;
        this.schoolYear = schoolYear;
        this.gradeLevel = gradeLevel;
        this.semester = semester;

        this.room = room;
        this.floor = floor;
        this.schedule = schedule;

        this.units = 1;
        this.tuitionFee = 300.00;
        this.section = "";
        this.adviser = "";
    }

    // Constructor for older parts of the project
    public Subject(
            String subjectId,
            String subjectName,
            String course,
            String schoolYear,
            String gradeLevel,
            String semester,
            int units,
            String schedule,
            double tuitionFee) {

        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.course = course;
        this.schoolYear = schoolYear;
        this.gradeLevel = gradeLevel;
        this.semester = semester;

        this.units = units;
        this.schedule = schedule;
        this.tuitionFee = tuitionFee;

        this.room = "";
        this.floor = "";
        this.section = "";
        this.adviser = "";
    }

    // =========================
    // SUBJECT ID
    // =========================

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    // =========================
    // SUBJECT NAME
    // =========================

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    // =========================
    // COURSE / STRAND
    // =========================

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // =========================
    // SCHOOL YEAR
    // =========================

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    // =========================
    // GRADE LEVEL
    // =========================

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // =========================
    // QUARTER
    // =========================

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    // =========================
    // UNITS
    // =========================

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    // =========================
    // SCHEDULE
    // =========================

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    // =========================
    // TUITION
    // =========================

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    // =========================
    // ROOM
    // =========================

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    // =========================
    // FLOOR
    // =========================

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    // =========================
    // SECTION
    // =========================

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // =========================
    // ADVISER
    // =========================

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }
}