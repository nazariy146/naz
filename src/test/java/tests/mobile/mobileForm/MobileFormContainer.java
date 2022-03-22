package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Selenide.$;

public class MobileFormContainer {
    MobileSteps mobileSteps = new MobileSteps();

    private static SelenideElement getResourceId(String field) {
        switch (field) {
            case "#container":
                return $(By.id("com.abmcloud:id/editTextBoxBarcodeContainerMoving"));
            case "#info":
                return $(By.id("com.abmcloud:id/textViewDescriptionContainerMoving"));
            case "#destination":
                return $(By.id("com.abmcloud:id/editTextDestinationContainerMoving"));
            case "#commit":
                return $(By.id("com.abmcloud:id/buttonCommitContainerMoving"));
        }
        return null;
    }

    public void completeTask(String container, String info, String destination){

        SelenideElement resourceId_container, resourceId_info, resourceId_destination, resourceId_commit;

        resourceId_container = getResourceId("#container");
        resourceId_info = getResourceId("#info");
        resourceId_destination = getResourceId("#destination");
        resourceId_commit = getResourceId("#commit");

        mobileSteps.verifyData(resourceId_info, info);
        mobileSteps.inputData(resourceId_container, container);
        mobileSteps.inputData(resourceId_destination, destination);
        mobileSteps.clickButton(resourceId_commit);
    }
}
