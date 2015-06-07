package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

public class TestInterrogationFindElementBy extends BaseTest {

    private String testUrl;

    @Test
    public void TestFindById() {
        testUrl = baseUrl + "/selenium/find_by_playground.php";

        driver.get(testUrl);

        WebElement foundItem =  driver.findElement(By.id("a1"));
        String observedValue = foundItem.getText();

        System.out.println("Item by ID: " + observedValue);
        assertThat(observedValue, is("This is a paragraph text"));
        assertEquals(foundItem.getText(),"This is a paragraph text");
    }

    @Test
    public void TestFindByName() {
        testUrl = baseUrl + "/selenium/find_by_playground.php";

        driver.get(testUrl);

        WebElement foundItem =  driver.findElement(By.name("pName1"));
        String observedValue = foundItem.getText();

        System.out.println("Item by Name: " + observedValue);
        assertThat(observedValue, is("This is a paragraph text"));
        assertEquals(foundItem.getText(),"This is a paragraph text");
    }

    @Test
    public void TestFindByClass() {
        testUrl = baseUrl + "/selenium/find_by_playground.php";

        driver.get(testUrl);

        WebElement foundItem =  driver.findElement(By.className("normal"));
        String observedValue = foundItem.getText();

        System.out.println("Item by className: " + observedValue);
        assertThat(observedValue, is("This is a paragraph text"));
        assertEquals(foundItem.getText(),"This is a paragraph text");
    }

    @Ignore
    @Test
    public void TestFindByLinkText() {
        testUrl = baseUrl + "/selenium/find_by_playground.php";

        driver.get(testUrl);

        WebElement foundItem =  driver.findElement(By.linkText("jump to para 3"));
        String observedValue = foundItem.getAttribute("href");
        foundItem.click();
        String observedValue2 = driver.getCurrentUrl();

        System.out.println("Item by linkText: " + observedValue);

        assertThat(observedValue, is(testUrl + "#" + observedValue));

        assertThat(observedValue, is("This is a paragraph text"));
        assertEquals(foundItem.getText(),"This is a paragraph text");



        // Name the element on the page and hook it to the locator
        WebElement weblink = driver.findElement(By.linkText("Basic Web Page"));

        // Identify characteristic to confirm
        String observedValuesample = weblink.getAttribute("href");

        assertThat(observedValuesample, is(baseUrl + "/basic_web_page.html"));

    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
