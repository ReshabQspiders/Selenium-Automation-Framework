package com.Practiece;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromexc {

	public static void main(String[] args) throws IOException {
		
		
			//Step 1 Create the object of the class	
			File file = new File("C:\\Users\\Admin\\Documents\\Excel Data.xlsx");
			
			// Step 2 Create the object of FileInputStream (java.io) and handle File not found exception
			FileInputStream fis = new FileInputStream(file);
			
			//Step 3 Create the object of XSSFWORKBOOK CLASS (From Apache Poi)
			//Helps to Open a workbook in a ExcelFile
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			// Call getSheet(String Sheetname) to navigate into a particular sheet
			XSSFSheet Sheet = workbook.getSheet("User Details");
			
			//Call getRow(int rowNum) to navigate into a row of specific no
			XSSFRow Row1 = Sheet.getRow(0);
			
		    System.out.println(Row1);
            workbook.close();

		
		
	/*    //Step 1 Create the object of the class	
		File file = new File("C:\\Users\\Admin\\Documents\\Excel Data.xlsx");
		
		// Step 2 Create the object of FileInputStream (java.io) and handle File not found exception
		FileInputStream fis = new FileInputStream(file);
		
		//Step 3 Create the object of XSSFWORKBOOK CLASS (From Apache Poi)
		//Helps to Open a workbook in a ExcelFile
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// Call getSheet(String Sheetname) to navigate into a particular sheet
		XSSFSheet Sheet = workbook.getSheet("User Details");
		
		//Call getRow(int rowNum) to navigate into a row of specific no
		XSSFRow Row1 = Sheet.getRow(0);
		
	System.out.println(Row1);
    workbook.close();
*/

	}

}
