package JavaRush.Assignment_1;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream ss = System.in;

        int c;

        while ((c = ss.read()) != 0)
            System.out.println(c);
    }
}
