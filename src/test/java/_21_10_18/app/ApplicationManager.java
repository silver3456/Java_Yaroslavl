package _21_10_18.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {

    public static WebDriver driver;

    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--start-fullscreen");
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
    }

    public void stop() {
        driver.quit();
    }

}
