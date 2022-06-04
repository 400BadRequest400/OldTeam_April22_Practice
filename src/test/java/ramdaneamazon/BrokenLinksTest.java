package ramdaneamazon;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BrokenLinksTest extends CommonAPI {
    BrokenLinksTest brokenLinksTest;
    String url ="https://www.amazon.com/";

    @Test
    public void brokenLinks(){
        brokenLinksTest= PageFactory.initElements(driver, BrokenLinksTest.class);
        driver.get(url);

    }
}
