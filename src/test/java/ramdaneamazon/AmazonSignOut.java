package ramdaneamazon;

import main.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSignOut extends CommonAPI {

    @Test
    public void signOutTest(){

        hoverOver("#nav-link-accountList-nav-line-1");
        waitFor(3);
        click("//span[contains(text(),'AmazonSmile Charity Lists')]");
        waitFor(3);
        String expectedResult = "AmazonSmile: You shop. Amazon gives.";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }
}
