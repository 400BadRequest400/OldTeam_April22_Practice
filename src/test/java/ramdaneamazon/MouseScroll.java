package ramdaneamazon;

import main.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseScroll extends CommonAPI {
    @Test
    public void mouseScrollTest(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitFor(4);
        js.executeScript("window.scrollBy(0,5000)");
        waitFor(6);
        driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
        waitFor(3);

        String expectedResult = "Amazon.jobs: Help us build Earth’s most customer-centric company.";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }
}
