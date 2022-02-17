package CodingChallange;

import java.util.*;

public class Draft35 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        String res = findValue(Level.MEDIUM);
        System.out.println(res);

    }

    private static String findValue(Level myVar) {
        switch(myVar) {
            case LOW:
               return "Low level";
            case MEDIUM:
                return "Medium level";
            case HIGH:
                return "High level";
        }
        return null;
    }




}
