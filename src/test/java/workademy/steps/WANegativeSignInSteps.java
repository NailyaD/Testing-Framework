package workademy.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import workademy.pages.WASignInPage;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static workademy.pages.WASignInPage.emailInput;
import static workademy.pages.WASignInPage.pwdInput;

/**
 * WANegativeSignInSteps
 * Class implements the step definitions for testing invalid sign in functionality.
 */

public class WANegativeSignInSteps implements En {

    public WANegativeSignInSteps() {

        WASignInPage waSignInPage = new WASignInPage();

        When("I enter invalid user credentials:", (DataTable table) -> {

            List<Map<String, String>> dataTable = table.asMaps();
            for (Map<String, String> dataRow : dataTable) {
                String email = dataTable.get(0).get("email");
                String password = dataTable.get(0).get("password");

                $(emailInput).setValue(email);
                $(pwdInput).setValue(password);
            }
        });

        And("I click on Sign In btn", waSignInPage::clickSignInBtn);

        Then("I see validation message", waSignInPage::displayValidationMsg);
    }
}
