package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	WebDriver driver;
	public SeleniumPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//*[@class='authorization-link']")// 1 of 2
	private List<WebElement> signinBtn;// findElements()<== new
	@FindBy(xpath="(//*[@id='email'])")
	private WebElement Email;

	@FindBy(xpath="(//*[@title='Password'])")
	private WebElement Password;
	
	@FindBy(xpath="(//*[@class='action login primary'])")
	private WebElement SecondSignin;

	@FindBy(xpath="//*[@class='greet welcome']")
	private List<WebElement> welcome;

	public List<WebElement> getWelcome() {
		return welcome;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public List<WebElement> getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSecondSignin() {
		return SecondSignin;
	}
	
}
