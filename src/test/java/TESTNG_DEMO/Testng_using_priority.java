package TESTNG_DEMO;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testng_using_priority {

	
	public void Registertest() 
	{
		System.out.println("these is register test for user");
	}
	@Test(priority=0,description="These is test case2",threadPoolSize = 5,invocationCount=10)//invocationcount attribute is used to execute the particular text case for how many times
	public void logintest() 
	{
		System.out.println("these is login test for user");
	}
	@Test(priority=1,description="These is test case3")
	public void searchtest() 
	{
		System.out.println("these is search test for user");
	}
	@Test(priority=2,description="These is test case4")
	public void addtocarttest() 
	{
		System.out.println("these is addtocart test for user");
	}
	
}
