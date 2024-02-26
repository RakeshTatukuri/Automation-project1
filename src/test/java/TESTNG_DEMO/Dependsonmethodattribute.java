package TESTNG_DEMO;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethodattribute {

	@Test(priority=1)
	public void registertest()
	{
		System.out.println("these is register test for user");
		//assertion-validate test case
		AssertJUnit.assertEquals(100, 10);//fail
		
	}
	@Test(priority=2,dependsOnMethods="registertest",alwaysRun=true)
	public void logintest()
	{
		System.out.println("these is logintest for user");
	}
}
