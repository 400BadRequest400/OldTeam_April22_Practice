package ramdaneamazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends CommonAPI {
    @Test
    public void createAmazonAccount(){
        hoverOver("#nav-link-accountList-nav-line-1");
        waitFor(3);
        click("//*[@id=\"nav-flyout-ya-signin\"]/a/span");
        waitFor(3);
        click("#createAccountSubmit");
        type("#ap_customer_name","dave");
        waitFor(2);
        type("//input[@id='ap_email']","123456789");
        waitFor(2);
        type("//input[@id='ap_password']","abcdef");
        waitFor(2);
        type("//input[@id='ap_password_check']","abcdef");
        waitFor(2);
        click("//input[@id='continue']");
        waitFor(2);

        //hard assertion
        String expectedResult = "Amazon Registration";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

        //soft assertion
        if (expectedResult.equalsIgnoreCase(actualResult)){
            System.out.println("the test passed");
        }else {
            System.out.println("test failed");
        }


    }

}
