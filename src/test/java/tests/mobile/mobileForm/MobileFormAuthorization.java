package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Selenide.$;

public class MobileFormAuthorization {
    MobileSteps mobileSteps = new MobileSteps();

    private static SelenideElement getResourceId(String field) {
        switch (field) {
            case "#user":
                return $(By.id("com.abmcloud:id/spn_user"));
            case "#userSelect":
                return $(By.id("com.abmcloud:id/text_input_end_icon"));
            case "#login":
                return $(By.id("com.abmcloud:id/btn_authorize"));
            case "#password":
                return $(By.id("com.abmcloud:id/et_password"));
        }
        return null;
    }

    public void completeTask(){
        SelenideElement resourceId_user, resourceId_login, resourceId_password;

        resourceId_user = getResourceId("#user");
        resourceId_login = getResourceId("#login");
        resourceId_password = getResourceId("#password");

        mobileSteps.mobileDriver("user");
        mobileSteps.inputData(resourceId_user, "Admin");
        mobileSteps.clickButton(resourceId_password);
        mobileSteps.clickButton(resourceId_login);
    }
}
