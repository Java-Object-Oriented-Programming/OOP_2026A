package Week02;

public class Main {


    public static void main(String[] args) {
        // -------------------------------------------
        int[][] mat =
                {{1, 2, 3},
                        {6, 5, 4},
                        {7, 8, 9}};

        System.out.println(mat[0][0]);
        System.out.println(mat[1][1]);
        System.out.println(mat[2][2]);
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i]);
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
            sum += mat[i][i];
        }
        System.out.println(sum);


        int[][] matTest = new int[3][3];
        matTest[0] = new int[]{1, 2, 3};
        matTest[1] = new int[]{6, 5, 4};
        matTest[2] = new int[]{7, 8, 9};

        matTest = new int[][]{{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
        matTest = new int[][]{new int[]{1, 2, 3}, new int[]{6, 5, 4}, new int[]{7, 8, 9}};

        System.out.println(matTest[0][0]);
        System.out.println(matTest[1][1]);
        System.out.println(matTest[2][2]);

        for (int i = 0; i < matTest.length; i++) {
            System.out.println(matTest[i]);
        }

        for (int i = 0; i < matTest.length; i++) {
            System.out.println(matTest[i][i]);
        }
        for (int i = 0; i < matTest.length; i++) {
            for (int j = 0; j < matTest.length; j++) {
                if (i == j)
                    System.out.println(matTest[i][j]);
            }
        }

//         {(0,0), (0,1), (0,2)},
//         {(1,0), (1,1), (1,2)},
//         {(2,0), (2,1), (2,2)},

//        for (int i = matTest.length-1; i >=0; i--) {
//            System.out.println(matTest[i][2]);
//            System.out.println(matTest[i][1]);
//            System.out.println(matTest[i][0]);
//        }

        for (int i = 0; i < matTest.length; i++) {
            System.out.println(matTest[i][matTest.length - 1 - i]);
        }
        for (int i = 0; i < matTest.length; i++) {
            for (int j = 0; j < matTest.length; j++) {
                if (i + j == matTest.length - 1)
                    System.out.println(matTest[i][j]);
            }
        }


//         {(0,0), (0,1), (0,2), (0,3), (0,4)},
//         {(1,0), (1,1), (1,2), (1,3), (1,4)},
//         {(2,0), (2,1), (2,2)},//         {(0,0), (0,1), (0,2)},
//         {(1,0), (1,1), (1,2)},
//         {(2,0), (2,1), (2,2)},
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + "j = " + j);
            }
        }

    }
}
