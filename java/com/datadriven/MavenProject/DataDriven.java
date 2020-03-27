package com.datadriven.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven{
	public static void main(String[] args) throws IOException {
	
		File f = new File("F:\\Users\\Karthick\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\datadriven\\MavenProject");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheetAt = wb.getSheetAt(0); 
        System.out.println("Physical number of rows: + SheetAtget.physical number of rows()");
        for(int i=0; i<sheetAt.getphysicalnumberofrows(); i++) {
        Row row = sheetAt.getRow(i);
        
        }
        
	}

}
