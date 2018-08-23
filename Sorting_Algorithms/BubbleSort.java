public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 4, 3, 6, 10};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int num = arr[i];
                int nextNum = arr[i + 1];
                if (num > nextNum) {
                    int buf = num;
                    arr[i] = nextNum;
                    arr[i + 1] = buf;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }

}
