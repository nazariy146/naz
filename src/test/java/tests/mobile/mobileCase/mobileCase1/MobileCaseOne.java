package tests.mobile.mobileCase.mobileCase1;

import org.testng.annotations.Test;
import tests.mobile.mobileForm.MobileFormBatchProperties;
import tests.mobile.mobileForm.*;
import tests.mobile.mobileUtils.BaseMobileClass;
import tests.mobile.mobilePagesRefactor.*;
import tests.mobile.mobileSteps.MobileSteps;
import tests.mobile.mobileUtils.MobileData;

import static com.codeborne.selenide.Condition.*;

public class MobileCaseOne extends BaseMobileClass {
    MobileSteps mobileSteps = new MobileSteps();
    AllTasksPage allTasksPage = new AllTasksPage();
    ReceptionCardPage receptionCardPage = new ReceptionCardPage();
    AccommodationCardPage accommodationCardPage = new AccommodationCardPage();
    FindRestsPage findRestsPage = new FindRestsPage();
    SelectionCardPage selectionCardPage = new SelectionCardPage();
    ControlCardPage controlCardPage = new ControlCardPage();
    PackagingCardPage packagingCardPage = new PackagingCardPage();
    LoadingCardPage loadingCardPage = new LoadingCardPage();
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

    @Test
    public void processingReceptionTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Reception");
        allTasksPage.getWorkTypeTasksQuantity().click();

