package mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Selenide.$;

public class FindRestsPage {
    MobileSteps mobileSteps = new MobileSteps();

    public static SelenideElement getResourceId(String Field) {
        if (Field == "product"){
            return $(By.id("com.abmcloud:id/barcode"));
        }
        else if (Field == "productInfo"){
            return $(By.id("com.abmcloud:id/card_view_title"));
        }
        else if (Field == "sourceInfo"){
            return $(By.id("com.abmcloud:id/textViewItem"));
        }
        else if (Field == "qty"){
            return $(By.id("com.abmcloud:id/textViewRecord_count"));
        }
        else if (Field == "seriesInfo"){
            return $(By.id("com.abmcloud:id/textViewSeries"));//mobileCase1,case2,case4
        }
        else if (Field == "shelfLifeInfo"){
            return $(By.id("com.abmcloud:id/textViewShelfLife"));//mobileCase1,case2,case4
        }
        else if (Field == "shelfLifeInfoString1"){
            //return $(By.id("com.abmcloud:id/textViewShelfLife"));
            //return $(By.xpath("//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
            return $(By.xpath("//android.widget.LinearLayout[2]/android.widget.TextView[1]"));
        }
        else if (Field == "checkLocationString1"){
            //return $(By.id("//android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
            return $(By.xpath("//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        }
        else if (Field == "qtyString1"){
            //return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"));
            //return $(By.xpath("android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
            return $(By.xpath("//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"));
        }
        else if (Field == "checkLocationString2"){
            return $(By.xpath("//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
            //return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        }
        else if (Field == "shelfLifeInfoString2"){
            //return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
            return $(By.xpath("//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
        }
        else if (Field == "seriesInfoString2"){
            return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
        }
        else if (Field == "qtyString2"){
            return $(By.xpath("//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
            //return $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
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


