package Week08.Task;

public class Student extends Person {

    private int year;
    private String degree;
    private double averageGrade;

    public Student(String fullName, String id, String email, String phone,
                   int year, String degree, double averageGrade) {
        super(fullName, id, email, phone);
        setYear(year);
        setDegree(degree);
        setAverageGrade(averageGrade);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 5) {
            this.year = year;
        }
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if (degree != null && !degree.isEmpty()) {
            this.degree = degree;
        }
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0 && averageGrade <= 100) {
            this.averageGrade = averageGrade;
        }
    }

    @Override
    public String getDescription() {
        return "Student: " + fullName +
                ", Year: " + year +
                ", Degree: " + degree;
    }
}
