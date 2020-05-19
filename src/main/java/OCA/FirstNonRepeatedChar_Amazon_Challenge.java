package OCA;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar_Amazon_Challenge {

    //Amazon  Find first non-repeating letter
    //google -> l

    //I am using LinkedHashMap cause it maintains insertion order


    public static void main(String args[]){

        String initWord = "google";

        String[] arrChar = initWord.split("");

        Map<String, Integer> map = new LinkedHashMap<>();


        int count;

        for (String s : arrChar) {
            if (map.containsKey(s)) {
                count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }


        for (Map.Entry entry : map.entrySet()) {
           if ((int)entry.getValue() == 1) {
               System.out.println(entry.getKey());
               break;
           }
        }


    }

}





