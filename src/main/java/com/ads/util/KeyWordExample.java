package com.ads.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyWordExample extends EventFiringWebDriver  {

	public KeyWordExample(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	static WebDriver driver;
	static WebDriverWait wait;


	public static void enter_Text(WebElement locatorType) {
		try {
			locatorType.click();
			
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}


}