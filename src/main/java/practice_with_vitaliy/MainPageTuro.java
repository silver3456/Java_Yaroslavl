package practice_with_vitaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageTuro {
    private WebDriver driver;

    public MainPageTuro(WebDriver driver) {
        this.driver = driver;
    }

    private static final String WHERE_INPUT = "//*[@id='js-searchFormExpandedLocationInput']";
    private static final String PATTERN_CITY = "//*[contains(@class, 'placeName')]";

    public void enterPartOfCity(String cityPartName) {
        driver.findElement(By.xpath(WHERE_INPUT)).sendKeys(cityPartName);
        driver.findElement(By.xpath((String.format(PATTERN_CITY, cityPartName)))).click();

    }

}
