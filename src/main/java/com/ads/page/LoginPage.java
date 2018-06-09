package com.ads.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ads.util.KeyWordExample;

public class LoginPage extends KeyWordExample {

	public LoginPage(WebDriver BROWSER) {
		super(BROWSER);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver BROWSER;

	// ui element that include all accounts on the page
	@FindBy(how = How.ID, using = "firstnamecheck")
	public static WebElement accountBlock;

	By signin = By.id("firstnamecheck");

	public static void click_MyAccount() {
		KeyWordExample.enter_Text(accountBlock);
	}
	
	

}
