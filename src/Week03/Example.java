package Week03;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int size = in.nextInt();
        Person[] students = new Person[size];
        for (int i = 0; i < size; i++) {
            System.out.println("----------------------------");
            in.nextLine();
            System.out.println("Enter name");
            String name = in.nextLine();
            System.out.println("Enter last");
            String lastName = in.nextLine();
            System.out.println("Enter addr");
            String address = in.nextLine();
            System.out.println("----------------------------");
            students[i] = new Person(name, lastName, address);
        }

        for (int i = 0; i < size; i++) {
            students[i].print();
        }
    }

}
