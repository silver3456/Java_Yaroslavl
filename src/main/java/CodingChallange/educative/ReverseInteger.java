package CodingChallange.educative;

public class ReverseInteger {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 34, 78, 99};
        int key = 78;

        System.out.println(findNum(arr, key));
    }

    public static int findNum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;

        for (int i = 0; i <= arr.length + 1; i++) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
