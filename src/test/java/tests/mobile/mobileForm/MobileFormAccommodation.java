package tests.mobile.mobileForm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import static com.codeborne.selenide.Selenide.$;

public class MobileFormAccommodation {
        MobileSteps mobileSteps = new MobileSteps();

        public SelenideElement getResourceId(String field) {
                switch (field) {
                        case "#productInfo":
                                return $(By.id("com.abmcloud:id/textViewDescription"));
                        case "#source":
                                return $(By.id("com.abmcloud:id/source_edit"));
                        case "#product":
                                return $(By.id("com.abmcloud:id/ware_barcode"));
                        case "#destination":
                                return $(By.id("com.abmcloud:id/dest_edit"));
                        case "#qty":
                                return $(By.id("com.abmcloud:id/editTextQty"));
                        case "#commit":
                                return $(By.id("com.abmcloud:id/buttonCommit"));
                }
                return null;
        }

        public void completeTask(MobileData stolData) {

                SelenideElement resourceId_ProductInfo, resourceId_Source, resourceId_Product, resourceId_Destination, resourceId_Qty, resourceId_Commit;

                resourceId_ProductInfo = getResourceId("#productInfo");
                resourceId_Source = getResourceId("#source");
                resourceId_Product = getResourceId("#product");
                resourceId_Destination = getResourceId("#destination");
                resourceId_Qty = getResourceId("#qty");
                resourceId_Commit = getResourceId("#commit");

                mobileSteps.verifyData(resourceId_ProductInfo, stolData.productInfo);
                mobileSteps.inputData(resourceId_Source, stolData.container);
                mobileSteps.inputData(resourceId_Product, stolData.product);
                mobileSteps.inputData(resourceId_Destination, stolData.destination);
                mobileSteps.inputData(resourceId_Qty, stolData.qtyTotal);
                mobileSteps.clickButton(resourceId_Commit);
        }
}
