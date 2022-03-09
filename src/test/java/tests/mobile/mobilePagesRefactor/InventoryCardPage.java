package tests.mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryCardPage {
    MobileSteps mobileSteps = new MobileSteps();

    public static SelenideElement getResourceId(String Field) {
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
        else if (Field == "AddInv"){    //radl кнопка +
            return $(By.id("com.abmcloud:id/buttonAddInv"));
        }
        else if (Field == "DelInv"){    //radl кнопка -
            return $(By.id("com.abmcloud:id/buttonDeleteInv"));
        }
        else if (Field == "ChoicePacking"){ // вызов списка доступных упаковок
            return $(By.id("com.abmcloud:id/tv_packing"));
        }
        else if (Field == "Packing42-5-4-2-1"){ //eleo //eleo выбор из списка упаковки 42-5-4-2-1
            return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
        }
        else if (Field == "Choice43-5-4-3-1"){  //eleo выбор упаковки для удаления
            return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.TextView"));
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
        else if (Field == "qualityTable"){
            return $(By.id("android:id/text1"));
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

    public void clickButtonAndConfirm(String field) {
        clickButton(field);
        verifyData("modalDialogMessage", "Complete Cell Inventory?");
        clickButton("ok");
    }

    //MNV need to refactor
    public void selectData(String field, String source) {
        SelenideElement resourceId = getResourceId("qualityTable");
        mobileSteps.selectData(resourceId, source);
    }
    //MNV need to refactor

    //MNV need to dell
    //MNV need to dell
}
