package learnWdWithAlanRichardson.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


public class StaticHtmlPage extends BasePage {

    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");

    public StaticHtmlPage(WebDriver driver) {
        super(driver);
        visit("/selenium/basic_html_form.html");

        assertTrue("The login form is not present", driver.findElement(loginFormLocator).isDisplayed());
    }


    public void with(String username, String password) {
        type(username, usernameLocator);
        type(password,passwordLocator);
        submit(loginFormLocator);
    }

}
