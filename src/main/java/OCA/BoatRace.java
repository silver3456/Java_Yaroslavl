package OCA;

import java.util.Arrays;

public class BoatRace {
    public static void modify(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = arr[idx] + 1;
            System.out.print(arr[idx] + " ");
        }
    }
    public static void main (String[] args) {
        int[] arr = {10, 20, 30};
        for (int e : arr) { System.out.print(e + " "); }
        modify(Arrays.copyOf(arr,arr.length));
        for (int e : arr) { System.out.print(e + " "); }
    }

}
