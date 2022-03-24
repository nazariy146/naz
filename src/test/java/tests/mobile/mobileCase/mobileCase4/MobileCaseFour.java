package tests.mobile.mobileCase.mobileCase4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.mobile.mobileForm.*;
import tests.mobile.mobileUtils.BaseMobileClass;
import tests.mobile.mobilePagesRefactor.*;
import tests.mobile.mobileUtils.MobileData;
import tests.web.webCase.WebDownloadMobileTest;

import static com.codeborne.selenide.Condition.*;

public class MobileCaseFour extends BaseMobileClass {

    AllTasksPage allTasksPage = new AllTasksPage();
    AccommodationCardPage accommodationCardPage = new AccommodationCardPage();
    FindRestsPage findRestsPage = new FindRestsPage();
    SelectionCardPage selectionCardPage = new SelectionCardPage();
    ControlCardPage controlCardPage = new ControlCardPage();
    PackagingCardPage packagingCardPage = new PackagingCardPage();
    LoadingCardPage loadingCardPage = new LoadingCardPage();
    InventoryCardPage inventoryCardPage = new InventoryCardPage();
    RelocationCardPage relocationCardPage = new RelocationCardPage();
    RelocationTSDCardPage relocationTSDCardPage = new RelocationTSDCardPage();
    MobileFormSerialNumber mobileFormSerialNumber = new MobileFormSerialNumber();
    MobileFormContainer mobileFormContainer = new MobileFormContainer();
    MobileFormAuthorization mobileFormAuthorization = new MobileFormAuthorization();
    MobileFormSettings mobileFormSettings = new MobileFormSettings();
    MobileData mobileData = new MobileData();
    MobileFormReception mobileFormReception = new MobileFormReception();
    WebDownloadMobileTest webDownloadMobileTest = new WebDownloadMobileTest();
    MobileFormAccommodation mobileFormAccommodation = new MobileFormAccommodation();

    @BeforeClass
    public void taskWeb() {
        webDownloadMobileTest.completeTask("4");
    }

    @Test
    public void taskReception() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Reception");
        allTasksPage.getWorkTypeTasksQuantity().click();

