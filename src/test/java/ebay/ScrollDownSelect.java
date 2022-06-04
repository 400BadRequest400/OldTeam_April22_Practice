package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollDownSelect extends CommonAPI {



    //@Test(enabled =false)
    public void scrollDown(){

        Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        waitFor(3);
        select.selectByIndex(3);
        waitFor(3);
        click("//input[@id='gh-btn']");
        waitFor(3);

        String expectedlValue = "Baby Essentials for sale | eBay";
        Assert.assertEquals(expectedlValue, driver.getTitle());
    }

    //@Test
    public void scrollDownByVisualText(){
        selectFromDropdown("//select[@id='gh-cat']", "Art");
    }


    @Test(enabled = true)
    public void scrollDown2(){

//        Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
//        waitFor(3);

        List<WebElement> list = driver.findElements(By.xpath("//select[@id='gh-cat']"));

        for ( WebElement ele: list) {
            System.out.println("The selection element"+ele);
        }
    }

    @Test(enabled = false)
    public void testListOfElements(){

        boolean isChecked = false;

        List<WebElement> elements = driver.findElements(By.xpath("//select[@id='gh-cat']"));

        System.out.println(elements);

        int size = elements.size();
        System.out.println("Size of the list :"+ size);

        for (int i = 0; i < size ; i++) {

            isChecked = elements.get(i).isSelected();

            if (!isChecked){
                elements.get(i).click();
                waitFor(5);
            }
        }
    }
}
