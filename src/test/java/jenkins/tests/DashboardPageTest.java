package jenkins.tests;

import jenkins.pageobjects.DashboardPage;
import jenkins.pageobjects.NewJobPage;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This class tests the Jenkins Dashboard page
 */

public class DashboardPageTest extends BaseTestSetup {

    @Test
    public void LoadDashboardPage() {
        DashboardPage dashboardPage = new DashboardPage(driver);

        String page = dashboardPage.pageTitle;

        assertThat(page, is("Dashboard [Jenkins]"));
    }

    // Add test for New Job link
    @Ignore
    @Test
    public void clickNewJobLinkLoadsCorrectPage() {
        DashboardPage dashboardPage = new DashboardPage(driver);

        NewJobPage newJobPage = dashboardPage.clickNewJobLink();

        // Wait until new page loads?

        String page = newJobPage.pageTitle;

        assertThat(page, is("New Job [Jenkins]"));
    }
}