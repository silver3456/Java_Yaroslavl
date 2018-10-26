package _21_10_18.pages;

import _21_10_18.app.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver = ApplicationManager.driver;
    private static final String BASE_URL = "https://www.vk.com";

    public LoginPage(WebDriver driver) {
        setDriver(driver);

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("#index_email")).sendKeys(email);
        driver.findElement(By.id("index_pass")).sendKeys(password);
        driver.findElement(By.id("index_login_button")).click();
    }

    public void logout() {
        driver.findElement(By.xpath("//*[@id=\"top_profile_link\"]/div[2]")).click();
        driver.findElement(By.id("top_logout_link")).click();
        driver.quit();
        driver = null;
    }
}

