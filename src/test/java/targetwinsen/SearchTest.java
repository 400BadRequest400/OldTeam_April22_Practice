package targetwinsen;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void searchFieldTakesInput(){
            type("#search","Baby Stroller");
            click("//button[@aria-label='go']");
            waitFor(3);
            String expectedAfterSearchTitle="Baby Stroller : Target";
            Assert.assertEquals(expectedAfterSearchTitle,getPageTitle());

    }
}
