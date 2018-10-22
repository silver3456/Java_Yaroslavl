package TestSuite;

import Assignment_1.MaxMinArray;
import _25_08.JUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorTest {
    @Before
    public void init(){

    }

    @Test
    public void testFactor() {
        int result = JUtils.findFactorial(3);
        Assert.assertTrue("result = " + result, result == 6);

    }

   /* @Test
    public void testSin() {
       double result = JUtils.findSin(90);
        Assert.assertTrue("result = " + result, result == 1);
    }*/

    @Test
    public void testMin() {
        Integer[] arr = {6, 4, 7, 98, 3, 6, -5, 8};

        int min = MaxMinArray.findMin(arr);
        Assert.assertTrue("Min=" + min, min == -5);
    }
}
