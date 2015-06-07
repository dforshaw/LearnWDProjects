package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestInterrogationPage extends BaseTest {

    String testUrl;
    String pageUrl;
    String pageTitle;
    String testPhrase1, testPhrase2;
    String pageSource;

    @Test
    public void TestInterrogation1() {
        testUrl = baseUrl + "/selenium/basic_web_page.html";
        testPhrase1 = "Basic Web Page Title";
        testPhrase2 = "A paragraph of text";

        driver.get(testUrl);
        pageTitle = driver.getTitle();
        pageUrl = driver.getCurrentUrl();
        pageSource = driver.getPageSource();

        System.out.println("Current Page Title: " + pageTitle);
        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        System.out.println("Current URL: " + pageUrl);
        assertThat(pageUrl, is(testUrl));

        assertTrue(pageSource.contains(testPhrase2));
    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
