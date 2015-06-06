package jenkins.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This is the page object class for the Jenkins New Job page
 */

public class NewJobPage extends BasePageObject {

    // Determine how to locate New Job Link on the page
    By newJobNameLocator = By.id("name");

    public NewJobPage(WebDriver driver) {
        super(driver);
        pageTitle = driver.getTitle();
        if (!"New Job [Jenkins]".equals(pageTitle)) {
            visit("/view/All/newJob");
        }
    }

    public NewJobPage typeNewJobName(String name) {

        driver.findElement(newJobNameLocator).clear();
        driver.findElement(newJobNameLocator).sendKeys(name);
        return this;
    }

    @Override
    protected void load() {
        visit("/view/All/newJob");
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(driver.getCurrentUrl().contains("New Job [Jenkins]"));
    }
}
