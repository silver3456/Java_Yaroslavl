package _25_08;

import java.util.Scanner;

public class _4 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomize(1, 9);
            }
        }

        for (int i = 0; i < matrix.length; i++, System.out.println()) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int minIndex = sumOfLines(matrix);
        System.out.println("Строка с минимальной суммой всех элементов равна № " + minIndex);
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static Integer sumOfLines(int a[][]) {
        int strCount = a.length;
        int strIndex = 0;
        int minIndex = -1;
        int minSum = 0;


        while (strIndex < strCount) {
            int sumLines = 0;
            for (int i = 0; i < strCount; i++) {
                sumLines += a[strIndex][i];
            }

            if(minSum> sumLines || strIndex == 0){
                minSum = sumLines;
                minIndex = strIndex;
            }

            System.out.println("Сумма елементов строки " + strIndex + " равна: " + sumLines);
            strIndex++;
        }

        return minIndex;
    }
}




