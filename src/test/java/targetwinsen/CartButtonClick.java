package targetwinsen;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CartButtonClick extends CommonAPI {

    @Test
    public void  clickCartButton(){
        click(".sc-gtsrHT.iPVIGk");
        waitFor(3);
//        String cartPageTitle = "Cart : Target";
//        Assert.assertEquals(cartPageTitle,getPageTitle());
    }
}
