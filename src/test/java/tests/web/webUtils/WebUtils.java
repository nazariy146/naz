package tests.web.webUtils;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebUtils {
    public void  webOpen1C(){
        open("http://dmz.abmretail.com:8080/wms_regress_mikn");

        $("#userName").shouldBe(visible, Duration.ofSeconds(10));
        $("#userName").val("Администратор");
        $("#userPassword").val("Password1");
        $("#okButton").click();
        $("#themesCell_theme_0").shouldBe(visible, Duration.ofSeconds(20));
    }
}
