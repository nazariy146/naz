package mobile.mobileCase.mobileCaseJenkins;

import mobile.mobileCase.mobileCase3.MobileCaseThree;

public class CaseThreeJenkins {
    static MobileCaseThree mobileCaseThree = new MobileCaseThree();

    public static void main(String[] var0) throws Exception {

        mobileCaseThree.taskWeb();
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
