package jqueryuiWinsen;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropMethod  extends CommonAPI {

    @Test
    public void DragAndDropTest(){
        driver.switchTo().frame(0);
        waitFor(3);

        WebElement dragFrom = driver.findElement(By.id("draggable"));
        WebElement droppedTo =driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver) ;

        action.dragAndDrop(dragFrom,droppedTo).build().perform();

    }
}
