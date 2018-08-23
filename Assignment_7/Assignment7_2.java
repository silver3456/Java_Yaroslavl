import java.util.Arrays;
import java.util.Scanner;

public class Assignment7_2 {
    public static void main(String[] args) {
        Integer n, arr[], result, var;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");

        n = in.nextInt();
        arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomize(1, 10);
        }

        System.out.println("Enter random number");
        var = in.nextInt();

        if(Arrays.asList(arr).contains(var)){
            result = Arrays.asList(arr).indexOf(var);
            System.out.println("Index of random number is " + result);
        }

        else
            System.out.println(-1);

        for (int i : arr)
            System.out.print(i + " ");

    }

    public static int randomize(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}


