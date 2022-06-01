package ramdaneamazon;

import main.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItems extends CommonAPI {

    @Test
    public void searchBox(){
        click("//input[@id='twotabsearchtextbox']");
        String expectedResult = "Amazon.com. Spend less. Smile more.";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }

}
