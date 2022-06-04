package targetwinsen;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DealsButton extends CommonAPI {

    @Test
    public void dealsButtonClick(){

        click("a[aria-label='Deals']");
        waitFor(3);
        click("a[data-test='deals-topDeals']");
        String expectedDealsText="Top Deals";
        String actualdealsText = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals(expectedDealsText,actualdealsText);

    }
}
