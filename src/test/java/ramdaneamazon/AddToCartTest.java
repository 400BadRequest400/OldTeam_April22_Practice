package ramdaneamazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonAPI {
    @Test
    public void addToCart(){
        typeAndEnter("//*[@id=\"twotabsearchtextbox\"]","shoes");
        waitFor(2);
        click("//*[@id=\"p_n_is_primewardrobe/15121302011\"]/span/a/div/label/i");
        waitFor(4);
        click("//*[@id=\"n/6127770011\"]/span/a/span");
        waitFor(2);
        click("//span[contains(text(),\"Men's Charged Assert 9 Running Shoe\")]");
        waitFor(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitFor(4);
        js.executeScript("window.scrollBy(0,1000)");
        waitFor(6);
        driver.findElement(By.xpath("//*[@id=\"size_name_6\"]/span/input")).click();
        waitFor(5);

        click("//*[@id=\"mbc-buybutton-addtocart-1\"]/span/input");
        waitFor(6);

        click("//span[@id='nav-cart-count']");
        waitFor(3);

        String expectedResult = "Amazon.com Shopping Cart";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);


    }



}

