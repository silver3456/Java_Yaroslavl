package OCA.failed_exam1;

import OCA.failed_exam2.*;

public class BB extends AA {

    public void run() {}

    public static void main(String[] args) {

       AA ab = new BB();
       BB bb = new BB();
       AA aa = new AA();



       ab.age = 9;
       bb.age = 9;

    }
}
