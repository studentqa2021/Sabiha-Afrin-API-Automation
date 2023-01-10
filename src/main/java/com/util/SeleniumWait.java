package com.util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumWait {

	
	public static void getImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public static void getImplicitWait(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
//	public static void getExplicitWait(int time,WebDriver driver, WebElement element) {
//		WebDriverWait wait = new WebDriverWait(time ,TimeUnit.SECONDS);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//	}
//	public static void getExplicitWait(WebDriver driver, WebElement element, int time) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//	}
}
