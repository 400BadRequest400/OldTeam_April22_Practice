package djafarebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test
    public void homePageTitleTest(){
        getPageTitle();
        waitFor(3);

        String actualPageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(actualPageTitle, getPageTitle());
    }
}
