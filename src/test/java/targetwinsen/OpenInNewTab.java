package targetwinsen;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenInNewTab extends CommonAPI {

    @Test
    public void numberOfPagesTest(){
        int numberOfPages = driver.findElements(By.tagName("a")).size();

    }


}
