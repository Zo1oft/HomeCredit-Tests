package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class HomeCreditTests extends TestBase {

    @Test
    @Description("Проверка работы страницы 'Дебетовой карты'")
    @DisplayName("Дебетовая карта")
    void debitCardPageTest() {
        step("Открываем сайт HomeCredit", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку на слайдере 'Дебетовая карта'", () -> {
            mainPage.debitSliderActualizer();
        });


        step("Нажимаем на кнопку на слайдере 'Оформить онлайн'", () -> {
            mainPage.debitCardPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            debitPage.promoPageCheck();
        });
    }

    @Test
    @Description("Проверка работы страницы активации карты")
    @DisplayName("Активация карты")
    void creditPageTest() {
        step("Открываем сайт HomeCredit", () -> {
            mainPage.openPage();
        });

        step("Нажимаем 'Активировать карту'", () -> {
            mainPage.activateCardPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            activateCardPage.creditPageCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт HomeCredit", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Банк Хоум Кредит";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт HomeCredit", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}