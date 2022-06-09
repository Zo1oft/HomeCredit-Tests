package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class PromoPage {
    SelenideElement
            promoPagePageTitle = $(".product-promo-block__title");

    //action
    public void promoPageCheck() {
        switchTo().window(1);
        promoPagePageTitle.should(Condition.have(Condition.text("Дебетовая карта Польза")));
    }
}
