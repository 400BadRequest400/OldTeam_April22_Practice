package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends CommonAPI {

    @Test
    public void testMouseHover() {

        WebElement element = driver.findElement(By.linkText("My eBay"));
        waitFor(5);
        Actions action = new Actions(driver);
        waitFor(5);
        action.moveToElement(element).build().perform();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"gh-ul-nav\"]/li[3]/a")).click();
        waitFor(5);

//        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
//        waitFor(5);
    }
}
