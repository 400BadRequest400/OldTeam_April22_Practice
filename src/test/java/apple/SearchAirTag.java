package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAirTag extends CommonAPI {
    @Test
    public void searchAirTag(){
        driver.findElement(By.xpath("//a[@id='ac-gn-link-search']")).click();
        waitFor(3);
        driver.findElement(By.xpath("//input[@id='ac-gn-searchform-input']")).sendKeys("AirTag");
        waitFor(3);
//        hoverOver("//*[@id=\"quicklinks\"]/li[1]/a/b");
        click("//*[@id=\"quicklinks\"]/li[1]/a/b");
        waitFor(3);
        String expectedText = "AirTag - Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);


    }
}
