package tests.mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RelocationCardPage {
    MobileSteps mobileSteps = new MobileSteps();

    public static SelenideElement getResourceId(String Field) {
        if (Field == "source"){
            return $(By.id("com.abmcloud:id/source_edit"));
        }
        else if (Field == "product"){
            return $(By.id("com.abmcloud:id/ware_barcode"));
        }
        else if (Field == "productInfo"){
            return $(By.id("com.abmcloud:id/textViewDescription"));
        }
        else if (Field == "destination"){
            return $(By.id("com.abmcloud:id/dest_edit"));
        }
        else if (Field == "qty"){
            return $(By.id("com.abmcloud:id/editTextQty"));
        }
        else if (Field == "commit"){
            return $(By.id("com.abmcloud:id/buttonCommit"));
        }
        else if (Field == "unitAmount"){
            return $(By.id("android:id/text1"));
        }
        else if (Field == "unitPackaging"){
            return $(By.id("com.abmcloud:id/textViewLabelHint"));
        }
        else if (Field == "tareQty"){
            return $(By.id("com.abmcloud:id/editTextTareQty"));
        }
        else if (Field == "tareWeight"){
            return $(By.id("com.abmcloud:id/editTextTareWeight"));
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

    //MNV need to dell
    //MNV need to dell

}
