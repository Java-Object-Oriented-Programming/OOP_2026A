package Week08.Task;

public class DepartmentHead extends Lecturer {

    private Lecturer[] lecturers;
    private int lecturerCount;

    public DepartmentHead(String fullName, String id, String email, String phone,
                          String department, int employeeNumber, double salary,
                          String academicTitle, int coursesCount, String officeNumber) {

        super(fullName, id, email, phone,
                department, employeeNumber, salary,
                academicTitle, coursesCount, officeNumber);

        lecturers = new Lecturer[10];
    }

    public void addLecturer(Lecturer lecturer) {
        if (lecturer != null && lecturerCount < lecturers.length) {
            lecturers[lecturerCount++] = lecturer;
        }
    }

    public Lecturer[] getLecturers() {
        return lecturers;
    }

    @Override
    public String getDescription() {
        return "Department Head: " + fullName +
                ", Lecturers Managed: " + lecturerCount;
    }
}
