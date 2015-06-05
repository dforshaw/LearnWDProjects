package jenkins.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This is the page object class for the Jenkins Dashboard page
 */

// Constructor: uses super class to instantiate driver
// Loads Dashboard page if not on the correct page
public class DashboardPage extends BasePageObject {

    // Determine how to locate New Job Link on the page
    By newJobLinkLocator = By.cssSelector("div.task:nth-child(1) > a:nth-child(2)");

    public DashboardPage(WebDriver driver) {
        super(driver);

        if (!"Dashboard [Jenkins]".equals(pageTitle)) {
            driver.get(BaseUrl + "/");
        }
    }

    // Method: Sign In page allows user to submit the Sign In form
    public NewJobPage clickNewJobLink() {

        driver.findElement(newJobLinkLocator).click();
        return new NewJobPage(driver);
    }

    @Override
    protected void load() {
        driver.get(BaseUrl + "/");
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard [Jenkins]"));
    }
}
