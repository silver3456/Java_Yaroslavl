package CodingChallange;

import java.util.*;

public class SnapLogicPractice {
    public static void main(String[] args) {

       int [] arr = {3, -3, 5, 8, 6, 9};

       for(int j = 0; j < arr.length; j++) {
           for (int i = 0; i < j -1; i++) {
               int num = arr[i];
               int nextNum = arr[i + 1];
               if (num > nextNum) {
                   int temp = num;
                   arr[i] = nextNum;
                   arr[i + 1] = temp;
               }
           }
       }

       for (int i =0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }


}
