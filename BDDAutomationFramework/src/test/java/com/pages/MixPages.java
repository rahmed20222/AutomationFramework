package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.AmazonBaseClass;

public class MixPages{
	
	WebDriver driver;

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	public WebElement s;
	public WebElement s() {
		return s;
	}
	
	@FindBy(xpath="//span[text()='Recommendations']")
	public WebElement y;
	public WebElement y() {
		return y;
	}

	
	
	public MixPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
