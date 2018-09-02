package _26_08.Assignment_3;

import java.util.Scanner;

public class CountSymb2 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter some String:");
        String str = s.nextLine();

        int result = countSymbols(str,'h');
        System.out.println(result);
    }

    public static int countSymbols(String str, char symbol) {
        int count = 0;

        for(int index = 0; index < str.length(); index++){
            char ch = str.charAt(index);
            if(ch == symbol)
                count++;
        }
        return count;
    }
}
