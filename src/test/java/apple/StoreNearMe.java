package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class StoreNearMe extends CommonAPI {

    @Test
    public void storeNearMe(){
        driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[2]/a[1]")).click();
        waitFor(2);
        driver.findElement(By.xpath("//body/div[@id='page']/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/a[1]")).click();
        waitFor(3);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID= it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='page-landing']/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("11219");
        waitFor(4);
        String expectedText = "Apple Store - Find a Store - Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);

    }
}
