package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Navigate To
 */

public class TestNavigateTo extends BaseTest {

    String testUrl;
    String pageTitle;
    String testPhrase1;

    @Test
    public void TestNavigateTo1() {

        testUrl = baseUrl + "/selenium";
        testPhrase1 = "Selenium Simplified";

        driver.navigate().to(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestNavigateTo2() {

        testUrl = baseUrl + "/selenium/search.php";
        testPhrase1 = "Selenium Simplified Search Engine";

        driver.navigate().to(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestNavigateTo3() {

        testUrl = baseUrl + "/selenium/basic_html_form.html";
        testPhrase1 = "HTML Form Elements";

        driver.navigate().to(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestNavigateTo4() {

        testUrl = baseUrl + "/selenium/basic_web_page.html";
        testPhrase1 = "Basic Web Page Title";

        driver.navigate().to(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestNavigateTo5() {

        testUrl = baseUrl + "/selenium/refresh.php";
        testPhrase1 = "Refreshed Page on ([0-9]{10})";

        driver.navigate().to(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
