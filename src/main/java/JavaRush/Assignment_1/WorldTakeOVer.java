package JavaRush.Assignment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WorldTakeOVer {
    final static int LIMIT = 2;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String input;


        for (int i = 0; i < LIMIT; i++) {

            System.out.println("Введите слово:");
            input = reader.readLine();
            list.add(input);
        }
        System.out.println(list.get(0) + " захватит мир через "
                + list.get(1) + " лет. Му-ха-ха!");
    }
}
