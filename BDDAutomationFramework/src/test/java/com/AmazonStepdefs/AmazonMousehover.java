package com.AmazonStepdefs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pages.MixPages;
import com.utils.AmazonBaseClass;
import com.utils.PageInitialize;
import com.utils.ScreenShot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonMousehover extends AmazonBaseClass{

	MixPages mix;
	
	
	@Given("User in Amazon HomePage")
	public void user_in_amazon_home_page() throws IOException {
		
		launchBrowser();
		mix = PageFactory.initElements(driver, MixPages.class);
		ScreenShot.scshot(driver, "Amazon Homepage");
	}
	
	@When("User Clicks on recommendation from Hello Sign In")
	public void user_clicks_on_recommendation_from_hello_sign_in() {
	   
		Actions ac = new Actions(driver);

	    WebElement Rec = driver.findElement(By.xpath("//span[text()='Recommendations']"));
	 
	    ac.moveToElement(mix.s()).moveToElement(mix.y()).click().build().perform();
	}
	
	@Then("User navigate back to Homepage")
	public void user_navigate_back_to_homepage() {
	   
		driver.navigate().back();
	}

	@Then("User Clicks on browsing History")
	public void user_clicks_on_browsing_history() {
	   
		 Actions ac = new Actions(driver);
		    
		 WebElement HelloSign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		 WebElement browsing = driver.findElement(By.xpath("//span[text()='Browsing History']"));
		    
		 ac.moveToElement(HelloSign).moveToElement(browsing).click().build().perform();
	}

	@Then("User Clikcs on music Library")
	public void user_clikcs_on_music_library() throws InterruptedException, IOException {
	   
			Actions ac = new Actions(driver);
			WebElement HelloSign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
			WebElement music = driver.findElement(By.xpath("//span[text()='Music Library']"));
			ac.moveToElement(HelloSign).moveToElement(music).click().build().perform();
			ScreenShot.scshot(driver, "Music Library");
			Thread.sleep(1000);
	}

	@Then("User Clicks on memberships and subscriptions")
	public void user_clicks_on_memberships_and_subscriptions() {
	   
		   Actions ac = new Actions(driver);
		   WebElement HelloSign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		   WebElement Member = driver.findElement(By.xpath("//span[text()='Memberships & Subscriptions']"));
		   ac.moveToElement(HelloSign).moveToElement(Member).click().build().perform();
	}

	@Then("User clicks on kindle Unlimited")
	public void user_clicks_on_kindle_unlimited() {
	   
			Actions ac = new Actions(driver);
		   WebElement HelloSign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		   WebElement Kin = driver.findElement(By.xpath("//span[text()='Kindle Unlimited']"));
		   ac.moveToElement(HelloSign).moveToElement(Kin).click().build().perform();
	}

	@Then("I close my Chrome Browser")
	public void i_close_my_chrome_browser() {
	   
	   driver.close();
	}
}
