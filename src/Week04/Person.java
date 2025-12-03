package Week04;

public class Person {

    String name;
    String id;
    String lastName;
    String address;
    String year;
    float age;

    public Person() {

    }

    public Person(Person other) {
        this.name = other.name;
        this.id = other.id;
        this.lastName = other.lastName;
        this.address = other.address;
        this.year = other.year;
    }

    public Person(String name, String id, String lastName, String address, String year) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
    }

    public Person(String name, String id, String lastName, String address, String year, float age) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
        this.age = age;
    }

    public Person(String name, String id, String lastName, String address, float age, String year) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
        this.age = age;
    }

     void func() {
        Person copy = new Person(this);

        System.out.println(this.name);
    }

     boolean compare(Person p) {
        return this.name == p.name;
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
}
