package godaddy;

import base.CommonAPI;
import org.testng.annotations.DataProvider;

public class CreateAccountData extends CommonAPI {

    @DataProvider(name = "testdata")

    public Object [][] testDataFeed(){

        Object [][] accountdata = new Object[2][2];

        accountdata [0][0] = "username1@gmail.com";
        accountdata [0][1] = "Password1";
        accountdata [1][0] = "username2@gmail.com";
        accountdata [1][1] = "Password2";

        return accountdata;
    }
}
