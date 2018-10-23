package _21_10_18;

import _21_10_2018_VK.ApplicationManager;
import _21_10_2018_VK.LoginPage;
import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    //Verify ability to login
    @Test
    public void testLogin() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        String title_actual = driver.getTitle();
        Assert.assertEquals("Welcome! | VK", title_actual);

    }

    //Verify if user has undread messages
    @Test
    public void testUnreadMessages() {
        boolean verifymMessage = driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span/span[1]/span")).getText().isEmpty();
        org.testng.Assert.assertFalse(verifymMessage);
    }

    // Verify number of friends
    @Test
    public void verifyNumOfFriends() {
        WebElement friends = driver.findElement(By.cssSelector(" #l_fr > a > span > span.left_label.inl_bl"));
        friends.click();
        WebElement friendsNum = driver.findElement(By.cssSelector("#friends_tab_all > a > span"));
        int sizeFriends = Integer.parseInt(friendsNum.getText());
        Assert.assertEquals(257, sizeFriends);
    }
}

