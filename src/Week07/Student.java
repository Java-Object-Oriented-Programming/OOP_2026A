package Week07;

public class Student extends Person {

    private double grade;

    public Student(double grade) {
        super("", "", "", "", "");
        this.grade = grade;
        System.out.println("Hello Student");
    }


    public Student(String name, String id, String lastName, String address, String year, double grade) {
        super(name, id, lastName, address, year);
        this.grade = grade;
    }


    public Student(String name, String id, String lastName, double grade) {
        super(name, id, lastName, "",null);
        this.grade = grade;
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
//        if(!(grade<0 || grade>100))
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
    }


    public void getDetails() {
        System.out.println(getName());
    }
}
