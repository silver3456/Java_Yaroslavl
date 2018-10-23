package _21_10_18;

import _21_10_2018_VK.ApplicationManager;
import _21_10_2018_VK.LoginPage;
import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VKTest extends TestBase {

    private static WebDriver driver;
    private LoginPage lp;


    @BeforeTest
    public void init() {
        driver = ApplicationManager.driver;
        lp = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        String title_actual = driver.getTitle();
        Assert.assertEquals("Welcome! | VK", title_actual);
    }

    @Test
    public void testUnreadMessages() {
        boolean verifymMessage = driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span/span[1]/span")).getText().isEmpty();
        org.testng.Assert.assertFalse(verifymMessage);
    }

    @Test
    public void verifyNumOfFriends() {

    }
}

