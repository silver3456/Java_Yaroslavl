package OCA.oca_answers;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};


        for (int j = 0 ; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }


//        for (int[] a : arr) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(a[i] + " ");
//
//            }
//            System.out.println();
//        }
    }
}
