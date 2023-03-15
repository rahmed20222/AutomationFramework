package com.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(Iframe);
	    
	    WebElement Drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	    WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions ac = new Actions(driver);
	    ac.dragAndDrop(Drag, Drop).perform();
	    
	    

	}

}
