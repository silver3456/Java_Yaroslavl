package yammer;


import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static yammer_code_challenge.Swap2.Solution;


public class Swap2Test {

    @Test
    public void test1() {
        String s= "complicated";
        assertThat(Solution(s), CoreMatchers.is("cemplacitod"));

    }


    @Test
    public void test2() {
        String s="dima";
        assertThat(Solution(s), CoreMatchers.is("dami"));
    }

    @Test
    public void test3() {
        String s="comandir";
        assertThat(Solution(s), CoreMatchers.is("cimandor"));
    }

    @Test
    public void test4() {
        String s="com";
        assertThat(Solution(s), CoreMatchers.is("com"));
    }

    @Test
    public void test5() {
        String s="cmmn";
        assertThat(Solution(s), CoreMatchers.is("cmmn"));
    }

    @Test
    public void test6() {
        String s="very complicated";
        assertThat(Solution(s), CoreMatchers.is("vera cimplocyted"));
    }

}
