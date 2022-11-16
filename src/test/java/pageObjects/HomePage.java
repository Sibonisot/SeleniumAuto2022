package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
    WebDriver driver = null;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Laptops')]")
    WebElement laptopCategory_xpath;


    @FindBy(xpath = "//a[contains(.,'Sony vaio i5')]")
    WebElement  addLaptopToCart_xpath;


    @FindBy(xpath = "")
    WebElement storeName_xpath;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement laptopInAddCartScreen_xpath;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement laptopInCartScreen_xpath;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public HomePage verifyHomePage() {
        String actualProductLabel = storeName_xpath.getText();
        Assert.assertEquals( actualProductLabel , "PRODUCT STORE");
        return this;
    }

    public HomePage verifywLoginAccess() {
        String laptopInAddCartScreen = laptopInAddCartScreen_xpath.getText();
        String laptopInCartScreen = laptopInCartScreen_xpath.getText();
        Assert.assertEquals( laptopInAddCartScreen , laptopInCartScreen);
        return this;
    }

    public HomePage clickCategoryButton() {
        laptopCategory_xpath.click();
        return this;

    }

    public HomePage clickLaptopToAddOnCart(){
    new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(addLaptopToCart_xpath));
        addLaptopToCart_xpath.click();
        return this;

    }

    // https://www.guru99.com/alert-popup-handling-selenium.html

}
