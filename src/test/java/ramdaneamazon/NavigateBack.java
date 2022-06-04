package ramdaneamazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateBack extends CommonAPI {
    @Test
    public void navigateBackTest(){
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("soccer ball");
        waitFor(3);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        waitFor(3);

        driver.navigate().back();
        waitFor(3);
        String expectedResult = "Amazon.com. Spend less. Smile more.";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
