package seleniumGuidebookWithDaveHaeffner.tests;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base implements Config {

    protected WebDriver driver;

    @Rule
    public ExternalResource resource = new ExternalResource() {

        @Override
        protected void before() throws Throwable {

            if (browser.equals("firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver");
                driver = new ChromeDriver();

            } else if (browser.equals("safari")) {
                driver = new SafariDriver();
            }
        }

        @Override
        protected void after() {
            driver.quit();
        }
    };
}
