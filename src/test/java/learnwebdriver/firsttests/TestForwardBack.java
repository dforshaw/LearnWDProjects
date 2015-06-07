package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Forward & Back
 */

public class TestForwardBack extends BaseTest {

    String testUrl;
    String pageTitle;
    String testPhrase1, testPhrase2;

    @Test
    public void TestForwardBack1() {

        testUrl = baseUrl + "/selenium";
        testPhrase1 = "Selenium Test Pages";
        testPhrase2 = "Selenium Simplified";


        driver.navigate().to(baseUrl);
        driver.navigate().to(testUrl);

        driver.navigate().back();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));


        driver.navigate().forward();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase2));
        assertTrue(pageTitle.startsWith(testPhrase2));
        assertTrue(pageTitle.contains(testPhrase2));
    }

    @Test
    public void TestForwardBack2() {

        testUrl = baseUrl + "/selenium/search.php";
        testPhrase1 = "Selenium Test Pages";
        testPhrase2 = "Selenium Simplified Search Engine";


        driver.navigate().to(baseUrl);
        driver.navigate().to(testUrl);

        driver.navigate().back();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));


        driver.navigate().forward();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase2));
        assertTrue(pageTitle.startsWith(testPhrase2));
        assertTrue(pageTitle.contains(testPhrase2));
    }

    @Test
    public void TestForwardBack3() {

        testUrl = baseUrl + "/selenium/basic_html_form.html";
        testPhrase1 = "Selenium Test Pages";
        testPhrase2 = "HTML Form Elements";


        driver.navigate().to(baseUrl);
        driver.navigate().to(testUrl);

        driver.navigate().back();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));


        driver.navigate().forward();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase2));
        assertTrue(pageTitle.startsWith(testPhrase2));
        assertTrue(pageTitle.contains(testPhrase2));
    }

    @Test
    public void TestForwardBack4() {

        testUrl = baseUrl + "/selenium/basic_web_page.html";
        testPhrase1 = "Selenium Test Pages";
        testPhrase2 = "Basic Web Page Title";


        driver.navigate().to(baseUrl);
        driver.navigate().to(testUrl);

        driver.navigate().back();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));


        driver.navigate().forward();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase2));
        assertTrue(pageTitle.startsWith(testPhrase2));
        assertTrue(pageTitle.contains(testPhrase2));
    }

    @Test
    public void TestForwardBack5() {

        testUrl = baseUrl + "/selenium/refresh.php";
        testPhrase1 = "Selenium Test Pages";
        testPhrase2 = "Refreshed Page on ([0-9]{10})";


        driver.navigate().to(baseUrl);
        driver.navigate().to(testUrl);

        driver.navigate().back();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));


        driver.navigate().forward();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase2));
        assertTrue(pageTitle.startsWith(testPhrase2));
        assertTrue(pageTitle.contains(testPhrase2));
    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
