package selenium_guidebook_with_davehaeffner.tests;


import org.junit.Before;
import org.junit.Test;
import selenium_guidebook_with_davehaeffner.pageobjects.DynamicLoading;

import static org.junit.Assert.assertTrue;

public class TestDynamicLoading extends Base {

    private DynamicLoading dynamicLoading;

    @Before
    public void setUp() {
        dynamicLoading = new DynamicLoading(driver);
    }

    @Test
    public void hiddenElementLoads() {
        dynamicLoading.loadExample("1");
        assertTrue("finish text didn't display after loading", dynamicLoading.finishTextPresent());
    }

    @Test
    public void elementAppears() {
        dynamicLoading.loadExample("2");
        assertTrue("finish text didn't render after loading", dynamicLoading.finishTextPresent());
    }
}