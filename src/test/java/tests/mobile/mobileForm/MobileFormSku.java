package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import static com.codeborne.selenide.Selenide.$;

public class MobileFormSku {
    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#title":
                return $(By.id("com.abmcloud:id/alertTitle"));
            case "#write":
                return $(By.id("android:id/button1"));
        }
        return null;
    }

    public void completeTask (MobileData stolData) {
        SelenideElement resourceId_Title, resourceId_Write;

        resourceId_Title = getResourceId("#title");
        resourceId_Write = getResourceId("#write");

        mobileSteps.verifyData(resourceId_Title, "SKU info");
        mobileSteps.clickButton (resourceId_Write);
    }
}
