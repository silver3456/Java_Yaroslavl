package CodingChallange;

//Calculate sums of two diagonals

//123
//456
//789


public class SumOfMatrixDiagonals {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0, j = i; i < matrix.length; j++, i++) {
            sumOne = sumOne + matrix[i][j];
        }
        System.out.println("Sum one is: " + sumOne);

        for (int i = 0, j = 2; i < matrix.length; j--, i++) {
            sumTwo = sumTwo + matrix[i][j];
        }
        System.out.println("Sum two is: " + sumTwo);
    }

}

