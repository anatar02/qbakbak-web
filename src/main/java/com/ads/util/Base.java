package com.ads.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	/** The workingdirectory. */
	static String workingdirectory = System.getProperty("user.dir");
	/** The map. */
	public static Map<String, String> map = new HashMap<String, String>();
	private static String execPlatform = System.getProperty("execPlatform");
	private static String browser = System.getProperty("browserName");

	public WebDriver BROWSER;

	public WebDriver initializDriver() throws IOException {
		setUpDataMap();

		if (execPlatform == null) {
			execPlatform = map.get("execution_mode");
		}
		if (browser == null) {
			browser = map.get("Browsername");
		}

		System.out.println(browser);
		if (execPlatform.equals("native")) {

			switch (browser) {
			case "chrome":
				BROWSER = new ChromeDriver();
				break;
			case "firefox":
				BROWSER = new FirefoxDriver();
				break;
			case "ie":
				BROWSER = new InternetExplorerDriver();
				break;
			case "safari":
				BROWSER = new SafariDriver();
				break;
			default:
				System.out.println("Specified capabilities are not set for native tesing");
			}

			BROWSER.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		return BROWSER;

	}

	/**
	 * Gets the properties value.
	 *
	 * @return the properties value
	 */
	public static void getpropertiesValue() {
		InputStream setFilePath = null;
		List<String> fileList = new ArrayList<String>();
		// If this pathname does not denote a directory, then listFiles()

		fileList.add(workingdirectory + "/driver.properties");

		for (String filePath : fileList) {
			try {
				setFilePath = new FileInputStream(filePath);
				ResourceBundle resources = new PropertyResourceBundle(setFilePath);

				// convert ResourceBundle to Map
				Enumeration<String> keys = resources.getKeys();
				while (keys.hasMoreElements()) {
					String key = keys.nextElement();
					map.put(key, resources.getString(key));

				}
				// Now you can use the 'map' object as you wish.

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void setUpDataMap() {

		/**
		 * Instantiates a new ease web step.
		 *
		 * @author lmn490
		 * @param properies
		 *            path name
		 *
		 */
		if (map == null || map.size() <= 0 || map.values().isEmpty()) {
			getpropertiesValue();
		}

	}

	// tearDown()
	public void after() throws Exception {
		BROWSER.close();
		System.out.println("Running: tearDown");
	}

}
