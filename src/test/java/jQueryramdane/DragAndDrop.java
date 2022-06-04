package jQueryramdane;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends CommonAPI {
    @Test
    public void dragAndDropTest(){
        click("//a[contains(text(),'Droppable')]");

        waitFor(5);
        driver.switchTo().frame(0);
        WebElement fromElement =driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));
        // action.dragAndDrop(fromElement,toElement).build().perform();
        Actions action = new Actions(driver);
        waitFor(3);
        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
        waitFor(3);


    }
}
