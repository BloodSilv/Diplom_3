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
        boolean isBunsTabActive = ConstructorPage.isBunsTabActive();
        assertTrue("Нет переключения на раздел Булки при клике на таб Булки", isBunsTabActive);
    }

    @Test
    @Feature("Раздел «Конструктор» переходы к разделу «Соусы»")
    @DisplayName("Раздел «Конструктор» переходы к разделу «Соусы»")
    @Description("Test for https://stellarburgers.nomoreparties.site frontend")
    public void constructorSaucesTest() {
        burgersSite.clickButtonSauces();
        boolean isSaucesTabActive = ConstructorPage.isSaucesTabActive();
        assertTrue("Нет переключения на раздел Булки при клике на таб Булки", isSaucesTabActive);
    }

    @Test
    @Feature("Раздел «Конструктор» переходы к разделу «Начинки»")
    @DisplayName("Раздел «Конструктор» переходы к разделу «Начинки»")
    @Description("Test for https://stellarburgers.nomoreparties.site frontend")
    public void constructorFillingTest() {
        burgersSite.clickButtonFilling();
        boolean isFillingsTabActive = ConstructorPage.isFillingsTabActive();
        assertTrue("Нет переключения на раздел Начинки при клике на таб Начинки", isFillingsTabActive);
    }

}
