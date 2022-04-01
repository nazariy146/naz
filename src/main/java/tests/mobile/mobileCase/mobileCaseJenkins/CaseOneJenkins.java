package tests.mobile.mobileCase.mobileCaseJenkins;

import tests.mobile.mobileCase.mobileCase1.MobileCaseOne;

import static tests.mobile.mobileUtils.BaseMobileClass.setUp;

public class CaseOneJenkins {

    static MobileCaseOne mobileCaseOne = new MobileCaseOne();

    public static void main(String[] var0) throws Exception {

        mobileCaseOne.taskWeb();
        setUp();
        mobileCaseOne.taskReception();
        setUp();
        mobileCaseOne.taskAccommodation();
        setUp();
        mobileCaseOne.taskFindRests();
        setUp();
        mobileCaseOne.taskInventory();
        setUp();
        mobileCaseOne.taskFindRestsAfterInventory();
        setUp();
        mobileCaseOne.taskRelocation();
        setUp();
        mobileCaseOne.taskRelocationTSD();
        setUp();
        mobileCaseOne.taskSelection();
        setUp();
        mobileCaseOne.taskContainer();
        setUp();
        mobileCaseOne.taskControl();
        setUp();
        mobileCaseOne.taskPackaging();
        setUp();
        mobileCaseOne.taskLoading();
    }
}
