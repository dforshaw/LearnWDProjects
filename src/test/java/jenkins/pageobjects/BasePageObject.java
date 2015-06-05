package jenkins.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * This is the base page object
 */

public abstract class BasePageObject extends LoadableComponent {
    protected final WebDriver driver;
    String BaseUrl = "http://localhost:8080";
    String pageTitle;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        driver.get(BaseUrl);
        pageTitle = driver.getTitle();
    }
}
