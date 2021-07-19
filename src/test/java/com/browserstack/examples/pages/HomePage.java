  package com.browserstack.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.browserstack.examples.utils.Utility;

public class HomePage extends BasePage {

    @FindBy(id = "signin")
    private WebElement signInLink;

    @FindBy(css = "a#orders")
    private WebElement ordersLink;
    
    @FindBy(css = "a#offers")
    private WebElement offersLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage navigateToSignIn() {
    	Utility.waitForJSLoad(driver);
        signInLink.click();
        return new LoginPage(driver);
    }

    public HomePage addProductToCart(String productName) {
        waitAndClick(driver.findElement(By.xpath("//p[text() = '" + productName + "']/../div[@class = 'shelf-item__buy-btn']")));
        getBag().close();
        return this;
    }

 
    
    public void navigateToOffers() {
        offersLink.click();
       
    }


    public Bag getBag() {
        return new Bag(driver);
    }
}
