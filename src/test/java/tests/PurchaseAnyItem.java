package tests;
import pageObjects.*;

import org.testng.annotations.Test;

public class PurchaseAnyItem extends BaseTest{


    @Test
    public void verifyHomePageSuccess() throws InterruptedException {
        //takesScreenshot.takeSnapShot(driver, "Home Page");
        homePage
                .verifyHomePage();
        Thread.sleep(5000);

        
    }
    @Test
    public void verifyLaptopCategoryPageAccess() throws InterruptedException {
        //takesScreenshot.takeSnapShot(driver, "Home Page");
        homePage
                .clickCategoryButton()
                .clickLaptopToAddOnCart();
        Thread.sleep(5000);

    }
}
