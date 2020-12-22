package CodingChallange.educative;

//https://www.educative.io/courses/algorithms-coding-interviews-java/YQpPNvN3LAY
// Binary search runs in O(log(n))O(log(n))

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 6, 9, 45, 89, 0};
//        int arr[] = {};


        int key = 45;

        System.out.println(binarySearch(arr, key));
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length <= 0) { //if the array consists of one element or none
            return -1;
        }

        if (arr.length == 1) { //If the array only has one element,
            if (arr[0] == target) { //we check if it is equal to target
                return 0;
            } else {
                return -1;
            }
        }


        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
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
