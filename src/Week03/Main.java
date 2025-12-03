package Week03;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] oopGrade = {70, 80, 59, 90, 87};
//        int[] javaGrade = {90, 60, 99, 90, 97};
//        int[] pyGrade = {90, 60, 99, 90, 97};
//        int[][] grades = {oopGrade, javaGrade, pyGrade};
//        int[][] grades1 = {oopGrade, javaGrade, pyGrade};
//        int[][] grades2 = {oopGrade, javaGrade, pyGrade};
//        int[][] grades3 = {oopGrade, javaGrade, pyGrade};
//        int[][][] dep = {};
        Person p = new Person("Barak", "Sharabi", "Sheshet Ha'yamim");

        p.address = "Sheshet Ha'yamim";
        p.name = "Barak";
        p.lastName = "Sharabi";

        p.getFullName();

        System.out.println(p.lastName);

        Person[] people = new Person[200];
        for (int i = 0; i < 200; i++) {
            people[i] = new Person();
            people[i].address = "Sheshet Ha'yamim " + i;
            people[i].name = "" + i;
            people[i].lastName = "(" + i + "," + i + ")";
        }

        for (int i = 0; i < people.length; i++) {
            people[i].print();
            System.out.println(people[i]);
        }
//        for (int i = 0; i < people.length; i++) {
//            System.out.println("Person{" +
//                    "name='" + people[i].name + '\'' +
//                    ", lastName='" + people[i].lastName + '\'' +
//                    ", address='" + people[i].address + '\'' +
//                    '}');
//            System.out.println(people[i]);
//        }


        Person[] students = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name");
            String name = in.next();
            System.out.println("Enter last");
            String lastName = in.next();
            System.out.println("Enter addr");
            String address = in.next();
            students[i] = new Person(name, lastName, address);
        }
    }
}
