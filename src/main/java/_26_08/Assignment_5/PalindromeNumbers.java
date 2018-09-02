package _26_08.Assignment_5;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        int n, arr[], central;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = randomize(1, 9);

        int randomNum = arrayToInt(arr);//generate random number, and convert array to int
        StringBuilder str = new StringBuilder(String.valueOf(randomNum));
        str.reverse();
        int reverse = Integer.parseInt(str.toString());//reverse generated number
        String result = randomNum + "" + reverse; //String valueOf number + reverse number
        System.out.println(result);

        //Enter central number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter random central number: ");
        central = input.nextInt();
        String convertNum = String.valueOf(central);//convert int to String

        String[] ary = result.split("");
        String res = ary[0].concat(ary[1]).concat(ary[2]).concat(convertNum).concat(ary[3]).concat(ary[4]).concat(ary[5]);
        System.out.println(res);
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * ((max - min + 1) + min));
    }

    static int arrayToInt(int[] arr) {
        StringBuilder s = new StringBuilder();

        for (int i : arr) {
            s.append(i); //add all the ints to a string
        }
        return Integer.parseInt(s.toString()); //parse integer out of the string
    }
}



