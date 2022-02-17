package OCA.oca_answers;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int x = array.length;


//        while (x > 0) {
//            x--;
//            System.out.println(array[x]);
//        }

        while (x > 0) {
            System.out.println(array[--x]);
        }
    }
}
