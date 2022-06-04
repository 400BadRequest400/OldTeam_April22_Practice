package ramdaneamazon;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class OpenNewWindow extends CommonAPI {
    @Test
    public void openNewWindowTest(){
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Basics')]")).sendKeys(Keys.COMMAND,Keys.ENTER);

        waitFor(3);
        Set<String> widows = driver.getWindowHandles();
        Iterator<String> it =widows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);

        String expectedResult = "Amazon.com: Amazon Basics";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
//        driver.switchTo().window(parentID);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");


        System.out.println(getPageTitle());
    }

}
