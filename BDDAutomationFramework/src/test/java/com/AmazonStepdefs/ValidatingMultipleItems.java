package com.AmazonStepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingMultipleItems {

WebDriver driver;
@Given("In Amazon Homepage")
public void in_amazon_homepage() {
    
	WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@When("^enter ([^\\\"]*)$")
public void enter(String items) {
    
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(items);
}

@Then("Click on search")
public void click_on_search() {
    
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}

@Then("validating the first price")
public void validating_the_first_price() {
    
	 WebElement price = driver.findElement(By.xpath("(//span[@class='a-price'])[1]"));
	    System.out.println(price.getText());
	    driver.close();
}

}
