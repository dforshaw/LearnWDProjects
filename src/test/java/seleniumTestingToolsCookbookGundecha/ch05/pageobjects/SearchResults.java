package seleniumTestingToolsCookbookGundecha.ch05.pageobjects;

// page 156

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.*;

public class SearchResults extends LoadableComponent<SearchResults> {

    private String query;

    public SearchResults(String query) {
        PageFactory.initElements(Browser.driver(), this);
    }

    @Override
    protected void load() {
        // TO DO -- Auto-generated method stub

    }

    @Override
    protected void isLoaded() {
        assertTrue(Browser.driver().getTitle().equals("Search results for: '" + this.query + "' - Magento1 Commerce Demo Store"));

    }
}
