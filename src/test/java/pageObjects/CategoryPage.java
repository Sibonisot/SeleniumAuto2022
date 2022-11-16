package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CategoryPage {
    WebDriver driver = null;

    @FindBy(xpath = "//a[contains(.,'Laptops')])")
    WebElement laptopCategory_xpath;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement laptopInAddCartScreen_xpath;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement laptopInCartScreen_xpath;

    public CategoryPage(WebDriver driver) {

        this.driver = driver;
    }

    public CategoryPage clickCategoryButton(){
        laptopCategory_xpath.click();
        return this;
    }

    // https://www.guru99.com/alert-popup-handling-selenium.html

}


//public class CategoryPage {
//
//    public CategoryPage clickCategoryButton(){
//        laptopCategory_xpath.click();
//        return this;
//    }
//
//}
