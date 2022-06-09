package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ActivateCardPage {

    //locator
    SelenideElement
            activateCardPageTitle = $(".style__title___-Mr9U");

    //action
    public void creditPageCheck() {
        activateCardPageTitle.should(Condition.have(Condition.text("Активация карты")));
    }
}
