package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: TestGet
 */

public class TestGet extends BaseTest {

    String testUrl;
    String pageTitle;
    String testPhrase1;

    @Test
    public void TestGet() {
        testUrl = baseUrl;
        testPhrase1 = "Selenium Test Pages";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        System.out.println("Current Page Title: " + pageTitle);
        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
