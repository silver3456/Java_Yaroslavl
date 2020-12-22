package CodingChallange;

import java.util.Arrays;

public class MyClass {

    private static int[] arr = {1, 2, 100};


    static int[] getArr() {
        System.out.println(Arrays.toString(arr));
        return Arrays.copyOf(arr, arr.length);
    }



    public static void main(String[] args) {

//        int[][] a1 = new int[5][];
//        int [][] a2 = new int[2][];
//        int[][][] b3 = new int[1][][];
//        int a3 = 10;
//        int[][][][] a4 = new int[1][2][3][4];
//        a1[1][0] = a3;
//        a4[1][1][0][1] = a1[1][0];
//        a4[0][1] = a1;
//        int[] b1 = new int[1];
//        int b2 = 10;
//        b1[0] = b2;
//        a4[0][1] = a2;
//        b3[1][0] = b1;
//        a4[1][1] = a2;

        int[] res = MyClass.getArr();
        res[2] = 0;
        MyClass.getArr();

    }
}

