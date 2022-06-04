package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iphone extends CommonAPI {
    @Test
    public void iphone(){
        driver.findElement(By.cssSelector("body.page-home.ac-nav-overlap.body-with-ribbon:nth-child(2) nav.js.no-touch.no-windows.no-firefox:nth-child(5) div.ac-gn-content ul.ac-gn-list li.ac-gn-item.ac-gn-item-menu.ac-gn-iphone:nth-child(5) > a.ac-gn-link.ac-gn-link-iphone")).click();
        waitFor(3);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        waitFor(3);
        js.executeScript("window.scrollBy(0,6000)");
        waitFor(3);
        String expectedText = "iPhone - Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);

    }
}
