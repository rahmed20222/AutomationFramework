package com.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("ali@gmail.com");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		   driver.findElement(By.className("_9lsa")).click();
		   driver.findElement(By.className("_9lsa")).click();
		   driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		   driver.findElement(By.xpath("//input[@type='password']")).clear();
		   

	}

}
