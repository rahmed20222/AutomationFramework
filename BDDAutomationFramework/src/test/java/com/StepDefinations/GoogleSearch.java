package com.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	WebDriver driver;
	@Given("I am Google Homepage")
	public void i_am_google_homepage() {
	   
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("I search {string}")
	public void i_search(String string) {
	   
	    WebElement SearchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	    SearchBox.sendKeys(string);
	}

	@Then("I click on facebook from search suggestion")
	public void i_click_on_facebook_from_search_suggestion() {
	   
	    WebElement click = driver.findElement(By.xpath("(//div[@class='pcTkSc'])[3]"));
	    click.click();
	}

	@Then("Searching should be successful")
	public void searching_should_be_successful() {
	   
	    WebElement suc = driver.findElement(By.xpath("(//div[@class='TbwUpd NJjxre'])[1]"));
	    System.out.print(suc.getText());
	    driver.close();
	}
}
