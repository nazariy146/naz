package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase1.MobileCaseOne;
import web.webCase.WebDownloadMobileTest;

public class MobileCaseJenkins1 {

    static MobileCaseOne mobileCaseOne = new MobileCaseOne();
    static WebDownloadMobileTest webDownloadMobileTest = new WebDownloadMobileTest();
//    public static String BASE = "wms_qa_mazv";

    public static void main(String[] var0) throws Exception {

        webDownloadMobileTest.completeTask("1");
        mobileCaseOne.setUp();
        mobileCaseOne.taskReception();
        mobileCaseOne.setUp();
        mobileCaseOne.taskAccommodation();
        mobileCaseOne.setUp();
        mobileCaseOne.taskFindRests();
        mobileCaseOne.setUp();
        mobileCaseOne.taskInventory();
        mobileCaseOne.setUp();
        mobileCaseOne.taskFindRestsAfterInventory();
        mobileCaseOne.setUp();
        mobileCaseOne.taskRelocation();
        mobileCaseOne.setUp();
        mobileCaseOne.taskRelocationTSD();
        mobileCaseOne.setUp();
        mobileCaseOne.taskSelection();
        mobileCaseOne.setUp();
        mobileCaseOne.taskContainer();
        mobileCaseOne.setUp();
        mobileCaseOne.taskControl();
        mobileCaseOne.setUp();
        mobileCaseOne.taskPackaging();
        mobileCaseOne.setUp();
        mobileCaseOne.taskLoading();
    }
}
