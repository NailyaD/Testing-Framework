package workademy.steps;

import io.cucumber.java8.En;
import workademy.pages.WAUserAccountPage;
import static com.codeborne.selenide.Selenide.page;

/**
 * WAUserAccountPageSteps
 * Class implements the step definitions for testing user name displaying in the user area.
 */

public class WAUserAccountPageSteps implements En {

    WAUserAccountPage waUserAccountPage;

    public WAUserAccountPageSteps(){

        Then("I see the user area", () -> {
            waUserAccountPage = page(WAUserAccountPage.class);
            waUserAccountPage.assertUserName();
        });
    }
}
