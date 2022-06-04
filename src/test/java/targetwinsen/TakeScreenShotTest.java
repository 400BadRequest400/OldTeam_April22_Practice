package targetwinsen;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotTest extends CommonAPI  {

    @Test
    public void screenshotMainPage() throws IOException {
        getPageTitle();

//        File scrshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile((scrshotFile, new File("src/screenshotsFiles.png"));



    }

}
