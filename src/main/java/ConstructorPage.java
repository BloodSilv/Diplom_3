import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class ConstructorPage extends PersonalAccountPage {

    //Кнопка входа в аккаунт
    @FindBy(how = How.XPATH, using = "//button[text()='Войти в аккаунт']")
    SelenideElement buttonEnterInAccount;

    // Кнопка Оформить заказ, доступна после входа в аккаунт
    @FindBy(how = How.XPATH, using = "//button[text()='Оформить заказ']")
    SelenideElement buttonPlaceAnOrder;

    // Кнопка Булки
    @FindBy(how = How.XPATH, using = "//span[text()='Булки']")
    SelenideElement buttonBuns;

    // Кнопка «Соусы»
    @FindBy(how = How.XPATH, using = "//span[text()='Соусы']")
    SelenideElement buttonSauces;

    // Кнопка «Начинки»
    @FindBy(how = How.XPATH, using = "//span[text()='Начинки']")
    SelenideElement buttonFilling;

    @Step("Входим в личный кабинет")
    void clickEnterInAccount() {
        buttonEnterInAccount.shouldBe(Condition.visible).click();
    }

    boolean buttonPlaceAnOrderOnDisplay() {
        return buttonPlaceAnOrder.shouldBe(Condition.visible).exists();
    }

    // локатор активного таба
    @FindBy(how = How.CSS,using = ".tab_tab_type_current__2BEPc")
    public static SelenideElement currentActiveSection;

    // вытаскиваем текст активного таба (Начинки)
    public static boolean isFillingsTabActive() {
        return currentActiveSection.getText().contentEquals("Начинки");
    }

    // вытаскиваем текст активного таба (Соусы)
    public static boolean isSaucesTabActive() {
        return currentActiveSection.getText().contentEquals("Соусы");
    }

    // вытаскиваем текст активного таба (Булки.)
    public static boolean isBunsTabActive() {
        return currentActiveSection.getText().contentEquals("Булки");
    }

    @Step("Клик по кнопке Булки")
    void clickButtonBuns() {
        buttonBuns.shouldBe(Condition.visible).click();
    }

    @Step("Клик по вкладке «Соусы»")
    void clickButtonSauces() {
        buttonSauces.shouldBe(Condition.visible).click();
    }

    @Step("Клик по вкладке «Начинки»")
    void clickButtonFilling() {
        buttonFilling.shouldBe(Condition.visible).click();
    }
}
