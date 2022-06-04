package targetwinsen;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HandleAlert extends CommonAPI {

    @Test
    public void handleAlertTest(){
        click("#web-store-id-msg-btn");
        waitFor(2);
        click("//*[@id='overlay-1']/div[2]/div[1]/div/div[2]/div/div[1]/button/span[2]");
    }
}
