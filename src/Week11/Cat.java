package Week11;

import java.util.Date;

public class Cat extends Mammal{

    public Cat() {
        super("");
        System.out.println("Cat");
    }

    public Cat(String name) {
        super(name);
        System.out.println("Cat(String name)");
    }

    public Cat(Date birthday, String name) {
        super(birthday, name);
    }
}
