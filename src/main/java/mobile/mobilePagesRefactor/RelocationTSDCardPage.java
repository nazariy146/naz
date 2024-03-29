package mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import mobile.mobileSteps.MobileSteps;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RelocationTSDCardPage {
    MobileSteps mobileSteps = new MobileSteps();

    public static SelenideElement getResourceId(String Field) {
        if (Field == "rightMenu"){
            return $(By.id("com.abmcloud:id/action_more_menu"));
        }
        else if (Field == "relocation"){
            return $(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView"));
        }
        else if (Field == "source"){
            return $(By.id("com.abmcloud:id/textBoxSource"));
        }
        else if (Field == "product"){
            return $(By.id("com.abmcloud:id/textBoxBarcode"));
        }
        else if (Field == "qty"){
            return $(By.id("com.abmcloud:id/textBoxQty"));
        }
        else if (Field == "moving"){
            return $(By.id("com.abmcloud:id/buttonCommit"));
        }
        else if (Field == "productInfo"){
            return $(By.id("com.abmcloud:id/textBoxDescription"));
        }
        else if (Field == "destination"){
            return $(By.id("com.abmcloud:id/textBoxDestination"));
        }
        else if (Field == "modalDialogTitle"){
            return $(By.id("com.abmcloud:id/alertTitle"));
        }
        else if (Field == "modalTab"){
            return $(By.id("com.abmcloud:id/tv_shelf_life"));
        }
        else if (Field == "modalDialogOK"){
            return $(By.id("android:id/button1"));
        }
        else if (Field == "dataPacking"){ //radl combobox упаковки
            return $(By.id("com.abmcloud:id/tv_packing"));
        }
        else if (Field == "packing42-5-4-2-1"){ // выбор из списка упаковки 42-5-4-2-1 для Стола42
            return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
        }
        else if (Field == "packing42-5-4-3-1"){ // выбор из списка упаковки 42-5-4-3-1 для Стола42
            return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
        }
        return null;
    }

    public static String getIdFielString(String Field) {
       if (Field == "series"){
            String seriesID = "com.abmcloud:id/tv_series";
            return seriesID ;
       }
       else if (Field == "shelfLife"){
           String seriesID = "com.abmcloud:id/tv_shelf_life";
           return seriesID ;
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

    public void selectData(String field, String source) {
            String seriesID = getIdFielString(field);
            $$(By.id(seriesID)).find(exactText(source)).click();
        }

    //MNV need to dell
    //MNV need to dell
}


