package web.webUtils;

import com.codeborne.selenide.Configuration;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebUtils {

    public void  webRunBrowser(){
        Configuration.startMaximized = true;
        Configuration.browserSize = null;
        open("http://dmz.abmretail.com:8080/wms_regress_mikn");

        $("#userName").shouldBe(visible, Duration.ofSeconds(200));
        $("#userName").val("Администратор");
        $("#userPassword").val("Password1");
        $("#okButton").click();
        $("#themesCell_theme_0").shouldBe(visible, Duration.ofSeconds(200));
    }
}
