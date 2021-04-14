package tests.pages.mobilePages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import tests.utils.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class ControlCardPage {

    private SelenideElement getCellInput() {
        return $(By.id("com.abmcloud:id/editTextControlCell"));
    }

    public void setCellInput(String sourceInput) {
        AndroidDriver driver = (AndroidDriver) getCellInput().getWrappedDriver();
        getCellInput().click();
        getCellInput().val(sourceInput);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    private SelenideElement getContainerInput() {
        return $(By.id("com.abmcloud:id/editTextControlContainer"));
    }

    public void setContainerInput(String sourceInput) {
        AndroidDriver driver = (AndroidDriver) getContainerInput().getWrappedDriver();
        getContainerInput().click();
        getContainerInput().val(sourceInput);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void setOnOrOffFreeWCSwitcher(boolean state) {
        $(By.id("com.abmcloud:id/checkBoxNotContainer")).shouldBe(visible);
        $(By.id("com.abmcloud:id/checkBoxNotContainer")).click();
    }

    public SelenideElement getItemInput() {
        return $(By.id("com.abmcloud:id/editTextControlBarcode"));
    }

    public void setItemInput(String destinationInput) {
        AndroidDriver driver = (AndroidDriver) getItemInput().getWrappedDriver();
        getItemInput().click();
        getItemInput().val(destinationInput);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public SelenideElement getQuantityInput() {
        return $(By.id("com.abmcloud:id/editTextCCIlQty"));
    }

    public void setQuantityInputInput(String destinationInput) {
        AndroidDriver driver = (AndroidDriver) getQuantityInput().getWrappedDriver();
        getQuantityInput().click();
        getQuantityInput().val(destinationInput);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public SelenideElement getProductInfo() {
        return $(By.id("com.abmcloud:id/tv_good"));
    }

    public SelenideElement getSeriesInfo() {
        return $(By.id("com.abmcloud:id/tv_series"));
    }

    public SelenideElement getShelfLifeInfo() {
        return $(By.id("com.abmcloud:id/tv_shelflife"));
    }

    public SelenideElement getContainerInfo() {
        return $(By.id("com.abmcloud:id/tv_container"));
    }

    public SelenideElement getControlledQty(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find((By.id("com.abmcloud:id/tv_qty_controlled")));
    }

    public SelenideElement getQty(int row) {
        return $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find((By.id("com.abmcloud:id/tv_qty")));
    }

    public SelenideElement getAvailableSeries() {
        return $(By.id("com.abmcloud:id/textViewSeries"));
    }

    public SelenideElement getSeriesBox() {
        return $(By.id("com.abmcloud:id/textBoxSeriesPL"));
    }

    public SelenideElement getAvailableExpirationDate() {
        return $(By.id("com.abmcloud:id/textViewShelfLife"));
    }

    public SelenideElement getExpirationDateBox() {
        return $(By.id("com.abmcloud:id/textBoxShelfLifeLP"));
    }

    public SelenideElement getSerialNumberInput() {
        return $(By.id("com.abmcloud:id/editTextSerialNumber"));
    }

    public SelenideElement getSerialNumberProductInfo() {
        return $(By.id("com.abmcloud:id/textViewInfo"));
    }

    public void checkSerialNumberInputText(String text) {
        String serialNumberText = getSerialNumberInput().getText();
        Assert.assertEquals(serialNumberText, text, "SerialNumberInputText is not empty");
    }

    public void setSerialNumberInput(String serialNumber) {
        AndroidDriver driver = (AndroidDriver) getSerialNumberInput().getWrappedDriver();
        getSerialNumberInput().click();
        getSerialNumberInput().val(serialNumber);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void setSerialNumberInputSeveralTimes(String serialNumber, int numberOfReps) {
        AndroidDriver driver = (AndroidDriver) getSerialNumberInput().getWrappedDriver();
        for (int i = 0; i < numberOfReps; i++) {
            getSerialNumberInput().click();
            getSerialNumberInput().val(serialNumber);
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        }
    }

    public void setSerialNumberInputSeveralTimes(String ... serialNumbers) {
        AndroidDriver driver = (AndroidDriver) getSerialNumberInput().getWrappedDriver();
        for (String s : serialNumbers) {
            getSerialNumberInput().click();
            getSerialNumberInput().val(s);
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        }
    }

    public void checkSerialNumberQtyFactInEveryRow(String qtyFact, int qtyOfQtyFactsRows) {
        for(int i = 0; i < qtyOfQtyFactsRows; i++) {
            String text = $(By.xpath ("//android.widget.EditText[3][@bounds='[995,"+(700+i*95)+"][1440,"+(791+i*95)+"]']")).getText();
            Assert.assertEquals(qtyFact, text);
        }
    }

    public SelenideElement getCommitSerialNumberButton() {
        return $(By.id("com.abmcloud:id/buttonSNCommit"));
    }

    public void clickCommitSerialNumberButton() {
        getCommitSerialNumberButton().click();
    }

    private SelenideElement getCommitButton() {
        return $(By.id("com.abmcloud:id/buttonCommitControlContainer"));
    }

    public void clickCommitButton() {
        getCommitButton().click();
    }

    private SelenideElement getShipmentStatusButton() {
        return $(By.id("com.abmcloud:id/buttonStatusBuild"));
    }

    public void clickShipmentStatusButton() {
        getShipmentStatusButton().click();
    }

    public void scrollElement(SelenideElement element) {
        AndroidDriver driver = (AndroidDriver) element.getWrappedDriver();

        TouchAction touchAction= new TouchAction(driver);

        touchAction.press(point(element.getLocation().x, element.getLocation().y))
                .waitAction(WaitOptions.waitOptions(ofMillis(300)))
                .moveTo(point(element.getLocation().x, element.getLocation().y-854))
                .release().perform();
    }

    private SelenideElement getScrollableTable() {
        return $(By.id("com.abmcloud:id/listViewControlContainer"));
    }

    public void checkAllProductsInfoAndQty(int row, String qty, String productInfo) {
        Actions.hideKeyboard(getScrollableTable());
        if(!getQty(row).isDisplayed()) {
            scrollElement(getScrollableTable());
        }
        if (row > 7) {
            $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+(row-2)+"]")).find((By.id("com.abmcloud:id/tv_good"))).shouldHave(text(productInfo));
            getQty(row-2).shouldHave(text(qty));
            getControlledQty(row-2).shouldNotBe(visible);
        }
        else {
            $(By.xpath("//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView["+row+"]")).find((By.id("com.abmcloud:id/tv_good"))).shouldHave(text(productInfo));
            getQty(row).shouldHave(text(qty));
            getControlledQty(row).shouldNotBe(visible);
        }
    }
}