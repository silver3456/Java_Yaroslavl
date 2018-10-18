package _15_10_18.Assignment_4;

import java.io.IOException;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {

        SolutionUtils.init();
        doWork(createPerson(SolutionUtils.key));
    }

    private static Object createPerson(List<Object> list) {
        if (list.isEmpty())
            return null;

        Object object = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Object anotherObject = list.get(i);
            if (object.equals("looser")) {
                new Looser();
                object = anotherObject;
            } else if (object.equals("user")) {
                new User();
                object = anotherObject;
                break;
            } else if (object.equals("coder")) {
                new Coder();
                object = anotherObject;
                break;
            } else if (object.equals("proger")) {
                new Proger();
                object = anotherObject;
                break;
            } else {
                break;
            }
        }
        return object;
    }

    private static void doWork(Object o) {
        if (o.equals("user")) SolutionUtils.live();
        else if (o.equals("coder")) SolutionUtils.coding();
        else if (o.equals("looser")) SolutionUtils.doNothing();
        else if (o.equals("proger")) SolutionUtils.enjoy();
    }
}
