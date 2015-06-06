package jenkins.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import jenkins.tests.Config;
/**
 * This is the base page object
 */

public abstract class BasePageObject extends LoadableComponent implements Config  {
    protected final WebDriver driver;
    public String pageTitle;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        pageTitle = driver.getTitle();
    }

    public void visit(String url) {
        if (url.contains("http")) {
            driver.get(url);
        } else {
            driver.get(baseUrl + url);
        }
    }

}
