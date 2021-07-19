package com.browserstack.examples.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.browserstack.examples.pages.HomePage;
import com.browserstack.examples.pages.LoginPage;
import com.browserstack.examples.utils.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends AbstractBaseSteps {

	
	@And("I SignIn as {string} with {string} password")
	public void iSignInAsWithPassword(String username, String password) {
		System.out.print("Testing New Method");
		homepage = new HomePage(getWebDriver());
		loginpage = new LoginPage(getWebDriver());
		homepage.navigateToSignIn(); 
		loginpage.loginWith(username,password);
		System.out.print("After New Method");
		Utility.mockGPS(getWebDriver());
	}
	

	@Then("I should see {string} as Login Error Message")
	public void iShouldSeeAsLoginErrorMessage(String expectedMessage) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 5);
		try {
			String errorMessage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".api-error"))).getText();
			Assert.assertEquals(expectedMessage, errorMessage);
		} catch (NoSuchElementException e) {
			throw new AssertionError("Error in logging in");
		}
	}

	

}