        MobileData stol1 = mobileData.dataReceptionCardPage("stol1");
        MobileData stol2 = mobileData.dataReceptionCardPage("stol2");
        MobileData stol3 = mobileData.dataReceptionCardPage("stol3");
        MobileData stol4 = mobileData.dataReceptionCardPage("stol4");
        MobileData stol5 = mobileData.dataReceptionCardPage("stol5");
        MobileData stol6 = mobileData.dataReceptionCardPage("stol6");
        MobileData stol7 = mobileData.dataReceptionCardPage("stol7");
        MobileData stol8 = mobileData.dataReceptionCardPage("stol8");
        MobileData stol9 = mobileData.dataReceptionCardPage("stol9");
        MobileData stol10 = mobileData.dataReceptionCardPage("stol10");
    //Стол1
        mobileFormReception.completeTask(stol1);
    //Стол10
        mobileFormReception.completeTask(stol10);
    //Стол2
        mobileFormReception.completeTask(stol2);
    //Стол3
        mobileFormReception.completeTask(stol3);
    //Стол4
        mobileFormReception.completeTask(stol4);
    //Стол5
        mobileFormReception.completeTask(stol5);
    //Стол6
        mobileFormReception.completeTask(stol6);
    //Стол7
        mobileFormReception.completeTask(stol7);
    //Стол8
        mobileFormReception.completeTask(stol8);
    //Стол9
        mobileFormReception.completeTask(stol9);
    }

    @Test (priority = 1, dependsOnMethods = "processingReceptionTaskTest")
    public void processingAccommodationTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Accommodation");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол1
        accommodationCardPage.verifyData("productInfo", "0001 Стол1 IN.01 ➡ A.1.1.1.1 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0001");
        accommodationCardPage.inputData("destination","A.1.1.1.1");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол2
        accommodationCardPage.verifyData("productInfo", "0002 02series01 Стол2 IN.01 ➡ A.1.1.1.2 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0002");
        accommodationCardPage.inputData("destination","A.1.1.1.2");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол3
        accommodationCardPage.verifyData("productInfo", "0003 31.12.2022 Стол3 IN.01 ➡ A.1.1.1.3 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0003");
        accommodationCardPage.inputData("destination","A.1.1.1.3");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол4
        accommodationCardPage.verifyData("productInfo", "0004 Стол4 IN.01 ➡ A.1.1.1.4 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0004");
        accommodationCardPage.inputData("destination","A.1.1.1.4");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол5
        accommodationCardPage.verifyData("productInfo", "0005 05series01 31.12.2022 Стол5 IN.01 ➡ A.1.1.1.5 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0005");
        accommodationCardPage.inputData("destination","A.1.1.1.5");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол6
        accommodationCardPage.verifyData("productInfo", "0006 06series01 Стол6 IN.01 ➡ A.1.1.1.6 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0006");
        accommodationCardPage.inputData("destination","A.1.1.1.6");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол7
        accommodationCardPage.verifyData("productInfo", "0007 31.12.2022 Стол7 IN.01 ➡ A.1.1.1.7 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0007");
        accommodationCardPage.inputData("destination","A.1.1.1.7");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол8
        accommodationCardPage.verifyData("productInfo", "0008 08series01 31.12.2022 Стол8 IN.01 ➡ A.1.1.1.8 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0008");
        accommodationCardPage.inputData("destination","A.1.1.1.8");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол9
        accommodationCardPage.verifyData("productInfo", "0009 Стол9 IN.01 ➡ A.1.1.1.9 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","0009");
        accommodationCardPage.inputData("destination","A.1.1.1.9");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    //Стол10
        accommodationCardPage.verifyData("productInfo", "00010 Стол10 IN.01 ➡ A.1.1.1.10 Quantity 10 шт");
        accommodationCardPage.inputData("source","IN1");
        accommodationCardPage.inputData("product","00010");
        accommodationCardPage.inputData("destination","A.1.1.1.10");
        accommodationCardPage.inputData("qty","10");
        accommodationCardPage.clickButton("commit");
    }

    @Test (priority = 2, dependsOnMethods = "processingAccommodationTaskTest")
    public void checkingFreeAmountTest() {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол1
        findRestsPage.inputData("product", "0001");
        findRestsPage.verifyData("productInfo", "0001 Стол1");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.1");
        findRestsPage.verifyData("qty", "10");
    //Стол2
        findRestsPage.inputData("product", "0002");
        findRestsPage.verifyData("productInfo", "0002 Стол2");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.2");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "02series01");
    //Стол3
        findRestsPage.inputData("product", "0003");
        findRestsPage.verifyData("productInfo", "0003 Стол3");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.3");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол4
        findRestsPage.inputData("product", "0004");
        findRestsPage.verifyData("productInfo", "0004 Стол4");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.4");
        findRestsPage.verifyData("qty", "10");
    //Стол5
        findRestsPage.inputData("product", "0005");
        findRestsPage.verifyData("productInfo", "0005 Стол5");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.5");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "05series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол6
        findRestsPage.inputData("product", "0006");
        findRestsPage.verifyData("productInfo", "0006 Стол6");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.6");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "06series01");
    //Стол7
        findRestsPage.inputData("product", "0007");
        findRestsPage.verifyData("productInfo", "0007 Стол7");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.7");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол8
        findRestsPage.inputData("product", "0008");
        findRestsPage.verifyData("productInfo", "0008 Стол8");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.8");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "08series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол9
        findRestsPage.inputData("product", "0009");
        findRestsPage.verifyData("productInfo", "0009 Стол9");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.9");
        findRestsPage.verifyData("qty", "10");
    //Стол10
        findRestsPage.inputData("product", "00010");
        findRestsPage.verifyData("productInfo", "00010 Стол10");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.10");
        findRestsPage.verifyData("qty", "10");
    }

    @Test (priority = 3, dependsOnMethods = "processingAccommodationTaskTest")
    public void processingInventoryTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.getStringTasks(2).click();
    //Стол1
        inventoryCardPage.inputData("source", "A.1.1.1.1");
        inventoryCardPage.inputData("product", "0001");
        inventoryCardPage.verifyData("productInfo", "0001 Стол1");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0001 Стол1");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол2
        inventoryCardPage.inputData("source", "A.1.1.1.2");
        inventoryCardPage.inputData("product", "0002");
        mobileFormBatchProperties.select(true, false,"02series01","");
        inventoryCardPage.verifyData("productInfo", "0002 02series01 Стол2");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0002 02series01 Стол2");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол3
        inventoryCardPage.inputData("source", "A.1.1.1.3");
        inventoryCardPage.inputData("product", "0003");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "0003 31.12.2022 Стол3");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0003 31.12.2022 Стол3");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол4
        inventoryCardPage.inputData("source", "A.1.1.1.4");
        inventoryCardPage.inputData("product", "0004");
        inventoryCardPage.verifyData("productInfo", "0004 Стол4");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0004 Стол4");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол5
        inventoryCardPage.inputData("source", "A.1.1.1.5");
        inventoryCardPage.inputData("product", "0005");
        mobileFormBatchProperties.select(true,true,"05series01","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "0005 05series01 31.12.2022 Стол5");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0005 05series01 31.12.2022 Стол5");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол6
        inventoryCardPage.inputData("source", "A.1.1.1.6");
        inventoryCardPage.inputData("product", "0006");
        mobileFormBatchProperties.select(true,false,"06series01","");
        inventoryCardPage.verifyData("productInfo", "0006 06series01 Стол6");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0006 06series01 Стол6");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол7
        inventoryCardPage.inputData("source", "A.1.1.1.7");
        inventoryCardPage.inputData("product", "0007");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "0007 31.12.2022 Стол7");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0007 31.12.2022 Стол7");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол8
        inventoryCardPage.inputData("source", "A.1.1.1.8");
        inventoryCardPage.inputData("product", "0008");
        mobileFormBatchProperties.select(true,true,"08series01","31.12.2022");
        inventoryCardPage.verifyData("productInfo", "0008 08series01 31.12.2022 Стол8");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0008 08series01 31.12.2022 Стол8");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол9
        inventoryCardPage.inputData("source", "A.1.1.1.9");
        inventoryCardPage.inputData("product", "0009");
        inventoryCardPage.verifyData("productInfo", "0009 Стол9");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "0009 Стол9");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    //Стол10
        inventoryCardPage.inputData("source", "A.1.1.1.10");
        inventoryCardPage.inputData("product", "00010");
        inventoryCardPage.verifyData("productInfo", "00010 Стол10");
        inventoryCardPage.selectData("quality", "Кондиция");
        inventoryCardPage.inputData("qty","10");
        inventoryCardPage.verifyData("itemViewInfo", "00010 Стол10");
        inventoryCardPage.verifyData("qualityInfo", "Кондиция");
        inventoryCardPage.verifyData("qtyViewInfo", "10.0");
        inventoryCardPage.clickButtonAndConfirm("inventory");
    }

    @Test (priority = 4, dependsOnMethods = "processingInventoryTaskTest")
    public void checkingFreeAmountAfterProcessingInventoryTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.selectFindRestsMenu();
    //Стол1
        findRestsPage.inputData("product", "0001");
        findRestsPage.verifyData("productInfo", "0001 Стол1");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.1");
        findRestsPage.verifyData("qty", "10");
    //Стол2
        findRestsPage.inputData("product", "0002");
        findRestsPage.verifyData("productInfo", "0002 Стол2");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.2");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "02series01");
    //Стол3
        findRestsPage.inputData("product", "0003");
        findRestsPage.verifyData("productInfo", "0003 Стол3");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.3");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол4
        findRestsPage.inputData("product", "0004");
        findRestsPage.verifyData("productInfo", "0004 Стол4");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.4");
        findRestsPage.verifyData("qty", "10");
    //Стол5
        findRestsPage.inputData("product", "0005");
        findRestsPage.verifyData("productInfo", "0005 Стол5");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.5");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "05series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол6
        findRestsPage.inputData("product", "0006");
        findRestsPage.verifyData("productInfo", "0006 Стол6");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.6");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "06series01");
    //Стол7
        findRestsPage.inputData("product", "0007");
        findRestsPage.verifyData("productInfo", "0007 Стол7");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.7");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол8
        findRestsPage.inputData("product", "0008");
        findRestsPage.verifyData("productInfo", "0008 Стол8");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.8");
        findRestsPage.verifyData("qty", "10");
        findRestsPage.verifyData("seriesInfo", "08series01");
        findRestsPage.verifyData("shelfLifeInfo", "31.12.2022");
    //Стол9
        findRestsPage.inputData("product", "0009");
        findRestsPage.verifyData("productInfo", "0009 Стол9");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.9");
        findRestsPage.verifyData("qty", "10");
    //Стол10
        findRestsPage.inputData("product", "00010");
        findRestsPage.verifyData("productInfo", "00010 Стол10");
        findRestsPage.verifyData("sourceInfo", "A.1.1.1.10");
        findRestsPage.verifyData("qty", "10");
    }

    @Test (priority = 5, dependsOnMethods = "processingInventoryTaskTest")
    public void processingRelocationTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Moving");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол1
        relocationCardPage.verifyData("productInfo", "0001 Стол1 A.1.1.1.1 ➡ B.1.1.1.1 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.1");
        relocationCardPage.inputData("product", "0001");
        relocationCardPage.inputData("destination", "B.1.1.1.1");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол2
        relocationCardPage.verifyData("productInfo", "0002 02series01 Стол2 A.1.1.1.2 ➡ B.1.1.1.2 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.2");
        relocationCardPage.inputData("product", "0002");
        relocationCardPage.inputData("destination", "B.1.1.1.2");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол3
        relocationCardPage.verifyData("productInfo", "0003 31.12.2022 Стол3 A.1.1.1.3 ➡ B.1.1.1.3 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.3");
        relocationCardPage.inputData("product", "0003");
        relocationCardPage.inputData("destination", "B.1.1.1.3");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол4
        relocationCardPage.verifyData("productInfo", "0004 Стол4 A.1.1.1.4 ➡ B.1.1.1.4 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.4");
        relocationCardPage.inputData("product", "0004");
        relocationCardPage.inputData("destination", "B.1.1.1.4");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол5
        relocationCardPage.verifyData("productInfo", "0005 05series01 31.12.2022 Стол5 A.1.1.1.5 ➡ B.1.1.1.5 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.5");
        relocationCardPage.inputData("product", "0005");
        relocationCardPage.inputData("destination", "B.1.1.1.5");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол6
        relocationCardPage.verifyData("productInfo", "0006 06series01 Стол6 A.1.1.1.6 ➡ B.1.1.1.6 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.6");
        relocationCardPage.inputData("product", "0006");
        relocationCardPage.inputData("destination", "B.1.1.1.6");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол7
        relocationCardPage.verifyData("productInfo", "0007 31.12.2022 Стол7 A.1.1.1.7 ➡ B.1.1.1.7 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.7");
        relocationCardPage.inputData("product", "0007");
        relocationCardPage.inputData("destination", "B.1.1.1.7");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол8
        relocationCardPage.verifyData("productInfo", "0008 08series01 31.12.2022 Стол8 A.1.1.1.8 ➡ B.1.1.1.8 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.8");
        relocationCardPage.inputData("product", "0008");
        relocationCardPage.inputData("destination", "B.1.1.1.8");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол9
        relocationCardPage.verifyData("productInfo", "0009 Стол9 A.1.1.1.9 ➡ B.1.1.1.9 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.9");
        relocationCardPage.inputData("product", "0009");
        relocationCardPage.inputData("destination", "B.1.1.1.9");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    //Стол10
        relocationCardPage.verifyData("productInfo", "00010 Стол10 A.1.1.1.10 ➡ B.1.1.1.10 Quantity 10 шт");
        relocationCardPage.inputData("source", "A.1.1.1.10");
        relocationCardPage.inputData("product", "00010");
        relocationCardPage.inputData("destination", "B.1.1.1.10");
        relocationCardPage.inputData("qty", "10");
        relocationCardPage.verifyData("unitAmount", "1.0");
        relocationCardPage.verifyData("unitPackaging", "10");
        relocationCardPage.clickButton("commit");
    }

    @Test (priority = 6, dependsOnMethods = "processingRelocationTaskTest")
    public void processingRelocationTSDTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        relocationTSDCardPage.clickButton("rightMenu");
        relocationTSDCardPage.clickButton("relocation");
    //Стол1
        relocationTSDCardPage.inputData("source", "B.1.1.1.1");
        relocationTSDCardPage.inputData("product", "0001");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.1 ➡ 0001 Стол1");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.1 ➡ 0001 Стол1 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.1");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.1 ➡ C.1.1.1.1 0001 Стол1 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол2
        relocationTSDCardPage.inputData("source", "B.1.1.1.2");
        relocationTSDCardPage.inputData("product", "0002");
        mobileFormBatchProperties.select(true,false,"02series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.2 ➡ 0002 02series01 Стол2");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.2 ➡ 0002 02series01 Стол2 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.2");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.2 ➡ C.1.1.1.2 0002 02series01 Стол2 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол3
        relocationTSDCardPage.inputData("source", "B.1.1.1.3");
        relocationTSDCardPage.inputData("product", "0003");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.3 ➡ 0003 31.12.2022 Стол3 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.3");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.3 ➡ C.1.1.1.3 0003 31.12.2022 Стол3 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол4
        relocationTSDCardPage.inputData("source", "B.1.1.1.4");
        relocationTSDCardPage.inputData("product", "0004");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.4 ➡ 0004 Стол4");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.4 ➡ 0004 Стол4 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.4");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.4 ➡ C.1.1.1.4 0004 Стол4 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол5
        relocationTSDCardPage.inputData("source", "B.1.1.1.5");
        relocationTSDCardPage.inputData("product", "0005");
        mobileFormBatchProperties.select(true, true,"05series01","31.12.2022");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.5 ➡ 0005 05series01 31.12.2022 Стол5");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.5 ➡ 0005 05series01 31.12.2022 Стол5 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.5");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.5 ➡ C.1.1.1.5 0005 05series01 31.12.2022 Стол5 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол6
        relocationTSDCardPage.inputData("source", "B.1.1.1.6");
        relocationTSDCardPage.inputData("product", "0006");
        mobileFormBatchProperties.select(true,false,"06series01","");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.6 ➡ 0006 06series01 Стол6");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.6 ➡ 0006 06series01 Стол6 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.6");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.6 ➡ C.1.1.1.6 0006 06series01 Стол6 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол7
        relocationTSDCardPage.inputData("source", "B.1.1.1.7");
        relocationTSDCardPage.inputData("product", "0007");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.7 ➡ 0007 31.12.2022 Стол7");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.7 ➡ 0007 31.12.2022 Стол7 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.7");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.7 ➡ C.1.1.1.7 0007 31.12.2022 Стол7 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол8
        relocationTSDCardPage.inputData("source", "B.1.1.1.8");
        relocationTSDCardPage.inputData("product", "0008");
        mobileFormBatchProperties.select(true,true,"08series01","31.12.2022");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.8 ➡ 0008 08series01 31.12.2022 Стол8");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.8 ➡ 0008 08series01 31.12.2022 Стол8 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.8");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.8 ➡ C.1.1.1.8 0008 08series01 31.12.2022 Стол8 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол9
        relocationTSDCardPage.inputData("source", "B.1.1.1.9");
        relocationTSDCardPage.inputData("product", "0009");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.9 ➡ 0009 Стол9");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.9 ➡ 0009 Стол9 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.9");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.9 ➡ C.1.1.1.9 0009 Стол9 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    //Стол10
        relocationTSDCardPage.inputData("source", "B.1.1.1.10");
        relocationTSDCardPage.inputData("product", "00010");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.10 ➡ 00010 Стол10");
        relocationTSDCardPage.inputData("qty", "10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.10 ➡ 00010 Стол10 Quantity 10");
        relocationTSDCardPage.inputData("destination", "C.1.1.1.10");
        relocationTSDCardPage.verifyData("productInfo", "B.1.1.1.10 ➡ C.1.1.1.10 00010 Стол10 Quantity 10");
        relocationTSDCardPage.clickButton("moving");
    }

    @Test (priority = 7, dependsOnMethods = "processingAccommodationTaskTest")
    public void processingSelectionTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Selection");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол1
        selectionCardPage.verifyData("productInfo", "0001 Стол1 C.1.1.1.1 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.1");
        selectionCardPage.inputData("product", "0001");
        selectionCardPage.inputData("destination", "OUT101");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол2
        selectionCardPage.verifyData("productInfo", "0002 02series01 Стол2 C.1.1.1.2 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.2");
        selectionCardPage.inputData("product", "0002");
        selectionCardPage.inputData("destination", "OUT102");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол3
        selectionCardPage.verifyData("productInfo", "0003 31.12.2022 Стол3 C.1.1.1.3 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.3");
        selectionCardPage.inputData("product", "0003");
        selectionCardPage.inputData("destination", "OUT103");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол4
        selectionCardPage.verifyData("productInfo", "0004 Стол4 C.1.1.1.4 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.4");
        selectionCardPage.inputData("product", "0004");
        mobileFormSerialNumber.normal("04", 10);
        selectionCardPage.inputData("destination", "OUT104");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол5
        selectionCardPage.verifyData("productInfo", "0005 05series01 31.12.2022 Стол5 C.1.1.1.5 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.5");
        selectionCardPage.inputData("product", "0005");
        selectionCardPage.inputData("destination", "OUT105");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол6
        selectionCardPage.verifyData("productInfo", "0006 06series01 Стол6 C.1.1.1.6 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.6");
        selectionCardPage.inputData("product", "0006");
        mobileFormSerialNumber.normal("06", 10);
        selectionCardPage.inputData("destination", "OUT106");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол7
        selectionCardPage.verifyData("productInfo", "0007 31.12.2022 Стол7 C.1.1.1.7 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.7");
        selectionCardPage.inputData("product", "0007");
        mobileFormSerialNumber.normal("07", 10);
        selectionCardPage.inputData("destination", "OUT107");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол8
        selectionCardPage.verifyData("productInfo", "0008 08series01 31.12.2022 Стол8 C.1.1.1.8 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.8");
        selectionCardPage.inputData("product", "0008");
        mobileFormSerialNumber.normal("08", 10);
        selectionCardPage.inputData("destination", "OUT108");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол9
        selectionCardPage.verifyData("productInfo", "0009 Стол9 C.1.1.1.9 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.9");
        selectionCardPage.inputData("product", "0009");
        mobileFormSerialNumber.unique("09", 10);
        selectionCardPage.inputData("destination", "OUT109");
        selectionCardPage.verifyData("qty", "10");
        selectionCardPage.clickButton("commit");
    //Стол10
        selectionCardPage.verifyData("productInfo", "00010 Стол10 C.1.1.1.10 ➡ KT1.01.01.01.01 Quantity 10 шт");
        selectionCardPage.inputData("source", "C.1.1.1.10");
        selectionCardPage.inputData("product", "00010");
        selectionCardPage.inputData("destination", "OUT110");
        selectionCardPage.inputData("qty", "10");
        selectionCardPage.clickButton("commit");
    }

    @Test (priority = 8, dependsOnMethods = "processingSelectionTaskTest")
    public void processingContainerTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Контейнер (Selection)");
        allTasksPage.getWorkTypeTasksQuantity().click();

        mobileFormContainer.completeTask("OUT101", "CON/OUT101 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT102", "CON/OUT102 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT103", "CON/OUT103 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT104", "CON/OUT104 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT105", "CON/OUT105 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT106", "CON/OUT106 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT107", "CON/OUT107 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT108", "CON/OUT108 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT109", "CON/OUT109 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
        mobileFormContainer.completeTask("OUT110", "CON/OUT110 ➡ KT1.01.01.01.01", "KT1.01.01.01.01");
    }

    @Test (priority = 9, dependsOnMethods = "processingContainerTaskTest")
    public void processingControlTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Control");
        allTasksPage.getWorkTypeTasksQuantity().click();
    //Стол1
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT101");
        controlCardPage.verifyData("productInfo", "0001 Стол1");
        controlCardPage.verifyData("containerInfo", "OUT101");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0001");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол2
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT102");
        controlCardPage.verifyData("productInfo", "0002 Стол2");
        controlCardPage.verifyData("containerInfo", "OUT102");
        controlCardPage.verifyData("seriesInfo", "02series01");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0002");
        mobileFormBatchProperties.select(true,false,"02series01","");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол3
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT103");
        controlCardPage.verifyData("productInfo", "0003 Стол3");
        controlCardPage.verifyData("containerInfo", "OUT103");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0003");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол4
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT104");
        controlCardPage.verifyData("productInfo", "0004 Стол4");
        controlCardPage.verifyData("containerInfo", "OUT104");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0004");
        mobileFormSerialNumber.normal("04", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол5
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT105");
        controlCardPage.verifyData("productInfo", "0005 Стол5");
        controlCardPage.verifyData("seriesInfo", "05series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.verifyData("containerInfo", "OUT105");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0005");
        mobileFormBatchProperties.select(true, true,"05series01","31.12.2022");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол6
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT106");
        controlCardPage.verifyData("productInfo", "0006 Стол6");
        controlCardPage.verifyData("seriesInfo", "06series01");
        controlCardPage.verifyData("containerInfo", "OUT106");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0006");
        mobileFormBatchProperties.select(true,false,"06series01","");
        mobileFormSerialNumber.normal("06", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол7
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT107");
        controlCardPage.verifyData("productInfo", "0007 Стол7");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.verifyData("containerInfo", "OUT107");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0007");
        mobileFormBatchProperties.select(false,true,"","31.12.2022");
        mobileFormSerialNumber.normal("07", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол8
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT108");
        controlCardPage.verifyData("productInfo", "0008 Стол8");
        controlCardPage.verifyData("seriesInfo", "08series01");
        controlCardPage.verifyData("shelfLifeInfo", "31.12.2022");
        controlCardPage.verifyData("containerInfo", "OUT108");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0008");
        mobileFormBatchProperties.select(true,true,"08series01","31.12.2022");
        mobileFormSerialNumber.normal("08", 10);
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    //Стол9
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT109");
        controlCardPage.verifyData("productInfo", "0009 Стол9");
        controlCardPage.verifyData("containerInfo", "OUT109");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","0009");
        mobileFormSerialNumber.unique("09", 10);
        controlCardPage.clickButton("commit");
    //Стол10
        controlCardPage.inputData("source", "KT1.01.01.01.01");
        controlCardPage.inputData("container","OUT110");
        controlCardPage.verifyData("productInfo", "00010 Стол10");
        controlCardPage.verifyData("containerInfo", "OUT110");
        controlCardPage.getControlledQty(1).shouldHave(text("0"));
        controlCardPage.getQty(1).shouldHave(text("10"));
        controlCardPage.inputData("product","00010");
        controlCardPage.inputData("qty","10");
        controlCardPage.getControlledQty(1).shouldNotBe(visible);
        controlCardPage.clickButton("commit");
    }

    @Test (priority = 10, dependsOnMethods = "processingControlTaskTest")
    public void processingPackagingTaskTest() throws Exception {
        mobileFormSettings.completeTask();
        mobileFormAuthorization.completeTask();
        allTasksPage.checkWorkType("Packaging");
        allTasksPage.getWorkTypeTasksQuantity().click();

        packagingCardPage.inputData("#container", "KT1.01.01.01.01");
        packagingCardPage.checkCellProductInfoInRow2(1, "OUT101", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(2, "OUT102", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(3, "OUT103", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(4, "OUT104", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(5, "OUT105", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(6, "OUT106", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(7, "OUT107", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(8, "OUT108", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(9, "OUT109", "10", "0.66", "10", "1", "1");
        packagingCardPage.checkCellProductInfoInRow2(10, "OUT110", "10", "0.66", "10", "1", "1");

        packagingCardPage.clickButton("#createCargo");
        packagingCardPage.verifyData("#modalMessage", "Cargo slots will be created. Continue?");
        packagingCardPage.clickButton("#modalOk");
        packagingCardPage.verifyData("#modalMessage", "We've created cargo bays");
        packagingCardPage.clickButton("#modalOk2");
    }

    @Test (priority = 11, dependsOnMethods = "processingPackagingTaskTest")
    public void processingLoadingTaskTest() throws Exception {
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
