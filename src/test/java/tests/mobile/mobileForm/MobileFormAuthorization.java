package tests.mobile.mobileForm;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import java.time.Duration;
import java.util.Collection;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MobileFormAuthorization {
    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#user":
                return $(By.id("com.abmcloud:id/spn_user"));
            case "#userSelect":
                return $(By.id("com.abmcloud:id/text_input_end_icon"));
            case "#login":
                return $(By.id("com.abmcloud:id/btn_authorize"));
            case "#password":
                return $(By.id("com.abmcloud:id/et_password"));
            case "#settings":
                return $(By.id("com.abmcloud:id/ib_settings"));
        }
        return null;
    }

    public void completeTask(){
        SelenideElement resourceId_user, resourceId_login, resourceId_password, resourceId_settings;

        resourceId_user = getResourceId("#user");
        resourceId_login = getResourceId("#login");
        resourceId_password = getResourceId("#password");
        resourceId_settings = getResourceId("#settings");

        resourceId_settings.shouldBe(visible, Duration.ofSeconds(25));
        mobileSteps.inputData(resourceId_user, "Admin");
        mobileSteps.clickButton(resourceId_password);
        mobileSteps.clickButton(resourceId_login);
    }
}
