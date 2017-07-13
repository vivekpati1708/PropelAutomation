package propel.utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	File xlrSrc;
	FileInputStream xlsxFis;
	XSSFWorkbook wb ;
	XSSFSheet dataSheet;
	/**
	  * Excel method the read the data from the excel. 
	  * 
	  */
	public ExcelUtility()
	{
		try {
			xlrSrc = new File("..\\PropelAutomation\\DataFiles\\PropelData.xlsx");
			xlsxFis = new FileInputStream(xlrSrc);
			//For xlx file we will be using the class. 
			//HSSFWorkbook wb1 = new HSSFWorkbook(xlxFis);

			wb = new XSSFWorkbook(xlsxFis);			
		} catch (IOException e) {
		
			System.out.println(e.getMessage());
		}	
	}
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param col
	 * @return
	 */
	public String GetCellValue(int row, int col)
	{
		String cellValue = dataSheet.getRow(row-1).getCell(col).getStringCellValue();
		return cellValue;
	}
/**
 * GetCellValue : To fetch the value of a particular Cell. 
 * @param sheet = Name of the sheet in the workbook, String Type
 * @param row = Row number in the sheet, Integer Type.
 * @param col = Name of the column, String type
 * @return object with the cell value that is fetched by row number and column name
 */
	public Object[][] GetCellValue(String sheet, int row, String col) 
	{
		String[][] cellValue =new String[1][1];
		dataSheet = wb.getSheet(sheet);
		int colNum=0;
		for(int i=0;i<dataSheet.getRow(0).getLastCellNum();i++)
		{
			String x = dataSheet.getRow(0).getCell(i).getStringCellValue();
			if(x.compareTo(col)==0)
				colNum=i;
		}
		cellValue[0][0]=GetCellValue(row, colNum);		
		return cellValue;
	}
	
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @return
	 */
	public Object[][] GetRowValues(String sheet, int row)
	{
		Object[][] dataRow = null;
		dataSheet = wb.getSheet(sheet);
		dataRow = new String [1][dataSheet.getRow(row-1).getLastCellNum()];
		for(int i =0; i < dataSheet.getRow(row-1).getLastCellNum();i++)
		{
			dataRow[0][i]=GetCellValue(row, i);;
		}
		return dataRow;		
	}
	
	/**
	 * 
	 * @param sheet
	 * @return
	 */
	public Object[][] getAllRows(String sheet)
	{
		Object[][] dataSet = null;
		dataSheet = wb.getSheet(sheet);
		int rowsCount = dataSheet.getLastRowNum()+1;
		int colsCount = dataSheet.getRow(0).getLastCellNum();
		dataSet = new Object[rowsCount][colsCount];
		for(int i = 0; i<rowsCount;i++)
			for(int j=0;j<colsCount;j++)
			{ 
				dataSet[i][j]=GetCellValue(i+1,j);
			}
			
		return dataSet;
	}

}
