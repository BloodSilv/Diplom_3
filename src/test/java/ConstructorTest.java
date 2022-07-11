import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructorTest extends DataForTests {
    /*
    Раздел «Конструктор»
         Проверь, что работают переходы к разделам:
           - «Булки»,
           - «Соусы»,
           - «Начинки».
         Проверяем, что требуемые блоки видны
    */
    @Before
    public void setUp_() {
        burgersSite.clickButtonPersonalAccount();
        burgersSite.clickConstructor();
    }

    @Test
    @Feature("Раздел «Конструктор» переходы к разделу «Булки»")
    @DisplayName("Раздел «Конструктор» переходы к разделу «Булки»")
    @Description("Test for https://stellarburgers.nomoreparties.site frontend")
    public void constructorBunsTest() {
        burgersSite.clickButtonFilling();
        burgersSite.clickButtonBuns();
        boolean blockVisible = ConstructorPage.bunSection.isDisplayed();
        assertTrue("Block is invisible",blockVisible);
    }

    @Test
    @Feature("Раздел «Конструктор» переходы к разделу «Соусы»")
    @DisplayName("Раздел «Конструктор» переходы к разделу «Соусы»")
    @Description("Test for https://stellarburgers.nomoreparties.site frontend")
    public void constructorSaucesTest() {
        burgersSite.clickButtonSauces();
        boolean blockVisible = ConstructorPage.sauceSection.isDisplayed();
        assertTrue("Block is invisible",blockVisible);
    }

    @Test
    @Feature("Раздел «Конструктор» переходы к разделу «Начинки»")
    @DisplayName("Раздел «Конструктор» переходы к разделу «Начинки»")
    @Description("Test for https://stellarburgers.nomoreparties.site frontend")
    public void constructorFillingTest() {
        burgersSite.clickButtonFilling();
        boolean blockVisible = ConstructorPage.fillingSection.isDisplayed();
        assertTrue("Block is invisible",blockVisible);
    }

}
