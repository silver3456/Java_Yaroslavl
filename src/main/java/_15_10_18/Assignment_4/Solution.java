package _15_10_18.Assignment_4;

import org.omg.CORBA.OBJ_ADAPTER;

import java.io.IOException;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {

        SolutionUtils.init();


        //createPerson(key);


    }

    private static Object createPerson(List<?> list) {
        Object object = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (object.equals(list.get(i))) {
                new User();
            }

        }

        return object;
    }

}
//            for(
//    int i = 0; i<key.size();i++)
//
//    {
//        key.add(words[i]);
//
//        if (!str.equals(key.get(i)))
//            break;
//        list.add(str);


//            for(
//    int i = 0; i<list.size();i++)
//
//    {
//        Object object = list.get(i);
//
//        if (object.equals("looser")) {
//            new Looser();
//        } else if (object.equals("user")) {
//            new User();
//        } else if (object.equals("coder")) {
//            new Coder();
//        } else if (object.equals("proger")) {
//            new Proger();
//        } else
//            break;
//    }
//
//}
//    }
//            }
//
