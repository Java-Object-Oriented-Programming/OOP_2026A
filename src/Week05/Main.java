package Week05;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private int test;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "barak";
        s.getName();

        Student s2 = new Student();
        s2.name = "barak2";
        s2.getName();


        int randSize = new Random().nextInt(0, 890);
        Student[] students = new Student[randSize];
        for (int i = 0; i < randSize; i++)
            students[i] = new Student();

        System.out.println(Student.COUNT);
        System.out.println(randSize);
        System.out.println(students.length);


        Main m = new Main();

        Student.test();

        int f = 3;
        Integer g = 6;


    }

    public int xor(int a, int b) {
        return a + b;
    }
}
