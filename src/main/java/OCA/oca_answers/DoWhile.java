package OCA.oca_answers;

public class DoWhile {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;

        do {
            System.out.print(arr[i] + " ");
            i++;
        }while (i < arr.length - 1);
    }
}
