package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleYoutubeChannel extends CommonAPI {

    @Test
    public void appleYoutubeChannel(){
        driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[11]/a[1]")).click();
        waitFor(3);
        hoverOver("//body/div[6]/div[21]/div[1]/div[2]/a[2]/img[1]");
        waitFor(3);
        click("//body/div[6]/div[21]/div[1]/div[2]/a[2]/img[1]");
        waitFor(3);
        String expectedText = "Apple Support - YouTube";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);



    }
}
