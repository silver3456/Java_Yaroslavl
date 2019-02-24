package CodingChallange;

import java.util.ArrayList;

public class LongestStringArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Al");
        list.add("Alexander");
        list.add("Alex");

        int maxLength = 0;
        String longest = "";

        for (String s : list) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longest = s;
            }

        }
        System.out.println("Longest string is " + longest);
    }
}


