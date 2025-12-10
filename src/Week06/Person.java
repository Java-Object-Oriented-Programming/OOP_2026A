package Week06;

import java.util.Comparator;

interface IPerson {
    public void sleep();

    public void sleep(int a);

    public void eat();
}

public class Person implements IPerson, Comparable<Person> {

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
                ", age=" + age +
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

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age && this.name.equals(o.name)) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }
}

class Student implements IPerson {


    @Override
    public void sleep() {

    }

    @Override
    public void sleep(int a) {
        System.out.println(a * a);
    }

    @Override
    public void eat() {

    }
}

class ComparePersonByAge implements Comparator<Person> {
    // o1.age =12
    // o2.age =6
    // return o1.age-o2.age = 6

    // o1.age =6
    // o2.age =12
    // return o1.age-o2.age = -6

    // o1.age =12
    // o2.age =12
    // return o1.age-o2.age = 0

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age) return 1;
        else if (o1.age < o2.age) return -1;
        return 0;
    }
}
class ComparePersonByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}class ComparePersonByLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}