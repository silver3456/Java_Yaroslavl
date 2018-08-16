
import java.util.Scanner;
import java.util.*;

public class Matrix {

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
        sumOfLines(matrix);
    }


    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void sumOfLines(int a[][]) {
        int x = a.length;
        int s = 0;
        int Str1 = 0;
        Map<String, Integer> map = new HashMap<>();

        while (s < x) {
            for (int i = 0; i < x; i++) {
                Str1 += a[s][i];
            }

            s++;
            saveSumInMap(map, Str1, s);
            System.out.println("Сумма елементов строки " + s + " равна: " + Str1);
            Str1 = 0;
        }
        findMinLine(map);
    }

    public static void saveSumInMap(Map<String, Integer> map, int a, int s) {
        int line = s;
        int sum = a;

        map.put(" " + s, sum);
    }

    public static void findMinLine(Map<String, Integer> map) {
        int minValueInMap = (Collections.min(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minValueInMap) {
                System.out.println("Строка с минимальной суммой всех элементов равна №" + entry.getKey());
            }
        }

    }

}




