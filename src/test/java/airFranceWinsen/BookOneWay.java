package airFranceWinsen;

import base.CommonAPI;
import org.testng.annotations.Test;

public class BookOneWay extends CommonAPI {
   //booking one way ticket

    @Test
    public void bookingOneWayTest(){
        driver.get("https://wwws.airfrance.us/");
        click("button[id='accept_cookies_btn']");
        waitFor(2);
        click("div[class='mat-select-arrow.ng-tns-c199-13']");
        waitFor(2);
        click("//*[@id='mat-option-1']");
    }
}
