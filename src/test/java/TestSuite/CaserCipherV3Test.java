package TestSuite;

import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.junit.Test;

public class CaserCipherV3Test {

    @Test
    public void testCaserCipher(){
        String result = CaeserCipherV3.encode("hello", 3);
        Assert.assertEquals(result, "khoor");

    }
}
