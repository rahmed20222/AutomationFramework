package com.AmazonStepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	
	WebDriver driver;

	@Given("User in Amazon Homepage")
	public void user_in_amazon_homepage() {
	   
		 	WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get("https://www.amazon.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("User Clicks on Best Seller")
	public void user_clicks_on_best_seller() {
		
		//driver.findElement(By.className("nav-a  ")).click();
	   
	   driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
	}
	
	@Then("User validate the Header")
	public void user_validate_the_header() {
	   
		WebElement header = driver.findElement(By.xpath("//span[text()='Amazon Best Sellers']"));
		Assert.assertEquals(header.getText(), "Amazon Best Sellers");
	}

	
	@Then("User Clicks on New Release")
	public void user_clicks_on_new_release() {
	    
		driver.findElement(By.xpath("(//a[text()='New Releases'])[2]")).click();
	}
	
	@Then("I Click on Movers & Shakers")
	public void i_click_on_movers_shakers() {
	   
		driver.findElement(By.xpath("(//a[text()='Movers & Shakers'])[1]")).click();
	}

	@Then("I click On Most Wished For")
	public void i_click_on_most_wished_for() {
	   
		driver.findElement(By.xpath("//a[text()='Most Wished For']")).click();
	}

	@Then("I Click ON Gift Ideas")
	public void i_click_on_gift_ideas() {
	   
		driver.findElement(By.xpath("//a[text()='Gift Ideas']")).click();
	}
}
