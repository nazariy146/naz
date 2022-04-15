package web.webDraft;

import mobile.mobileUtils.BaseClass;
import web.webPages.WebDashboardPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static web.webPages.WebDashboardPage.DASHBOARD_MAIN_TITLE_TEXT;

public class WebLoginTest extends BaseClass {

    public void successfulLoginTest() {
        WebLoginPage webLoginPage = new WebLoginPage();
        webLoginPage.getLoginModal().shouldHave(text(WebLoginPage.MODAL_DIALOG_TEXT));

        WebDashboardPage webDashboardPage = webLoginPage.loginAsUser();
        webDashboardPage.getMainFormTitle().shouldHave(text(DASHBOARD_MAIN_TITLE_TEXT), Duration.ofSeconds(10));
    }
}
