import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BubbleSorting {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = randomize(10, 50);
        for (int i : arr)
            System.out.print(i + " ");
//[8, 6, 0 ...]
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int num = arr[i];
                int nextNum = arr[i + 1];
                if (num > nextNum) { //8>6
                    int buf = num; //buf = 8 (copy variable)
                    arr[i] = nextNum;//6 (следущий элемент записывается на место текущего)
                    arr[i + 1] = buf;//8 (присваиваем сохраненный текущий)

                }
            }
        }
        System.out.println();
        for (int i : arr)
            System.out.print(i + " ");

    }


    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

