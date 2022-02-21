package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File scr = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(scr);
			wb= new XSSFWorkbook(fis);
		}
		catch (IOException e) {
			System.out.println("Unable to read the file "+e.getMessage());
		}
	}
	
	public String getStringData(String sheetName, int row, int col )
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public  double getNumericData(String sheetName, int row, int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}

}
