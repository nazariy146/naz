package tests.pages.mobilePages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import tests.steps.Steps;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryCardPage {
    Steps steps = new Steps();

    AndroidDriver driver;

    public void andrDriver(String field) {
        driver = (AndroidDriver) getIdField(field).getWrappedDriver();
    }

    public static SelenideElement getIdField(String Field) {
        if (Field == "source"){
            return $(By.id("com.abmcloud:id/textBoxLocationInv"));
        }
        else if (Field == "product"){
            return $(By.id("com.abmcloud:id/textBoxBarcodeInv"));
        }
        else if (Field == "productInfo"){
            return $(By.id("com.abmcloud:id/textViewInfoProduct"));
        }
        else if (Field == "qty"){
            return $(By.id("com.abmcloud:id/textBoxQtyInv"));
        }
        else if (Field == "palletWeight"){
            return $(By.id("com.abmcloud:id/editTextPalletWeight"));
        }
        else if (Field == "tareQty"){
            return $(By.id("com.abmcloud:id/editTextTareQty"));
        }
        else if (Field == "tareWeight"){
            return $(By.id("com.abmcloud:id/editTextTareWeight"));
        }
        else if (Field == "itemViewInfo"){
            return $(By.xpath("//android.widget.ListView/android.view.ViewGroup[2]")).find(By.id("com.abmcloud:id/textViewItemInv")); //поле наименования номенклатуры в колонке Item
        }
        else if (Field == "quality"){
            return $(By.id("android:id/text1"));
        }
        else if (Field == "modalDialogMessage"){
            return $(By.id("android:id/message"));
        }
        else if (Field == "inventory"){
            return $(By.id("com.abmcloud:id/buttonCommitInv"));
        }
        else if (Field == "ok"){
            return $(By.id("android:id/button1"));
        }
        else if (Field == "modalDialogTitle"){
            return $(By.id("com.abmcloud:id/alertTitle"));
        }
        else if (Field == "modalDialogOK"){
            return $(By.id("android:id/button1"));
        }
        else if (Field == "qualityInfo"){
            return $(By.xpath("//android.widget.ListView/android.view.ViewGroup[2]")).find(By.id("com.abmcloud:id/textViewQualityInv"));
        }
        else if (Field == "qtyViewInfo"){
            return $(By.xpath("//android.widget.ListView/android.view.ViewGroup[2]")).find(By.id("com.abmcloud:id/textViewQtyInv"));
        }
        return null;
    }

    public void inputData(String field, String source) {
        SelenideElement ID = getIdField(field);
        ID.click();
        ID.val(source);
        steps.driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void verifyData(String field, String source) {
        SelenideElement ID = getIdField(field);
        ID.shouldHave(text(source));
    }

    public void clickButton(String field) {
        SelenideElement ID = getIdField(field);
        ID.click();
    }

    public void clickButtonAndConfirm(String field) {
        clickButton(field);
        verifyData("modalDialogMessage", "Complete Cell Inventory?");
        clickButton("ok");
    }

    //MNV need to refactor
    public void selectData(String field, String source) {
        getIdField(field).click();
        $$(By.id("android:id/text1")).find(exactText(source)).click();
    }
    //MNV need to refactor

    //MNV need to dell
/*    public void inputBatchProperties(boolean seriesOn, boolean shelfLifeOn, String action, String series, String shelfLife) {
        verifyData("modalDialogTitle", "Batch properties");
        if (action == "input") {
            if (seriesOn == true) {
                inputData("newSeries", series);
            }
            if (shelfLifeOn == true) {
                inputData("newShelfLife", shelfLife);
            }
        }
        if (action == "select") {
            if (seriesOn == true) {
                $$(By.id("com.abmcloud:id/tv_series")).find(exactText(series)).click();
            }
            if (shelfLifeOn == true) {
                $$(By.id("com.abmcloud:id/tv_shelf_life")).find(exactText(shelfLife)).click();
            }
        }
        clickButton("modalDialogOK");
    }*/
    //MNV need to dell
}
