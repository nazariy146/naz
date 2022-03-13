package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static tests.mobile.mobileSteps.MobileSteps.mobileDriver;

public class MobileFormReception {

    MobileSteps mobileSteps = new MobileSteps();
    MobileFormBatchProperties mobileFormBatchProperties = new MobileFormBatchProperties();
    MobileFormSerialNumber mobileFormSerialNumber = new MobileFormSerialNumber();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#productInfo":
                return $(By.id("com.abmcloud:id/textViewDescription"));
            case "#source":
                return $(By.id("com.abmcloud:id/editTextControlSource"));
            case "#product":
                return $(By.id("com.abmcloud:id/editTextControlBoxBarcode"));
            case "#container":
                return $(By.id("com.abmcloud:id/editTextControlDestination"));
            case "#qty":
                return $(By.id("com.abmcloud:id/editTextControlQty"));
            case "#commit":
                return $(By.id("com.abmcloud:id/buttonControlCommit"));
        }
        return null;
    }

    public void completeTask( MobileData stolData) {

        SelenideElement resourceId_ProductInfo, resourceId_Source, resourceId_Product, resourceId_Container, resourceId_Qty, resourceId_Commit;

        resourceId_ProductInfo  = getResourceId("#productInfo");
        resourceId_Source       = getResourceId("#source");
        resourceId_Product      = getResourceId("#product");
        resourceId_Container    = getResourceId("#container");
        resourceId_Qty          = getResourceId("#qty");
        resourceId_Commit       = getResourceId("#commit");

        if (stolData.series | stolData.shelfLife ){
            if (stolData.declaredSeriesShelfLife){
                mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfoSeriesShelfLife);
            }
            else {
                mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfo);
            }
        }

        mobileSteps.inputData (resourceId_Source, stolData.source);
        mobileSteps.inputData (resourceId_Product, stolData.product);

        //учет Серий, СГ, СН вводим данные на формах
        if (stolData.series | stolData.shelfLife | stolData.serialNumber){
            if (stolData.series | stolData.shelfLife){
                if (!stolData.declaredSeriesShelfLife){
                    mobileFormBatchProperties.input(stolData.series, stolData.shelfLife, stolData.dataSeries, stolData.dataShelfLife);
                }
            }
            if (stolData.serialNumber){
                mobileFormSerialNumber.completeTask(stolData);
            }
        }
        mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfoSeriesShelfLife);
        mobileSteps.inputData (resourceId_Container, stolData.container);

        //если Номенклатура.УчетСН, количество заполняется автоматически, делаем проверку количества
        if (stolData.serialNumber){
            mobileSteps.verifyData (resourceId_Qty, stolData.qty);
        }
        else {
            mobileSteps.inputData(resourceId_Qty, stolData.qty);
        }

        mobileSteps.clickButton (resourceId_Commit);
    }
}
