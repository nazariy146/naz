package web.webCase;

import web.webUtils.WebUtils;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WebDownloadMobileTest {
    WebUtils webUtils = new WebUtils();

    public void completeTask(String numberCase) {
        String number = "#form0_SendingTest" + numberCase;

        webUtils.webRunBrowser();
        $("#captionbarMore").shouldBe(visible, Duration.ofSeconds(10));
        $("#captionbarMore").click();
        $("#fileSubMenu").hover();
        $("#fileOpen").click();

        File file = new File("src/LoadingTheDatabase.epf");
        $("#fileSelectButton").uploadFile(file);
        $("#fileSelectDialogOk").click();

        $(number).click();
        $("#LogoutButton").click();
        $("#LogoutCloseButton").click();
        System.out.println("log out complete");
    }

}

