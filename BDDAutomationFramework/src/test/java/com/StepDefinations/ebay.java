package com.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ebay {

WebDriver driver;
	
	@Given("User on Ebay homepage")
	public void user_on_ebay_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	    
	}
	
	@Given("I Select the Antiques from Dropdown")
	public void i_select_the_antiques_from_dropdown() {	
		
	   Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
	   sc.selectByVisibleText("Antiques");
	   
	   }
	
	@Given("I Select the Art from Dropdown")
	public void i_select_the_art_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Art");
	    
	   
	}

	@Given("I Select the Baby from Dropdown")
	public void i_select_the_baby_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Baby");
	    
	   
	}

	@Given("I Select the Books from Dropdown")
	public void i_select_the_books_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Books");
	    
	   
	}

	@Given("I Select the Business & Industrial from Dropdown")
	public void i_select_the_business_industrial_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Business & Industrial");
	    
	   
	}

	@Given("I Select the Cameras & Photo from Dropdown")
	public void i_select_the_cameras_photo_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Cameras & Photo");
	    
	   
	}

	@Given("I Select the Cell Phones & Accessories from Dropdown")
	public void i_select_the_cell_phones_accessories_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Cell Phones & Accessories");
	    
	   
	}

	@Given("I Select the Clothing, Shoes & Accessories from Dropdown")
	public void i_select_the_clothing_shoes_accessories_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Clothing, Shoes & Accessories");
	    
	   
	}

	@Given("I Select the Coins & Paper Money from Dropdown")
	public void i_select_the_coins_paper_money_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Coins & Paper Money");
	    
	   
	}

	@Given("I Select the Collectibles from Dropdown")
	public void i_select_the_collectibles_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByVisibleText("Collectibles");
	    
	   
	}

	@Given("I Select the Computers\\/Tablets & Networking from Dropdown")
	public void i_select_the_computers_tablets_networking_from_dropdown() {
	    
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		   sc.selectByIndex(11);
		   
	   
	}

	@Given("I Select the Consumer Electronics from Dropdown")
	public void i_select_the_consumer_electronics_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(12);
	    
	   
	}

	@Given("I Select the Crafts from Dropdown")
	public void i_select_the_crafts_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(13);
	    
	   
	}

	@Given("I Select the Dolls & Bears from Dropdown")
	public void i_select_the_dolls_bears_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(14);
	    
	   
	}

	@Given("I Select the DVDs & Movies from Dropdown")
	public void i_select_the_dv_ds_movies_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(15);
	    
	   
	}

	@Given("I Select the eBay Motors from Dropdown")
	public void i_select_the_e_bay_motors_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(16);
	    
	   
	}

	@Given("I Select the Entertainment Memorabilia from Dropdown")
	public void i_select_the_entertainment_memorabilia_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(17);
	    
	   
	}

	@Given("I Select the Gift Cards & Coupons from Dropdown")
	public void i_select_the_gift_cards_coupons_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(18);
	    
	   
	}

	@Given("I Select the Health & Beauty from Dropdown")
	public void i_select_the_health_beauty_from_dropdown() {
	    
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(19);
	   
	}

	@Given("I Select the Home & Garden from Dropdown")
	public void i_select_the_home_garden_from_dropdown() {
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@class ='gh-sb ']")));
		 sc.selectByIndex(20);
		 
	    
	   
	}
	@Given("I Close the Browser from Ebay Homepage")
	public void i_close_the_browser_from_ebay_homepage() {
	   //driver.close();
	   
	}
}
