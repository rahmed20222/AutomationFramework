package com.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.MixPages;
import com.utils.AmazonBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingCheaoOAir extends AmazonBaseClass{

	MixPages m;
	//WebDriver driver;
	@Given("I am on CheapOAir Website")
	public void i_am_on_cheap_o_air_website() {
		
		launchBrowser();
	    
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.get("https://www.cheapoair.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("I close the suggested departing airport")
	public void i_close_the_suggested_departing_airport() throws InterruptedException {
	  
		//WebElement close = driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon is--hover'])"));
		//close.click();
		Thread.sleep(1000);
		driver.findElement(By.id("from0")).click();
		Thread.sleep(1000);
	}
	
	@Then("I search Departing Airport as {string}")
	public void i_search_departing_airport_as(String depart) throws InterruptedException {


		WebElement deprt = driver.findElement(By.id("from0"));
		deprt.sendKeys(depart);
		//driver.findElement(By.id("from0")).sendKeys(depart);
	}
	
	@Then("I select the first suggested airport")
	public void i_select_the_first_suggested_airport() throws InterruptedException {
	    
		Thread.sleep(1000);
		WebElement cl = driver.findElement(By.id("from0"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cl);
		//WebElement airport = driver.findElement(By.xpath("//li[@class='suggestion-box__item ic-location selected']"));
		//cl.click();

	}
	
	@Then("I Refresh the page")
	public void i_refresh_the_page() {

		driver.navigate().refresh();
		
	}
}
