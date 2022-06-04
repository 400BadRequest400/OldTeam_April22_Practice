package ramdanetarget;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

    @Test
    public void categoryTest(){
        click("//body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/nav[1]/div[2]/a[1]");
        waitFor(3);

        click("//*[@id=\"overlay-4\"]/div/div/div/a[7]/div/span");
        waitFor(3);

        click("//span[contains(text(),'Baby Deals')]");
        waitFor(3);

        String expectedResult ="https://www.target.com/c/baby-sale/-/N-558or";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
