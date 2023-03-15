package com.AmazonStepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.utils.AmazonBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownValidationFromAmazon extends AmazonBaseClass{
	
//	WebDriver driver;
	
	@Given("Launch the Amazon Homepage")
	public void launch_the_amazon_homepage() {
		
		launchBrowser();
	    
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.get("https://www.amazon.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("I click on Baby from the All dropdown")
	public void i_click_on_baby_from_the_All_dropdown() {
	    
		WebElement a = driver.findElement(By.xpath("//div[@class='nav-search-facade']"));
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		sc.selectByVisibleText("Baby");
		Assert.assertEquals(a.getText(), "Baby");
		System.out.print(a.getText());
	}
	@Then("I click on Books from the All dropdown")
	public void i_click_on_books_from_the_all_dropdown() {
	    
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		sc.selectByIndex(14);
		WebElement a = driver.findElement(By.xpath("//div[@class='nav-search-facade']"));
		Assert.assertEquals(a.getText(), "Books");
		System.out.print(a.getText());
	}
}
