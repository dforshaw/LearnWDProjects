package seleniumTestingToolsCookbookGundecha.ch05.tests;

// page 156

import seleniumTestingToolsCookbookGundecha.ch05.pageobjects.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void testProductSearch() {

        HomePage homePage = new HomePage();

        homePage.get();

        SearchResults searchResult = homePage.Search().searchInStore("Sony");

        assertEquals(2, searchResult.getProducts().size());
        assertTrue(searchResult.getProducts().contains("Sony Ericsson W810i"));

        searchResult.close();

    }

}
