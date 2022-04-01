package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase2.MobileCaseTwo;

public class CaseTwoJenkins {
    static MobileCaseTwo mobileCaseTwo = new MobileCaseTwo();

    public static void main(String[] var0) throws Exception {

        mobileCaseTwo.taskWeb();
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
        mobileCaseTwo.taskLoading();
    }
}
