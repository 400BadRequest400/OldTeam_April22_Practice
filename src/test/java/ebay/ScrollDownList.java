package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollDownList extends CommonAPI {

    @Test(enabled = false)
    public void scrollDownElement(){
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        waitFor(5);
        System.out.println("Size of the list"+linkList.size());
        for (WebElement currentlink : linkList) {
            String linkText = currentlink.getText();

            System.out.println(linkText);
        }
    }
}
