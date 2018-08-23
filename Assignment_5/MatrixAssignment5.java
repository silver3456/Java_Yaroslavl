import java.util.Scanner;

public class MatrixAssignment5 {

    public static void main(String[] args) {
        int n;
        int var = 1;
        int trans = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {

            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = var;
                System.out.print(var + " ");
                var++;
            }

            var = arr[0][0] + trans;
            trans++;
        }
    }
}

