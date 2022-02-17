package OCA.failed_exam1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {


    public static void main(String[] args) {

        String s = "alexander";
//        System.out.println(s.replaceAll("a", "bbb"));


        StringBuilder sb = new StringBuilder("vovochka");
//        sb.insert(sb.length(), "D");
        int len =  sb.capacity();


        System.out.println(sb.toString());
        System.out.println(len);


        List list = new ArrayList();
        List list1 = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(5);
        System.out.println(list);

        list1.add(1);
        list1.add(2);


        list.removeAll(list1);

        System.out.println(list);





    }


}



