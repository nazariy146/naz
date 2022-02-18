package tests.mobile.mobileSteps;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class MobileSteps {

    public static AndroidDriver mobileDriver;

    public void mobileDriver(SelenideElement resourceId) {
        mobileDriver = (AndroidDriver) resourceId.getWrappedDriver();
    }

    public void verifyData(SelenideElement resourceId, String data) {
        resourceId.shouldBe(visible, Duration.ofSeconds(25));
        resourceId.shouldHave(text(data));
    }

    public void inputData(SelenideElement resourceId, String data) {
        resourceId.shouldBe(visible, Duration.ofSeconds(25));
        resourceId.click();
        resourceId.val(data);
        mobileDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void clickButton(SelenideElement resourceId) {
        resourceId.shouldBe(visible, Duration.ofSeconds(25));
        resourceId.click();
    }

//    MNV development
//    $(By.id("android:id/text1")).find(exactText(source)).getId();
//    $$(By.id("android:id/text1")).find(exactText(source)).getClass();
//    $(By.id("android:id/text1")).shouldBe(visible, Duration.ofSeconds(25));
//    $(By.id("android:id/text1")).shouldBe(enabled).click();
//    Actions.hideKeyboard();

//Скролл формы
/*    public void scrollElement(SelenideElement element) {
        AndroidDriver driver = (AndroidDriver) element.getWrappedDriver();

        TouchAction touchAction= new TouchAction(driver);

        touchAction.press(point(element.getLocation().x, element.getLocation().y))
                .waitAction(WaitOptions.waitOptions(ofMillis(300)))
                .moveTo(point(element.getLocation().x, element.getLocation().y-854))
                .release().perform();
    }*/
//Скролл формы

/*    public void checkSerialNumberInputText(String text) {
        String serialNumberText = getSerialNumberInput().getText();//получаем текст
        Assert.assertEquals(serialNumberText, text, "SerialNumberInputText is not empty");//сравниваем текст если не сходится получаем сообщение
    }*/

/*    public void checkSerialNumberQtyFactInEveryRow(String qtyFact, int qtyOfQtyFactsRows) {
        for(int i = 0; i < qtyOfQtyFactsRows; i++) {
            String text = $(By.xpath ("//android.widget.EditText[3][@bounds='[995,"+(700+i*95)+"][1440,"+(791+i*95)+"]']")).getText();
            Assert.assertEquals(qtyFact, text);
        }
    }*/
/*public void checkAndSelectAvailableRouteSheet(String description, String driver) {
    $(By.id("com.abmcloud:id/buttonRouteSheetChoice")).click();
    $(By.id("com.abmcloud:id/select_dialog_listview")).shouldBe(visible);
    $(By.id("com.abmcloud:id/textViewDoc_title")).shouldHave(text(description));
    $(By.id("com.abmcloud:id/textViewDriver")).shouldHave(text(driver)).click();
}*/
//    MNV development
}