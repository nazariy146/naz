package mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;
import mobile.mobileSteps.MobileSteps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class PackagingCardPage {
    MobileSteps mobileSteps = new MobileSteps();

    public SelenideElement getResourceId(String field) {
        switch (field) {
            case "#container":
                return $(By.id("com.abmcloud:id/et_consolidate_cell"));
            case "#createCargo":
                return $(By.id("com.abmcloud:id/btn_create_cargo"));
            case "#modalMessage":
                return $(By.id("android:id/message"));
            case "#modalOk":
                return $(By.id("android:id/button1"));
            case "#modalOk2":
                return $(By.id("android:id/button2"));
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

    //MNV need to refactor
    public SelenideElement getProductContainerInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/tv_container"));
    }
    private SelenideElement getProductQtyInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/tv_qty"));
    }
    private SelenideElement getProductCapacityInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/tv_capacity"));
    }
    private SelenideElement getProductWeightInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/tv_weight"));
    }
    private SelenideElement getProductLabelInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/ed_label_qty"));
    }
    private SelenideElement getBoxQtyInfo(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find(By.id("com.abmcloud:id/et_box_qty"));
    }
    private SelenideElement getScrollableTable() {
        return $(By.id("com.abmcloud:id/recycler_view"));
    }
    public void checkCellProductInfoInRow(int row, String container, String qty, String capacity, String weight) {//старый метод проверки табчасти
        if(!getProductContainerInfo(row).isDisplayed()) {
            scrollElement(getScrollableTable());
        }
        if (row > 10) {
            getProductContainerInfo(row-4).shouldHave(text(container));
            getProductQtyInfo(row-4).shouldHave(text(qty));
            getProductCapacityInfo(row-4).shouldHave(text(capacity));
            getProductWeightInfo(row-4).shouldHave(text(weight));
        }
        else {
            getProductContainerInfo(row).shouldHave(text(container));
            getProductQtyInfo(row).shouldHave(text(qty));
            getProductCapacityInfo(row).shouldHave(text(capacity));
            getProductWeightInfo(row).shouldHave(text(weight));
        }
    }
    public void checkCellProductInfoInRow2(int row, String container, String qty, String capacity, String weight, String label, String box) {//новый метод проверки табчасти
        if(!getProductContainerInfo(row).isDisplayed()) {
            scrollElement(getScrollableTable());
        }
            getProductContainerInfo(row).shouldHave(text(container));
            getProductQtyInfo(row).shouldHave(text(qty));
            getProductCapacityInfo(row).shouldHave(text(capacity));
            getProductWeightInfo(row).shouldHave(text(weight));
            getProductLabelInfo(row).shouldHave(text(label));
            getBoxQtyInfo(row).shouldHave(text(box));

    }
    public void scrollElement(SelenideElement element) {
        AndroidDriver driver = (AndroidDriver) element.getWrappedDriver();

        TouchAction touchAction= new TouchAction(driver);

        touchAction.press(point(element.getLocation().x, element.getLocation().y))
                .waitAction(WaitOptions.waitOptions(ofMillis(300)))
                .moveTo(point(element.getLocation().x, element.getLocation().y-846))
                .release().perform();
    }
    //MNV need to refactor

    //MNV need to dell
//    public void setCellOrContainerInput(String cellOrContainer) {
//        getCellOrContainerInput().shouldBe(visible);
//        AndroidDriver driver = (AndroidDriver) getCellOrContainerInput().getWrappedDriver();
//        getCellOrContainerInput().click();
//        getCellOrContainerInput().val(cellOrContainer);
//        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//    }
//    private SelenideElement getCellOrContainerInput() {
//        return $(By.id("com.abmcloud:id/et_consolidate_cell"));
//    }
//    public void clickCreateCargoButton() {
//        getCreateCargoButton().click();
//    }
//    private SelenideElement getCreateCargoButton() {
//        return $(By.id("com.abmcloud:id/btn_create_cargo"));
//    }
    //MNV need to dell
}
