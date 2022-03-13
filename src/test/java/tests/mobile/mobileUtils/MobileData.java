package tests.mobile.mobileUtils;

public class MobileData {



    public String article, name, productInfo, productInfoSeriesShelfLife, source, product, container, qty, dataSeries, dataShelfLife, dataSerialNumber, typeSn;
    public boolean series, shelfLife, declaredSeriesShelfLife, serialNumber;

    public MobileData dataReceptionCardPage (String stol) {

        MobileData stolData = new MobileData();
        switch (stol) {
            case "stol1":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.article = "0001";
                stolData.name = "Стол1";
                stolData.source = "IN.01";
                stolData.product = "0001";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol2":
                stolData.series = true;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.dataSeries = "02series01";
                stolData.dataShelfLife = "";
                stolData.article = "0002";
                stolData.name = "Стол2";
                stolData.source = "IN.01";
                stolData.product = "0002";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol3":
                stolData.series = false;
                stolData.shelfLife = true;
                stolData.serialNumber = false;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "31.12.2022";
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "0003";
                stolData.name = "Стол3";
                stolData.source = "IN.01";
                stolData.product = "0003";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol4":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "04";
                stolData.article = "0004";
                stolData.name = "Стол4";
                stolData.source = "IN.01";
                stolData.product = "0004";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol5":
                stolData.series = true;
                stolData.shelfLife = true;
                stolData.serialNumber = false;
                stolData.dataSeries = "05series01";
                stolData.dataShelfLife = "31.12.2022";
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "0005";
                stolData.name = "Стол5";
                stolData.source = "IN.01";
                stolData.product = "0005";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol6":
                stolData.series = true;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "06series01";
                stolData.dataShelfLife = "";
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "06";
                stolData.article = "0006";
                stolData.name = "Стол6";
                stolData.source = "IN.01";
                stolData.product = "0006";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol7":
                stolData.series = false;
                stolData.shelfLife = true;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "31.12.2022";
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "07";
                stolData.article = "0007";
                stolData.name = "Стол7";
                stolData.source = "IN.01";
                stolData.product = "0007";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol8":
                stolData.series = true;
                stolData.shelfLife = true;
                stolData.serialNumber = true;
                stolData.dataSeries = "08series01";
                stolData.dataShelfLife = "31.12.2022";
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "08";
                stolData.article = "0008";
                stolData.name = "Стол8";
                stolData.source = "IN.01";
                stolData.product = "0008";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol9":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.typeSn = "unique";
                stolData.dataSerialNumber = "09";
                stolData.article = "0009";
                stolData.name = "Стол9";
                stolData.source = "IN.01";
                stolData.product = "0009";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol10":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.article = "00010";
                stolData.name = "Стол10";
                stolData.source = "IN.01";
                stolData.product = "00010";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol11":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "00011";
                stolData.name = "Стол11";
                stolData.source = "IN.01";
                stolData.product = "11fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol12":
                stolData.series = true;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.dataSeries = "12Series01";
                stolData.dataShelfLife = "";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "00012";
                stolData.name = "Стол12";
                stolData.source = "IN.01";
                stolData.product = "12fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol13":
                stolData.series = false;
                stolData.shelfLife = true;
                stolData.serialNumber = false;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "31.12.2022";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "00013";
                stolData.name = "Стол13";
                stolData.source = "IN.01";
                stolData.product = "13fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol14":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "14";
                stolData.article = "00014";
                stolData.name = "Стол14";
                stolData.source = "IN.01";
                stolData.product = "14fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol15":
                stolData.series = true;
                stolData.shelfLife = true;
                stolData.serialNumber = false;
                stolData.dataSeries = "15series01";
                stolData.dataShelfLife = "31.12.2022";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "00015";
                stolData.name = "Стол15";
                stolData.source = "IN.01";
                stolData.product = "15fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol16":
                stolData.series = true;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "16series01";
                stolData.dataShelfLife = "";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "16";
                stolData.article = "00016";
                stolData.name = "Стол16";
                stolData.source = "IN.01";
                stolData.product = "16fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol17":
                stolData.series = false;
                stolData.shelfLife = true;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "31.12.2022";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "17";
                stolData.article = "00017";
                stolData.name = "Стол17";
                stolData.source = "IN.01";
                stolData.product = "17fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol18":
                stolData.series = true;
                stolData.shelfLife = true;
                stolData.serialNumber = true;
                stolData.dataSeries = "18series01";
                stolData.dataShelfLife = "31.12.2022";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "normal";
                stolData.dataSerialNumber = "18";
                stolData.article = "00018";
                stolData.name = "Стол18";
                stolData.source = "IN.01";
                stolData.product = "18fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol19":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = true;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.declaredSeriesShelfLife = true;
                stolData.typeSn = "unique";
                stolData.dataSerialNumber = "19";
                stolData.article = "00019";
                stolData.name = "Стол19";
                stolData.source = "IN.01";
                stolData.product = "19fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
            case "stol20":
                stolData.series = false;
                stolData.shelfLife = false;
                stolData.serialNumber = false;
                stolData.dataSeries = "";
                stolData.dataShelfLife = "";
                stolData.declaredSeriesShelfLife = false;
                stolData.typeSn = "";
                stolData.dataSerialNumber = "";
                stolData.article = "00020";
                stolData.name = "Стол20";
                stolData.source = "IN.01";
                stolData.product = "20fragbc";
                stolData.container = "IN1";
                stolData.qty = "10";
                stolData.productInfo = stolData.article + productInfo(stolData);
                stolData.productInfoSeriesShelfLife = stolData.article + productInfoSeriesShelfLife(stolData) + productInfo(stolData);
                return stolData;
        }
        return null;
    }

    String productInfo(MobileData stolData){
       String productInfo = " " + stolData.name + " " + stolData.source + " Quantity" + " " + stolData.qty + " шт";
       return productInfo;
    }

    String productInfoSeriesShelfLife(MobileData stolData){

        if (stolData.series || stolData.shelfLife) {
            if (stolData.series & stolData.shelfLife){
                productInfoSeriesShelfLife = " " + stolData.dataSeries + " " + stolData.dataShelfLife;
            }
            else if (stolData.series){
                productInfoSeriesShelfLife = " " + stolData.dataSeries ;
            }
            else if (stolData.shelfLife){
                productInfoSeriesShelfLife = " " + stolData.dataShelfLife;
            }
        }
        else{
            productInfoSeriesShelfLife = "";
        }
        return productInfoSeriesShelfLife;
    }
}
