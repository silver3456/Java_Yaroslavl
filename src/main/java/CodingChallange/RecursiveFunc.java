package CodingChallange;

public class RecursiveFunc {
    public static void main(String[] args) {
        int res = recursiveCall(5);
        System.out.println(res + " ");
    }

    public static int recursiveCall(int num){
        //Factorial of num
        if(num == 0)
            return 1;
        int newNum = num - 1;
        int res = recursiveCall(newNum);
        return num*res;
    }
}
