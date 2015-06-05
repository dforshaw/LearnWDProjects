package jenkins.tests;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This class tests the Jenkins New Job page
 */

public class NewJobPageTest extends BaseTestSetup {

    // FIX THIS -- not getting to New Job page
    @Test
    public void LoadNewJobPage() {
        NewJobPage newJobPage = new NewJobPage(driver);

        // Wait until new page loads?

        String page = newJobPage.pageTitle;

        assertThat(page, is("New Job [Jenkins]"));
    }

    @Test
    public void verifyEntryOfNewJobName() {

        NewJobPage newJobPage = new NewJobPage(driver);
        newJobPage.typeNewJobName("df test job");


    }
}
