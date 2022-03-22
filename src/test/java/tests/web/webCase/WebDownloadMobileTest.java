package tests.web.webCase;

import tests.web.webUtils.WebUtils;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WebDownloadMobileTest {
    WebUtils webUtils = new WebUtils();

    public void completeTask() {
        webUtils.webOpen1C();

        $("#captionbarMore").shouldBe(visible, Duration.ofSeconds(10));
        $("#captionbarMore").click();
        $("#fileSubMenu").hover();
        $("#fileOpen").click();

        File file = new File("src/OpenAndSending.epf");
        $("#fileSelectButton").uploadFile(file);
        $("#fileSelectDialogOk").click();

        $x("//a//span[text()='Clear base']").click();
        $("#msg0").shouldHave(text("База очищена!"));
        $x("//a//span[text()='Sending test1']").click();
        $("#msg1").shouldHave(text("Код статуса: 200 - Запрос отправлен!"), Duration.ofSeconds(10));
        $("#msg2").shouldHave(text("Тело POST, OK, Документ записан (номер WMS - 1)"));
        $("#msg3").shouldHave(text("Документ приход отправлен!"));

        $("#LogoutButton").click();
        $("#LogoutCloseButton").click();
        System.out.println("log out complete");
    }

    }

