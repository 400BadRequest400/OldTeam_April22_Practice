package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class NewWindowTabFeature extends CommonAPI {

    @Test
    public void redCardButtonClick(){

        String parentTitle = getPageTitle();
        System.out.println("Parent Window Title is :"+parentTitle);
        driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > a")).
                sendKeys(Keys.COMMAND,Keys.ENTER);
        waitFor(3);

        Set<String> widows = driver.getWindowHandles();
        Iterator<String> it =widows.iterator();

        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        waitFor(3);
        type("//input[@id='gh-ac']", "Cars");
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);
        String childTitle = getPageTitle();
        System.out.println("Child Window Title is :"+childTitle);
        driver.switchTo().window(parentID);
        waitFor(3);

    }

}
