
//switch any two integer variables without using a temporal storage

class FlipVariables {
    public static void main(String[] args) {
        int a = 123;
        int b = 321;
        System.out.println("a=" + a + ", b=" + b);            // a=123, b=321
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + ", b=" + b);            // a=321, b=123 
    }
}
