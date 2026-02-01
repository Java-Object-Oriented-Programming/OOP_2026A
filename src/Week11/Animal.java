package Week11;

import java.util.Date;

public abstract class Animal {
    public Date birthday;
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String name)");
    }

    public Animal(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Animal() {
        System.out.println("Animal");
    }

    public String getName() {
        return name;
    }
}
