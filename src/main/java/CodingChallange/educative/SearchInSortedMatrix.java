package CodingChallange.educative;

//https://www.educative.io/courses/algorithms-coding-interviews-java/39RD24wZoGQ


public class SearchInSortedMatrix {


    public static void main(String[] args) {

        int[][] matrix = {{10, 11, 12, 13},
                {14, 15, 16, 17},
                {27, 29, 30, 31},
                {32, 33, 39, 80}};

        int target = 39;

        System.out.println(searchInMatrix(matrix, target));
    }

    private static boolean searchInMatrix(int[][] array, int target) {

        for (int[] arr : array) {
            int res = binarySearch(arr, target);
            if (res >= 0) {
                return true;
            }
        }

        return false;
    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;

        for (int i = 0; i < arr.length; i++) {
            mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
