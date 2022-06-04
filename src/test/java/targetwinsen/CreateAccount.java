package targetwinsen;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends CommonAPI {

    @Test
    public void createAccountTest() {

        click("//*[@id='headerPrimary']/a[4]");
        waitFor(1);
        click("//*[@id='listaccountNav-createAccount']/a/span");
        waitFor(2);
        type("input[id='username']", "winsen@email.com");
        type("input[id='firstname']", "Winsen");
        type("input[id='lastname']", "Sid");
        type("input[id='phone']", "999-999-9999");
        type("input[id='password']", "Secret8#");
        click("button[id='createAccount']");
        String expectedMessage="Sorry, something went wrong. Please try again.";
        String displayedMessage = driver.findElement(By.cssSelector(".AlertDisplay__AlertDisplayStyles-sc-1m3ky8a-0.chevvj")).getText();
        Assert.assertEquals(expectedMessage,displayedMessage);


    }

}



