package workademy.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import workademy.utils.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WAUserAccountPage {

    /* Properties */
    private static String validUserName = PropertiesLoader.loadProperty("valid.username");

    /* Elements */
    private static By title = By.cssSelector("div.v-application.workademy-app.v-application--is-ltr.theme--light div.v-application--wrap header.px-1.px-sm-12.v-sheet.theme--light.v-toolbar.v-toolbar--flat.v-app-bar.v-app-bar--clipped.v-app-bar--fixed:nth-child(2) div.v-toolbar__content div.v-toolbar__items:nth-child(8) button.v-btn.v-btn--text.theme--light.v-size--default span.v-btn__content > span:nth-child(1)");

    /* Methods */
    //public SelenideElement accountTitle() { return $(title); }

    public void assertUserName(){
        $(title).shouldHave(text(validUserName));
    }
}
