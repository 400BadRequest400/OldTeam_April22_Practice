package ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {


    @Test(enabled = false)
    public void searchItems(){

        type("//input[@id='gh-ac']", "babydoll");
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);

        String expectedText = "babydoll: Search Result | eBay";
        Assert.assertEquals(expectedText, getPageTitle());
    }

    @Test
    public void clearSearchField(){

        type("//input[@id='gh-ac']", "babydoll");
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);
        driver.navigate().back();

        String expectedText = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(expectedText, driver.getTitle());
    }
}
