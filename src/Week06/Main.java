package Week06;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Person p = new Person();
        p.age = 15;
        Person p1 = new Person();
        p1.age = 19;
        Student s = new Student();

        IPerson is = new Student();
        IPerson ip = new Person();


        nightMode(p);
        nightMode(s);
        nightMode(is);
        nightMode(ip);


//        Arrays.sort();
//        Collections.sort();
//        Comparator c;
//        Comparable comp;


        Person[] people = new Person[10];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].address = "Sheshet Ha'yamim " + i;
            people[i].name = "" + i;
            people[i].lastName = "(" + i + "," + i + ")";
            people[i].age = new Random().nextInt(18, 67);
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].age > people[j + 1].age) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].compareTo(people[j + 1]) == 1) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;

                }
            }
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        Arrays.sort(people);
        String s2 = "Hello";

        ComparePersonByAge compByAge = new ComparePersonByAge();
        ComparePersonByName compByName = new ComparePersonByName();
        ComparePersonByLastName compByLastName = new ComparePersonByLastName();
        Comparator<Person> comparator = compByAge.thenComparing(compByName).thenComparing(compByLastName);

        Collections.sort(Arrays.stream(new ArrayList<Person>().toArray(people)).toList(), compByAge);
        Collections.sort(Arrays.stream(new ArrayList<Person>().toArray(people)).toList(), comparator);
        Collections.sort(Arrays.stream(new ArrayList<Person>().toArray(people)).toList(), compByName);
    }

    private static void nightMode(IPerson ip) {


    }


}