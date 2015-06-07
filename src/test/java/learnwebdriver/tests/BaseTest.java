package learnwebdriver.tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements Config {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
