package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase5.MobileCaseFive;

public class MobileCaseJenkins5 {
    static MobileCaseFive mobileCaseFive = new MobileCaseFive();

    public static void main(String[] var0) throws Exception {

        mobileCaseFive.taskWeb();
        mobileCaseFive.setUp();
        mobileCaseFive.taskReception();
        mobileCaseFive.setUp();
        mobileCaseFive.taskAccommodation();
        mobileCaseFive.setUp();
        mobileCaseFive.taskFindRests();
        mobileCaseFive.setUp();
        mobileCaseFive.taskInventory();
        mobileCaseFive.setUp();
        mobileCaseFive.taskFindRestsAfterInventory();
        mobileCaseFive.setUp();
        mobileCaseFive.taskRelocation();
        mobileCaseFive.setUp();
        mobileCaseFive.taskRelocationTSD();
        mobileCaseFive.setUp();
        mobileCaseFive.taskSelection();
        mobileCaseFive.setUp();
        mobileCaseFive.taskContainer();
        mobileCaseFive.setUp();
        mobileCaseFive.taskControl();
        mobileCaseFive.setUp();
        mobileCaseFive.taskPackaging();
        mobileCaseFive.setUp();
        mobileCaseFive.taskLoading();
    }
}
