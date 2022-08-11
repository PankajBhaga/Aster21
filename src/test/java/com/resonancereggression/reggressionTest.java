package com.resonancereggression;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjectModel.homePage;
import com.propertiesDemo.PropertiesFile;
import com.resonance.UIkeywords;

public class reggressionTest {
	UIkeywords keyword=new UIkeywords();
	@Test
	public void verifyTittleOfHomePage() throws InterruptedException {
		UIkeywords.openBrowser("Chrome");
		UIkeywords.launchUrl("https://testingshastra.com/");
		homePage home=PageFactory.initElements(keyword.driver, homePage.class);
		home.clickOnHomelnk();
		home.dragOncourseslnk();
		home.clickOnRecentPlacementslnk();
		
		home.clickOnVideolnk();
		
		
		
		//String actualTittle=UIkeywords.getTitle();
		
	
		//Assert.assertEquals("actualTittle", "Domestic and International Flights");
	}
	

}