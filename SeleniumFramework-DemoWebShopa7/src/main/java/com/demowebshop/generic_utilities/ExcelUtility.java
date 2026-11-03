package com.demowebshop.generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ExcelUtility {
	
	
	public String readDataFromSpecificCell(String sheetName,int rowNum,int cellNum) 
			throws FileNotFoundException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream
				(FrameworkConstants.excelFilePath));
			String cellData = workbook.getSheet(sheetName).
					getRow(rowNum).getCell(cellNum).getStringCellValue();
			workbook.close();
			return cellData;
		}	

@DataProvider(name = "RegisterDetails")
public Object[][] getRegisterData() throws IOException {

    FileInputStream fis =
            new FileInputStream(FrameworkConstants.excelFilePath);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("RegisterUser");
    int rowCount = sheet.getLastRowNum();
    Object[][] data = new Object[rowCount][6];
    DataFormatter formatter = new DataFormatter();
    int count = 0;
    for (int i = 1; i <= rowCount; i++) {
        Row row = sheet.getRow(i);
        // Check whether row is empty
        if (row == null ||
                formatter.formatCellValue(row.getCell(1)).isEmpty()) {
            continue;
        }
        for (int j = 1; j <= 6; j++) {
            data[i-1][j - 1] =
                    formatter.formatCellValue(row.getCell(j));
        }
        count++;
    }
    workbook.close();
    fis.close();
    // Return only records containing data
    Object[][] finalData = new Object[count][6];
    for (int i = 0; i < count; i++) {
        finalData[i] = data[i];
    }
    return finalData;
   
}

}
	
		


