package com.ads.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty", "html:target/html/login/", "json:target/json/login.json" }, features = {
		"src/main/resources/login.feature" }, glue = { "com.ads.steps", "com.ads.pages" }, tags = { "@bvts" })

public class bvts {

}