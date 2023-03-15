package com.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayMouseHoverTesting {

	WebDriver driver;
	@Given("I am on Ebay Homepage")
	public void i_am_on_ebay_homepage() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("I click on Action Figures from Toys")
	public void i_click_on_action_figures_from_toys() throws InterruptedException {
	    
		//Actions ac = new Actions(driver);
		WebElement Source = driver.findElement(By.xpath("(//a[text()='Toys'])[1]"));
		Source.click();
		//Thread.sleep(2000);
		WebElement Target = driver.findElement(By.xpath("//a[text()='Action Figures']"));
		Target.click();
//		System.out.print(Target.getText());
//		ac.moveToElement(Source).moveToElement(Target).click().build().perform();
	}

}
