package tests.mobile.mobileCase.mobileCaseJenkins;

import tests.mobile.mobileCase.mobileCase2.MobileCaseTwo;

import static tests.mobile.mobileUtils.BaseMobileClass.setUp;

public class CaseTwoJenkins {
    static MobileCaseTwo mobileCaseTwo = new MobileCaseTwo();

    public static void main(String[] var0) throws Exception {

        mobileCaseTwo.taskWeb();
        setUp();
        mobileCaseTwo.taskReception();
        setUp();
        mobileCaseTwo.taskAccommodation();
        setUp();
        mobileCaseTwo.taskFindRests();
        setUp();
        mobileCaseTwo.taskInventory();
        setUp();
        mobileCaseTwo.taskFindRestsAfterInventory();
        setUp();
        mobileCaseTwo.taskRelocation();
        setUp();
        mobileCaseTwo.taskRelocationTSD();
        setUp();
        mobileCaseTwo.taskSelection();
        setUp();
        mobileCaseTwo.taskContainer();
        setUp();
        mobileCaseTwo.taskControl();
        setUp();
        mobileCaseTwo.taskPackaging();
        setUp();
        mobileCaseTwo.taskLoading();
    }

}
