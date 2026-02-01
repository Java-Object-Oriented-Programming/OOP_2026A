package Week11;

import java.util.Date;

public class Dog extends Mammal{

    public Dog() {
        super("");
        System.out.println("Dog");
    }

    public Dog(String name) {
        super(name);
        System.out.println("Dog(String name)");
    }

    public Dog(Date birthday, String name) {
        super(birthday, name);
    }
}
