package com.ads.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ads.page.LoginPage;
import com.ads.page.registerPage;
import com.ads.util.*;

public class LoginStep extends Base {

	@Test
	public void pageNavigation() throws InterruptedException {
		try {
			
			BROWSER = initializDriver();
			WebDriverWait wait = new WebDriverWait(BROWSER, 10);
			BROWSER.get("https://www.google.com/");
			BROWSER.findElement(By.id("fsettl")).click();
			BROWSER.findElement(By.linkText("Advanced search")).click();
			BROWSER.findElement(By.id("CwYCWc")).sendKeys("greenlots");
			BROWSER.findElement(By.name("f")).submit();
			// return number of navigation
			BROWSER.findElement(By.id("nav")).getSize();

			boolean bFound = false;
			try {
				int flg = 100;
				while (flg != 0) {
					//return true or false 
					Boolean isPresent = BROWSER.findElements(By.linkText("Greenlots | Lux Research")).size() > 0;

					if ((isPresent == true)) {
						bFound = true;
						WebElement eleLink = wait.until(
								ExpectedConditions.elementToBeClickable(By.linkText("Greenlots | Lux Research")));
						eleLink.click();
						break;
					}
					BROWSER.findElement(By.cssSelector("#pnnext > span:nth-child(2)")).click();
					flg--;
				}

			} catch (NoSuchElementException s) {
				bFound = false;

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
