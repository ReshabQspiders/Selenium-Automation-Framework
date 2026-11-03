package com.demowebshop.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	public String readDataFromSpecificCell(String Sheet1,int rowNum,int cellNum) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook= new XSSFWorkbook(new FileInputStream(FrameworkConstants.excelFilePath));
	
		String celldata = workbook.getSheet(Sheet1).getRow(rowNum).getCell(cellNum).getStringCellValue();
	
		workbook.close();
		return celldata;
	}  


	@DataProvider(name="RegisterDetails")
	public Object getRegisterData() throws IOException {

	    XSSFWorkbook workbook =new XSSFWorkbook(new FileInputStream(FrameworkConstants.excelFilePath));
	    XSSFSheet sheet = workbook.getSheet("Sheet1");

	    int rows = sheet.getLastRowNum();
	    int columns = sheet.getRow(0).getLastCellNum();

	    Object[][] data = new Object[rows - 1][columns-1];

	    DataFormatter formatter = new DataFormatter();

	    for (int i = 1; i < rows; i++) {
	        for (int j = 1; j < columns; j++) {
	            data[i - 1][j-1] =formatter.formatCellValue(sheet.getRow(i).getCell(j));
	        }
	    }

	    workbook.close();
	    return data;
	}
	
}
