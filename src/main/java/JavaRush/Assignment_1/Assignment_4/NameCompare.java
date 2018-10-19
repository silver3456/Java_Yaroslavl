package JavaRush.Assignment_1.Assignment_4;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NameCompare {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String s = "JOhn";
        s.intern();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name");
            String inputName = reader.readLine();
            list.add(inputName);
        }
        if (list.get(0).equals(list.get(1))) {
            System.out.println("Equal names");
        } else if (list.get(0).length() == list.get(1).length())
            System.out.println("Names length are equal");
    }
}
