package seleniumTestingToolsCookbookGundecha.ch05.tests;

// Chapter 5 : Implementing nested Page Object instances

import seleniumTestingToolsCookbookGundecha.ch05.pageobjects.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void testProductSearch() {

        HomePage homePage = new HomePage();

        homePage.get();

        SearchResults searchResult = homePage.search().searchInStore("Chelsea");

        assertEquals(2, searchResult.getProducts().size());
        assertTrue(searchResult.getProducts().contains("CHELSEA TEE"));

        searchResult.close();

    }

}
