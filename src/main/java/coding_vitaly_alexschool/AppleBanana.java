package coding_vitaly_alexschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppleBanana {

    static List<String> occur(String input) {
        List<String> list = new ArrayList<String>();
        String[] array = input.split("\\s");
        for (String s : array) {
            list.add(s);
        }
        List<String> list2 = new ArrayList<String>();
        for (String s : list) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                Matcher m = Pattern.compile(list.get(i)).matcher(s);
                while (((Matcher) m).find())
                    count++;
            }
            list2.add(count + " : " + s);
        }
        Set<String> set = new TreeSet<String>(list2);
        set = ((TreeSet<String>) set).descendingSet();

        List<String> list3 = new ArrayList<String>();
        for (String s : set) {
            list3.add(s);
        }
        return list3;
    }

    static void myRes(List<String> list, int count) {
        String regex = "^(\\d+)\\s:\\s(\\w+)$";
        for (int i = 0; i < count; i++) {
            Matcher m = Pattern.compile(regex).matcher(list.get(i));
            m.find();
            System.out.println(m.group(2));
        }
    }

    public static void main(String[] args) {
        String test = "apple banana orange apple banana apple orange apple banana";
        int num = 2;
        new AppleBanana().myRes(occur(test), num);
    }

}
