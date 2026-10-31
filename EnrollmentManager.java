import java.util.ArrayList;

public class EnrollmentManager {

    private ArrayList<Subject> subjects =
            new ArrayList<>();


    // =====================================================
    // CONSTRUCTOR
    // =====================================================

    public EnrollmentManager() {

        String[] schoolYears = {
            "2026-2027",
            "2027-2028"
        };

        // =================================================
        // GRADE 7 - 10
        // =================================================

        for (String schoolYear : schoolYears) {

            addJuniorSubjects("Grade 7", schoolYear);
            addJuniorSubjects("Grade 8", schoolYear);
            addJuniorSubjects("Grade 9", schoolYear);
            addJuniorSubjects("Grade 10", schoolYear);
        }

        // =================================================
        // GRADE 11 - 12
        // =================================================

        String[] strands = {
            "STEM",
            "HUMSS",
            "TVL Plumbing",
            "TVL Housekeeping"
        };

        for (String schoolYear : schoolYears) {

            for (String strand : strands) {

                addSeniorSubjects(
                        strand,
                        "Grade 11",
                        schoolYear
                );

                addSeniorSubjects(
                        strand,
                        "Grade 12",
                        schoolYear
                );
            }
        }
    }


    // =====================================================
    // GRADE 7 - 10
    // =====================================================

    private void addJuniorSubjects(
            String gradeLevel,
            String schoolYear) {

        String gradeNumber =
                gradeLevel.replace("Grade ", "");

        // =================================================
        // QUARTER 1
        // =================================================

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "01",
                "English " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "02",
                "Mathematics " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "03",
                "Science " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "04",
                "Filipino " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "05",
                "Araling Panlipunan " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "06",
                "MAPEH " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "07",
                "TLE " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 1", "08",
                "Values Education " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 2
        // =================================================

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "01",
                "Creative English " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "02",
                "Advanced Mathematics " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "03",
                "Earth and Life Science " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "04",
                "Pagbasa at Pagsulat " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "05",
                "Philippine History " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "06",
                "Arts and Music " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "07",
                "Technology " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 2", "08",
                "Character Education " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 3
        // =================================================

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "01",
                "Reading and Literature " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "02",
                "Algebra " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "03",
                "Physical Science " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "04",
                "Panitikan " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "05",
                "World History " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "06",
                "Health and Fitness " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "07",
                "Computer Technology " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 3", "08",
                "Good Citizenship " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 4
        // =================================================

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "01",
                "Communication Skills " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "02",
                "Geometry " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "03",
                "Environmental Science " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "04",
                "Filipino Communication " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "05",
                "Economics and Society " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "06",
                "Sports and Wellness " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "07",
                "Digital Skills " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addJuniorSubject(
                gradeNumber, schoolYear, gradeLevel,
                "Quarter 4", "08",
                "Life Skills " + gradeNumber,
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );
    }


    // =====================================================
    // ADD JUNIOR SUBJECT
    // =====================================================

    private void addJuniorSubject(
            String gradeNumber,
            String schoolYear,
            String gradeLevel,
            String quarter,
            String number,
            String subjectName,
            String room,
            String floor,
            String schedule) {

        String subjectId =
                "G" + gradeNumber + "-"
                + quarter.replace("Quarter ", "Q")
                + "-" + number;

        addSubject(
                subjectId,
                subjectName,
                "Not Applicable",
                schoolYear,
                gradeLevel,
                quarter,
                room,
                floor,
                schedule
        );
    }


    // =====================================================
    // GRADE 11 - 12
    // =====================================================

