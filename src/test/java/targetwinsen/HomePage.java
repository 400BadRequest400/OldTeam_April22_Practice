package targetwinsen;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void homePageTitle(){
        getPageTitle();
        waitFor(3);

        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(expectedTitle, getPageTitle());

    }
//    @Test
//    public void openNewTab(){
//        Keys.chord(Keys.COMMAND,"N",Keys.ENTER);
//    }

}
