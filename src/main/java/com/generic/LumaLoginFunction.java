package com.generic;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.pagefactory.SeleniumPageFactory;
import com.util.HighLighter;
import com.util.LumaConstants;
import com.util.SeleniumWait;

public class LumaLoginFunction {

	public void getLogin() {

		WebDriver driver =DriverManager.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.navigate().to(LumaConstants.URL);
		
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);
		SeleniumWait.getImplicitWait(driver, 5);
		//SeleniumWait.getImplicitwait(driver, pf.getSigninBtn().get(0), 3);
		HighLighter.getColor(driver, pf.getSigninBtn().get(0), "red");
		pf.getSigninBtn().get(0).click();
		
		HighLighter.getColor(driver, pf.getEmail(), "yellow");
		pf.getEmail().click();
		pf.getEmail().sendKeys(LumaConstants.user);
		HighLighter.getColor(driver, pf.getPassword(), "blue");
		pf.getPassword().click();
		pf.getPassword().sendKeys(LumaConstants.passWord);
		
		HighLighter.getColor(driver, pf.getSecondSignin(), "green");
		pf.getSecondSignin().click();
		HighLighter.getColor(driver, pf.getWelcome().get(0), "white");
		Boolean status=pf.getWelcome().get(0).isDisplayed();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status);
		sa.assertAll();

	}
	
}
