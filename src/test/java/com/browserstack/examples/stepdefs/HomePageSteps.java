package com.browserstack.examples.stepdefs;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.browserstack.examples.utils.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps extends AbstractBaseSteps {

	WebDriverWait wait;
	
	@Then("I click on Offers link")
    public void iClickOnOffersLink() {
		homepage.navigateToOffers();

    }

	@Then("I should see user {string} logged in")
	public void iShouldUserLoggedIn(String user) {
		Utility.waitForJSLoad(getWebDriver());
		try {
			String loggedInUser = loginpage.getSignedInUsername();
			Assert.assertEquals(user, loggedInUser);
		} catch (NoSuchElementException e) {
			throw new AssertionError(user + " is not logged in");
		}
	}

	

	

}
