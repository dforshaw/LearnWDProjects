package selenium_testing_tools_cookbook_gundecha.ch04.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This is the page object class for the BMI Calculator page
 */

public class BmiCalculatorPage extends BasePageObject {

// Define By locators instead of WebElements to avoid StaleElementException
    By heightCMSLocator = By.id("heightCMS");
    By weightKgLocator = By.id("weightKg");
    By calculateButtonLocator = By.id("Calculate");
    By bmiLabelLocator = By.id("bmi");
    By bmiCategoryLabelLocator = By.id("bmi_category");

    public BmiCalculatorPage(WebDriver driver) {
        super(driver);

        if (!"BMI Calculator".equals(pageTitle)) {
            driver.get(BaseUrl);
        }
    }

    // Method: BMI Calculator page allows user to type their height into the Height field
    private BmiCalculatorPage typeHeight(String height) {

        typeFormValue(heightCMSLocator, height);
        return this;
    }

    // Method: BMI Calculator page allows user to type their weight into the Weight field
    private BmiCalculatorPage typeWeight(String weight) {

        typeFormValue(weightKgLocator, weight);
        return this;
    }

    // Method: used to generically enter a form value
    private BmiCalculatorPage typeFormValue(By locator, String value) {

        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
        return this;
    }

    // Method: BMI Calculator page allows user to calculate their BMI
    private BmiCalculatorPage submitCalculateButton() {

        driver.findElement(calculateButtonLocator).click();
        return this;
    }

    // Method: BMI Calculator page allows user to calculate their BMI as a service using their height & weight
    public BmiCalculatorPage calculateBmi(String height, String weight) {

        typeHeight(height);
        typeWeight(weight);
        return submitCalculateButton();
    }

    // Method: BMI Calculator page allows user to get the calculated value of their BMI as a service
    public String getCalculatedBmiFromPage() {
        return driver.findElement(bmiLabelLocator).getAttribute("value");
    }

    // Method: BMI Calculator page allows user to get the category of their BMI as a service
    public String getCalculatedBmiCategoryFromPage() {
        return driver.findElement(bmiCategoryLabelLocator).getAttribute("value");
    }
}
