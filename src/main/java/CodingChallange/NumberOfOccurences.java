package CodingChallange;

//Write a program which accepts a list of numbers and the number to be searched and find out
//the number of occurrences

public class NumberOfOccurences {
    public static void main(String[] args) {
        int inputNum = 474974494;
        int numToSearch = 9;

        String word = Integer.toString(inputNum);
        String[] arrayNums = word.split("");
        


        String numCompare = Integer.toString(numToSearch);

        int count = 0;

        for (String num : arrayNums) {
            if (numCompare.equals(num)) {
                count++;
            }
        }
        System.out.println("Number of occurences is: " + count);
    }

}
