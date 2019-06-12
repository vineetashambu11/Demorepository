package automation.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadConfig {
	HSSFWorkbook hf;
	HSSFSheet hs;
	public ExcelReadConfig (String Excelpath) throws FileNotFoundException {
		// TODO Auto-generated method stub
    File src=new File(Excelpath);
    FileInputStream Fis =new FileInputStream(src);
    try {
		hf=new HSSFWorkbook(Fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    int Sheetnumber;
	hs= hf.getSheetAt(0);
    
	}
	
	public void getExcelData(int Sheetnumber,int rownum, int col) {
		
	String data	=hf.getSheetAt(Sheetnumber).getRow(rownum).getCell(col).getStringCellValue();
	System.out.println(data);
	}
	
	
	public  void getData(int Sheetnumber) {
		
hs= hf.getSheetAt(Sheetnumber);
  int	row_count=hs.getLastRowNum();
	for(int i=0; i<= row_count;i++) {
	 for(int j=0;j< row_count;j++){
                   
		
		System.out.println("data rom row i col j"+i+": "+ j + "is " + hs.getRow(i).getCell(j).getStringCellValue());		}
		
	}
	

		
		}
}
