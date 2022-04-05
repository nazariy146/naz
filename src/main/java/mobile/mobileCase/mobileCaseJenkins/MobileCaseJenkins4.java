package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase4.MobileCaseFour;

public class MobileCaseJenkins4 {

    static MobileCaseFour mobileCaseFour = new MobileCaseFour();

    public static void main(String[] var0) throws Exception {

        mobileCaseFour.taskWeb();
        mobileCaseFour.setUp();
        mobileCaseFour.taskReception();
        mobileCaseFour.setUp();
        mobileCaseFour.taskAccommodation();
        mobileCaseFour.setUp();
        mobileCaseFour.taskFindRests();
        mobileCaseFour.setUp();
        mobileCaseFour.taskInventory();
        mobileCaseFour.setUp();
        mobileCaseFour.taskFindRestsAfterInventory();
        mobileCaseFour.setUp();
        mobileCaseFour.taskRelocation();
        mobileCaseFour.setUp();
        mobileCaseFour.taskRelocationTSD();
        mobileCaseFour.setUp();
        mobileCaseFour.taskSelection();
        mobileCaseFour.setUp();
        mobileCaseFour.taskContainer();
        mobileCaseFour.setUp();
        mobileCaseFour.taskControl();
        mobileCaseFour.setUp();
        mobileCaseFour.taskPackaging();
        mobileCaseFour.setUp();
        mobileCaseFour.taskLoading();
    }
}
