package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LinkTextClass extends CommonAPI {

    @Test
    public void testArrayList(){

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Size of the list is :"+list.size());
        ArrayList<String> linktext = new ArrayList<String>();
        for ( WebElement ele : list) {
            try
            {
                linktext.add(ele.getText());
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("****************************");
        System.out.println("Size of the ArrayList :"+linktext.size());

        int i =1;
        for (String text : linktext) {
            System.out.println(i+"   ArrayList Text are   :"+text);
            i++;
        }
    }
}
