package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarrerOpportunities extends CommonAPI {
    @Test
    public void carrerOpportunities(){
     driver.findElement(By.xpath("//a[contains(text(),'Career Opportunities')]")).click();
     waitFor(3);
        String expectedText = "Careers at Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);


    }
}
