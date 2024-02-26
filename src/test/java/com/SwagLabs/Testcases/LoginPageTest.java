package com.SwagLabs.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseClass {
  @Test(priority=1)
  public void VerifyURL() {
	 String curl= lp.getAppURL();
	 Assert.assertTrue(curl.contains("demo"),"URL not match!");
	 System.out.println("URL Matched!");
	 
  }
  @Test(priority=2)
  public void VerifyTitle() {
	String actitle=  lp.getAppTitle();
	  Assert.assertTrue(actitle.contains("Swag"),"Title is not matched");
	  System.out.println("Title is matched");
  }
  @Test(priority=3)
  public void VerifyLogin() {
	  lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(lp.getAppURL().contains("inventory"),"Login Fail!");
	  System.out.println("Login completed!");
  }
}
