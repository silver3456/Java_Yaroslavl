package CodingChallange;

import java.util.*;

public class Draft35 {
    public static void main(String[] args) {

        int[][] arr2d = new int[2][];
        arr2d[0] = new int[3];
        arr2d[1] = new int[5];

        for (int j = 0; j < arr2d.length; j++) {
            for (int i =0; i < arr2d[j].length; i++ ) {
                arr2d[j][i] = i;
            }
        }

        for (int[] a : arr2d) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }


}
