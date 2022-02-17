package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-490/

public class TwoDemArray {
    public static void main(String[] args) {

        int[][] n = {{1, 3}, {2, 4}};

        for (int i = n.length -1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                System.out.print(n[i][j]);
            }
        }
    }

}