    private void addSeniorSubjects(
            String strand,
            String gradeLevel,
            String schoolYear) {

        String prefix = getPrefix(strand);

        String gradeNumber =
                gradeLevel.replace("Grade ", "");


        // =================================================
        // QUARTER 1
        // =================================================

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "01",
                "General Mathematics",
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "02",
                "Oral Communication",
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "03",
                getSubject3(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "04",
                getSubject4(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "05",
                "Physical Education",
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "06",
                getSubject6(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "07",
                getSubject7(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 1", "08",
                "Research Fundamentals",
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 2
        // =================================================

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "01",
                "Statistics",
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "02",
                "Academic Writing",
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "03",
                getSubject11(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "04",
                "Entrepreneurship",
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "05",
                getSubject13(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "06",
                getSubject14(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "07",
                "Work Immersion Preparation",
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 2", "08",
                "Personal Development",
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 3
        // =================================================

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "01",
                "Applied Mathematics",
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "02",
                "Creative Writing",
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "03",
                "Practical Research",
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "04",
                getQuarter3Subject4(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "05",
                "Community Engagement",
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "06",
                getQuarter3Subject6(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "07",
                "Career Development",
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 3", "08",
                "Health and Wellness",
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );


        // =================================================
        // QUARTER 4
        // =================================================

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "01",
                "Advanced Mathematics",
                "Room 101", "1st Floor",
                "Monday-Friday 7:30-8:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "02",
                "Professional Communication",
                "Room 101", "1st Floor",
                "Monday-Friday 8:30-9:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "03",
                "Research Project",
                "Room 101", "1st Floor",
                "Monday-Friday 9:30-10:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "04",
                getQuarter4Subject4(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 10:30-11:30 AM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "05",
                "Leadership and Citizenship",
                "Room 101", "1st Floor",
                "Monday-Friday 1:00-2:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "06",
                getQuarter4Subject6(strand),
                "Room 101", "1st Floor",
                "Monday-Friday 2:00-3:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "07",
                "Work Immersion",
                "Room 101", "1st Floor",
                "Monday-Friday 3:00-4:00 PM"
        );

        addSeniorSubject(
                prefix, gradeNumber, schoolYear,
                gradeLevel, strand,
                "Quarter 4", "08",
                "Portfolio Development",
                "Room 101", "1st Floor",
                "Monday-Friday 4:00-5:00 PM"
        );
    }


    // =====================================================
    // ADD SENIOR SUBJECT
    // =====================================================

    private void addSeniorSubject(
            String prefix,
            String gradeNumber,
            String schoolYear,
            String gradeLevel,
            String strand,
            String quarter,
            String number,
            String subjectName,
            String room,
            String floor,
            String schedule) {

        String subjectId =
                prefix
                + gradeNumber
                + "-"
                + quarter.replace("Quarter ", "Q")
                + "-"
                + number;

        addSubject(
                subjectId,
                subjectName,
                strand,
                schoolYear,
                gradeLevel,
                quarter,
                room,
                floor,
                schedule
        );
    }


    // =====================================================
    // STRAND SUBJECTS
    // =====================================================

    private String getSubject3(String strand) {

        if (strand.equals("STEM")) {
            return "Earth Science";
        }

        if (strand.equals("HUMSS")) {
            return "Philippine Politics";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Fundamentals";
        }

        return "Housekeeping Fundamentals";
    }


    private String getSubject4(String strand) {

        if (strand.equals("STEM")) {
            return "21st Century Literature";
        }

        if (strand.equals("HUMSS")) {
            return "Introduction to Philosophy";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Installation";
        }

        return "Room Maintenance";
    }


    private String getSubject6(String strand) {

        if (strand.equals("STEM")) {
            return "Pre-Calculus";
        }

        if (strand.equals("HUMSS")) {
            return "Creative Writing";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Maintenance";
        }

        return "Housekeeping Operations";
    }


    private String getSubject7(String strand) {

        if (strand.equals("STEM")) {
            return "Basic Calculus";
        }

        if (strand.equals("HUMSS")) {
            return "Community Engagement";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Pipe Installation";
        }

        return "Laundry Services";
    }


    private String getSubject11(String strand) {

        if (strand.equals("STEM")) {
            return "Physics";
        }

        if (strand.equals("HUMSS")) {
            return "Creative Writing";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Advanced Plumbing";
        }

        return "Advanced Housekeeping";
    }


    private String getSubject13(String strand) {

        if (strand.equals("STEM")) {
            return "Biology";
        }

        if (strand.equals("HUMSS")) {
            return "Disciplines and Ideas";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Safety";
        }

        return "Guest Services";
    }


    private String getSubject14(String strand) {

        if (strand.equals("STEM")) {
            return "Chemistry";
        }

        if (strand.equals("HUMSS")) {
            return "Media and Information Literacy";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Repair";
        }

        return "Laundry and Linen Services";
    }


    private String getQuarter3Subject4(String strand) {

        if (strand.equals("STEM")) {
            return "General Chemistry";
        }

        if (strand.equals("HUMSS")) {
            return "World Literature";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Water Supply Systems";
        }

        return "Housekeeping Supervision";
    }


    private String getQuarter3Subject6(String strand) {

        if (strand.equals("STEM")) {
            return "Physics Applications";
        }

        if (strand.equals("HUMSS")) {
            return "Social Sciences";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Drainage Systems";
        }

        return "Food and Beverage Services";
    }


    private String getQuarter4Subject4(String strand) {

        if (strand.equals("STEM")) {
            return "Research Methods";
        }

        if (strand.equals("HUMSS")) {
            return "Cultural Studies";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Design";
        }

        return "Housekeeping Management";
    }


    private String getQuarter4Subject6(String strand) {

        if (strand.equals("STEM")) {
            return "Environmental Science";
        }

        if (strand.equals("HUMSS")) {
            return "Public Administration";
        }

        if (strand.equals("TVL Plumbing")) {
            return "Plumbing Troubleshooting";
        }

        return "Facility Management";
    }


    // =====================================================
    // PREFIX
    // =====================================================

    private String getPrefix(String strand) {

        if (strand.equals("STEM")) {
            return "STEM";
        }

        if (strand.equals("HUMSS")) {
            return "HUMSS";
        }

        if (strand.equals("TVL Plumbing")) {
            return "PLUMB";
        }

        return "HOUSE";
    }


    // =====================================================
    // ADD SUBJECT
    // =====================================================

    private void addSubject(
            String subjectId,
            String subjectName,
            String course,
            String schoolYear,
            String gradeLevel,
            String semester,
            String room,
            String floor,
            String schedule) {

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

        subject.setUnits(1);
        subject.setTuitionFee(300.00);

        subjects.add(subject);
    }


    // =====================================================
    // GET SUBJECTS
    // =====================================================

    public ArrayList<Subject> getSubjects(
            String course,
            String schoolYear,
            String gradeLevel,
            String semester) {

        ArrayList<Subject> result =
                new ArrayList<>();

        for (Subject subject : subjects) {

            if (subject.getCourse()
                    .trim()
                    .equalsIgnoreCase(course.trim())

                    && subject.getSchoolYear()
                    .trim()
                    .equalsIgnoreCase(schoolYear.trim())

                    && subject.getGradeLevel()
                    .trim()
                    .equalsIgnoreCase(gradeLevel.trim())

                    && subject.getSemester()
                    .trim()
                    .equalsIgnoreCase(semester.trim())) {

                result.add(subject);
            }
        }

        return result;
    }


    // =====================================================
    // GET ALL SUBJECTS
    // =====================================================

    public ArrayList<Subject> getAllSubjects() {

        return subjects;
    }


    // =====================================================
    // SECTION CAPACITY (MAX 45 STUDENTS PER SECTION / ROOM)
    // Works for Grade 7-12, all school years, all strands
    // =====================================================

    public static final int MAX_STUDENTS = 45;

    public static class SectionAssignment {
        public final String section;
        public final String room;
        public final String floor;

        public SectionAssignment(String section, String room, String floor) {
            this.section = section;
            this.room = room;
            this.floor = floor;
        }
    }

    // Counts students already in a section (excluding this student)
    private int countStudentsInSection(
            java.sql.Connection con,
            String section,
            String gradeLevel,
            String course,
            String schoolYear,
            String semester,
            String studentId) throws java.sql.SQLException {

        String sql =
                "SELECT COUNT(DISTINCT e.student_id) "
                + "FROM enrollments e "
                + "INNER JOIN students s "
                + "ON e.student_id = s.student_id "
                + "WHERE e.section = ? "
                + "AND s.year_level = ? "
                + "AND s.course = ? "
                + "AND s.school_year = ? "
                + "AND s.semester = ? "
                + "AND e.student_id <> ?";

        try (java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, section);
            pst.setString(2, gradeLevel);
            pst.setString(3, course);
            pst.setString(4, schoolYear);
            pst.setString(5, semester);
            pst.setString(6, studentId);

            try (java.sql.ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return 0;
    }

    // Every section in a school year gets its own unique room.
    // Existing sections keep their room; a new section gets the next free room.
    private int getRoomIndex(
            java.sql.Connection con,
            String section,
            String schoolYear) throws java.sql.SQLException {

        String sql =
                "SELECT e.section "
                + "FROM enrollments e "
                + "INNER JOIN students s "
                + "ON e.student_id = s.student_id "
                + "WHERE s.school_year = ? "
                + "GROUP BY e.section "
                + "ORDER BY MIN(e.enrollment_id)";

        int index = 0;

        try (java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, schoolYear);

            try (java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    if (section.equals(rs.getString("section"))) {
                        return index;
                    }
                    index++;
                }
            }
        }

        // New section: next free room
        return index;
    }

    // Finds the first section with fewer than 45 students.
    // If full, automatically moves to the next section, room and adviser.
    public SectionAssignment assignSection(
            String baseSection,
            String gradeLevel,
            String course,
            String schoolYear,
            String semester,
            String studentId) {

        try (java.sql.Connection con =
                DatabaseConnection.getConnection()) {

            int n = 0;

            while (true) {

                String section = (n == 0)
                        ? baseSection
                        : baseSection + "-" + (n + 1);

                int count = countStudentsInSection(
                        con, section, gradeLevel, course,
                        schoolYear, semester, studentId);

                if (count < MAX_STUDENTS) {

                    int roomIndex = getRoomIndex(con, section, schoolYear);

                    int floorNumber = (roomIndex / 10) + 1;
                    int roomNumber = (floorNumber * 100) + (roomIndex % 10) + 1;

                    String floor;
                    if (floorNumber == 1) floor = "1st Floor";
                    else if (floorNumber == 2) floor = "2nd Floor";
                    else if (floorNumber == 3) floor = "3rd Floor";
                    else floor = floorNumber + "th Floor";

                    return new SectionAssignment(
                            section, "Room " + roomNumber, floor);
                }

                n++;
            }

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(
                    null, "Section Error: " + e.getMessage());
            return new SectionAssignment(baseSection, "Room 101", "1st Floor");
        }
    }

    // Returns the 8 subjects with the assigned room and floor applied
    public ArrayList<Subject> getSubjectsForSection(
            String course,
            String schoolYear,
            String gradeLevel,
            String semester,
            SectionAssignment assignment) {

        ArrayList<Subject> result = new ArrayList<>();

        for (Subject s : getSubjects(course, schoolYear, gradeLevel, semester)) {

            Subject copy = new Subject(
                    s.getSubjectId(),
                    s.getSubjectName(),
                    s.getCourse(),
                    s.getSchoolYear(),
                    s.getGradeLevel(),
                    s.getSemester(),
                    assignment.room,
                    assignment.floor,
                    s.getSchedule()
            );

            copy.setUnits(1);
            copy.setTuitionFee(300.00);

            result.add(copy);
        }

        return result;
    }


    // =====================================================
    // GET ADVISER
    // =====================================================


public String getAdviser(
        String subjectId,
        String subjectName,
        String gradeLevel,
        String course,
        String schoolYear,
        String quarter,
        String section) {

    if (subjectName == null || subjectName.trim().isEmpty()) {
        return "No adviser assigned";
    }

    String[] adviserNames = {
        "Andrea Santos",
        "Miguel Reyes",
        "Sofia Cruz",
        "Gabriel Garcia",
        "Isabella Mendoza",
        "Daniel Bautista",
        "Patricia Villanueva",
        "Joshua Aquino",
        "Angela Castillo",
        "Nathan Flores",
        "Camille Navarro",
        "Adrian Ramos",
        "Christine Torres",
        "Rafael Rivera",
        "Beatrice Fernandez",
        "Lorenzo Morales",
        "Maria Gonzales",
        "Joseph Mercado",
        "Clarisse Domingo",
        "Samuel Dela Cruz",
        "Nicole Salazar",
        "Matthew Manalo",
        "Bianca Santiago",
        "Carlos Pascual",
        "Jasmine Castro",
        "Anthony Aguilar",
        "Rachel Diaz",
        "Vincent Lim",
        "Monica Tan",
        "Patrick Valdez"
    };

    String strand = course;

    String findSql =
            "SELECT adviser_name FROM advisers "
            + "WHERE grade_level = ? "
            + "AND section = ? "
            + "AND school_year = ? "
            + "AND strand = ? "
            + "AND quarter = ? "
            + "AND adviser_name IS NOT NULL "
            + "LIMIT 1";

    try (java.sql.Connection con =
            DatabaseConnection.getConnection()) {

        // Check whether this class already has an adviser.
        try (java.sql.PreparedStatement pst =
                con.prepareStatement(findSql)) {

            pst.setString(1, gradeLevel);
            pst.setString(2, section);
            pst.setString(3, schoolYear);
            pst.setString(4, strand);
            pst.setString(5, quarter);

            try (java.sql.ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("adviser_name");
                }
            }
        }

        // Select a consistent sample adviser for the subject.
        String key = (subjectId + "|" + subjectName + "|"
                + gradeLevel + "|" + section + "|"
                + schoolYear + "|" + strand + "|"
                + quarter).toLowerCase();

        int index = Math.floorMod(
                key.hashCode(), adviserNames.length);

        String adviserName = adviserNames[index];

        String insertSql =
                "INSERT INTO advisers "
                + "(adviser_name, grade_level, section, "
                + "school_year, strand, quarter) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (java.sql.PreparedStatement pst =
                con.prepareStatement(insertSql)) {

            pst.setString(1, adviserName);
            pst.setString(2, gradeLevel);
            pst.setString(3, section);
            pst.setString(4, schoolYear);
            pst.setString(5, strand);
            pst.setString(6, quarter);

            pst.executeUpdate();
        }

        return adviserName;

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(
                null,
                "Adviser Error:\n" + e.getMessage(),
                "Database Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);

        return "No adviser assigned";
    }
}
}