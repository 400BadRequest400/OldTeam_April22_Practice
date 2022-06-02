package ebay;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinksTest extends CommonAPI {

    BrokenLinks brokenLin = new BrokenLinks();

    String url = "https://www.ebay.com";
    @BeforeMethod
    public void init(){
        brokenLin = PageFactory.initElements(driver,BrokenLinks.class);
        driver.get(url);
    }

    @Test
    public void testCnnActivlinks() throws IOException {
        brokenLin.linksbroken();
    }
}
