package _25_08;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args){
        int n, arr[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");

        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = JUtils.randomize(1, 10);

        int[] reverseArr = reverse(arr);

        JUtils.printArray(arr);
        JUtils.printArray(reverseArr);
    }

    public static int[] reverse(int[] arr) {
        int[] reverseArr = new int[arr.length];

        for(int arrIndex = arr.length - 1, reverseIndex = 0; arrIndex >= 0; arrIndex--, reverseIndex++){
            reverseArr[reverseIndex] = arr[arrIndex];
        }

        return reverseArr;
    }


}
