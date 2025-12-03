package Week03;

public class Person {


    String name;
    String lastName;
    String address;

    public Person(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Person() {
    }

    void getFullName() {
        System.out.println(name + " " + lastName);
    }

    void print() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
