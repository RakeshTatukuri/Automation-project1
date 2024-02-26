package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	//globalize the object
	Properties p1;
	
	
	public PropertiesRead(String file) 
	{
		//properties class
		   p1=new Properties();
		
		//File f1=new File(System.getProperty("user.dir")+"//config.properties");//config is used for single window handle
		File f1=new File(System.getProperty("user.dir")+"//"+ file +".properties");//file is used it will handles all window
		
		FileInputStream fs ;
		
		try {
		 
			fs=new FileInputStream(f1);
			p1.load(fs);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public String getdata(String key)
	{
		 return p1.getProperty(key);
	}
	
	
}
