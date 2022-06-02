package ramdaneamazon;

import main.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistryTest extends CommonAPI {
    @Test
    public void registryTest(){
        click("//a[contains(text(),'Registry')]");
        waitFor(4);

        type("//*[@id=\"gr-find-stripe__form\"]/div/div[2]/input","ramdane");
        waitFor(3);

        driver.findElement(By.xpath("//span[contains(text(),'Select a registry or gift list type')]")).click();
        //selectFromDropdown("//span[contains(text(),'Select a registry or gift list type')]","Baby Registry");
        waitFor(3);
        click("#dropdown1_1");
        waitFor(3);

        click("//button[contains(text(),'Search')]");
        waitFor(3);

        String expectedResult = "Amazon: Baby Registry Search Results";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);


    }
}
