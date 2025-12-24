package Week08.Task;

public class TeachingAssistant extends Employee {

    private int weeklyHours;
    private Lecturer supervisor;

    public TeachingAssistant(String fullName, String id, String email, String phone,
                             String department, int employeeNumber, double salary,
                             int weeklyHours) {

        super(fullName, id, email, phone, department, employeeNumber, salary);
        setWeeklyHours(weeklyHours);
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        if (weeklyHours >= 0 && weeklyHours <= 40) {
            this.weeklyHours = weeklyHours;
        }
    }

    public Lecturer getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Lecturer supervisor) {
        if (supervisor != null) {
            this.supervisor = supervisor;
        }
    }

    @Override
    public String getDescription() {
        return "Teaching Assistant: " + fullName +
                ", Weekly Hours: " + weeklyHours;
    }
}
