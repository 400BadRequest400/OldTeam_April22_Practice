package ramdaneamazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test
    public void homePageTitle(){
        getPageTitle();
        waitFor(3);
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = getPageTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
