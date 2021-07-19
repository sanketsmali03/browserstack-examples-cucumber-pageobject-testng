package com.browserstack.examples.stepdefs;

import org.openqa.selenium.WebDriver;

import com.browserstack.examples.core.WebDriverFactory;
import com.browserstack.examples.core.WebDriverManager;
import com.browserstack.examples.pages.Bag;
import com.browserstack.examples.pages.CheckoutPage;
import com.browserstack.examples.pages.ConfirmationPage;
import com.browserstack.examples.pages.HomePage;
import com.browserstack.examples.pages.LoginPage;
import com.browserstack.examples.pages.OrdersPage;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Anirudha Khanna
 */
public abstract class AbstractBaseSteps {

    private WebDriverManager webDriverManager;
    private WebDriver webDriver;
    HomePage homepage;
    LoginPage loginpage;
    CheckoutPage checkoutpage;
    OrdersPage ordersPage;
    Bag bagPage;
    ConfirmationPage confirmationPage;
    

    public AbstractBaseSteps() {
        this.webDriverManager = WebDriverManager.getInstance();
    	homepage = new HomePage(getWebDriver());
		loginpage = new LoginPage(getWebDriver());
		checkoutpage = new CheckoutPage(getWebDriver());
		ordersPage = new OrdersPage(getWebDriver());
		bagPage = new Bag(getWebDriver());
		confirmationPage = new ConfirmationPage(getWebDriver());
        
        
    }

    public WebDriver getWebDriver() {
        if (this.webDriver == null) {
            this.webDriver = webDriverManager.getWebDriver();
        }
        return this.webDriver;
    }

    public String getTestEndpoint() {
        return WebDriverFactory.getInstance().getTestEndpoint();
    }
}
