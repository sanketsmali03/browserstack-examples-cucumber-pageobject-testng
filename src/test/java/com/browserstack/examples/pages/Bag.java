package com.browserstack.examples.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Bag extends BasePage {

    @FindBy(className = "float-cart__close-btn")
    private WebElement closeButton;

    @FindBy(css = ".bag")
    private WebElement bagButton;

    @FindBy(css = ".bag--float-cart-closed")
    private WebElement bagClosed;

    @FindBy(css = ".float-cart--open")
    private WebElement bagOpen;

    @FindBy(className = "buy-btn")
    private WebElement buyButton;

    @FindBy(css = ".bag__quantity")
    private WebElement quantityContainer;

    public Bag(WebDriver driver) {
        super(driver);
    }

    

    public void close() {
        waitAndClick(closeButton);
    }

    public HomePage waitForItemsInBag(int i) {
        waitFortextToBePresentInElement(quantityContainer, Integer.toString(i));
        return new HomePage(driver);
    }
}
