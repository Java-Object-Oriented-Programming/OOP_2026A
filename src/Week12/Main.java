package Week12;

import java.util.List;

interface IParent {
    void get();
    void learn();
}
abstract class ABParent{
    abstract  void get();
    abstract  void learn();
}

 abstract class Parent implements IParent {
    void func() {
    }
    public abstract void example();

    static void staticFunc() {
    }

//    public void get() {
//    }
//
//    public void learn() {
//    }
}

class Child extends Parent {
    void func() {
//        this.example();
    }

    @Override
    public void example() {

    }

//    @Override
//    public void example() {
//
//    }

    static void staticFunc() {
    }

    @Override
    public void get() {

    }

    @Override
    public void learn() {

    }
}

public class Main {
    static void main() {
//        Parent p = new Parent();
//        p.func();

        Parent pc = new Child();
        pc.func();

        Child c = new Child();
        c.func();

        Child.staticFunc();
        Parent.staticFunc();
    }

}

