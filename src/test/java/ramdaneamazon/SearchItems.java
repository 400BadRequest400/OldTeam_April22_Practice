package ramdaneamazon;

import main.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {

    @Test
    public void searchBox(){
        type("//input[@id='twotabsearchtextbox']","bikes");
        waitFor(5);
        click("//input[@id='nav-search-submit-button']");
        waitFor(4);
        String expectedResult = "Amazon.com : bikes";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);



    }

}
