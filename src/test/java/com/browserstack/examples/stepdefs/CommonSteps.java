package com.browserstack.examples.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps extends AbstractBaseSteps {

    @Given("I navigate to website")
    public void iNavigateToWebsite() {
        getWebDriver().get(getTestEndpoint());
    }




}
