package djafarebay;

import main.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test
    public void homeTest(){
        getPageTitle();
    }
}
