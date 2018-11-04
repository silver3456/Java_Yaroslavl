package _03_11_2018;

import java.util.Arrays;

public class AverageNum {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 2, 3, 5, 6};
        int[] arrTwo = {2, 3, 5};
        int[][] matrix = {{3, 5, 7, 1}, {5, 2, 4, 8}, {3, 8, 6, 0}, {8, 0, 0, 9}};


        sumMatrixRow(matrix);
        averageNum(arr);
        findSubArray(arr, arrTwo);
        arrShift(arr);
        //8 6 3
        //2 3 5
    }

    private static void sumMatrixRow(int[][] matrix) {
        int sum = 0;

        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j)
                sum += matrix[i][j];
            }
        }*/

        for(int i = 0; i < matrix.length; i++)
            sum+=matrix[i][i];
        System.out.println(sum);


    }

    private static void arrShift(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void findSubArray(int[] array, int[] arrayTwo) {
        boolean flag = false;

        for (int i = 0; i < array.length; ) {
            flag = true;
            for (int j = 0; j < arrayTwo.length; j++) {
                if (array[i] != arrayTwo[j]) {
                    i++;
                    flag = false;
                    break;
                } else {
                    i++;
                }
            }
            if (flag)
                break;
        }
        if (flag) {
            System.out.println("Arrays matched");
        } else {
            System.out.println("Arrays not matched");
        }

    }

    public static void averageNum(int[] array) {

        int sum = 0;
        double aver = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if (array.length != 0)
            aver = (double) sum / array.length;
        System.out.println(aver);

    }
}
