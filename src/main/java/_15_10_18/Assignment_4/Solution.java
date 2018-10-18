package _15_10_18.Assignment_4;

import java.io.IOException;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {

        SolutionUtils.init();
        createPerson(SolutionUtils.key);
    }

    private static void createPerson(List<Object> list) {
        //Object object = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            if (object.equals("looser")) {
                new Looser();
                // object = anotherObject;
            } else if (object.equals("user")) {
                new User();
                //  object = anotherObject;
            } else if (object.equals("coder")) {
                new Coder();
                //  object = anotherObject;
            } else if (object.equals("proger")) {
                new Proger();
                //  object = anotherObject;
            } else {
                break;
            }
        }
    }
}
