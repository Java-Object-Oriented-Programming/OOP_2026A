package Week07;

import java.util.Comparator;



public class Person  {

   private String name;
    String id;
    String lastName;
    String address;
    String year;
    float age;

//    public Person() {
//        System.out.println("Hello Person");
//    }

    public Person(String name, String id, String lastName, String address, String year) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
    }

    public String getName() {
        return name;
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



}
