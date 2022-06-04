package apple;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    @Test
    public void homePage(){
        getPageTitle();
        String expectedText = "Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);

    }
}
