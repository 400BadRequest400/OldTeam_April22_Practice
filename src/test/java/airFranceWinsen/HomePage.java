package airFranceWinsen;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void homePageTest(){
        getPageTitle();
        waitFor(3);
        click("button[id='accept_cookies_btn']");

//        String expectedHomePageTitle = "Airline tickets: cheap flights to France & worldwide | Air France USA";
//        Assert.assertEquals(expectedHomePageTitle,getPageTitle());
    }
}
