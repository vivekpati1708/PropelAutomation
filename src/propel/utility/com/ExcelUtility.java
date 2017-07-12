package propel.utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	File xlrSrc;
	FileInputStream xlsxFis;
	XSSFWorkbook wb ;
	/**
	  * Excel method the read the data from the excel. 
	  * 
	  */
	public ExcelUtility()
	{
		try {
			xlrSrc = new File("C:\\Users\\pativ\\Desktop\\PropelData.xlsx");
			xlsxFis = new FileInputStream(xlrSrc);
			//For xlx file we will be using the class. 
			//HSSFWorkbook wb1 = new HSSFWorkbook(xlxFis);

			wb = new XSSFWorkbook(xlsxFis);			
		} catch (IOException e) {
		
			System.out.println(e.getMessage());
		}	
	}
	
	public void GetData(String sheet, int row, int col) 
	{
		try {
			XSSFSheet loginData =wb.getSheet("LoginData"); // To get sheet as per the sheet name. 
			//wb.getSheetAt(0);// Fetch you the 1st sheet as the index start from zero. 
			
			String userName = loginData.getRow(1).getCell(0).getStringCellValue();
			System.out.println("Line 2");
			double passworkd = loginData.getRow(1).getCell(1).getNumericCellValue();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally 
		{
			try {
				wb.close();
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
			}
		}		
	}
	
	

}
