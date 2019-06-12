package com.vinnu.automation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

import automation.config.ExcelReadConfig;
@Test
public class ExcelRead {
	
	public void readExcel() throws IOException{
		ExcelReadConfig Erc = new ExcelReadConfig("C:\\Users\\shambu.vineeta\\Desktop\\Exceldata.xls");
	File src=new File("C:\\Users\\shambu.vineeta\\Desktop\\Exceldata.xls");
	FileInputStream fis = new FileInputStream(src);
	HSSFWorkbook xw=new HSSFWorkbook(fis);
	HSSFSheet xs=xw.getSheetAt(0);
	int count=xs.getLastRowNum();
	
	System.out.println(count);
	
	for(int i = 0;i<=count;i++) {
		for(int j= 0;j<count;j++) {
			
			
			
		System.out.println("data at row " +i+": col "+ j + "is " + xs.getRow(i).getCell(j).getStringCellValue());
		
		}
	}
	Erc.getExcelData(0, 0, 0);
	Erc.getData(0);
	}
	

}
	

	
