package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase3.MobileCaseThree;
import web.webCase.WebDownloadMobileTest;

public class MobileCaseJenkins3 {
    static MobileCaseThree mobileCaseThree = new MobileCaseThree();
    static WebDownloadMobileTest webDownloadMobileTest = new WebDownloadMobileTest();

    public static void main(String[] var0) throws Exception {

        webDownloadMobileTest.completeTask("3");
        mobileCaseThree.setUp();
        mobileCaseThree.taskReception();
        mobileCaseThree.setUp();
        mobileCaseThree.taskAccommodation();
        mobileCaseThree.setUp();
        mobileCaseThree.taskFindRests();
        mobileCaseThree.setUp();
        mobileCaseThree.taskInventory();
        mobileCaseThree.setUp();
        mobileCaseThree.taskFindRestsAfterInventory();
        mobileCaseThree.setUp();
        mobileCaseThree.taskRelocation();
        mobileCaseThree.setUp();
        mobileCaseThree.taskRelocationTSD();
        mobileCaseThree.setUp();
        mobileCaseThree.taskSelection();
        mobileCaseThree.setUp();
        mobileCaseThree.taskContainer();
        mobileCaseThree.setUp();
        mobileCaseThree.taskControl();
        mobileCaseThree.setUp();
        mobileCaseThree.taskPackaging();
        mobileCaseThree.setUp();
        mobileCaseThree.taskLoading();
    }

}
