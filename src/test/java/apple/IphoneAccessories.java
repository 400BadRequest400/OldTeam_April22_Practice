package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IphoneAccessories extends CommonAPI {
    @Test
    public void iphoneAccessories(){
        driver.findElement(By.cssSelector("#ac-globalnav > div > ul.ac-gn-list > li.ac-gn-item.ac-gn-item-menu.ac-gn-accessories > a")).click();
        waitFor(3);
        hoverOver("//body/div[@id='page']/div[7]/div[5]/div[1]/div[1]/div[2]/ul[1]/div[1]/li[3]/a[1]/div[1]/img[1]");
        waitFor(2);
        String expectedText = "iBuy iPhone Accessories - Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);


    }

}