        MobileData stol31 = mobileData.dataReception("stol31");
        MobileData stol32 = mobileData.dataReception("stol32");
        MobileData stol33 = mobileData.dataReception("stol33");
        MobileData stol34 = mobileData.dataReception("stol34");
        MobileData stol35 = mobileData.dataReception("stol35");
        MobileData stol36 = mobileData.dataReception("stol36");
        MobileData stol37 = mobileData.dataReception("stol37");
        MobileData stol38 = mobileData.dataReception("stol38");
        MobileData stol39 = mobileData.dataReception("stol39");
        MobileData stol40 = mobileData.dataReception("stol40");
    //Стол31
        mobileFormReception.completeTask(stol31);
    //Стол32
        mobileFormReception.completeTask(stol32);
    //Стол33
        mobileFormReception.completeTask(stol33);
    //Стол34
        mobileFormReception.completeTask(stol34);
    //Стол35
        mobileFormReception.completeTask(stol35);
    //Стол36
        mobileFormReception.completeTask(stol36);
    //Стол37
        mobileFormReception.completeTask(stol37);
    //Стол38
        mobileFormReception.completeTask(stol38);
    //Стол39
        mobileFormReception.completeTask(stol39);
    //Стол40
        mobileFormReception.completeTask(stol40);
    }

    @Test (priority = 1, dependsOnMethods = "taskReception")
    public void taskAccommodation() throws Exception{
        MobileData stol31 = mobileData.dataAccommodation("stol31");
        MobileData stol32 = mobileData.dataAccommodation("stol32");
        MobileData stol33 = mobileData.dataAccommodation("stol33");
        MobileData stol34 = mobileData.dataAccommodation("stol34");
        MobileData stol35 = mobileData.dataAccommodation("stol35");
        MobileData stol36 = mobileData.dataAccommodation("stol36");
        MobileData stol37 = mobileData.dataAccommodation("stol37");
        MobileData stol38 = mobileData.dataAccommodation("stol38");
        MobileData stol39 = mobileData.dataAccommodation("stol39");
        MobileData stol40 = mobileData.dataAccommodation("stol40");

        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Accommodation");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол31
        mobileFormAccommodation.completeTask(stol31);
    //Стол32
        mobileFormAccommodation.completeTask(stol32);
    //Стол33
        mobileFormAccommodation.completeTask(stol33);
    //Стол34
        mobileFormAccommodation.completeTask(stol34);
    //Стол35
        mobileFormAccommodation.completeTask(stol35);
    //Стол36
        mobileFormAccommodation.completeTask(stol36);
    //Стол37
        mobileFormAccommodation.completeTask(stol37);
    //Стол38
        mobileFormAccommodation.completeTask(stol38);
    //Стол39
        mobileFormAccommodation.completeTask(stol39);
    //Стол40
        mobileFormAccommodation.completeTask(stol40);
    }

    @Test (priority = 2, dependsOnMethods = "taskAccommodation")
    public void taskFindRests() {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол31
        findRestsPage.inputData("product", "31FRAGSN31Series013112202200");
        findRestsPage.verifyData("productInfo", "00031 Стол31");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.31");
        findRestsPage.verifyData("qty", "10");
    //Стол32
        findRestsPage.inputData("product", "32FRAGSN32Series013112202200");
        findRestsPage.verifyData("productInfo", "00032 Стол32");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.32");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "32Series01");
    //Стол33
        findRestsPage.inputData("product", "33FRAGSN33Series013112202200");
        findRestsPage.verifyData("productInfo", "00033 Стол33");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.33");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол34
        findRestsPage.inputData("product", "34FRAGSN34Series013112202200");
        findRestsPage.verifyData("productInfo", "00034 Стол34");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.34");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "34Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол35
        findRestsPage.inputData("product", "35FRAGBC35Series013112202200");
        findRestsPage.verifyData("productInfo", "00035 Стол35");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.35");
        findRestsPage.verifyData("qty", "10");
    //Стол36
        findRestsPage.inputData("product", "36FRAGBC36Series013112202200");
        findRestsPage.verifyData("productInfo", "00036 Стол36");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.36");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "36Series01");
    //Стол37
        findRestsPage.inputData("product", "37FRAGBC37Series013112202200");
        findRestsPage.verifyData("productInfo", "00037 Стол37");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.37");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол38
        findRestsPage.inputData("product", "38FRAGBC38Series013112202200");
        findRestsPage.verifyData("productInfo", "00038 Стол38");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.38");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "38Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол39
        findRestsPage.inputData("product", "39FRAGSN39Series013112202200");
        findRestsPage.verifyData("productInfo", "00039 Стол39");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.39");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "39Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол40
        findRestsPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        findRestsPage.verifyData("productInfo", "00040 Стол40");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.40");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "40Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    }

    @Test (priority = 3, dependsOnMethods = "taskAccommodation")
    public void taskInventory() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.getStringTasks(2).click();
    //Стол 31
        inventoryCardPage.inputData("source", "A.1.1.1.31");
        inventoryCardPage.inputData("product", "31FRAGSN31Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00031 Стол31"); MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00031 31Series01 2022-12-31T00:00:00 Стол31"); //MNV TODO bag серия и СГ не должны быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 32
        inventoryCardPage.inputData("source", "A.1.1.1.32");
        inventoryCardPage.inputData("product", "32FRAGSN32Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00032 32Series01 Стол32"); MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00032 32Series01 2022-12-31T00:00:00 Стол32"); //MNV TODO bag СГ не должен быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 33
        inventoryCardPage.inputData("source", "A.1.1.1.33");
        inventoryCardPage.inputData("product", "33FRAGSN33Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00033 2022-12-31T00:00:00 Стол33"); MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00033 33Series01 2022-12-31T00:00:00 Стол33");//MNV TODO bag Серия не должена быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 34
        inventoryCardPage.inputData("source", "A.1.1.1.34");
        inventoryCardPage.inputData("product", "34FRAGSN34Series013112202200");
        inventoryCardPage.verifyData("productInfo", "00034 34Series01 2022-12-31T00:00:00 Стол34");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 35
        inventoryCardPage.inputData("source", "A.1.1.1.35");
        inventoryCardPage.inputData("product", "35FRAGBC35Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00035 Стол35");MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00035 35Series01 2022-12-31T00:00:00 Стол35");//MNV TODO bag Серия и СГ не должена быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 36
        inventoryCardPage.inputData("source", "A.1.1.1.36");
        inventoryCardPage.inputData("product", "36FRAGBC36Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00036 36Series01 Стол36"); MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00036 36Series01 2022-12-31T00:00:00 Стол36"); //MNV TODO bag Серия и СГ не должена быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 37
        inventoryCardPage.inputData("source", "A.1.1.1.37");
        inventoryCardPage.inputData("product", "37FRAGBC37Series013112202200");
        //inventoryCardPage.verifyData("productInfo", "00037 2022-12-31T00:00:00 Стол37"); MNV TODO правильно
        inventoryCardPage.verifyData("productInfo", "00037 37Series01 2022-12-31T00:00:00 Стол37"); //MNV TODO bag Серия не должена быть в описании по номенклатуре не ведется учет
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 38
        inventoryCardPage.inputData("source", "A.1.1.1.38");
        inventoryCardPage.inputData("product", "38FRAGBC38Series013112202200");
        inventoryCardPage.verifyData("productInfo", "00038 38Series01 2022-12-31T00:00:00 Стол38");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 39
        inventoryCardPage.inputData("source", "A.1.1.1.39");
        inventoryCardPage.inputData("product", "39FRAGSN39Series01311220220001");
        inventoryCardPage.verifyData("productInfo", "00039 39Series01 2022-12-31T00:00:00 Стол39");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол 40
        inventoryCardPage.inputData("source", "A.1.1.1.40");
        inventoryCardPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        inventoryCardPage.verifyData("productInfo", "00040 40Series01 2022-12-31T00:00:00 Стол40");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    }

    @Test (priority = 4, dependsOnMethods = "taskInventory")
    public void taskFindRestsAfterInventory() {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол31
        findRestsPage.inputData("product", "31FRAGSN31Series013112202200");
        findRestsPage.verifyData("productInfo", "00031 Стол31");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.31");
        findRestsPage.verifyData("qty", "10");
    //Стол32
        findRestsPage.inputData("product", "32FRAGSN32Series013112202200");
        findRestsPage.verifyData("productInfo", "00032 Стол32");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.32");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "32Series01");
    //Стол33
        findRestsPage.inputData("product", "33FRAGSN33Series013112202200");
        findRestsPage.verifyData("productInfo", "00033 Стол33");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.33");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол34
        findRestsPage.inputData("product", "34FRAGSN34Series013112202200");
        findRestsPage.verifyData("productInfo", "00034 Стол34");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.34");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "34Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол35
        findRestsPage.inputData("product", "35FRAGBC35Series013112202200");
        findRestsPage.verifyData("productInfo", "00035 Стол35");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.35");
        findRestsPage.verifyData("qty", "10");
    //Стол36
        findRestsPage.inputData("product", "36FRAGBC36Series013112202200");
        findRestsPage.verifyData("productInfo", "00036 Стол36");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.36");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "36Series01");
    //Стол37
        findRestsPage.inputData("product", "37FRAGBC37Series013112202200");
        findRestsPage.verifyData("productInfo", "00037 Стол37");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.37");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол38
        findRestsPage.inputData("product", "38FRAGBC38Series013112202200");
        findRestsPage.verifyData("productInfo", "00038 Стол38");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.38");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "38Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол39
        findRestsPage.inputData("product", "39FRAGSN39Series013112202200");
        findRestsPage.verifyData("productInfo", "00039 Стол39");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.39");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "39Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол40
        findRestsPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        findRestsPage.verifyData("productInfo", "00040 Стол40");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.40");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "40Series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    }

    @Test (priority = 5, dependsOnMethods = "taskInventory")
    public void taskRelocation() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Moving");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол31
        relocationCardPage.verifyData("productInfo", "00031 Стол31 A.1.1.1.31 ➡ B.1.1.1.31 Quantity 10 уп. (5)");
        relocationCardPage.inputData("source", "A.1.1.1.31");
        relocationCardPage.inputData("product", "31FRAGSN31Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.31");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол32
        relocationCardPage.verifyData("productInfo", "00032 32Series01 Стол32 A.1.1.1.32 ➡ B.1.1.1.32 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.32");
        relocationCardPage.inputData("product", "32FRAGSN32Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.32");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол33
        relocationCardPage.verifyData("productInfo", "00033 31.12.2022 Стол33 A.1.1.1.33 ➡ B.1.1.1.33 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.33");
        relocationCardPage.inputData("product", "33FRAGSN33Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.33");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол34
        relocationCardPage.verifyData("productInfo", "00034 34Series01 31.12.2022 Стол34 A.1.1.1.34 ➡ B.1.1.1.34 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.34");
        relocationCardPage.inputData("product", "34FRAGSN34Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.34");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол35
        relocationCardPage.verifyData("productInfo", "00035 Стол35 A.1.1.1.35 ➡ B.1.1.1.35 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.35");
        relocationCardPage.inputData("product", "35FRAGBC35Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.35");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол36
        relocationCardPage.verifyData("productInfo", "00036 36Series01 Стол36 A.1.1.1.36 ➡ B.1.1.1.36 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.36");
        relocationCardPage.inputData("product", "36FRAGBC36Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.36");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол37
        relocationCardPage.verifyData("productInfo", "00037 31.12.2022 Стол37 A.1.1.1.37 ➡ B.1.1.1.37 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.37");
        relocationCardPage.inputData("product", "37FRAGBC37Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.37");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол38
        relocationCardPage.verifyData("productInfo", "00038 38Series01 31.12.2022 Стол38 A.1.1.1.38 ➡ B.1.1.1.38 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.38");
        relocationCardPage.inputData("product", "38FRAGBC38Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.38");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол39
        relocationCardPage.verifyData("productInfo", "00039 39Series01 31.12.2022 Стол39 A.1.1.1.39 ➡ B.1.1.1.39 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.39");
        relocationCardPage.inputData("product", "39FRAGSN39Series013112202200");
        relocationCardPage.inputData("destination", "B.1.1.1.39");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол40
        relocationCardPage.verifyData("productInfo", "00040 40Series01 31.12.2022 Стол40 A.1.1.1.40 ➡ B.1.1.1.40 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.40");
        relocationCardPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        relocationCardPage.inputData("destination", "B.1.1.1.40");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    }

    @Test (priority = 6, dependsOnMethods = "taskRelocation")
    public void taskRelocationTSD() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        relocationTSDCardPage.clickButton("rightMenu");
        relocationTSDCardPage.clickButton("relocation");
    //Стол31
        relocationTSDCardPage.inputData("source", "B.1.1.1.31");
        relocationTSDCardPage.inputData("product", "31FRAGSN31Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.31 ➡ 00031 Стол31");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.31 ➡ 00031 Стол31 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.31");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.31 ➡ C.1.1.1.31 00031 Стол31 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол32
        relocationTSDCardPage.inputData("source", "B.1.1.1.32");
        relocationTSDCardPage.inputData("product", "32FRAGSN32Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.32 ➡ 00032 32Series01 Стол32");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.32 ➡ 00032 32Series01 Стол32 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.32");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.32 ➡ C.1.1.1.32 00032 32Series01 Стол32 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол33
        relocationTSDCardPage.inputData("source", "B.1.1.1.33");
        relocationTSDCardPage.inputData("product", "33FRAGSN33Series01311220220003");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.33 ➡ 00033 31.12.2022 Стол33");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.33 ➡ 00033 31.12.2022 Стол33 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.33");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.33 ➡ C.1.1.1.33 00033 31.12.2022 Стол33 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол34
        relocationTSDCardPage.inputData("source", "B.1.1.1.34");
        relocationTSDCardPage.inputData("product", "34FRAGSN34Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.34 ➡ 00034 34Series01 31.12.2022 Стол34");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.34 ➡ 00034 34Series01 31.12.2022 Стол34 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.34");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.34 ➡ C.1.1.1.34 00034 34Series01 31.12.2022 Стол34 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол35
        relocationTSDCardPage.inputData("source", "B.1.1.1.35");
        relocationTSDCardPage.inputData("product", "35FRAGBC35Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.35 ➡ 00035 Стол35");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.35 ➡ 00035 Стол35 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.35");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.35 ➡ C.1.1.1.35 00035 Стол35 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол36
        relocationTSDCardPage.inputData("source", "B.1.1.1.36");
        relocationTSDCardPage.inputData("product", "36FRAGBC36Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.36 ➡ 00036 36Series01 Стол36");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.36 ➡ 00036 36Series01 Стол36 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.36");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.36 ➡ C.1.1.1.36 00036 36Series01 Стол36 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол37
        relocationTSDCardPage.inputData("source", "B.1.1.1.37");
        relocationTSDCardPage.inputData("product", "37FRAGBC37Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.37 ➡ 00037 31.12.2022 Стол37");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.37 ➡ 00037 31.12.2022 Стол37 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.37");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.37 ➡ C.1.1.1.37 00037 31.12.2022 Стол37 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол38
        relocationTSDCardPage.inputData("source", "B.1.1.1.38");
        relocationTSDCardPage.inputData("product", "38FRAGBC38Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.38 ➡ 00038 38Series01 31.12.2022 Стол38");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.38 ➡ 00038 38Series01 31.12.2022 Стол38 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.38");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.38 ➡ C.1.1.1.38 00038 38Series01 31.12.2022 Стол38 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол39
        relocationTSDCardPage.inputData("source", "B.1.1.1.39");
        relocationTSDCardPage.inputData("product", "39FRAGSN39Series013112202200");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.39 ➡ 00039 39Series01 31.12.2022 Стол39");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.39 ➡ 00039 39Series01 31.12.2022 Стол39 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.39");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.39 ➡ C.1.1.1.39 00039 39Series01 31.12.2022 Стол39 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол40
        relocationTSDCardPage.inputData("source", "B.1.1.1.40");
        relocationTSDCardPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.40 ➡ 00040 40Series01 31.12.2022 Стол40");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.40 ➡ 00040 40Series01 31.12.2022 Стол40 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.40");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.40 ➡ C.1.1.1.40 00040 40Series01 31.12.2022 Стол40 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    }

    @Test (priority = 7, dependsOnMethods = "taskRelocationTSD")
    public void taskSelection() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Selection");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол31
        selectionCardPage.verifyData("productInfo", "00031 Стол31 C.1.1.1.31 ➡ KT1.01.01.01.01 Quantity 10 уп. (5)");
        selectionCardPage.inputData("source", "C.1.1.1.31");
        selectionCardPage.inputData("product", "31FRAGSN31Series013112202200");
        mobileFormSerialNumber.sn("31", 10);
        selectionCardPage.inputData("destination", "OUT131");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол32
        selectionCardPage.verifyData("productInfo", "00032 32series01 Стол32 C.1.1.1.32 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.32");
        selectionCardPage.inputData("product", "32FRAGSN32Series013112202200");
        mobileFormSerialNumber.sn("32", 10);
        selectionCardPage.inputData("destination", "OUT132");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол33
        selectionCardPage.verifyData("productInfo", "00033 31.12.2022 Стол33 C.1.1.1.33 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.33");
        selectionCardPage.inputData("product", "33FRAGSN33Series013112202200");
        mobileFormSerialNumber.sn("33", 10);
        selectionCardPage.inputData("destination", "OUT133");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол34
        selectionCardPage.verifyData("productInfo", "00034 34series01 31.12.2022 Стол34 C.1.1.1.34 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.34");
        selectionCardPage.inputData("product", "34FRAGSN34Series013112202200");
        mobileFormSerialNumber.sn("34", 10);
        selectionCardPage.inputData("destination", "OUT134");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол35
        selectionCardPage.verifyData("productInfo", "00035 Стол35 C.1.1.1.35 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.35");
        selectionCardPage.inputData("product", "35FRAGBC35Series013112202200");
        selectionCardPage.inputData("destination", "OUT135");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол36
        selectionCardPage.verifyData("productInfo", "00036 36series01 Стол36 C.1.1.1.36 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.36");
        selectionCardPage.inputData("product", "36FRAGBC36Series013112202200");
        selectionCardPage.inputData("destination", "OUT136");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол37
        selectionCardPage.verifyData("productInfo", "00037 31.12.2022 Стол37 C.1.1.1.37 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.37");
        selectionCardPage.inputData("product", "37FRAGBC37Series013112202200");
        selectionCardPage.inputData("destination", "OUT137");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол38
        selectionCardPage.verifyData("productInfo", "00038 38series01 31.12.2022 Стол38 C.1.1.1.38 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.38");
        selectionCardPage.inputData("product", "38FRAGBC38Series013112202200");
        selectionCardPage.inputData("destination", "OUT138");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол39
        selectionCardPage.verifyData("productInfo", "00039 39series01 31.12.2022 Стол39 C.1.1.1.39 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.39");
        selectionCardPage.inputData("product", "39FRAGSN39Series013112202200");
        mobileFormSerialNumber.uniqueSn("39", 9);
        selectionCardPage.inputData("destination", "OUT139");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол40
        selectionCardPage.verifyData("productInfo", "00040 40Series01 31.12.2022 Стол40 C.1.1.1.40 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.40");
        selectionCardPage.inputData("product", "40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        mobileFormSerialNumber.qr("40", 7);
        selectionCardPage.inputData("destination", "OUT140");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    }

    @Test (priority = 8, dependsOnMethods = "taskSelection")
    public void taskContainer() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Контейнер (Selection)");
        allTasksPage.getWorkTypeTasksQuantity().click();

        mobileFormContainer.completeTask("OUT131", "CON/OUT131 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT132", "CON/OUT132 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT133", "CON/OUT133 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT134", "CON/OUT134 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT135", "CON/OUT135 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT136", "CON/OUT136 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT137", "CON/OUT137 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT138", "CON/OUT138 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT139", "CON/OUT139 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT140", "CON/OUT140 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
    }

    @Test (priority = 9, dependsOnMethods = "taskContainer")
    public void taskControl() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Control");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол31
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT131");
        controlCardPage.verifyData("productInfo", "00031 Стол31");
        controlCardPage.verifyData("containerInfo", "OUT131");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","31FRAGSN31Series013112202200");
        mobileFormSerialNumber.sn("31", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол32
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT132");
        controlCardPage.verifyData("productInfo", "00032 Стол32");
        controlCardPage.verifyData("containerInfo", "OUT132");
        controlCardPage.verifyData("seriesInfo", "32Series01");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","32FRAGSN32Series013112202200");
        mobileFormSerialNumber.sn("32", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол33
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT133");
        controlCardPage.verifyData("productInfo", "00033 Стол33");
        controlCardPage.verifyData("containerInfo", "OUT133");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","33FRAGSN33Series013112202200");
        mobileFormSerialNumber.sn("33", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол34
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT134");
        controlCardPage.verifyData("productInfo", "00034 Стол34");
        controlCardPage.verifyData("containerInfo", "OUT134");
        controlCardPage.verifyData("seriesInfo", "34Series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","34FRAGSN34Series013112202200");
        mobileFormSerialNumber.sn("34", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол35
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT135");
        controlCardPage.verifyData("productInfo", "00035 Стол35");
        controlCardPage.verifyData("containerInfo", "OUT135");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","35FRAGBC35Series013112202200");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол36
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT136");
        controlCardPage.verifyData("productInfo", "00036 Стол36");
        controlCardPage.verifyData("containerInfo", "OUT136");
        controlCardPage.verifyData("seriesInfo", "36Series01");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","36FRAGBC36Series013112202200");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол37
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT137");
        controlCardPage.verifyData("productInfo", "00037 Стол37");
        controlCardPage.verifyData("containerInfo", "OUT137");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","37FRAGBC37Series013112202200");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол38
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT138");
        controlCardPage.verifyData("productInfo", "00038 Стол38");
        controlCardPage.verifyData("containerInfo", "OUT138");
        controlCardPage.verifyData("seriesInfo", "38Series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","38FRAGBC38Series013112202200");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол39
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT139");
        controlCardPage.verifyData("productInfo", "00039 Стол39");
        controlCardPage.verifyData("containerInfo", "OUT139");
        controlCardPage.verifyData("seriesInfo", "39Series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","39FRAGSN39Series013112202200");
        mobileFormSerialNumber.uniqueSn("39", 9);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    //Стол40
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT140");
        controlCardPage.verifyData("productInfo", "00040 Стол40");
        controlCardPage.verifyData("containerInfo", "OUT140");
        controlCardPage.verifyData("seriesInfo", "40Series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","40FRAGSN40Series013112202207 40FRAGSN40Series013112202208 40FRAGSN40Series013112202209");
        mobileFormSerialNumber.qr("40", 7);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.clickButton("commit");
    }

    @Test (priority = 10, dependsOnMethods = "taskControl")
    public void taskPackaging() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Packaging");
        allTasksPage.getWorkTypeTasksQuantity().click();

        packagingCardPage.inputData("#container", "KT1.01.01.01.01");
        packagingCardPage.checkCellProductInfoInRow2(1, "OUT131", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(2, "OUT132", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(3, "OUT133", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(4, "OUT134", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(5, "OUT135", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(6, "OUT136", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(7, "OUT137", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(8, "OUT138", "10", "0.1", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(9, "OUT139", "10", "1", "1", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(10, "OUT140", "10", "0.1", "10", "1", "1");

        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    }

    @Test (priority = 11, dependsOnMethods = "taskPackaging")
    public void taskLoading() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Loading");
        allTasksPage.getWorkTypeTasksQuantity().click();

        loadingCardPage.inputData("#routeSheet", "I000000001");
        loadingCardPage.verifyData("#routeSheet", "I000000001");
        loadingCardPage.inputData("#gate", "OUT.01");
        loadingCardPage.checkLoadingInfo("5", "Костенко", "0", "10");
        loadingCardPage.setSerialCargoInput("9990000000012", "9990000000029", "9990000000036", "9990000000043", "9990000000050", "9990000000067", "9990000000074", "9990000000081", "9990000000098", "9990000000104");
        loadingCardPage.checkLoadingInfo("5", "Костенко", "10", "0");
        loadingCardPage.clickButton("#commit");
    }
}