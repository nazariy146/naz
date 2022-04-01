package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MobileFormUnit {

    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#title":
                return $(By.id("com.abmcloud:id/alertTitle"));
            case "#name":
                return $(By.id("com.abmcloud:id/tv_base_unit"));
            case "#qty":
                return $(By.id("com.abmcloud:id/et_unit_parameters_ratio"));
            case "#width":
                return $(By.id("com.abmcloud:id/et_unit_parameters_width"));
            case "#lenght":
                return $(By.id("com.abmcloud:id/et_unit_parameters_length"));
            case "#height":
                return $(By.id("com.abmcloud:id/et_unit_parameters_height"));
            case "#weight":
                return $(By.id("com.abmcloud:id/et_unit_parameters_weight"));
            case "#write":
                return $(By.id("android:id/button1"));
        }
        return null;
    }
    public void completeTask (String dataTitle, String dataName, String dataQty, String dataWidth, String dataLenght, String dataHeight, String dataWeight) {
        SelenideElement resourceId_Title, resourceId_Name, resourceId_Qty, resourceId_Width, resourceId_Lenght, resourceId_Height, resourceId_Weight, resourceId_Write;

        resourceId_Title =  getResourceId("#title");
        resourceId_Name =   getResourceId("#name");
        resourceId_Qty =    getResourceId("#qty");
        resourceId_Width =  getResourceId("#width");
        resourceId_Lenght = getResourceId("#lenght");
        resourceId_Height = getResourceId("#height");
        resourceId_Weight = getResourceId("#weight");
        resourceId_Write =  getResourceId("#write");

        resourceId_Title.shouldBe(visible, Duration.ofSeconds(25));
        mobileSteps.verifyData (resourceId_Title, dataTitle);
        mobileSteps.verifyData (resourceId_Name, dataName);
        mobileSteps.verifyData (resourceId_Qty, dataQty);
        mobileSteps.inputData (resourceId_Width, dataWidth);
        mobileSteps.inputData (resourceId_Lenght, dataLenght);
        mobileSteps.inputData (resourceId_Height, dataHeight);
        mobileSteps.inputData (resourceId_Weight, dataWeight);
        mobileSteps.clickButton (resourceId_Write);
    }

    public void completeTask1 (MobileData stolData) {
        SelenideElement resourceId_Title, resourceId_Name, resourceId_Qty, resourceId_Width, resourceId_Lenght, resourceId_Height, resourceId_Weight, resourceId_Write;

        resourceId_Title =  getResourceId("#title");
        resourceId_Name =   getResourceId("#name");
        resourceId_Qty =    getResourceId("#qty");
        resourceId_Width =  getResourceId("#width");
        resourceId_Lenght = getResourceId("#lenght");
        resourceId_Height = getResourceId("#height");
        resourceId_Weight = getResourceId("#weight");
        resourceId_Write =  getResourceId("#write");

        mobileSteps.verifyData (resourceId_Title, stolData.unitName);
        mobileSteps.verifyData (resourceId_Name, stolData.unitName);
        mobileSteps.verifyData (resourceId_Qty, stolData.unitQty);
        mobileSteps.inputData (resourceId_Width, stolData.unitWidth);
        mobileSteps.inputData (resourceId_Lenght, stolData.unitLenght);
        mobileSteps.inputData (resourceId_Height, stolData.unitHeight);
        mobileSteps.inputData (resourceId_Weight, stolData.unitWeight);
        mobileSteps.clickButton (resourceId_Write);
    }
}
