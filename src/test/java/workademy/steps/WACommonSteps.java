package workademy.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static workademy.pages.WAStagingPage.basicURL;

/**
 * WACommonSteps
 * Class implements the common step definitions.
 */

public class WACommonSteps implements En {

    public WACommonSteps() {

        Given("I am on the {} page", (String page) -> {
            String partialURL = null;
            if (page.equals("Sign In"))
                partialURL = "/signin";
            open(basicURL + partialURL);
        });
    }
}
