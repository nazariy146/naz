package web.webDraft;

import mobile.mobileUtils.BaseClass;
import web.webPages.WebDashboardPage;
import web.webPages.WarehouseOperatorPage;

import static com.codeborne.selenide.Condition.text;

public class WebGoodsReceipt extends BaseClass {

    public void createGoodsReceiptDocumentTest() {
        WebLoginPage webLoginPage = new WebLoginPage();
        webLoginPage.getLoginModal().shouldHave(text(WebLoginPage.MODAL_DIALOG_TEXT));
        WebDashboardPage webDashboardPage = webLoginPage.loginAsUser();

        WarehouseOperatorPage warehouseOperatorPage = webDashboardPage.clickWHOperatorTab();
        warehouseOperatorPage.clickGoodsReceptionLink();
        warehouseOperatorPage.clickCreateGoodsMovementDocumentButton();
        warehouseOperatorPage.selectDocumentType("Приход");
        warehouseOperatorPage.clickSaveIcon();
        warehouseOperatorPage.getConfirmModalDialog().shouldHave(text("Added"));
        warehouseOperatorPage.setGateValue("00.019.1");
        warehouseOperatorPage.setContractorValue("!!! Таранский (сыр)");
        warehouseOperatorPage.addGoods(" Пазл Утенок");
        warehouseOperatorPage.setGoodsQnty("5000");
        warehouseOperatorPage.clickBeginProcessLink();
        warehouseOperatorPage.compareDocumentStateField("Активен");
        warehouseOperatorPage.clickDetailInfoButton();
        warehouseOperatorPage.isOperationsListNotEmpty();
        warehouseOperatorPage.isWHMovementListNotEmpty();
    }
}
