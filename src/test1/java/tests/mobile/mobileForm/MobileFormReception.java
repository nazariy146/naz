package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import static com.codeborne.selenide.Selenide.$;

public class MobileFormReception {

    MobileSteps mobileSteps = new MobileSteps();
    MobileFormBatchProperties mobileFormBatchProperties = new MobileFormBatchProperties();
    MobileFormSerialNumber mobileFormSerialNumber = new MobileFormSerialNumber();
    MobileFormSku mobileFormSku = new MobileFormSku();
    MobileFormUnit mobileFormUnit = new MobileFormUnit();
    MobileFormPacking mobileFormPacking = new MobileFormPacking();

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
            case "#palletWeight":
                return $(By.id("com.abmcloud:id/editTextPalletWeight"));
            case "#tareQty":
                return $(By.id("com.abmcloud:id/editTextTareQty"));
            case "#tareWeight":
                return $(By.id("com.abmcloud:id/editTextTareWeight"));
        }
        return null;
    }

    public void completeTask( MobileData stolData) {

        SelenideElement resourceId_ProductInfo, resourceId_Source, resourceId_Product, resourceId_Container, resourceId_Qty, resourceId_Commit, resourceId_PalletWeight, resourceId_TareQty, resourceId_TareWeight;

        resourceId_ProductInfo  = getResourceId("#productInfo");
        resourceId_Source       = getResourceId("#source");
        resourceId_Product      = getResourceId("#product");
        resourceId_Container    = getResourceId("#container");
        resourceId_Qty          = getResourceId("#qty");
        resourceId_Commit       = getResourceId("#commit");
        resourceId_PalletWeight = getResourceId("#palletWeight");
        resourceId_TareQty      = getResourceId("#tareQty");
        resourceId_TareWeight   = getResourceId("#tareWeight");

        if (stolData.series | stolData.shelfLife ){
            if (stolData.declaredSeriesShelfLife){
                mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfoSeriesShelfLife);
            }
            else {
                mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfo);
            }
        }
        else {
            mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfo);
        }

        mobileSteps.inputData (resourceId_Source, stolData.source);
        mobileSteps.inputData (resourceId_Product, stolData.product);

        //учет Серий, СГ, СН вводим данные на формах
        if (stolData.series | stolData.shelfLife | stolData.serialNumber){
            if (stolData.series | stolData.shelfLife){
                if (!stolData.declaredSeriesShelfLife & !stolData.declaredSeriesShelfLifeSN){
//                    mobileFormBatchProperties.input(stolData.series, stolData.shelfLife, stolData.dataSeries, stolData.dataShelfLife); MNV-удалить после рефакторинга
                    mobileFormBatchProperties.completeTask(stolData);
                }
            }
            if (stolData.serialNumber){
                mobileFormSerialNumber.completeTask(stolData);
            }
        }

        if (stolData.skuForm){
            mobileFormSku.completeTask(stolData);
            if (stolData.packingNew){
                mobileFormPacking.completeTask1(stolData);
            }
        }

        if (stolData.skuUnit){
            mobileFormUnit.completeTask1(stolData);
        }

        mobileSteps.verifyData (resourceId_ProductInfo, stolData.productInfoSeriesShelfLife);
        mobileSteps.inputData (resourceId_Container, stolData.container);

        if (stolData.sof){
            mobileSteps.inputData(resourceId_PalletWeight, stolData.palletWeight);
            mobileSteps.inputData(resourceId_TareQty, stolData.tareQty);
            mobileSteps.inputData(resourceId_TareWeight, stolData.tareWeight);
        }

        //если Номенклатура.УчетСН, количество заполняется автоматически, делаем проверку количества
        if (stolData.serialNumber | stolData.weightBarcode){
            mobileSteps.verifyData (resourceId_Qty, stolData.qty);
        }
        else {
            mobileSteps.inputData(resourceId_Qty, stolData.qty);
        }
        mobileSteps.clickButton (resourceId_Commit);
    }
}
