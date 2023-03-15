package com.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteUsingKeyBoard {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    Actions ac = new Actions(driver);
	    
	    WebElement ele1 = driver.findElement(By.xpath("//input[@id='email']"));
	    
	    WebElement ele2 = driver.findElement(By.xpath("//input[@id='pass']"));
	    
	    //first input the value in the textbox
	    ac.moveToElement(ele1).click().sendKeys("Noyon");
	   
	    //enter control C
	    ac.keyDown(Keys.CONTROL).sendKeys("a");
	    ac.sendKeys("c");
	    
	    //enter control V
	    ac.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
	    
	    //Release tye control Key
	    ac.keyUp(Keys.CONTROL).build().perform();
	    
	  //  ac.keyDown(Keys.BACK_SPACE);
	    
	    
	    
	    
	    
	    

	}

}
