package tests.mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoadingCardPage {
    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#routeSheet":
                return $(By.id("com.abmcloud:id/textBoxRouteSheet"));
            case "#gate":
                return $(By.id("com.abmcloud:id/textBoxAdditionalBarcode"));
            case "#commit":
                return $(By.id("com.abmcloud:id/buttonCommitLoading"));
            case "#cargo":
                return $(By.id("com.abmcloud:id/editTextCargo"));
        }
        return null;
    }

    public void inputData(String field, String data) {
        SelenideElement resourceId = getResourceId(field);
        mobileSteps.inputData(resourceId, data);
    }

    public void verifyData(String field, String data) {
        SelenideElement resourceId = getResourceId(field);
        mobileSteps.verifyData(resourceId, data);
    }

    public void clickButton(String button) {
        SelenideElement resourceId = getResourceId(button);
        mobileSteps.clickButton(resourceId);
    }

    //MNV need to refactor
    private SelenideElement getCargoInput() {
        return $(By.id("com.abmcloud:id/editTextCargo"));
    }
    private SelenideElement getPriorityInfo() {
        return $(By.xpath("//android.view.ViewGroup[2]/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout")).find(By.id("com.abmcloud:id/text_resource"));
    }
    private SelenideElement getClientInfo() {
        return $(By.xpath("//android.view.ViewGroup[2]/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout")).find(By.id("com.abmcloud:id/textViewClient"));
    }
    private SelenideElement getLoadedInfo() {
        return $(By.xpath("//android.view.ViewGroup[2]/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout")).find(By.id("com.abmcloud:id/textViewLoaded"));
    }
    private SelenideElement getNotLoadedInfo() {
        return $(By.xpath("//android.view.ViewGroup[2]/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout")).find(By.id("com.abmcloud:id/textViewNotLoaded"));
    }
    public void setSerialCargoInput(String ... serialNumbers) {
        AndroidDriver driver = (AndroidDriver) getCargoInput().getWrappedDriver();
        for (String s : serialNumbers) {
            getCargoInput().click();
            getCargoInput().val(s);
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        }
    }
    public void checkLoadingInfo(String priority, String client, String loaded, String notLoaded) {
        getPriorityInfo().shouldBe(visible).shouldHave(exactText(priority));
        getClientInfo().shouldHave(exactText(client));
        getLoadedInfo().shouldHave(exactText(loaded));
        getNotLoadedInfo().shouldHave(exactText(notLoaded));
    }
    //MNV need to refactor

    //MNV need to dell
//    public void setRouteSheetInput(String routeSheetInput) {
//        AndroidDriver driver = (AndroidDriver) getRouteSheetInput().getWrappedDriver();
//        getRouteSheetInput().click();
//        getRouteSheetInput().val(routeSheetInput);
//        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//    }
//    public void setGateInput(String gateInput) {
//        AndroidDriver driver = (AndroidDriver) getGateInput().getWrappedDriver();
//        getGateInput().click();
//        getGateInput().val(gateInput);
//        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//    }
//    public void checkAndSelectAvailableRouteSheet(String description, String driver) {
//        $(By.id("com.abmcloud:id/buttonRouteSheetChoice")).click();
//        $(By.id("com.abmcloud:id/select_dialog_listview")).shouldBe(visible);
//        $(By.id("com.abmcloud:id/textViewDoc_title")).shouldHave(text(description));
//        $(By.id("com.abmcloud:id/textViewDriver")).shouldHave(text(driver)).click();
//    }
//    public void clickCommitButton() {
//        $(By.id("com.abmcloud:id/buttonCommitLoading")).click();
//    }
//    public SelenideElement getRouteSheetInput() {
//        return $(By.id("com.abmcloud:id/textBoxRouteSheet"));
//    }
//    private SelenideElement getGateInput() {
//        return $(By.id("com.abmcloud:id/textBoxAdditionalBarcode"));
//    }
    //MNV need to dell
}
