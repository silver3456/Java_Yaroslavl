package CodingChallange.youtube;

import java.util.ArrayList;
import java.util.List;



//www.youtube.com/watch?v=wdt3_BeF3d0
public class FizzBuzz {


    public static void main(String[] args) {
       List list =  fizzBuzz(15);
//       list.forEach(System.out::println);
        System.out.println(list);

    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

}

