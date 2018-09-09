package _25_08;

public class JUtils {
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static int findMinIndex(int[] array) {

        int min = array[0];
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int findFactorial(int a) {

        int factorial = 1;

        for (int i = 1; i <= a; i++)
            factorial = i * factorial;


        return factorial;
    }

    public static double findSin(double x) {
        double res = 0;
        int var = 1;
        for (int i = 1, c = 1; c <= 50; i += 2, c++) {

            double power = Math.pow(x, (double) i);
            double div = findFactorial(i);
            double result = power / div;
            res = res + result * var;
            var = var * (-1);

        }
        return res;

    }

}
