package tests.mobile.mobilePagesRefactor;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SettingsPage clickSettingIcon() {
        //$(By.id("com.abmcloud:id/buttonSettings")).shouldBe(enabled).click(); - элемент Релиз4
        $(By.id("com.abmcloud:id/ib_settings")).shouldBe(visible, Duration.ofSeconds(25));
        $(By.id("com.abmcloud:id/ib_settings")).shouldBe(enabled).click(); //- элемент Релиз5
        return new SettingsPage();
    }
    //MNV need to dell
    //MNV need to dell

}
