package Week06;


import java.util.Random;
import java.util.Scanner;

public interface Animal {
    void makeSound();

}

interface IDog {
    void fly();

}

class Cat implements Animal {
    String name;


    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog implements Animal, IDog {
    String name;

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}

class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        while ( sc.nextInt() != -1) {

            Animal animal = new Random().nextBoolean() ? new Dog() : new Cat();

            if (animal instanceof Dog) {
                System.out.println("Dog");
                ((Dog) animal).fly();
            } else {
                System.out.println("Cat");
                animal.makeSound();
            }
        }
        IDog iDog = new Dog();


    }
}