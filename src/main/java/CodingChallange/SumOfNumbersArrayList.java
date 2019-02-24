package CodingChallange;

import java.util.ArrayList;

public class SumOfNumbersArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int sum = 0;

        for(int i =0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}
