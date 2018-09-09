package _26_08.Assignment_2;

//resolved by myself

import _25_08.JUtils;

public class SumInArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 45, 50, 5, 30};

        int sum = findSumBetween(arr);
        System.out.println("Sum between min and max values of array = " + sum);
    }
    public static int findSumBetween(int[] arr){
        int indexMin = JUtils.findMinIndex(arr);

        int indexMax = JUtils.findMaxIndex(arr);

        int sum = 0;

        int first = indexMax <= indexMin ? indexMax : indexMin;
        int last = indexMax >= indexMin ? indexMax : indexMin;

        first = first == arr.length - 1 ? first : first + 1;
        last = last == 0 ? last : last - 1;

        for (int i = first; i <= last; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}


