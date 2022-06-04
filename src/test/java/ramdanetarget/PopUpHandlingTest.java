package ramdanetarget;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class PopUpHandlingTest extends CommonAPI {

    @Test
    public void handlePopUps(){
        click("//*[@id=\"web-store-id-msg-btn\"]/div[2]/div");
        waitFor(3);
        click("//*[@id=\"overlay-1\"]/div[2]/div[1]/div/div[2]/div/div/button/span[2]");

        Alert alert = driver.switchTo().alert();
        alert.accept();
        waitFor(3);
    }
}
