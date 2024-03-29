package mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import mobile.mobileSteps.MobileSteps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MobileFormSettings {
    MobileFormAuthorization mobileFormAuthorization = new MobileFormAuthorization();
    MobileSteps mobileSteps = new MobileSteps();

    private static SelenideElement getResourceId(String field) {
        switch (field) {
            case "#connection":
                return $(By.id("com.abmcloud:id/editTextCStr"));
            case "#license":
                return $(By.id("com.abmcloud:id/editTextLicenseNumber"));
            case "#save":
                return $(By.id("com.abmcloud:id/buttonSave"));
        }
        return null;
    }

    public void completeTask(){

        SelenideElement resourceId_settings, resourceId_connection, resourceId_license, resourceId_save;

        resourceId_settings =       mobileFormAuthorization.getResourceId("#settings");
        resourceId_connection =     getResourceId("#connection");
        resourceId_license =        getResourceId("#license");
        resourceId_save =           getResourceId("#save");


        resourceId_settings.shouldBe(visible, Duration.ofSeconds(25));
        mobileSteps.mobileDriver(resourceId_settings);
        mobileSteps.clickButton(resourceId_settings);
        mobileSteps.inputData(resourceId_connection, "http://dmz.abmretail.com:8080/wms_qa_mazv/hs/TSDExchange");
        mobileSteps.inputData(resourceId_license, "wms_qa_mazv");
        mobileSteps.clickButton(resourceId_save);
    }
}
