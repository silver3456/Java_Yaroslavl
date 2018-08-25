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

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void printArray(int[]arr){
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
