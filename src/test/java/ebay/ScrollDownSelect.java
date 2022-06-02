package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDownSelect extends CommonAPI {



    @Test
    public void scrollDown(){

        Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        waitFor(3);
        select.selectByIndex(3);
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);

        String expectedlValue = "Baby Essentials for sale | eBay";
        Assert.assertEquals(expectedlValue, driver.getTitle());
    }


}
