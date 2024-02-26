package datadriventesting1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenUsingArray
{
	
//	@DataProvider(name="Mydata")
//	public Object[][] testData()
//	{
//		Object [][]data= {{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Seema","test123"}};
//		return data;
//	}
	
	
  @Test(dataProvider = "ExcelData",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("password is: "+psw);
  }
}
