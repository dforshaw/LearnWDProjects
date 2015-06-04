package seleniumTestingToolsCookbookGundecha.ch05.pageobjects;

// page 156

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.*;

public class HomePage extends LoadableComponent<HomePage> {

    static String url = "http://demo.magentocommerce.com/";
    private static String title = "Madison Island";

    public HomePage() {
        PageFactory.initElements(Browser.driver(), this);
    }

    @Override
    protected void load() {
        Browser.open(url);
    }

    @Override
    protected void isLoaded() {
        assertTrue(Browser.driver().getTitle().equals(title));
    }

    public void close() {
        Browser.close();
    }

    public Search search() {
        Search search = new Search();
        return search;
    }
}
