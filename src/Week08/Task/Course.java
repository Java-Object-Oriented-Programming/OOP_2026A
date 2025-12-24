package Week08.Task;

public class Course {

    private String courseName;
    private String courseCode;
    private int creditPoints;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, int creditPoints) {
        setCourseName(courseName);
        setCourseCode(courseCode);
        setCreditPoints(creditPoints);
    }

    public void setLecturer(Lecturer lecturer) {
        if (lecturer != null) {
            this.lecturer = lecturer;
            lecturer.addCourse(this);
        }
    }

    public String getCourseInfo() {
        return "Course: " + courseName +
                ", Lecturer: " + lecturer.getFullName();
    }

    public void setCourseName(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            this.courseName = courseName;
        }
    }

    public void setCourseCode(String courseCode) {
        if (courseCode != null && !courseCode.isEmpty()) {
            this.courseCode = courseCode;
        }
    }

    public void setCreditPoints(int creditPoints) {
        if (creditPoints > 0) {
            this.creditPoints = creditPoints;
        }
    }
}
