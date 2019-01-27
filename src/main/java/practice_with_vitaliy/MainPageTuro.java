package practice_with_vitaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;

public class MainPageTuro {
    private WebDriver driver;

    public MainPageTuro(WebDriver driver) {
        this.driver = driver;
    }

    private static final String WHERE_INPUT = "//*[@id='js-searchFormExpandedLocationInput']";
   // private static final String CITY = "//a[@class = 'mediaObject mediaObject--center']//div[text() = 'Berkeley, CA, USA']";
    private static final String PATTERN_CITY = "//div[text() = '%s']";


    public void enterPartOfCity(String cityPartName) {
        driver.findElement(By.xpath(WHERE_INPUT)).clear();
        driver.findElement(By.xpath(WHERE_INPUT)).sendKeys(cityPartName.toLowerCase());
    }

    public void chooseCity(String city) {
        driver.findElement(By.xpath(format(PATTERN_CITY, city))).click();
    }
}
