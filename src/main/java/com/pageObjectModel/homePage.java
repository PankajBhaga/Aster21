package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.resonance.UIkeywords;

public class homePage {
	UIkeywords keywords = new UIkeywords();

	@FindBy(xpath = "//a[text()=\"Home\"]")
	public WebElement Homelnk;

	@FindBy(css = "a.sf-with-ul")
	public WebElement Courseslnk;

	@FindBy(css = "[href=\"/recent-placements\"]")
	public WebElement RecentPlacementslnk;

	@FindBy(css = "li#menu-item-353")
	public WebElement videoslnk;

	public WebElement Assignmentslnk;

	public WebElement Noteslnk;

	public WebElement Contactuslnk;

	public void clickOnHomelnk() {
		Homelnk.click();

	}

	public void dragOncourseslnk() {
		ChromeDriver driver = new ChromeDriver();
		Courseslnk.click();
		Actions mouse = new Actions(driver);
		mouse.moveToElement(Courseslnk).perform();

	}

	public void clickOnRecentPlacementslnk() {
		RecentPlacementslnk.click();

	}

	public void clickOnVideolnk() {
		videoslnk.click();

	}

}
