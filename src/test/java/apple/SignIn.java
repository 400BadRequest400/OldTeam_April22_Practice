package apple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {

    @Test
    public void signIn(){
        driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[13]/div[1]/a[1]")).click();
        waitFor(3);
//        hoverOver("//a[contains(text(),'Sign in')]");
        click("//a[contains(text(),'Sign in')]");
        waitFor(3);
        String expectedText = "Sign In — Secure Checkout - Apple";
        String actualText = getPageTitle();
        Assert.assertEquals( expectedText,actualText);


    }
}
