package mobile.mobileCase.mobileCase2;

import mobile.mobileForm.*;
import mobile.mobilePagesRefactor.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import mobile.mobileUtils.BaseMobileClass;
import mobile.mobileUtils.MobileData;
import web.webCase.WebDownloadMobileTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;

public class MobileCaseTwo extends BaseMobileClass {
    AllTasksPage allTasksPage = new AllTasksPage();
    FindRestsPage findRestsPage = new FindRestsPage();
    SelectionCardPage selectionCardPage = new SelectionCardPage();
    ControlCardPage controlCardPage = new ControlCardPage();
    PackagingCardPage packagingCardPage = new PackagingCardPage();
    LoadingCardPage loadingCardPage = new LoadingCardPage();
    ConsolidateContainerPage consolidateContainerPage = new ConsolidateContainerPage();
    InventoryCardPage inventoryCardPage = new InventoryCardPage();
    RelocationCardPage relocationCardPage = new RelocationCardPage();
    RelocationTSDCardPage relocationTSDCardPage = new RelocationTSDCardPage();
    MobileFormBatchProperties mobileFormBatchProperties = new MobileFormBatchProperties();
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
        webDownloadMobileTest.completeTask("2");
    }

    @Test
    public void taskReception() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Reception");
        allTasksPage.getWorkTypeTasksQuantity().click();

        MobileData stol11 = mobileData.dataReception("stol11");
        MobileData stol12 = mobileData.dataReception("stol12");
        MobileData stol13 = mobileData.dataReception("stol13");
        MobileData stol14 = mobileData.dataReception("stol14");
        MobileData stol15 = mobileData.dataReception("stol15");
        MobileData stol16 = mobileData.dataReception("stol16");
        MobileData stol17 = mobileData.dataReception("stol17");
        MobileData stol18 = mobileData.dataReception("stol18");
        MobileData stol19 = mobileData.dataReception("stol19");
        MobileData stol20 = mobileData.dataReception("stol20");

    //Стол11
        mobileFormReception.completeTask(stol11);
    //Стол12
        mobileFormReception.completeTask(stol12);
    //Стол13
        mobileFormReception.completeTask(stol13);
    //Стол14
        mobileFormReception.completeTask(stol14);
    //Стол15
        mobileFormReception.completeTask(stol15);
    //Стол16
        mobileFormReception.completeTask(stol16);
    //Стол17
        mobileFormReception.completeTask(stol17);
    //Стол18
        mobileFormReception.completeTask(stol18);
    //Стол19
        mobileFormReception.completeTask(stol19);
    //Стол20
        mobileFormReception.completeTask(stol20);
    }

    @Test (priority = 1, dependsOnMethods = "taskReception")
    public void taskAccommodation() throws Exception {
        MobileData stol11 = mobileData.dataAccommodation("stol11");
        MobileData stol12 = mobileData.dataAccommodation("stol12");
        MobileData stol13 = mobileData.dataAccommodation("stol13");
        MobileData stol14 = mobileData.dataAccommodation("stol14");
        MobileData stol15 = mobileData.dataAccommodation("stol15");
        MobileData stol16 = mobileData.dataAccommodation("stol16");
        MobileData stol17 = mobileData.dataAccommodation("stol17");
        MobileData stol18 = mobileData.dataAccommodation("stol18");
        MobileData stol19 = mobileData.dataAccommodation("stol19");
        MobileData stol20 = mobileData.dataAccommodation("stol20");

        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Accommodation");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол11
        mobileFormAccommodation.completeTask(stol11);
    //Стол12
        mobileFormAccommodation.completeTask(stol12);
    //Стол13
        mobileFormAccommodation.completeTask(stol13);
    //Стол14
        mobileFormAccommodation.completeTask(stol14);
    //Стол15
        mobileFormAccommodation.completeTask(stol15);
    //Стол16
        mobileFormAccommodation.completeTask(stol16);
    //Стол17
        mobileFormAccommodation.completeTask(stol17);
    //Стол18
        mobileFormAccommodation.completeTask(stol18);
    //Стол19
        mobileFormAccommodation.completeTask(stol19);
    //Стол20
        mobileFormAccommodation.completeTask(stol20);
    }

    @Test (priority = 2, dependsOnMethods = "taskAccommodation")
    public void taskFindRests() {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол11
        findRestsPage.inputData("product", "11fragbc");
        findRestsPage.verifyData("productInfo", "00011 Стол11");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.11");
        findRestsPage.verifyData("qty", "10");
    //Стол12
        findRestsPage.inputData("product", "12fragbc");
        findRestsPage.verifyData("productInfo", "00012 Стол12");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.12");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "12Series01");
    //Стол13
        findRestsPage.inputData("product", "13fragbc");
        findRestsPage.verifyData("productInfo", "00013 Стол13");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.13");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол14
        findRestsPage.inputData("product", "14fragbc");
        findRestsPage.verifyData("productInfo", "00014 Стол14");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.14");
        findRestsPage.verifyData("qty", "10");
    //Стол15
        findRestsPage.inputData("product", "15fragbc");
        findRestsPage.verifyData("productInfo", "00015 Стол15");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.15");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "15series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол16
        findRestsPage.inputData("product", "16fragbc");
        findRestsPage.verifyData("productInfo", "00016 Стол16");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.16");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "16series01");
    //Стол17
        findRestsPage.inputData("product", "17fragbc");
        findRestsPage.verifyData("productInfo", "00017 Стол17");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.17");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол18
        findRestsPage.inputData("product", "18fragbc");
        findRestsPage.verifyData("productInfo", "00018 Стол18");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.18");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "18series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол19
        findRestsPage.inputData("product", "19fragbc");
        findRestsPage.verifyData("productInfo", "00019 Стол19");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.19");
        findRestsPage.verifyData("qty", "10");
    //Стол20
        findRestsPage.inputData("product", "20fragbc");
        findRestsPage.verifyData("productInfo", "00020 Стол20");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.20");
        findRestsPage.verifyData("qty", "10");
    }

    @Test (priority = 3, dependsOnMethods = "taskAccommodation")
    public void taskInventory() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.getStringTasks(2).click();
    //Стол11
        inventoryCardPage.inputData("source", "A.1.1.1.11");
        inventoryCardPage.inputData("product", "11fragbc");
        inventoryCardPage.verifyData("productInfo", "00011 Стол11");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00011 Стол11");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол12
        inventoryCardPage.inputData("source", "A.1.1.1.12");
        inventoryCardPage.inputData("product", "12fragbc");
        mobileFormBatchProperties.select(true, false,"12Series01","");
        inventoryCardPage.verifyData("productInfo", "00012 12Series01 Стол12");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол13
        inventoryCardPage.inputData("source", "A.1.1.1.13");
        inventoryCardPage.inputData("product", "13fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "00013 31.12.2022 Стол13");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00013 31.12.2022 Стол13");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол14
        inventoryCardPage.inputData("source", "A.1.1.1.14");
        inventoryCardPage.inputData("product", "14fragbc");
        inventoryCardPage.verifyData("productInfo", "00014 Стол14");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00014 Стол14");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол15
        inventoryCardPage.inputData("source", "A.1.1.1.15");
        inventoryCardPage.inputData("product", "15fragbc");
        mobileFormBatchProperties.select(true,true,"15series01","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "00015 15series01 31.12.2022 Стол15");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00015 15series01 31.12.2022 Стол15");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол16
        inventoryCardPage.inputData("source", "A.1.1.1.16");
        inventoryCardPage.inputData("product", "16fragbc");
        mobileFormBatchProperties.select(true,false,"16series01","");
        inventoryCardPage.verifyData("productInfo", "00016 16series01 Стол16");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00016 16series01 Стол16");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол17
        inventoryCardPage.inputData("source", "A.1.1.1.17");
        inventoryCardPage.inputData("product", "17fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "00017 31.12.2022 Стол17");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00017 31.12.2022 Стол17");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол18
        inventoryCardPage.inputData("source", "A.1.1.1.18");
        inventoryCardPage.inputData("product", "18fragbc");
        mobileFormBatchProperties.select(true,true,"18series01","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "00018 18series01 31.12.2022 Стол18");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00018 18series01 31.12.2022 Стол18");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол19
        inventoryCardPage.inputData("source", "A.1.1.1.19");
        inventoryCardPage.inputData("product", "19fragbc");
        inventoryCardPage.verifyData("productInfo", "00019 Стол19");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00019 Стол19");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол20
        inventoryCardPage.inputData("source", "A.1.1.1.20");
        inventoryCardPage.inputData("product", "20fragbc");
        inventoryCardPage.verifyData("productInfo", "00020 Стол20");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00020 Стол20");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    }

    @Test (priority = 4, dependsOnMethods = "taskInventory")
    public void taskFindRestsAfterInventory() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол11
        findRestsPage.inputData("product", "11fragbc");
        findRestsPage.verifyData("productInfo", "00011 Стол11");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.11");
        findRestsPage.verifyData("qty", "10");
    //Стол12
        findRestsPage.inputData("product", "12fragbc");
        findRestsPage.verifyData("productInfo", "00012 Стол12");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.12");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "12Series01");
    //Стол13
        findRestsPage.inputData("product", "13fragbc");
        findRestsPage.verifyData("productInfo", "00013 Стол13");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.13");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол14
        findRestsPage.inputData("product", "14fragbc");
        findRestsPage.verifyData("productInfo", "00014 Стол14");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.14");
        findRestsPage.verifyData("qty", "10");
    //Стол15
        findRestsPage.inputData("product", "15fragbc");
        findRestsPage.verifyData("productInfo", "00015 Стол15");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.15");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "15series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол16
        findRestsPage.inputData("product", "16fragbc");
        findRestsPage.verifyData("productInfo", "00016 Стол16");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.16");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "16series01");
    //Стол17
        findRestsPage.inputData("product", "17fragbc");
        findRestsPage.verifyData("productInfo", "00017 Стол17");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.17");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол18
        findRestsPage.inputData("product", "18fragbc");
        findRestsPage.verifyData("productInfo", "00018 Стол18");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.18");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "18series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол19
        findRestsPage.inputData("product", "19fragbc");
        findRestsPage.verifyData("productInfo", "00019 Стол19");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.19");
        findRestsPage.verifyData("qty", "10");
    //Стол20
        findRestsPage.inputData("product", "20fragbc");
        findRestsPage.verifyData("productInfo", "00020 Стол20");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.20");
        findRestsPage.verifyData("qty", "10");
    }

    @Test (priority = 5, dependsOnMethods = "taskAccommodation")
    public void taskRelocation() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Moving");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол11
        relocationCardPage.verifyData("productInfo", "00011 Стол11 A.1.1.1.11 ➡ B.1.1.1.11 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.11");
        relocationCardPage.inputData("product", "11fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.11");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол12
        relocationCardPage.verifyData("productInfo", "00012 12Series01 Стол12 A.1.1.1.12 ➡ B.1.1.1.12 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.12");
        relocationCardPage.inputData("product", "12fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.12");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол13
        relocationCardPage.verifyData("productInfo", "00013 31.12.2022 Стол13 A.1.1.1.13 ➡ B.1.1.1.13 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.13");
        relocationCardPage.inputData("product", "13fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.13");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол14
        relocationCardPage.verifyData("productInfo", "00014 Стол14 A.1.1.1.14 ➡ B.1.1.1.14 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.14");
        relocationCardPage.inputData("product", "14fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.14");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол15
        relocationCardPage.verifyData("productInfo", "00015 15series01 31.12.2022 Стол15 A.1.1.1.15 ➡ B.1.1.1.15 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.15");
        relocationCardPage.inputData("product", "15fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.15");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол16
        relocationCardPage.verifyData("productInfo", "00016 16series01 Стол16 A.1.1.1.16 ➡ B.1.1.1.16 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.16");
        relocationCardPage.inputData("product", "16fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.16");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол17
        relocationCardPage.verifyData("productInfo", "00017 31.12.2022 Стол17 A.1.1.1.17 ➡ B.1.1.1.17 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.17");
        relocationCardPage.inputData("product", "17fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.17");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол18
        relocationCardPage.verifyData("productInfo", "00018 18series01 31.12.2022 Стол18 A.1.1.1.18 ➡ B.1.1.1.18 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.18");
        relocationCardPage.inputData("product", "18fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.18");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол19
        relocationCardPage.verifyData("productInfo", "00019 Стол19 A.1.1.1.19 ➡ B.1.1.1.19 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.19");
        relocationCardPage.inputData("product", "19fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.19");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол20
        relocationCardPage.verifyData("productInfo", "00020 Стол20 A.1.1.1.20 ➡ B.1.1.1.20 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.20");
        relocationCardPage.inputData("product", "20fragbc");
        relocationCardPage.inputData("destination", "B.1.1.1.20");
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
    //Стол11
        relocationTSDCardPage.inputData("source", "B.1.1.1.11");
        relocationTSDCardPage.inputData("product", "11fragbc");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.11 ➡ 00011 Стол11");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.11 ➡ 00011 Стол11 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.11");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.11 ➡ C.1.1.1.11 00011 Стол11 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол12
        relocationTSDCardPage.inputData("source", "B.1.1.1.12");
        relocationTSDCardPage.inputData("product", "12fragbc");
        mobileFormBatchProperties.select(true,false,"12series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.12 ➡ 00012 12Series01 Стол12");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.12 ➡ 00012 12Series01 Стол12 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.12");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.12 ➡ C.1.1.1.12 00012 12Series01 Стол12 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол13
        relocationTSDCardPage.inputData("source", "B.1.1.1.13");
        relocationTSDCardPage.inputData("product", "13fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.13 ➡ 00013 31.12.2022 Стол13");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.13 ➡ 00013 31.12.2022 Стол13 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.13");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.13 ➡ C.1.1.1.13 00013 31.12.2022 Стол13 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол14
        relocationTSDCardPage.inputData("source", "B.1.1.1.14");
        relocationTSDCardPage.inputData("product", "14fragbc");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.14 ➡ 00014 Стол14");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.14 ➡ 00014 Стол14 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.14");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.14 ➡ C.1.1.1.14 00014 Стол14 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол15
        relocationTSDCardPage.inputData("source", "B.1.1.1.15");
        relocationTSDCardPage.inputData("product", "15fragbc");
        mobileFormBatchProperties.select(true,false,"15Series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.15 ➡ 00015 15Series01 31.12.2022 Стол15");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.15 ➡ 00015 15Series01 31.12.2022 Стол15 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.15");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.15 ➡ C.1.1.1.15 00015 15Series01 31.12.2022 Стол15 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол16
        relocationTSDCardPage.inputData("source", "B.1.1.1.16");
        relocationTSDCardPage.inputData("product", "16fragbc");
        mobileFormBatchProperties.select(true,false,"16series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.16 ➡ 00016 16series01 Стол16");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.16 ➡ 00016 16series01 Стол16 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.16");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.16 ➡ C.1.1.1.16 00016 16series01 Стол16 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол17
        relocationTSDCardPage.inputData("source", "B.1.1.1.17");
        relocationTSDCardPage.inputData("product", "17fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.17 ➡ 00017 31.12.2022 Стол17");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.17 ➡ 00017 31.12.2022 Стол17 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.17");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.17 ➡ C.1.1.1.17 00017 31.12.2022 Стол17 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол18
        relocationTSDCardPage.inputData("source", "B.1.1.1.18");
        relocationTSDCardPage.inputData("product", "18fragbc");
        mobileFormBatchProperties.select(true,false,"18series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.18 ➡ 00018 18series01 31.12.2022 Стол18");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.18 ➡ 00018 18series01 31.12.2022 Стол18 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.18");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.18 ➡ C.1.1.1.18 00018 18series01 31.12.2022 Стол18 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол19
        relocationTSDCardPage.inputData("source", "B.1.1.1.19");
        relocationTSDCardPage.inputData("product", "19fragbc");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.19 ➡ 00019 Стол19");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.19 ➡ 00019 Стол19 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.19");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.19 ➡ C.1.1.1.19 00019 Стол19 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол20
        relocationTSDCardPage.inputData("source", "B.1.1.1.20");
        relocationTSDCardPage.inputData("product", "20fragbc");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.20 ➡ 00020 Стол20");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.20 ➡ 00020 Стол20 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.20");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.20 ➡ C.1.1.1.20 00020 Стол20 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    }

    @Test (priority = 7, dependsOnMethods = "taskRelocationTSD")
    public void taskSelection() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Selection");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол11
        selectionCardPage.verifyData("productInfo", "00011 Стол11 C.1.1.1.11 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.11");
        selectionCardPage.inputData("product", "11fragbc");
        selectionCardPage.inputData("destination", "OUT111");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол12
        selectionCardPage.verifyData("productInfo", "00012 12Series01 Стол12 C.1.1.1.12 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.12");
        selectionCardPage.inputData("product", "12fragbc");
        selectionCardPage.inputData("destination", "OUT112");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол13
        selectionCardPage.verifyData("productInfo", "00013 31.12.2022 Стол13 C.1.1.1.13 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.13");
        selectionCardPage.inputData("product", "13fragbc");
        selectionCardPage.inputData("destination", "OUT113");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол14
        selectionCardPage.verifyData("productInfo", "00014 Стол14 C.1.1.1.14 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.14");
        selectionCardPage.inputData("product", "14fragbc");
        mobileFormSerialNumber.normal("14", 10);
        selectionCardPage.inputData("destination", "OUT114");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол15
        selectionCardPage.verifyData("productInfo", "00015 15series01 31.12.2022 Стол15 C.1.1.1.15 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.15");
        selectionCardPage.inputData("product", "15fragbc");
        selectionCardPage.inputData("destination", "OUT115");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол16
        selectionCardPage.verifyData("productInfo", "00016 16series01 Стол16 C.1.1.1.16 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.16");
        selectionCardPage.inputData("product", "16fragbc");
        mobileFormSerialNumber.normal("16", 10);
        selectionCardPage.inputData("destination", "OUT116");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол17
        selectionCardPage.verifyData("productInfo", "00017 31.12.2022 Стол17 C.1.1.1.17 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.17");
        selectionCardPage.inputData("product", "17fragbc");
        mobileFormSerialNumber.normal("17", 10);
        selectionCardPage.inputData("destination", "OUT117");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол18
        selectionCardPage.verifyData("productInfo", "00018 18series01 31.12.2022 Стол18 C.1.1.1.18 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.18");
        selectionCardPage.inputData("product", "18fragbc");
        mobileFormSerialNumber.normal("18", 10);
        selectionCardPage.inputData("destination", "OUT118");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол19
        selectionCardPage.verifyData("productInfo", "00019 Стол19 C.1.1.1.19 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.19");
        selectionCardPage.inputData("product", "19fragbc");
        mobileFormSerialNumber.unique("19", 10);
        selectionCardPage.inputData("destination", "OUT119");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол20
        selectionCardPage.verifyData("productInfo", "00020 Стол20 C.1.1.1.20 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.20");
        selectionCardPage.inputData("product", "20fragbc");
        selectionCardPage.inputData("destination", "OUT120");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    }

    @Test (priority = 8, dependsOnMethods = "taskSelection")
    public void taskContainer() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Контейнер (Selection)");
        allTasksPage.getWorkTypeTasksQuantity().click();

        mobileFormContainer.completeTask("OUT111", "CON/OUT111 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT112", "CON/OUT112 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT113", "CON/OUT113 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT114", "CON/OUT114 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT115", "CON/OUT115 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT116", "CON/OUT116 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT117", "CON/OUT117 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT118", "CON/OUT118 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT119", "CON/OUT119 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT120", "CON/OUT120 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
    }

    @Test (priority = 9, dependsOnMethods = "taskContainer")
    public void taskControl() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Control");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол11
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT111");
        controlCardPage.verifyData("productInfo", "00011 Стол11");
        controlCardPage.verifyData("containerInfo", "OUT111");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","11fragbc");
        controlCardPage.inputData("qty","10");
        controlCardPage.clickButton("commit");
    //Стол12
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT112");
        controlCardPage.verifyData("productInfo", "00012 Стол12");
        controlCardPage.verifyData("containerInfo", "OUT112");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","12fragbc");
        mobileFormBatchProperties.select(true,false,"12Series01","");
        controlCardPage.verifyData("seriesInfo", "12Series01");
        controlCardPage.inputData("qty","10");
        controlCardPage.clickButton("commit");
    //Стол13
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT113");
        controlCardPage.verifyData("productInfo", "00013 Стол13");
        controlCardPage.verifyData("containerInfo", "OUT113");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","13fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        controlCardPage.inputData("qty","10");
        controlCardPage.clickButton("commit");
    //Стол14
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT114");
        controlCardPage.verifyData("productInfo", "00014 Стол14");
        controlCardPage.verifyData("containerInfo", "OUT114");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","14fragbc");
        mobileFormSerialNumber.normal("14", 10);
        controlCardPage.clickButton("commit");
    //Стол15
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT115");
        controlCardPage.verifyData("productInfo", "00015 Стол15");
        controlCardPage.verifyData("containerInfo", "OUT115");
        controlCardPage.verifyData("seriesInfo", "15series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","15fragbc");
        mobileFormBatchProperties.select(true,false,"15series01","");
        controlCardPage.inputData("qty","10");
        controlCardPage.clickButton("commit");
    //Стол16
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT116");
        controlCardPage.verifyData("productInfo", "00016 Стол16");
        controlCardPage.verifyData("containerInfo", "OUT116");
        controlCardPage.verifyData("seriesInfo", "16series01");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","16fragbc");
        mobileFormBatchProperties.select(true,false,"16series01","");
        mobileFormSerialNumber.normal("16", 10);
        controlCardPage.clickButton("commit");
    //Стол17
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT117");
        controlCardPage.verifyData("productInfo", "00017 Стол17");
        controlCardPage.verifyData("containerInfo", "OUT117");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","17fragbc");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        mobileFormSerialNumber.normal("17", 10);
        controlCardPage.clickButton("commit");
    //Стол18
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT118");
        controlCardPage.verifyData("productInfo", "00018 Стол18");
        controlCardPage.verifyData("containerInfo", "OUT118");
        controlCardPage.verifyData("seriesInfo", "18series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","18fragbc");
        mobileFormBatchProperties.select(true,true,"18series01","31.12.2022");
        mobileFormSerialNumber.normal("18", 10);
        controlCardPage.clickButton("commit");
    //Стол19
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT119");
        controlCardPage.verifyData("productInfo", "00019 Стол19");
        controlCardPage.verifyData("containerInfo", "OUT119");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","19fragbc");
        mobileFormSerialNumber.unique("19", 10);
        controlCardPage.clickButton("commit");
    //Стол20
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT120");
        controlCardPage.verifyData("productInfo", "00020 Стол20");
        controlCardPage.verifyData("containerInfo", "OUT120");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","20fragbc");
        controlCardPage.inputData("qty","10");
        controlCardPage.clickButton("commit");
    }

    @Test (priority = 10, dependsOnMethods = "taskControl")
    public void taskPackaging() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Packaging");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол11
        packagingCardPage.inputData("#container", "OUT111");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT111", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол12
        packagingCardPage.inputData("#container", "OUT112");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT112", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол13
        packagingCardPage.inputData("#container", "OUT113");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT113", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол14
        packagingCardPage.inputData("#container", "OUT114");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT114", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол15
        packagingCardPage.inputData("#container", "OUT115");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT115", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол16
        packagingCardPage.inputData("#container", "OUT116");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT116", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол17
        packagingCardPage.inputData("#container", "OUT117");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT117", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол18
        packagingCardPage.inputData("#container", "OUT118");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT118", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол19
        packagingCardPage.inputData("#container", "OUT119");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT119", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    //Стол20
        packagingCardPage.inputData("#container", "OUT120");
        packagingCardPage.checkCellProductInfoInRow(1, "OUT120", "10", "0.1", "10");
        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    }

    @Test (priority = 11, dependsOnMethods = "taskPackaging")
    public void taskMergeContainer() {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectConsolidateContainerMenu();
        consolidateContainerPage.setSeveralConsolidateContainer(true);
        consolidateContainerPage.setContainerSeveralTimes("9990000000012", "9990000000029", "9990000000036", "9990000000043", "9990000000050", "9990000000067", "9990000000074", "9990000000081", "9990000000098", "9990000000104");
        //MNV need to refactor. Проблема с методом поиска елемента
        /*        consolidateContainerPage.checkAllProductsInfoAndQty(1, "9990000000012", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(2, "9990000000029", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(3, "9990000000036", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(4, "9990000000043", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(5, "9990000000050", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(6, "9990000000067", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(7, "9990000000074", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(8, "9990000000081", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(9, "9990000000098", "Костенко (count 10/countprod. 1) -->");
        consolidateContainerPage.checkAllProductsInfoAndQty(10, "9990000000104", "Костенко (count 10/countprod. 1) -->");*/
        //MNV need to refactor
        consolidateContainerPage.setCreateConsolidateContainer(true);
        consolidateContainerPage.getReceiverInput().shouldBe(disabled);
        consolidateContainerPage.clickConsolidateButton();
    }

    @Test (priority = 12, dependsOnMethods = "taskMergeContainer")
    public void taskLoading() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Loading");
        allTasksPage.getWorkTypeTasksQuantity().click();

        loadingCardPage.inputData("#routeSheet", "I000000001");
        loadingCardPage.verifyData("#routeSheet", "I000000001");
        loadingCardPage.inputData("#gate", "OUT.01");
        loadingCardPage.checkLoadingInfo("0", "Костенко", "0", "1");
        loadingCardPage.inputData("#cargo", "9990000000111");
        loadingCardPage.checkLoadingInfo("0", "Костенко", "1", "0");
        loadingCardPage.clickButton("#commit");
    }
}
