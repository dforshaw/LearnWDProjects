package jenkins.pageobjects;

import org.openqa.selenium.By;

/**
 * This file contains locators used by the page objects
 */

public class Locators {

    public static void Locators() {

        // Used on DashboardPage
        By newJobLinkLocator = By.cssSelector("div.task:nth-child(1) > a:nth-child(2)");

        // Determine how to locate New Job Link on the NewJobpage
        By newJobNameLocator = By.id("name");
    }
}
