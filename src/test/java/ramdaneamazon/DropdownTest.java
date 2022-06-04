package ramdaneamazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends CommonAPI {
    @Test
    public void selectFromDropDown(){
        Select select = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        waitFor(2);
        select.selectByVisibleText("Baby");
        waitFor(5);
        type("//*[@id=\"twotabsearchtextbox\"]","shoes");
        waitFor(3);
        click("//*[@id=\"nav-search-submit-button\"]");
        waitFor(3);
        String expectedResult ="Amazon.com : shoes";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
        waitFor(3);



    }
}
