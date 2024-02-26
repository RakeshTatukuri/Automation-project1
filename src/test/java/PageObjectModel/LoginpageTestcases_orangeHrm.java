package PageObjectModel;

import org.testng.annotations.Test;

public class LoginpageTestcases_orangeHrm extends BaseClass_OrangeHRM{

	
	@Test(priority=1)
	public  void validatepagesource()
	{
		/*instance variable--instead of declaring local object here we can simply declare the object in base class
		 * Loginpage_orangeHRM hrm=new Loginpage_orangeHRM();
		 *  hrm.getpagesource();
	   */
		String actsource=hrm.getpagesource();
		System.out.println("actsource is:"+actsource);
	}
	
	@Test(priority=2)
	public void validatetitle()
	{
		/*instance variable--instead of declaring local object here we can simply declare the object in base class
		 * Loginpage_orangeHRM hrm=new Loginpage_orangeHRM();
		 *  hrm.gettitlt();
	   */
		String acttitle=hrm.getapplicationtitle();
		System.out.println("Title is:"+acttitle);
	}
	@Test(priority=3 )
	public void loginpage() throws InterruptedException
	{
		/*instance variable--instead of declaring local object here we can simply declare the object in base class
		 * Loginpage_orangeHRM hrm=new Loginpage_orangeHRM();
		 *  hrm.loginpage();
	   */
		hrm.Login("Admin","admin123");
	
	}	

}
