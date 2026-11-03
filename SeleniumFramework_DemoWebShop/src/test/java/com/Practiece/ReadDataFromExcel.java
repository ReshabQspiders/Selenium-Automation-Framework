package com.Practiece;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

   public class ReadDataFromExcel {
      
	   
	   public static void main(String[] args) throws IOException {
		   
	   //Step 1 Create the object of the class	
     	File file = new File("C:\\Users\\Admin\\Documents\\Excel Data.xlsx");
				
		// Step 2 Create the object of FileInputStream (java.io) and handle File not found exception
		FileInputStream fis = new FileInputStream(file);
				
		//Step 3 Create the object of XSSFWORKBOOK CLASS (From Apache Poi)
		//Helps to Open a workbook in a ExcelFile
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
     	// Call getSheet(String SheetName) to navigate into a particular sheet
		XSSFSheet Sheet = workbook.getSheet("User Details");
				
		//Call getRow(Int rowNum) to navigate into a row of specific no
		XSSFRow Row1 = Sheet.getRow(0);
		XSSFRow Row2 = Sheet.getRow(1);
		XSSFRow Row3 = Sheet.getRow(2);
		XSSFRow Row4 = Sheet.getRow(3);
		//Call getCell(Int cellNum) to navigate into a specific cell of the row 
		XSSFCell cell1 = Row1.getCell(0);
				
				//Converting the object to string
				String firstcelldata = cell1.getStringCellValue();
		        String secondcelldata = Row1.getCell(1).getStringCellValue();
		        String thirdcelldata = Row1.getCell(2).getStringCellValue();
		        String fourthcelldata = Row1.getCell(3).getStringCellValue();
		        
		        String firstcelldata1 = Row2.getCell(0).toString();
		        String secondcelldata1 = Row2.getCell(1).getStringCellValue();
		        String thirdcelldata1 = Row2.getCell(2).toString();
		        String fourthcelldata1 = Row2.getCell(3).getStringCellValue();
		        
		        String firstcelldata2 = Row3.getCell(0).toString();
		        String secondcelldata2 = Row3.getCell(1).getStringCellValue();
		        String thirdcelldata2 = Row3.getCell(2).toString();
		        String fourthcelldata2 = Row3.getCell(3).getStringCellValue();
		        
		        String firstcelldata3 = Row4.getCell(0).toString();
		        String secondcelldata3 = Row4.getCell(1).getStringCellValue();
		        String thirdcelldata3 = Row4.getCell(2).toString();
		        String fourthcelldata3 = Row4.getCell(3).getStringCellValue();
		        
				//Printing the data
				System.out.print(firstcelldata);
				System.out.println(" " + firstcelldata1);
				System.out.print(secondcelldata);
				System.out.println(" " + secondcelldata1);
				System.out.print(thirdcelldata);
				System.out.println(" " + thirdcelldata1);
				System.out.print(fourthcelldata);
				System.out.println(" " + fourthcelldata1);
				System.out.println();
				System.out.print(firstcelldata);
				System.out.println(" " + firstcelldata2);
				System.out.print(secondcelldata);
				System.out.println(" " + secondcelldata2);
				System.out.print(thirdcelldata);
				System.out.println(" " + thirdcelldata2);
				System.out.print(fourthcelldata);
				System.out.println(" " + fourthcelldata2);
				System.out.println();
				System.out.print(firstcelldata);
				System.out.println(" " + firstcelldata3);
				System.out.print(secondcelldata);
				System.out.println(" " + secondcelldata3);
				System.out.print(thirdcelldata);
				System.out.println(" " + thirdcelldata3);
				System.out.print(fourthcelldata);
				System.out.println(" " + fourthcelldata3);
				workbook.close();

			

		

	}
   }
