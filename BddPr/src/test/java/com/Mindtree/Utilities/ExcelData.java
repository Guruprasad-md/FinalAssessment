package com.Mindtree.Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	XSSFWorkbook wb;
	
	public ExcelData()
	{
		File read = new File ("C:\\Users\\M1089266\\eclipse-workspace\\BddPr\\excel files\\ExcelData.xlsx");
		try
		{
			FileInputStream fis = new FileInputStream(read);
			wb= new XSSFWorkbook(fis);
			
		}
		catch (Exception e)
		{
			
		}
		
	}
	
	public String excel(int seatindex, int row, int column)
	{
		return wb.getSheetAt(seatindex).getRow(row).getCell(column).getStringCellValue();
		
	}
	
}


