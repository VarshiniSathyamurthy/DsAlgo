package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import base.BaseTest;

public class Access_Excel extends BaseTest {

	public static String[][] getData() throws IOException  {
		
		File f= new File("C:\\Users\\varsh\\git\\DsAlgo\\DS-Algo\\src\\test\\resources\\testdata\\dsalgoTestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheetName= wb.getSheet("SignIn");
		
		int totalRows= sheetName.getLastRowNum();
	//	System.out.println(totalRows);
		Row rowCells=sheetName.getRow(0);
		int totalCols= rowCells.getLastCellNum();
	//	System.out.println(totalCols);
		
		DataFormatter format= new DataFormatter();
		
		String testData[][]= new String[totalRows][totalCols];
		 for(int i=1;i<=totalRows;i++) {
			 for(int j=0;j<totalCols;j++) {
				 testData[i-1][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
				 System.out.println(testData[i-1][j]);
				 
				 
			 }
			 
		 }
		
	return testData;
	
	}
	
public static String[][] getInput() throws IOException  {
		
		File f= new File("C:\\Users\\varsh\\eclipse-workspace\\Framework\\DS-Algo\\src\\test\\resources\\testdata\\dsalgoTestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheetName= wb.getSheet("Inputs");
		
		int totalRows= sheetName.getLastRowNum();
	//	System.out.println(totalRows);
		Row rowCells=sheetName.getRow(0);
		int totalCols= rowCells.getLastCellNum();
	//	System.out.println(totalCols);
		
		DataFormatter format= new DataFormatter();
		
		String testData[][]= new String[totalRows][totalCols];
		 for(int i=1;i<=totalRows;i++) {
			 for(int j=0;j<totalCols;j++) {
				 testData[i-1][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
				 System.out.println(testData[i-1][j]);
				 
				 
			 }
			 
		 }
		
	return testData;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	


