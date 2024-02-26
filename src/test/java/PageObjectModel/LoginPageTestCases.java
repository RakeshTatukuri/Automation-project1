package PageObjectModel;

import org.testng.annotations.Test;

public class LoginPageTestCases extends Baseclass {

	@Test(priority=1)
	public void ValidateTitle()
	{
		/*//instance variable--instead of declaring local object here we can simply declare the object in base class
		Loginpage lp=new Loginpage();
		lp.getApplicationTitle();
		*/
		String acttitle=lg.getApplicationTitle();
		System.out.println("Title is :"+acttitle);
	}
	
	@Test(priority=2)
	public void ValidateLogin()
	{
		/*//instance variable--instead of declaring local object here we can simply declare the object in base class
		Loginpage lp1=new Loginpage();
		lp1.login("test@gmail.com", "test1234");
		*/
		lg.login("test@gmail.com", "test1234");
		
	}
	
	
	

}
