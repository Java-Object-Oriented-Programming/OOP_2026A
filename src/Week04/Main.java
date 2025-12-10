package Week04;

import java.io.IOException;

public class Main {


    static void main() {
        Person p = new Person();
        p.address = "Sheshet Ha'yamim";
        p.name = "Barak";
        p.id = "123456789";
        p.lastName = "Sharabi";
        p.func();

        Person p1 = new Person("Bob", "12345678", "B", "", "");
        System.out.println(p1);

        p1.func();
        String[] name = {"barak"};
        Person[] people = {p, p1};

        Person p2 = null;
        Person[] people1 = new Person[100];

//        for (int i = 0; i < people1.length; i++) {
//            System.out.println(people1[i]);
//        }

        System.out.println(p);
        System.out.println(p.getDetails());

        int[] arr;
        float[] floats;
        double[] doubles;

        Object[] objects = {1, false, 1.2, "ddd", 'c', p,};
        getPerson(p);
        getPerson(p1);
        p.compare(p1);
        p.func();

        for (int i = 0; i < people1.length; i++) {
            people1[i] = new Person(p);
        }

        int s = sum(1, 2);


    }

    private static int sum(int a, int b) {

        return a + b;
    }

    private static void getPerson(Person other) {

    }
}
