package TestSuite;

import _26_08.Assignment_2.SumInArray;
import _26_08.Assignment_2.SumMinMaxArray;
import org.junit.Assert;
import org.junit.Test;


public class SumMinMaxTest {
    @Test
    public void testSum() {
        int[] arr = {1, 3, 7, 45, 50, 5, 30};

        int result = SumInArray.findSumBetween(arr);
        Assert.assertEquals(result, 55);
    }
}
