/*Опиши алгоритм, по которому происходит следующие преобразования:

       dima -> dami
       comandir -> cimandor
        very complicated -> vera cimplocyted
        com -> com

*/

package yammer_code_challenge;


import java.util.ArrayList;

public class Swap2 {
    public static String swap(String s, int index1, int index2) {
        int a = index1;
        int b = index2;
        StringBuilder sbldr = new StringBuilder(s);
        char tmp = sbldr.charAt(a);
        sbldr.setCharAt(a, sbldr.charAt(b));
        sbldr.setCharAt(b, tmp);
        return sbldr.toString();
    }

    public static ArrayList index(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "eyuioaj";
        ArrayList index = new ArrayList();
        for (int i = 0; i < sb.length(); i++) {
            Character temp = sb.charAt(i);
            if (vowels.contains(temp.toString())) {
                index.add(i);
            }
        }
        return (index);
    }

    public static String Solution(String s) {

        StringBuilder sb = new StringBuilder(s);
        ArrayList indx = index(s);
        String swp = "";

        if (indx.size() <= 1) {
            swp = s;
//	System.out.println(swp);
            return swp;
        }

        for (int i = 0; i < indx.size() / 2; i++) {
            int index1 = (int) indx.get(i);
            int index2 = (int) indx.get(indx.size() - i - 1);
            swp = swap(s, index1, index2);
            s = swp;
        }
//	System.out.println(swp);
        return swp;
    }
}
