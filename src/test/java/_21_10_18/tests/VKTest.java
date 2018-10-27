package _21_10_18.tests;

import _21_10_18.app.ApplicationManager;
import _21_10_18.pages.LoginPage;
import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VKTest extends TestBase {

    private static WebDriver driver;
    private LoginPage lp;


    @BeforeTest
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = ApplicationManager.driver;
        lp = new LoginPage(driver);
    }


    //Verify ability to login(valid user name & password)
    @Test(groups = {"Positive1"})
    public void testLoginOne() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        String title_actual = driver.getTitle();
        Assert.assertEquals("Welcome! | VK", title_actual);

    }

    //Verify error message is displayed (invalid user name or password)
    @BeforeGroups(groups = {"Positive1"})
    public void testLoginTwo() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        WebElement msgError = driver.findElement(By.cssSelector("#login_message > div"));
        org.testng.Assert.assertTrue(msgError.isDisplayed());
    }

    //Verify phone number field is displayed (invalid user name or password)
    @BeforeGroups(groups = {"Positive1", "Positive2", "Positive3"})
    public void testLoginThree() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        WebElement phoneInput = driver.findElement(By.id("fast_restore_phone"));
        org.testng.Assert.assertTrue(phoneInput.isDisplayed());
    }


    // Verify if user has unread messages
    @Test(groups = {"Positive1","Positive2"})
    public void testUnreadMessages() {
        boolean verifymMessage = driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span/span[1]/span")).getText().isEmpty();
        org.testng.Assert.assertFalse(verifymMessage);
    }

    // Verify number of friends
    @Test(groups = {"Positive1", "Positive2", "Positive3"})
    public void verifyNumOfFriends() {
        WebElement friends = driver.findElement(By.cssSelector(" #l_fr > a > span > span.left_label.inl_bl"));
        friends.click();
        WebElement friendsNum = driver.findElement(By.cssSelector("#friends_tab_all > a > span"));
        int sizeFriends = Integer.parseInt(friendsNum.getText());
        Assert.assertEquals(257, sizeFriends);
    }

    //Test logout option
    @Test(enabled = false)
    //@Test(groups = {"Positive1", "Positive2", "Positive3", "Positive4"})
    public void testLogOut() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        lp.logout();
    }
}

