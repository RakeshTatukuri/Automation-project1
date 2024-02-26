package PageObjectModel;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginpageTestcases_pagefactory extends Baseclass_pagefactory {

	@Test(priority=1)
	public void validatetitle()
	{
		String acttitle=pf.getapptitle();
		Assert.assertTrue("title not matched!",acttitle.contains("Login"));
		System.out.println("current title is:"+acttitle);
		
		 /*if(acttitle.contains("Login"))
		{
			System.out.println("current title is:"+acttitle);
		}else
		{
			System.out.println("title not matched!");
		}*/
	}
	@Test(priority=2)
	public void validatelogin()
	{
		pf.Login("test@gmai.com", "test123");
		String exp="customers";
		Assert.assertTrue("login test failed!", driver.getCurrentUrl().contains(exp));
		System.out.println("login test pass!");
		
		/*if(driver.getCurrentUrl().contains(exp))
		{
			System.out.println("login test pass!");
		}else
		{
			System.out.println("login test failed!");
		}*/
	}

}
