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
            case "#new":
                return $(By.id("com.abmcloud:id/ib_add"));
            case "#write":
                return $(By.id("android:id/button1"));
        }
        return null;
    }

    public void completeTask (MobileData stolData) {
        SelenideElement resourceId_Title, resourceId_New, resourceId_Write;

        resourceId_Title =  getResourceId("#title");
        resourceId_New =    getResourceId("#new");
        resourceId_Write =  getResourceId("#write");

        mobileSteps.verifyData(resourceId_Title, "SKU info");
        if (stolData.skuNew){
            mobileSteps.clickButton (resourceId_New);
        }
        if(stolData.skuEdit){
            mobileSteps.clickButton (resourceId_Write);
        }
    }
}
