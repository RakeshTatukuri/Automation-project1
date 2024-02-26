package datadriventesting1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	
	public XSSFWorkbook wb;
	@DataProvider(name="Mydata")
	public Object[][] testData()
	{
		Object [][]data= {{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Seema","test123"}};
		return data;
	}
	
	@DataProvider(name="ExcelData")
	public Object[][] testFileData()
	{
		//File
			File f1=new File(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
				FileInputStream fs;
				Object arr[][]=null;
				try {
					fs=new FileInputStream(f1);
					//wb-->sheet-->row-->cell-->data
					wb=new XSSFWorkbook(fs);
					//complete data from file
					
					//total rows
					int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
					System.out.println("Number of Rows: "+rows);//5
					
					//total cells
					int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
					System.out.println("Number of cells: "+cells);//2
					
					//create array of same size
					arr=new Object[rows-1][cells];
					
					//iterate array
					for(int r=1;r<rows;r++)//row will start with 1
					{
						
						for(int c=0;c<cells;c++)
						{
							//only for array position
							arr[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
							//System.out.print(arr[r-1][c]+"    ");
						}
						
						//System.out.println();
						
						
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return arr;
	}
	
	
}
