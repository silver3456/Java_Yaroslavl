package OCA.oca_answers;

//https://vceguide.com/which-two-statements-if-either-were-true-would-make-the-code-compile/

// answer is B and C (checked myself)

import java.util.ArrayList;

public class MotorCycle implements Cycle{

    public static void main(String[] args) {
        ArrayList<Cycle> myList =  new ArrayList();
        myList.add(new MotorCycle());
    }
}
