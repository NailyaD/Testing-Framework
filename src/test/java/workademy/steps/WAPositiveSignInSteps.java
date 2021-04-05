package workademy.steps;

import io.cucumber.java8.En;
import workademy.pages.WASignInPage;

/**
 * WAPositiveSignInSteps
 * Class implements the step definitions for testing valid sign in functionality.
 */

public class WAPositiveSignInSteps implements En {

    public WAPositiveSignInSteps() {

        WASignInPage waSignInPage = new WASignInPage();

        When("I enter valid user credentials", waSignInPage::validSignInInput);

        And("I click on Sign In button", waSignInPage::clickSignInBtn);
    }
}
