package CodingChallange;

public class Staticity {

    public static void main(String[] args) {

        String st = "ale xan der";
        StringBuilder sb = new StringBuilder("alexander");
        sb.replace(0,3, "bob");




        System.out.println("String " + st.replace(" ", ""));
        System.out.println("StringBuilder " + sb);

    }



}
