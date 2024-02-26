package com.SwagLabs.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class LoginPage {

	private WebDriver driver;//current driver
	public LoginPage(WebDriver driver) {

		this.driver=driver;//current driver instance to latest driver
	}
	
	//locator
	private By usern=By.id("user-name");
	private By passw=By.id("password");
	private By btn=By.id("login-button");
	
	//method
	public String getAppTitle()
	{
		return driver.getTitle();
	
	}
	public String getAppURL()
	{
		return driver.getCurrentUrl();
		
	}
	public void doLogin(String un,String pw)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(passw).sendKeys(pw);
		utility.getScreenshot(driver);
		driver.findElement(btn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
