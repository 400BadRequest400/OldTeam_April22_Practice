package ramdanetarget;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {
    @Test
    public void signIn(){

        click("//span[contains(text(),'Sign in')]");
        waitFor(3);

        click("//span[contains(text(),'Create Account')]");
        waitFor(3);

        type("//input[@id='username']","piit@gmail.com");
        waitFor(2);

        type("//input[@id='firstname']","ram");
        waitFor(2);

        type("//input[@id='lastname']","ame");
        waitFor(2);

        type("//input[@id='phone']","123456789");
        waitFor(2);

        type("//input[@id='password']","Abcdef12345");
        waitFor(2);

        click("//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/form/div[8]/label/div");
        waitFor(2);

        click("//span[contains(text(),'Create account')]");
        waitFor(2);

        String expectedResult = "Login: Target";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);



    }
}
