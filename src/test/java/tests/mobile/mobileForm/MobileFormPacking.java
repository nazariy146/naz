package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MobileFormPacking {

    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#palletFlag":
                return $(By.id("com.abmcloud:id/sw_pallet"));
            case "#layerFlag":
                return $(By.id("com.abmcloud:id/sw_layer"));
            case "#boxFlag":
                return $(By.id("com.abmcloud:id/sw_box"));
            case "#groupFlag":
                return $(By.id("com.abmcloud:id/sw_group"));
            case "#pallet":
                return $(By.id("com.abmcloud:id/et_pallet"));
            case "#layer":
                return $(By.id("com.abmcloud:id/et_layer"));
            case "#box":
                return $(By.id("com.abmcloud:id/et_box"));
            case "#group":
                return $(By.id("com.abmcloud:id/et_group"));
            case "#write":
                return $(By.id("android:id/button1"));
        }
        return null;
    }

    public void completeTask (boolean palletFlag, boolean layerFlag, boolean boxFlag, boolean groupFlag, String dataPallet, String dataLayer, String dataBox, String dataGroup) {
        SelenideElement resourceId_Title, resourceId_PalletFlag, resourceId_LayerFlag, resourceId_BoxFlag, resourceId_GroupFlag, resourceId_Pallet, resourceId_Layer, resourceId_Box, resourceId_Group, resourceId_Write;

        resourceId_Title = getResourceId("#title");
        resourceId_PalletFlag = getResourceId("#palletFlag");
        resourceId_LayerFlag = getResourceId("#layerFlag");
        resourceId_BoxFlag = getResourceId("#boxFlag");
        resourceId_GroupFlag = getResourceId("#groupFlag");
        resourceId_Pallet = getResourceId("#pallet");
        resourceId_Layer = getResourceId("#layer");
        resourceId_Box = getResourceId("#box");
        resourceId_Group = getResourceId("#group");
        resourceId_Write = getResourceId("#write");

        resourceId_PalletFlag.shouldBe(visible, Duration.ofSeconds(25)); // MNV добавить ИД наименования формы и ожидать ее
        //mobileSteps.verifyData (resourceId_Title, "New packing"); // MNV добавить проверку наименования формы
        if (palletFlag == true) {
            mobileSteps.clickButton (resourceId_PalletFlag);
            mobileSteps.inputData (resourceId_Pallet, dataPallet);
        }
        if (layerFlag == true) {
            mobileSteps.clickButton (resourceId_LayerFlag);
            mobileSteps.inputData (resourceId_Layer, dataLayer);
        }
        if (boxFlag == true) {
            mobileSteps.clickButton (resourceId_BoxFlag);
            mobileSteps.inputData (resourceId_Box, dataBox);
        }
        if (groupFlag == true) {
            mobileSteps.clickButton (resourceId_GroupFlag);
            mobileSteps.inputData (resourceId_Group, dataGroup);
        }
        mobileSteps.clickButton (resourceId_Write);
    }
}
