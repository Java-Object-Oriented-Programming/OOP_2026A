package Week08.Task;

public class Lecturer extends Employee {

    private String academicTitle;
    private int coursesCount;
    private String officeNumber;

    private TeachingAssistant[] assistants;
    private int assistantCount;

    private Course[] courses;
    private int courseCount;

    public Lecturer(String fullName, String id, String email, String phone,
                    String department, int employeeNumber, double salary,
                    String academicTitle, int coursesCount, String officeNumber) {

        super(fullName, id, email, phone, department, employeeNumber, salary);

        setAcademicTitle(academicTitle);
        setCoursesCount(coursesCount);
        setOfficeNumber(officeNumber);

        assistants = new TeachingAssistant[5];
        courses = new Course[5];
    }

    public void addAssistant(TeachingAssistant ta) {
        if (ta != null && assistantCount < assistants.length) {
            assistants[assistantCount++] = ta;
        }
    }

    public void addCourse(Course course) {
        if (course != null && courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }

    public TeachingAssistant[] getAssistants() {
        return assistants;
    }

    public Course[] getCourses() {
        return courses;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        if (academicTitle != null && !academicTitle.isEmpty()) {
            this.academicTitle = academicTitle;
        }
    }

    public int getCoursesCount() {
        return coursesCount;
    }

    public void setCoursesCount(int coursesCount) {
        if (coursesCount >= 0) {
            this.coursesCount = coursesCount;
        }
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        if (officeNumber != null && !officeNumber.isEmpty()) {
            this.officeNumber = officeNumber;
        }
    }

    @Override
    public String getDescription() {
        return "Lecturer: " + academicTitle + " " + fullName +
                ", Assistants: " + assistantCount +
                ", Courses: " + courseCount;
    }
}
