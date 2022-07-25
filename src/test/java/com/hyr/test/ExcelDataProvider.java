package com.hyr.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	
	@DataProvider
	public String[][] getData() throws IOException {
		File file = new File("./src/test/resource/TestData.xlsx");
		//System.out.println(file.exists());//it identified file is available in this path or not
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook  workbook =new XSSFWorkbook(fis);
		XSSFSheet  sheet = workbook.getSheet("Sheet1");
		//System.out.println(sheet.getPhysicalNumberOfRows());// this will return how many number of rows present physically in a sheet
		//System.out.println(sheet.getLastRowNum());//it will exclude the header and returns the row number,
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		//int noOfRows = sheet.getLastRowNum();
		int noOfColumns = sheet.getRow(0).getLastCellNum();//it will return no of columns in first row
		
		String[][] data =new String[noOfRows-1][noOfColumns];
		
		for(int i=0;i<noOfRows-1;i++)
		{
			for(int j=0;j<noOfColumns;j++)
			{
				DataFormatter df= new DataFormatter();//it will convert any type of data(text in cell) to string
                  data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));
                  
			    // System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			
		}
		
		/*
		 * for(String[] dataArr: data) { System.out.println(Arrays.toString(dataArr)); }
		 */
		
		
		workbook.close();
		fis.close();
		return data;
	}

}

