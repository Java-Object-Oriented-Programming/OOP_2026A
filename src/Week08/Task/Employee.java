package Week08.Task;

public class Employee extends Person {

    protected String department;
    protected int employeeNumber;
    protected double salary;

    public Employee(String fullName, String id, String email, String phone,
                    String department, int employeeNumber, double salary) {
        super(fullName, id, email, phone);
        setDepartment(department);
        setEmployeeNumber(employeeNumber);
        setSalary(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber > 0) {
            this.employeeNumber = employeeNumber;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    @Override
    public String getDescription() {
        return "Employee: " + fullName +
                ", Department: " + department;
    }
}
