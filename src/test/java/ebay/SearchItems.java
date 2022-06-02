package ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {


    @Test
    public void searchItems(){

        type("//input[@id='gh-ac']", "babydoll");
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);

        String actualText = "babydoll: Search Result | eBay";
        Assert.assertEquals(actualText, getPageTitle());
    }
}
