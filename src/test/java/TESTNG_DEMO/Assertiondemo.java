package TESTNG_DEMO;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertiondemo {

	@Test
	
	public void hardassert()
	{
		String act="selenium webdriver is webui automation library";
		
		String exp="selenium webdriver is webui automation library!";

		Assert.assertEquals(act,exp,"fail:Strings are not equals!");
		System.out.println("pass:Strings are Equal!");

		/* String act1="selenium webdriver is webui automation library";
		
		String exp1="selenium webdriver is webui automation ";

		Assert.assertTrue(act1.contains(exp1),"fail: pass: no string is not a part of Actual string!");
		
		System.out.println("pass:yes string is a part of Actual string!");
		
		String act="selenium webdriver is webui automation library";
		
		String exp="selenium  ";
        Assert.assertFalse(act.contains(exp),"fail:  current string is  a part of actual string!");
		System.out.println("pass:current string is not a part of Actual string!");

		System.out.println("hard assertion demo is completed");
		/*
		 * if assertion fails it always throw Assertion error
		 */
	}
	
	@Test
	public void softassert()
	{
		SoftAssert sa=new SoftAssert();
	
		int a=100,b=200;//here only compare with operator not any contains,startswith,equals
		//sa.assertEquals(a, b,"Fail:numbers are not equal!");
	    //System.out.println("passed");
		//sa.assertTrue(a==b,"Fail:numbers are not equal!");
		sa.assertFalse(a==b,"fail:numbers are not equal!");
		System.out.println("pass:numbers are equal!");
		sa.assertAll(); //if you not mention these it will showing pass only better we need to put these method
		
		
		
	}
}
