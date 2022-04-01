package web.webSteps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebSteps {

    public void verifyData(SelenideElement resourceId, String data) {
        resourceId.shouldBe(visible, Duration.ofSeconds(25));
        resourceId.shouldHave(text(data));
    }

    public void click(SelenideElement resourceId) {
        resourceId.shouldBe(visible, Duration.ofSeconds(25));
        resourceId.click();
    }

    public void verifyEverythingData(int column, String ... data) {
        int row = 0;
        for(String nowData : data) {
            String resourceId = "#cmd_" + column + "_" + row + "_txt";
            SelenideElement cssSelector1 = $(resourceId);
            cssSelector1.shouldHave(text(nowData));
            row++;
        }
    }

    public void clickMenu(int row) {
        String resourceId = "#themesCell_theme_" + row;
        SelenideElement cssSelector1 = $(resourceId);

        cssSelector1.shouldBe(visible, Duration.ofSeconds(25));
        cssSelector1.click();
    }
}
