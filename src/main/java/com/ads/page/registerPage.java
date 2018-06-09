package com.ads.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.ads.util.*;


//import com.capitalone.steps.ReportingOptions;

public class registerPage {

	
	@FindBy(how = How.ID, using = "firstnamecheck")
	public WebElement objFirstName;

	@FindBy(how = How.ID, using = "lastnamecheck")
	public WebElement objlastName;

	@FindBy(how = How.NAME, using = "txtemail")
	public WebElement objemail;

	@FindBy(how = How.ID, using = "usernamecheck")
	public WebElement objusername;

	@FindBy(how = How.ID, using = "phonecheck")
	public WebElement objmobilenumber;

	@FindBy(how = How.ID, using = "passwordcheck")
	public WebElement objpwd;

	@FindBy(how = How.NAME, using = "month")
	public WebElement objmonth;

	@FindBy(how = How.NAME, using = "day")
	public WebElement objday;

	@FindBy(how = How.NAME, using = "year")
	public WebElement objyear;

	@FindBy(how = How.CSS, using = "input[name=\"user-type\"][value=\"M\"]")
	public WebElement objgender;

	@FindBy(how = How.NAME, using = "CHECKBOX_1")
	public WebElement objAccept;

	@FindBy(how = How.NAME, using = "btn-signup")
	public WebElement objsignup;

	@FindBy(how = How.CSS, using = "div.alert alert-error m-x-auto text-center")
	public WebElement objsuccess;

	@FindBy(how = How.CSS, using = "div[class=\"error-messagesinsignup\"][style=\"color: red;\"]")
	public WebElement objerror;

	private WebDriver BROWSER;


	public registerPage(WebDriver BROWSER) {
		// TODO Auto-generated constructor stub
		this.BROWSER=BROWSER;
	}

	public void setRequiredfields() {
		// TODO Auto-generated method stub
		System.out.println("as");
		this.objFirstName.isEnabled();
		
	}

//	public WebElement setRequiredfields(String userName, String emailID, String phonenumber) throws InterruptedException {
//		// TODO Auto-generated method stub
//		Thread.sleep(2000);
//		this.objFirstName.sendKeys("Ashok");
//		this.objlastName.sendKeys("Natarajan");
//		this.objusername.sendKeys(userName);
//		this.objemail.sendKeys(emailID);
//		this.objpwd.sendKeys("ashok");
//		this.objmobilenumber.sendKeys(phonenumber.trim());
//
//		Select oSelect = new Select(this.objmonth);
//		oSelect.selectByVisibleText("May");
//
//		Select dSelect = new Select(this.objday);
//		dSelect.selectByVisibleText("6");
//		Select ySelect = new Select(this.objyear);
//		ySelect.selectByVisibleText("1983");
//
//		objgender.click();
//		objAccept.click();
//		objsignup.click();
//		Thread.sleep(2000);
//		String getme = this.objerror.getText();
//		return objAccept;
//
//
//	}

}
