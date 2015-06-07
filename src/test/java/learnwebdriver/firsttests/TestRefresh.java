package learnwebdriver.firsttests;

import learnwebdriver.tests.BaseTest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestRefresh extends BaseTest {

    String testUrl;
    String pageTitle;
    String testPhrase1;

    @Test
    public void TestRefresh1() {

        testUrl = baseUrl + "/selenium";
        testPhrase1 = "Selenium Simplified";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        driver.navigate().refresh();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestRefresh2() {

        testUrl = baseUrl + "/selenium/search.php";
        testPhrase1 = "Selenium Simplified Search Engine";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        driver.navigate().refresh();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestRefresh3() {

        testUrl = baseUrl + "/selenium/basic_html_form.html";
        testPhrase1 = "HTML Form Elements";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        driver.navigate().refresh();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestRefresh4() {

        testUrl = baseUrl + "/selenium/basic_web_page.html";
        testPhrase1 = "Basic Web Page Title";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        driver.navigate().refresh();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }

    @Test
    public void TestRefresh5() {

        testUrl = baseUrl + "/selenium/refresh.php";
        testPhrase1 = "Refreshed Page on ([0-9]{10})";

        driver.get(testUrl);
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));

        driver.navigate().refresh();
        pageTitle = driver.getTitle();

        assertThat(pageTitle, is(testPhrase1));
        assertTrue(pageTitle.startsWith(testPhrase1));
        assertTrue(pageTitle.contains(testPhrase1));
    }
}
