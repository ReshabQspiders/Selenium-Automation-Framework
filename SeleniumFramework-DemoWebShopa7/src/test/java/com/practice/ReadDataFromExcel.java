package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		/*Step 1 Create the object of file class(java.io) 
		 */
		File file=new File
	("C:\\Users\\qspiders wakad\\Documents\\TestExcelData.xlsx");
		/*Step 2 Create the object of FileInputStream(java.io)
		 *and handle FileNotFoundExecption 
		 */
		FileInputStream fis=new FileInputStream(file);
		//Step 3 Create the Object of XSSFWorkbook class(From Apache POI)
		//And handle IOException
		//Helps to open a workbook in a Excel file 
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//Call getSheet(String sheetName) to navigate into a paricular sheet
		XSSFSheet sheet = workbook.getSheet("UserDetails");
		//Call getRow(int rowNum) to navigate into a row of specific no
		XSSFRow firstRow = sheet.getRow(0);
		XSSFRow secondRow = sheet.getRow(1);
		XSSFRow thridRow = sheet.getRow(2);
		XSSFRow fourthRow = sheet.getRow(3);

		//Call getCell(int cellNum) to naviagate into a specific cell of the row
		XSSFCell firstCell = firstRow.getCell(0);
		//Converting the XSSFCell object to String 
		String firstCellData = firstCell.getStringCellValue();
		String secondCellData = firstRow.getCell(1).getStringCellValue();
		String thirdCellData = firstRow.getCell(2).getStringCellValue();
		String fourthCellData = firstRow.getCell(3).getStringCellValue();
		//2nd Row data
		String firstCellData1 = secondRow.getCell(0).toString();
		String secondCellData1 = secondRow.getCell(1).getStringCellValue();
		String thirdCellData1 = secondRow.getCell(2).toString();
		String fourthCellData1 = secondRow.getCell(3).getStringCellValue();
		//3rd row data
		String firstCellData2 = thridRow.getCell(0).toString();
		String secondCellData2 = thridRow.getCell(1).getStringCellValue();
		String thirdCellData2 = thridRow.getCell(2).toString();
		String fourthCellData2 = thridRow.getCell(3).getStringCellValue();
		//4th row data
		String firstCellData3 = fourthRow.getCell(0).toString();
		String secondCellData3 = fourthRow.getCell(1).getStringCellValue();
		String thirdCellData3 = fourthRow.getCell(2).toString();
		String fourthCellData3 = fourthRow.getCell(3).getStringCellValue();
		//Printing the data
		System.out.print(firstCellData);
		System.out.print("--> "+firstCellData1);
		System.out.print("     "+firstCellData2);
		System.out.println("     "+firstCellData3);


		System.out.print(secondCellData);
		System.out.print("-->  "+secondCellData1);
		System.out.print("     "+secondCellData2);
		System.out.println("     "+secondCellData3);


		System.out.print(thirdCellData);
		System.out.print("-->  "+thirdCellData1);
		System.out.print("      "+thirdCellData2);
		System.out.println("     "+thirdCellData3);


		System.out.print(fourthCellData);
		System.out.print("     "+fourthCellData1);
		System.out.print("     "+fourthCellData2);
		System.out.println("     "+fourthCellData3);





		workbook.close();
		
	}

}
