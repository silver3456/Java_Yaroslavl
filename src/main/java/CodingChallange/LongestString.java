/*
Problem: Write a program which will print the longest element in an ArrayList.

Enter a series of strings (To stop type: stop)
a
bb
ccc
----------------------------
The longest element (3): ccc
 */


package CodingChallange;

import java.util.*;


public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("Enter a series of strings (To stop type: stop)");
        String text = "";
        String longestString = "";

        while (true) {
            text = input.nextLine();
            if (!text.equals("stop")) {
                list.add(text);
            } else {
                input.close();
                break;
            }
        }

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            String var = list.get(i).toString();

            if (var.length() > max) {
                max = var.length();
                longestString = var;
            }
        }

        System.out.println("The longest element (" + longestString.length() + "): " + longestString);
    }
}
