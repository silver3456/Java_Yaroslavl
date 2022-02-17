package OCA.oca_answers;

import edu.emory.mathcs.backport.java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ListModif {
    public static void main(String[] args) {
        String[] arr = {"Hi", " How"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s)-> {return s.length() <=2;})) {
            System.out.println( "removed");
        }

    }
}
