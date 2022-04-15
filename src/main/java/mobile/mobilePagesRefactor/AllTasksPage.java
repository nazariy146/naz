package mobile.mobilePagesRefactor;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertEquals;
import static mobile.mobileUtils.Actions.refreshPage;
import static mobile.mobileUtils.AssertionUtils.WAIT_TASK_TIMEOUT;
import static mobile.mobileUtils.AssertionUtils.waitUntilPass;


public class AllTasksPage {
    ReceptionCardPage receptionCardPage = new ReceptionCardPage();
    public SelenideElement getWorkType() {
        return $(By.xpath("//androidx.cardview.widget.CardView[1]")).find(By.id("com.abmcloud:id/text_work_type"));
    }

    public void checkWorkType(String taskTitle) throws Exception {
        if (!getRelaxMessage().isDisplayed()) {
            waitUntilPass(WAIT_TASK_TIMEOUT, () -> {
                refreshPage($(By.id("com.abmcloud:id/top_app_bar")));
                $(By.id("com.abmcloud:id/text_work_type")).shouldBe(visible, Duration.ofSeconds(60));
                refreshPage($(By.id("com.abmcloud:id/top_app_bar")));
                getWorkType().shouldHave(exactText(taskTitle));
            });
        } else
            getWorkType().shouldBe(visible, Duration.ofSeconds(50));
//            refreshPage($(By.id("com.abmcloud:id/top_app_bar")));
            getWorkType().shouldHave(exactText(taskTitle));
    }

    public SelenideElement getWorkTypeTasksQuantity() {
        return $(By.id("com.abmcloud:id/text_qty"));
    }

    public SelenideElement getRelaxMessage() {
        return $(By.id("com.abmcloud:id/relax_view"));
    }

    public void clickMenuIcon() {
        $(By.id("com.abmcloud:id/action_more_menu")).click();
    }

    public void selectFindRestsMenu() {
        clickMenuIcon();
//        $(By.id("com.abmcloud:id/design_navigation_view")).shouldBe(visible);
//        $(By.id("com.abmcloud:id/design_navigation_view")).find(byId("com.abmcloud:id/find_rests")).click();
        $(By.id("com.abmcloud:id/navigation_more")).shouldBe(visible);
        $(By.id("com.abmcloud:id/navigation_more")).find(byId("com.abmcloud:id/find_rests")).click();
    }

    public void selectConsolidateContainerMenu() {
        clickMenuIcon();
        $(By.id("com.abmcloud:id/design_navigation_view")).shouldBe(visible);
        $(By.id("com.abmcloud:id/design_navigation_view")).find(byId("com.abmcloud:id/consolidate_container")).click();
    }

    public SelenideElement getStringTasks(int row) {
        return $(By.xpath("//androidx.cardview.widget.CardView[" + row + "]")).find(By.id("com.abmcloud:id/text_qty"));

    }
    //MNV need to refactor
    public void checkWorkTypesQty(int qty) throws Exception {
        $(By.id("com.abmcloud:id/top_app_bar")).shouldBe(visible);
        if ($$(By.id("com.abmcloud:id/card_view")).size() != qty) {
            waitUntilPass(WAIT_TASK_TIMEOUT, () -> {
                refreshPage($(By.id("com.abmcloud:id/top_app_bar")));
                assertEquals($$(By.id("com.abmcloud:id/card_view")).size(), qty, "Expected quantity of tasks doesn't match actual");
            });
        }
    }
    public void selectRelocation() {
        clickMenuIcon();
        $(By.id("com.abmcloud:id/design_navigation_view")).shouldBe(visible);
        $(By.id("com.abmcloud:id/design_navigation_view")).find(byId("com.abmcloud:id/relocation")).click();
    }
    public void selectelocationMenu() {
        clickMenuIcon();
        $(By.id("com.abmcloud:id/design_navigation_view")).shouldBe(visible);
        $(By.id("com.abmcloud:id/design_navigation_view")).find(byId("com.abmcloud:id/find_rests")).click();
    }
    public void clickInventoryTypeTaskQuantity() {
        $(By.id("com.abmcloud:id/text_qty")).click();
    }
/*    public void searchTasks (String nameTasks) throws Exception {
        switch (nameTasks) {
            case 1:
                getStringTasks(1, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[1]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 2:
                getStringTasks(2, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[2]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 3:
                getStringTasks(3, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[3]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 4:
                getStringTasks(4, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[4]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 5:
                getStringTasks(5, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[5]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 6:
                getStringTasks(6, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[6]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
            case 7:
                getStringTasks(7, nameTasks);
                $(By.xpath("//androidx.cardview.widget.CardView[7]")).find(By.id("com.abmcloud:id/text_qty")).click();
                break;
        }
    }*/

    //       public void clickInventoryTypeTaskQuantity() {
//        $(By.xpath("//androidx.cardview.widget.CardView[2]")).find(By.id("com.abmcloud:id/text_qty")).click();
//    }
    //MNV need to refactor
}


