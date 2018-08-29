import _26_08.Assignment_2.SumMinMaxArray;
import org.junit.Assert;
import org.junit.Test;


public class SumMinMaxTest {
    @Test
    public void testSum() {
        int[] arr = {2, 5, 6, 3};
        SumMinMaxArray.bubbleSort(arr);
        int result = SumMinMaxArray.findMinMaxSum(arr);
        Assert.assertEquals(result, 8);
    }
}
