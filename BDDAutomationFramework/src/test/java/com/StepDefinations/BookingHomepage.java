package com.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingHomepage {
	
	WebDriver driver;
	
	
	@Given("I am on Booking Homepage")
	public void i_am_on_booking_homepage() {
	    
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.booking.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Then("I validate the Booking.com in Header")
	public void i_validate_the_booking_com_in_header() {
	    

		  WebElement booking =  driver.findElement(By.xpath("//div[@class='bui-header__main']"));
		  System.out.print(booking.getText());
	}
}
	//@Then("I close the browser")
	//public void i_close_the_browser() {

		//    driver.close();
	//}

//}
