package lessons;

import homeworks.homework_06.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by bionic on 11/5/14.
 */
public class lesson_07 {

    WebDriver webDriver;
    MainPage mainPage;
    GoodsPage goodsPage;
    String product = "iPhone";





    @BeforeClass
    public void startBrowser(){
        webDriver = new FirefoxDriver();

    }

    @AfterClass
    public void closeBrowser(){
        webDriver.quit();
    }

    @BeforeMethod
    public void setup(){
        mainPage = new MainPage(webDriver);
    }

    @Test
    public void findProduct(){
        mainPage.getMainPage();
        mainPage.serchProduct(product);
        goodsPage = new GoodsPage(webDriver);
        Assert.assertTrue(goodsPage.getGoods(product).isDisplayed());
    }
}
