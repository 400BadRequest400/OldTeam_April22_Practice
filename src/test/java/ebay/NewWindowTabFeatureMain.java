package ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class NewWindowTabFeatureMain extends CommonAPI {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/djafarouldslimane/IdeaProjects/OldTeam_April22_Practice/src/drivers/macdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> widows = driver.getWindowHandles();
        Iterator<String> it =widows.iterator();

        String parentID = it.next();
        String childID = it.next();

        driver.switchTo().window(childID);

        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentID);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }
    public void redCardButtonClick(){
        System.out.println(getPageTitle());
        driver.findElement(By.cssSelector("#utilityNav-redCardLI")).sendKeys(Keys.COMMAND,Keys.ENTER);
        waitFor(3);
        Set<String> widows = driver.getWindowHandles();
        Iterator<String> it =widows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);

        System.out.println(getPageTitle());
    }


}
