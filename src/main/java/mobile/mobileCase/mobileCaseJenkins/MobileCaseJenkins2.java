package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase2.MobileCaseTwo;
import web.webCase.WebDownloadMobileTest;

public class MobileCaseJenkins2 {
    static MobileCaseTwo mobileCaseTwo = new MobileCaseTwo();
    static WebDownloadMobileTest webDownloadMobileTest = new WebDownloadMobileTest();

    public static void main(String[] var0) throws Exception {

        webDownloadMobileTest.completeTask("2");
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskReception();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskAccommodation();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskFindRests();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskInventory();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskFindRestsAfterInventory();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskRelocation();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskRelocationTSD();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskSelection();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskContainer();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskControl();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskPackaging();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskMergeContainer();
        mobileCaseTwo.setUp();
        mobileCaseTwo.taskLoading();
    }
}
