package Week12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class Example {

    static void main() throws ArithmeticException, Exception {
        int a = 3, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {


        }
        boolean flag = true;
        while (flag) {

            System.out.println("Hello Example");
        }

        ArrayIndexOutOfBoundsException e1 = new ArrayIndexOutOfBoundsException();
        int[] arr = new int[]{1, 2};
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
        int item = 8;
        boolean bool = search(arr, item);

        try {
            bool = search(arr, item, 10);
        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println(g.getMessage());

        }
        System.out.println("Hello");
        funcLaLoLa();
        Thread.sleep(1000);
    }

    private static void funcLaLoLa() throws Exception {
        throw new LaLOLa();
    }

    private static boolean search(int[] arr, int item) throws ArrayIndexOutOfBoundsException {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return true;
        }
        return false;

    }

    //                              {1, 2}          8       10
    private static boolean search(int[] arr, int item, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length)
            throw new ArrayIndexOutOfBoundsException("Out Of Boundsggggg -> " + index);

        for (int i = index; i < arr.length; i++) {
            if (arr[i] == item)
                return true;
        }
        return false;

    }
}

class LaLOLa extends IOException {


}

class MammalEx extends IOException {


}

class FishEx extends Exception {


}