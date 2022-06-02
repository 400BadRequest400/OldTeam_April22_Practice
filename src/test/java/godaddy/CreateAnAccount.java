package godaddy;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CreateAnAccount extends CommonAPI {

    @Test
    public void createAccount(){

        click("//header/div[@id='id-c65f43b6-16f4-4542-bb27-3c6a84de0d93']/div[2]/details[1]/summary[1]/span[3]");
        waitFor(2);
        click("//a[contains(text(),'Sign In')]");
        waitFor(2);
        click("//a[@id='create_account']");
        waitFor(2);
        click("//button[@id='sign-up-email']");
        waitFor(2);

        type("//input[@id='first_name']", "lionel");
        waitFor(3);
        type("//*[@id=\"last_name\"]", "messi");
        waitFor(2);
        type("//*[@id=\"email\"]", "lionel.messi@gmail.com");
        waitFor(2);
        type("//*[@id=\"username\"]", "leomessi87");
        waitFor(2);
        type("//*[@id=\"new-password\"]", "antonnila");
        waitFor(2);
        click("//button[@id='submitBtn']");
        waitFor(2);
    }
}
