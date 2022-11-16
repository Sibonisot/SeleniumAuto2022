package tests;

//import PageObjects.*;
//import Utils.BrowserFactory;
//import Utils.ReadTestData;
//import Utils.TakeScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import utils.BrowserFactory;

import java.io.IOException;

public class BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    //TakeScreenshot takesScreenshot = new TakeScreenshot();
//    ReadTestData readTestData;

//
//    {
//        try {
//            readTestData = new ReadTestData();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
