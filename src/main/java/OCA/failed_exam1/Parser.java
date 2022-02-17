package OCA.failed_exam1;

public class Parser {
    String input = "2013";
    public void parseMe(String str) {
        int output = 0;
        try {
            String input = str;
            output = Integer.parseInt(input);
        } catch (IllegalArgumentException iae) {
            System.out.println("Wrong argument!");
        }
        System.out.println(
                "input: " + input + ", output: " + output);
    }
    public static void main(String[] args) {
        Parser p = new Parser();
        p.parseMe("0123");
    }
}
