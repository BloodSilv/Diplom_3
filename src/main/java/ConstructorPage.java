import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

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

    // Признак открытого раздела Булки по булке Флюоресцентная булка R2-D3
    @FindBy(how = How.XPATH, using = "//a[@href='/ingredient/61c0c5a71d1f82001bdaaa6d']")
    SelenideElement buttonBunFluorescent;

    // Кнопка закрыть карточку по булке Флюоресцентная булка R2-D3
    @FindBy(how = How.XPATH, using = "//section[@class='Modal_modal_opened__3ISw4 Modal_modal__P3_V5']//button[@type='button']//*[name()='svg']")
    SelenideElement buttonCloseCard;

    // Кнопка «Соусы»
    @FindBy(how = How.XPATH, using = "//span[text()='Соусы']")
    SelenideElement buttonSauces;

    // Признак открытого раздела Соусы по соусу Соус Spicy-X
    @FindBy(how = How.XPATH, using = "//a[@href='/ingredient/61c0c5a71d1f82001bdaaa72']")
    SelenideElement buttonSauceSpicyX;

    // Кнопка «Начинки»
    @FindBy(how = How.XPATH, using = "//span[text()='Начинки']")
    SelenideElement buttonFilling;

    // Признак открытого раздела Начинки по Мясо бессмертных моллюсков Protostomia
    @FindBy(how = How.XPATH, using = "//a[@href='/ingredient/61c0c5a71d1f82001bdaaa6f']")
    SelenideElement buttonProtostomia;

    //локатор раздела «Булки»
    @FindBy(how = How.XPATH, using = ".//h2[text()='Булки']")
    static SelenideElement bunSection;

    //локатор раздела «Соусы»
    @FindBy(how = How.XPATH, using = ".//h2[text()='Соусы']")
    static SelenideElement sauceSection;

    //локатор раздела «Начинки»
    @FindBy(how = How.XPATH, using = ".//h2[text()='Начинки']")
    static SelenideElement fillingSection;

    @Step("Входим в личный кабинет")
    void clickEnterInAccount() {
        buttonEnterInAccount.shouldBe(Condition.visible).click();
    }

    boolean buttonPlaceAnOrderOnDisplay() {
        return buttonPlaceAnOrder.shouldBe(Condition.visible).exists();
    }

    @Step("Клик по кнопке Булки")
    void clickButtonBuns() {
        buttonBuns.shouldBe(Condition.visible).click();
    }

    @Step("Клик по разделу «Булки»")
    public static void clickBunButton() {
        sauceSection.shouldBe(enabled).click();
    }

    @Step("Клик по разделу «Соусы»")
    public static void clickSauceButton() {
        sauceSection.click();
    }

    @Step("Клик по разделу «Начинки»")
    public static void clickFillingButton() {
        fillingSection.shouldBe(enabled).click();
    }

    @Step("Клик по булке Флюоресцентная булка R2-D3")
    void clickButtonBunFluorescent() {
        buttonBunFluorescent.shouldBe(Condition.visible).click();
    }

    @Step("Клик по крестику, закрыть карточку товара")
    void clickButtonCloseCard() {
        buttonCloseCard.shouldBe(Condition.visible).click();
    }

    boolean searchButtonBunFluorescent() {
        return buttonBunFluorescent.shouldBe(Condition.visible).exists();
    }

    @Step("Клик по вкладке «Соусы»")
    void clickButtonSauces() {
        buttonSauces.shouldBe(Condition.visible).click();
    }

    boolean searchButtonSauceSpicyX() {
        return buttonSauceSpicyX.shouldBe(Condition.visible).exists();
    }

    @Step("Клик по соусу Соус Spicy-X")
    void clickButtonSauceSpicyX() {
        buttonSauceSpicyX.shouldBe(Condition.visible).click();
    }

    @Step("Клик по вкладке «Начинки»")
    void clickButtonFilling() {
        buttonFilling.shouldBe(Condition.visible).click();
    }

    @Step("Клик по начинке Мясо бессмертных моллюсков Protostomia ")
    void clickButtonProtostomia() {
        buttonProtostomia.shouldBe(Condition.visible).click();
    }
}
