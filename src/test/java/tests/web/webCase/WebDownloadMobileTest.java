package tests.web.webCase;

import tests.web.webUtils.WebUtils;

import static com.codeborne.selenide.Selenide.$;

public class WebDownloadMobileTest {
    WebUtils webUtils = new WebUtils();

    public void completeTask() {
        webUtils.webOpen1C();
        $("#svg_more").click();

    }
}
