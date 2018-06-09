package com.ads.steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ads.page.LoginPage;
import com.ads.util.Base;
import com.ads.util.KeyWordExample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class common extends Base {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {

		// Write code here that turns the phrase above into concrete actions
		BROWSER = initializDriver();
		BROWSER.get("http://www.qbakbak.com/");
		LoginPage login = new LoginPage(BROWSER);
		login.accountBlock.click();

	}

	@Given("^I am on sample page$")
	public void i_am_on_sample_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		BROWSER = initializDriver();
		BROWSER.get("http://localhost:7070/webapp/");
	}

	@Then("^I check all fields$")
	public void i_check_all_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Boolean isPresentUser = BROWSER.findElements(By.name("username")).size() > 0;

		Boolean isPresentPwd = BROWSER.findElements(By.name("password")).size() > 0;
		Boolean isPresent = BROWSER.findElements(By.xpath("//input[@value='Submit']")).size() > 0;

		if (isPresentUser.TRUE && isPresentPwd.TRUE && isPresent.TRUE) {
			Assert.assertTrue(isPresent);
		} else {
			System.out.println("Unable to find all the fields");
		}

	}

}
