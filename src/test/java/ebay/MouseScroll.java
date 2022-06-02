package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseScroll extends CommonAPI {


    public void mouseScrollTest() {
        //to scroll to exact place
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)");

        //to scroll to view
        WebElement link = driver.findElement(By.linkText("My eBay"));
        waitFor(4);
        js.executeScript("arguments[0].scrollIntoView(true);", link);
        waitFor(4);
    }

    @Test
    public void mouseScrollTest2() {
        //to scroll to exact place
        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitFor(5);
        js.executeScript("window.scrollBy(0,2000)");
        waitFor(5);
        click("//a[contains(text(),'Registration')]");

        String expectedPage= "Your eBay account | eBay";
        Assert.assertEquals(expectedPage, driver.getTitle());
    }

}
