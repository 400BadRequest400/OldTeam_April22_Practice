package targetwinsen;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollToFooter extends CommonAPI {


    @Test
    public void scrollDownToFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");
        //Assert.assertEquals();





    }




}
