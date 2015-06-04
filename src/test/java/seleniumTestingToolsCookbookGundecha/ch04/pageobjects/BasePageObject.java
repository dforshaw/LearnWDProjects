package seleniumTestingToolsCookbookGundecha.ch04.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * This is the base page object
 */

public class BasePageObject {
    protected final WebDriver driver;
    String BaseUrl = "http://dl.dropbox.com/u/55228056/bmicalculator.html";
    String pageTitle;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        driver.get(BaseUrl);
        pageTitle = driver.getTitle();
    }
}
