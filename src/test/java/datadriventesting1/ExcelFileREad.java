package datadriventesting1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileREad {

	public static void main(String[] args) throws IOException
	{

		//File
		
		File f1=new File(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		FileInputStream fs=new FileInputStream(f1);
		
		//wb-->sheet-->row-->cell-->data
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		//complete data from file
		
		//total rows
		int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		System.out.println("Number of Rows: "+rows);//5
		
		//total cells
		int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of cells: "+cells);//2
		
		//create array of same size
		Object arr[][]=new Object[rows-1][cells];
		
		//iterate array
		for(int r=1;r<rows;r++)//row will start with 1
		{
			
			for(int c=0;c<cells;c++)
			{
				//only for array position
				arr[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
				System.out.print(arr[r-1][c]+"    ");
			}
			
			System.out.println();
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		//single data read from file
		
//		String value=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
//		System.out.println(value);
		
		
//		XSSFSheet sheet1=wb.getSheet("userdata");
//		XSSFRow row1=sheet1.getRow(1);
//		XSSFCell cell1=row1.getCell(0);
//		String value=cell1.getStringCellValue();
//		System.out.println(value);
		
		
		
		
		
		
	}

}
