package CodingChallange;

import java.util.ArrayList;

public class SortNumbersArrayLIst {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(12);
        list.add(10);

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr); // convert arrayList in array


        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int num = arr[i];
                int nextNum = arr[i + 1];

                if (num > nextNum) {
                    int temp = num;
                    arr[i] = nextNum;
                    arr[i + 1] = temp;
                }
            }

        }
        for (int i : arr) {
            System.out.print(i + ",");
        }

    }
}

