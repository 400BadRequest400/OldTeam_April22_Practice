package targetwinsen;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class RedCardTest extends CommonAPI {

    @Test
    public void redCardButtonClick(){
        System.out.println(getPageTitle());
        driver.findElement(By.cssSelector("#utilityNav-redCardLI")).sendKeys(Keys.COMMAND,Keys.ENTER);
        waitFor(3);
        Set<String> widows  =  driver.getWindowHandles();
        Iterator<String> it =widows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        String expectedRedCardTitle= "RedCard : Save 5% at Target";
        Assert.assertEquals(expectedRedCardTitle,getPageTitle());

        System.out.println(getPageTitle());
    }
}
