package OCA.failed_exam1;

import java.util.ArrayList;
import java.util.List;

public class TestArrList {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();

       list.add("alex");
       list.add("bob");
       list.add("alex");
       list.removeAll(list);

        System.out.println(list);

    }

}
