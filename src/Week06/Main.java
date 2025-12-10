package Week06;

interface IPerson {
    public void sleep();
    public void sleep(int a);

    public void eat();
}

class Person implements IPerson {

    String name;
    String id;
    String lastName;
    String address;
    String year;
    float age;

    public Person() {
    }

    public Person(String name, String id, String lastName, String address, String year) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getDetails() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public void sleep() {

    }

    @Override
    public void sleep(int a) {
        System.out.println(a);
    }
    @Override
    public void eat() {

    }
}

class Student implements IPerson {


    @Override
    public void sleep() {

    }

    @Override
    public void sleep(int a) {
        System.out.println(a*a);
    }

    @Override
    public void eat() {

    }
}

public class Main {


    public static void main(String[] args) {

        Person p = new Person();
        Student s = new Student();

        IPerson is = new Student();
        IPerson ip = new Person();


        nightMode(p);
        nightMode(s);
        nightMode(is);
        nightMode(ip);
    }

    private static void nightMode(IPerson ip) {


    }


}
