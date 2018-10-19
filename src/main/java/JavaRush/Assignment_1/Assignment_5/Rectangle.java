package JavaRush.Assignment_1.Assignment_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter m");
        String im = reader.readLine();
        int m = Integer.parseInt(im);

        System.out.println("Enter n");
        String in = reader.readLine();
        int n = Integer.parseInt(in);

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(8 + " ");
            }
        }
    }
}
