package com.browserstack.examples.stepdefs;

import org.openqa.selenium.WebDriver;

import com.browserstack.examples.core.WebDriverFactory;
import com.browserstack.examples.core.WebDriverManager;
import com.browserstack.examples.pages.HomePage;
import com.browserstack.examples.pages.LoginPage;


public abstract class AbstractBaseSteps {

    private WebDriverManager webDriverManager;
    private WebDriver webDriver;
    HomePage homepage;
    LoginPage loginpage;


    public AbstractBaseSteps() {
        this.webDriverManager = WebDriverManager.getInstance();
    	homepage = new HomePage(getWebDriver());
		loginpage = new LoginPage(getWebDriver());

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
