package seleniumGuidebookWithDaveHaeffner.tests;

import org.junit.Before;
import org.junit.Test;
import seleniumGuidebookWithDaveHaeffner.pageobjects.Login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLogin extends Base {

    private Login login;

    @Before
    public void setUp() {
        login = new Login(driver);
    }

    @Test
    public void succeeded() {
        login.with("tomsmith","SuperSecretPassword!");

        assertTrue("success message not present", login.successMessagePresent());
    }

    @Test
    public void failed() {
        login.with("tomsmith","badpassword!");

        assertTrue("failure message wasn't present after providing bogus credentials", login.failureMessagePresent());
        assertFalse("failure message was present after providing bogus credentials", login.successMessagePresent());
    }
}
