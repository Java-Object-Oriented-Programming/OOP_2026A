package Week10;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static void main() {
        A b = new B();
        b.func();
        Student s = new Student();

        A[] arr = new A[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new A(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].num);
        }

        arr[0].func();

//        C c = new C();


    }
}
abstract class C{


}

class A extends C {
    public static int COUNT = 0;
    //    public final static int num = 1;
    public final int num;
    private int pnum;
    private int h;
    private int w;

    public A() {
        this.num = 2;
    }


    public A(int w, int h, int num) {
        this.w = w;
        this.h = h;
        this.num = num * 2;
    }

    public A(int num) {
        this.num = num;
    }

    public final void func() {
        System.out.println(this.num);
        System.out.println("Hello from A");
    }

    public void test() {
        System.out.println(num);
        System.out.println("Hello from A");
    }


    public final static void calc() {

    }
}

class B extends A {

//    public void func() {
//        System.out.println("Hello from B");
//        test();
//    }

    public B() {

    }

    public void test() {
        System.out.println(this.num);
        System.out.println("Hello from B");
        super.test();
    }
}

