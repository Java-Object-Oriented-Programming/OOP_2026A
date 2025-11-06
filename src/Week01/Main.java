package Day01;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int num;
        // sout
        // souf
        // fori
        // ctrl + alt + L
        Scanner in = new Scanner(System.in);
        //---------------------------------------
//        int size = in.nextInt();
//        int[] a = new int[size];
        //---------------------------------------


        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number");
            arr[i] = in.nextInt();
        }
        int sum = 0;
        int mul = 1;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            mul *= arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(avg);


    }
}
