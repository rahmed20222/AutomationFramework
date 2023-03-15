package com.utils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.options.Constants;

public class CommonMethods {
	
	public static WebDriver driver;

	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	public static void sendText(WebElement el, String text) {
		el.sendKeys(text);
	}

	public static void wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static String getTimeStamp() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(d.getTime());
	}

	public static JavascriptExecutor getJSObject() {
		js = (JavascriptExecutor) driver;
		return js;
	}

	public static void jsClick(WebElement el) {
		getJSObject().executeScript("arguments[0].click();", el);
	}

	public static void MouseHover(WebElement el) {
		Actions mouse_hover = new Actions(driver);
		mouse_hover.moveToElement(el).perform();
		mouse_hover.moveByOffset(300, 0).perform();
	}

	public static String mouseHoverText(WebElement el) {
		Actions mouse_hover = new Actions(driver);
		mouse_hover.moveToElement(el).perform();
		wait(1);
		String txt = driver.findElement(By.xpath("//div[contains(@class,'popover')]/div/span")).getText();
		mouse_hover.moveByOffset(300, 0).perform();
		return txt;
	}

	public static void selectDDValue(WebElement el, int index) {
		Select select = new Select(el);
		select.selectByIndex(index);
	}

	public static void selectDDValue(WebElement el, String text) {
		Select select = new Select(el);
		select.selectByVisibleText(text);
	}

	public static void checkButton(WebElement el, String message) {
		boolean displ = el.isDisplayed();
		boolean enbl = el.isEnabled();
		boolean txt = el.getText().equalsIgnoreCase(message);
		if (displ = false) {
			fail("Button is not displayed");
		} else if (enbl = false) {
			fail("Button is not enabled");
		} else if (txt = false) {
			fail("Text of the buttin is not matching");
		}
	}

	public static void assertContains(WebElement el, String message) {
		if (!el.getText().contains(message)) {
			fail("This WebElement does NOT contain following text" + " " + "Expected : " + message + " || " + "Actual: "
					+ el.getText());
		}
	}

	public static void noElement(WebElement el) {
		try {
			assertFalse(el.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isDisable(WebElement el) {
		assertEquals("true", el.getAttribute("aria-disabled"));
	}
}

