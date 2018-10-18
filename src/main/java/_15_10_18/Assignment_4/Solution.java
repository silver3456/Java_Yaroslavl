package _15_10_18.Assignment_4;

import java.io.IOException;

import static _15_10_18.Assignment_4.SolutionUtils.createPerson;

public class Solution {

    public static void main(String[] args) throws IOException {

        SolutionUtils.init();
        SolutionUtils.doWork(createPerson(SolutionUtils.key));
    }
}
