package Week11;

import java.util.Date;

public abstract class Mammal extends Animal{


    public Mammal() {

        System.out.println("Mammal");
    }

    public Mammal(String name) {
        super(name);
        System.out.println("Mammal");
    }

    public Mammal(Date birthday, String name) {
        super(birthday, name);
    }
}
