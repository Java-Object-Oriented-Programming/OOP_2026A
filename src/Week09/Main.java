package Week09;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static void main() {
        Lists l = new Lists();
        int[] arr = new int[10];

        for (int i = 0, k = arr.length - 1; i < arr.length && k >= 0; i++, k--) {
            System.out.println(arr[i]);
            System.out.println(arr[k]);
        }

        int[][] mat = new int[10][10];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = new Random().nextInt(10, 86);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        String space = "";
//
//        for (int i = 0; i < mat.length; i++) {
//            System.out.println(space + mat[i][i]);
//            space += "    ";
//        }
//
//        for (int i = 0; i < mat.length; i++) {
//            System.out.print(space);
//            for (int j = i + 1; j < mat[i].length; j++) {
//                System.out.print(mat[i][j] + ", ");
//            }
//            space += "    ";
//            System.out.println(space);
//        }
//
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(mat[i][j] + ", ");
//            }
//            System.out.println();
//        }
        space = "";
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < 40 - i * 4; k++) {
                space += " ";
            }
            System.out.print(space);
            for (int j = mat.length - i; j < mat.length; j++) {
                System.out.print(mat[i][j] + ", ");
            }
            space="";
            System.out.println();
        }
        System.out.println("\n-------------------------------\n");


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length-i-1; j++) {
                System.out.print(mat[i][j] + ", ");
            }
            System.out.println();
        }

    }


}
