package CodingChallange;


public class LongestStringSimple {
    public static void main(String[] args) {

        String[] arr = {"Alex", "Ben", "David", "Okskjkja", "Sam"};

        String longest = null;
        int maxLengeth = 0;

        for(String s : arr){
            if(s.length() > maxLengeth){
                maxLengeth = s.length();
                longest = s;
            }
        }
        System.out.println(longest);

    }
}
