package com.resonance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIkeywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.err.println("Invalid browser name: " + browserName);

		}

	}

	public static void launchUrl(String Url) {

		driver.get(Url);

	}

	public static String getTitle() {
		WebElement s=driver.findElement(By.xpath("//h2 [text()=\"Domestic and International Flights\"]"));
		
		return driver.getTitle();
		
	}

//	public static void enterText(WebElement element, String textToEnter) {
	//	element.sendKeys(textToEnter);

	//}

	//public static void enterText(String locatorValue, String textToEnter) {
	//	driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);
		
	//}
}
