package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            debitCardButton = $$(".main-slider__tab_title___1Xzf7").findBy(Condition.text("Дебетовая карта")),
            debitCardPageButton = $$(".main-slider__button___26pd_").findBy(Condition.text("Оформить  онлайн")),
            acivateCardButton = $$(".bank-products-widget-component__create_card___1okYO").
                    findBy(Condition.text("Активировать карту и установить PIN"));

    //actions
    public MainPage openPage() {
        open("https://www.homecredit.ru/");
        return this;
    }

    public void debitSliderActualizer() {
        debitCardButton.click();
    }

    public void debitCardPageTransfer() {
        debitCardPageButton.click();
    }

    public void activateCardPageTransfer() {
        acivateCardButton.click();
    }
}
