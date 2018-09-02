import _26_08.Assignment_1.CaesarCipher;
import _26_08.Assignment_1.CaesarCipherSimple;
import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {
    @Test
    public void test(){
        char ch = 'A';
        int code = (int)ch + 3;
        System.out.println((char)code);
    }
    @Test
    public void testEncodeNotSimple(){
        String result = CaesarCipher.encode("hello", 3);
        Assert.assertEquals(result, "khoor");
    }

  /*  @Test
    public void testEncode() { //test method encryption
        String result = CaesarCipherSimple.encode("hello", 3);
        Assert.assertEquals(result, "khoor");
    }

    @Test
    public void testDecode() {//test method decryption
        String result = CaesarCipherSimple.decode("khoor", 3);
        Assert.assertEquals(result, "hello");
    }*/
}
